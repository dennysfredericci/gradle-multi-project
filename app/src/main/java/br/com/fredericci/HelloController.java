package br.com.fredericci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final PersonService personService;

    public HelloController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> get() {
        return personService.findAll();
    }
}
