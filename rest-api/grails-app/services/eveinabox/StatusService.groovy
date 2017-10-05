package eveinabox

import de.inventoris.eve.esi.api.StatusApi
import org.springframework.beans.factory.annotation.Value

class StatusService {
    StatusApi statusApi

    @Value('${esi.datasource}')
    String datasource

    def status() {
        log.debug("read server status on ${datasource}")
        statusApi.getStatus(datasource, null, null)
    }
}
