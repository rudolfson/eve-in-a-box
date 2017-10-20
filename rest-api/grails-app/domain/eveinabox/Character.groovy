package eveinabox

import java.time.Instant

class Character {
    Long eveId
    String name
    String accessToken
    String refreshToken
    Instant expiresOn

    static belongsTo = [user: ApplicationUser]
    static constraints = {
        eveId nullable: false
        name nullable: false, blank: false, maxSize: 200
        user nullable: false
    }
}
