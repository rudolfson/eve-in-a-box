package eveinabox.auth

import eveinabox.ApplicationUser
import eveinabox.Character
import grails.gorm.transactions.Transactional
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.util.Base64Utils
import org.springframework.web.client.RestTemplate

@Transactional
class AuthService {

    // TODO read from external config
    private static final CLIENT = "aa398ed41e1a433cbfd7e31e998b6b0c"
    private static final SECRET = "SAkzWGfhBHNhNsHL1qYf6oiafyeMgn0l3EJiufhJ"

    def login(String authorizationCode) {
        log.debug "login($authorizationCode)"
        def token = getAccessToken(authorizationCode)
        def verifiedCharacter = verify(token)
        Character character = Character.findByName(verifiedCharacter.name)
        if (!character) {
            log.debug("Character with id $verifiedCharacter.eveId not in database - creating it")
            ApplicationUser user = new ApplicationUser()
            character = new Character(eveId: verifiedCharacter.eveId, name: verifiedCharacter.name)
            user.addToCharacters(character)
            character.user = user
            character.save()
            user.save()
        }
        character.refreshToken = token.refreshToken
        character.save()
        return character.user
    }

    def addCharacter(String authorizationCode) {
        log.debug "addCharacter($authorizationCode)"
    }

    private getAccessToken(String authorizationCode) {
        HttpHeaders requestHeaders = new HttpHeaders()
        requestHeaders.add("Authorization", "Basic ${Base64Utils.encodeToString("$CLIENT:$SECRET".bytes)}")
        requestHeaders.add("Content-Type", "application/x-www-form-urlencoded")
        String requestBody = "grant_type=authorization_code&code=$authorizationCode"
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, requestHeaders)
        HttpEntity<Token> responseEntity = new RestTemplate()
                .exchange("https://login.eveonline.com/oauth/token",
                HttpMethod.POST,
                requestEntity,
                Token.class)
        log.debug("got access token: ${responseEntity.body}")
        responseEntity.body
    }

    private verify(Token token) {
        HttpHeaders requestHeaders = new HttpHeaders()
        requestHeaders.add("Authorization", "Bearer ${token.accessToken}")
        HttpEntity<String> requestEntity = new HttpEntity<>(requestHeaders)
        HttpEntity<VerifiedCharacter> responseEntity = new RestTemplate()
                .exchange("https://login.eveonline.com/oauth/verify",
                HttpMethod.GET,
                requestEntity,
                VerifiedCharacter.class)
        log.debug("verfied access token: ${responseEntity.body}")
        responseEntity.body
    }
}
