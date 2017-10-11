package eveinabox

import grails.converters.JSON

class StatusController {
    static responseFormats = ['json']
    def statusService

    def index() {
        respond(status: statusService.status())
    }
}
