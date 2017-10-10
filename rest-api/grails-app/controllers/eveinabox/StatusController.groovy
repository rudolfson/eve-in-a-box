package eveinabox

import grails.converters.JSON

class StatusController {
    static responseFormats = ['json']
    def statusService

    def index() {
        log.debug("getting called")
        statusService.status()
    }
}
