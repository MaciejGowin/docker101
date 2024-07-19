package pl.coderbrother.dockerintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApplicationController {

    @GetMapping("/")
    public Map<String, String> test() {
        return Map.of("foo", "bar");
    }
}
