package io.alapierre.sample.springbootsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 28.10.2024
 */
@RestController
public class SampleController {

    @GetMapping("/api/person")
    public Person loadPerson() {
        return new Person("Adrian", "Lapierre", 28);
    }

}
