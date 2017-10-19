package eveinabox

class Character {
    Long eveId
    String name
    String refreshToken

    static belongsTo = [user: ApplicationUser]
    static constraints = {
        name nullable: false, blank: false, maxSize: 200
        user nullable: false
    }
}
