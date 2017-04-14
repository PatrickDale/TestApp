package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by patdale on 4/14/17.
 */

@RequestMapping("/health")
@RestController
public class HealthController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "hello, world!";
    }
}
