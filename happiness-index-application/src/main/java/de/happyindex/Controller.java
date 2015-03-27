package de.happyindex;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World from Spring Boot!";
    }

}