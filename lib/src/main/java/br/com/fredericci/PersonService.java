package br.com.fredericci;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public List<Person> findAll() {
        return List.of(
                new Person("Dennys", "Fredericci"),
                new Person("Luigi", "Federici")
        );
    }

}
