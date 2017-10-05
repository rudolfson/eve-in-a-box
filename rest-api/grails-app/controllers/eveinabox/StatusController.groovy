package eveinabox

class StatusController {
    static responseFormats = ['json']
    def statusService

    def index() {
        log.debug("I'm getting called")
        respond statusService.status()
    }
}
