package eveinabox

import grails.gorm.transactions.Transactional
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.util.Base64Utils
import org.springframework.web.client.RestTemplate

@Transactional
class AuthService {

    private static final CLIENT = "aa398ed41e1a433cbfd7e31e998b6b0c"
    private static final SECRET = "SAkzWGfhBHNhNsHL1qYf6oiafyeMgn0l3EJiufhJ"

    def login(String authorizationCode) {
        log.debug "login($authorizationCode)"
        def tokenResponse = getAccessToken(authorizationCode)
        verify(tokenResponse.access_token)
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
        HttpEntity<Map<String, Object>> responseEntity = new RestTemplate()
                .exchange("https://login.eveonline.com/oauth/token",
                HttpMethod.POST,
                requestEntity,
                Map.class)
        log.debug("got access token: ${responseEntity.body}")
        responseEntity.body
    }

    def verify(String accessToken) {
        HttpHeaders requestHeaders = new HttpHeaders()
        requestHeaders.add("Authorization", "Bearer $accessToken")
        HttpEntity<String> requestEntity = new HttpEntity<>(requestHeaders)
        HttpEntity<Map<String, Object>> responseEntity = new RestTemplate()
                .exchange("https://login.eveonline.com/oauth/verify",
                HttpMethod.GET,
                requestEntity,
                Map.class)
        log.debug("verfied access token: ${responseEntity.body}")
        responseEntity.body
    }
}
