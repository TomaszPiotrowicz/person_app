package pl.tomaszpiotrowicz.person_app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomaszpiotrowicz.person_app.dao.entity.PersonList;
import pl.tomaszpiotrowicz.person_app.manager.PersonListManager;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personList")

public class PersonListApi {

private  List<PersonList>personLists;
//tutaj wczytać plik csv
    private PersonListManager personList;

    @Autowired
    public PersonListApi(PersonListManager personList) {
        this.personList = personList;
    }

    @GetMapping("/all")
    public Iterable <PersonList>getAll() {
        return personList.findAll();
    } @GetMapping
    public Optional<PersonList> getById(@RequestParam Long index) {

        return personList.findById(index);
    }

    @PostMapping
    public PersonList  saveList(RequestBody PersonList personList) {
        return personList.save(personList);
    }

    @PutMapping
    public PersonList updateList(RequestBody PersonList personList) {
        return personList.save(personList);
    }

    @DeleteMapping
    public void deleteList(@RequestParam Long index) {
       personList.deleteById(index);
    }
}

