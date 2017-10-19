package eveinabox.auth

import com.fasterxml.jackson.annotation.JsonProperty
import groovy.transform.ToString

@ToString(includeNames = true)
class Token {
    @JsonProperty("access_token")
    String accessToken
    @JsonProperty("token_type")
    String tokenType
    @JsonProperty("expires_in")
    String expiresIn
    @JsonProperty("refresh_token")
    String refreshToken
}
