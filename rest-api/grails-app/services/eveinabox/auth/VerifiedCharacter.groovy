package eveinabox.auth

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import groovy.transform.ToString

import java.time.Instant
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZonedDateTime

@ToString(includeNames = true)
class VerifiedCharacter {
    @JsonProperty("CharacterID")
    Long eveId
    @JsonProperty("CharacterName")
    String name
    @JsonProperty("ExpiresOn")
    LocalDateTime expiresOn
    @JsonProperty("Scopes")
    String scopes
    @JsonProperty("TokenType")
    String tokenType
    @JsonProperty("CharacterOwnerHash")
    String characterOwnerHash
    @JsonProperty("IntellectualProperty")
    String intellectualProperty
}
