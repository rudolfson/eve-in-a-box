package eveinabox

class AuthController {
    def authService

    def login() {
        def response = authService.login(params.authorizationCode)
        respond(message: "$response")
    }

    def addCharacter() {
        authService.addCharacter(params.authorizationCode)
        respond(message: "addCharacter")
    }
}
