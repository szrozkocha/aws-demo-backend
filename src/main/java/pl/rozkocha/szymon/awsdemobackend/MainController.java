package pl.rozkocha.szymon.awsdemobackend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public ResponseEntity<Void> health() {
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/status")
    public StatusResponse status() {
        return new StatusResponse("OK");
    }
}
