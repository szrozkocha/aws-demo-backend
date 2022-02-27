package pl.rozkocha.szymon.awsdemobackend;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value = "/api/status")
    public StatusResponse status() {
        return new StatusResponse("OK");
    }
}
