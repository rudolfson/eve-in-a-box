package eveinabox

import grails.converters.JSON

class StatusController {
    def statusService

    def index() {
        respond(status: statusService.status())
    }
}
