package eveinabox

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action: "delete")
        get "/$controller(.$format)?"(action: "index")
        get "/$controller/$id(.$format)?"(action: "show")
        post "/$controller(.$format)?"(action: "save")
        put "/$controller/$id(.$format)?"(action: "update")
        patch "/$controller/$id(.$format)?"(action: "patch")

        "/"(controller: 'application', action: 'index')

        get "/auth/login"(controller: 'auth', action: 'login')
        get "/auth/addCharacter"(controller: 'auth', action: 'addCharacter')

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
