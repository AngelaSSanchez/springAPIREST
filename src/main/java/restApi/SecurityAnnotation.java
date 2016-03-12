package restApi;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("authenticated")
@RestController
@RequestMapping(Uris.SERVLET_MAP + Uris.SECURITY)
public class SecurityAnnotation {

    @PreAuthorize("hasRole('ROLE_PLAYER')")//Opcion alternativa a las rutas http
    @RequestMapping(value = Uris.ANNOTATION + Uris.PLAYER, method = RequestMethod.GET)
    public String player() {
        return "OK. Acceso permitido al recurso player";
    }
}
