package pl.tomaszpiotrowicz.person_app.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.tomaszpiotrowicz.person_app.dao.entity.PersonList;
import pl.tomaszpiotrowicz.person_app.dao.PersonListRepository;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class PersonListManager {

    private PersonListRepository personListRepository;

    @Autowired
    public PersonListManager(PersonListRepository personListRepository) {
        this.personListRepository = personListRepository;
    }



    public Optional<PersonList> findById(Long id) {
        return personListRepository.findById(id);
    }

    public Iterable<PersonList> findAll() {
        return personListRepository.findAll();

    }
    public  PersonList save(PersonList personList) {
        return personListRepository.save(personList);

    }
    public void deleteById(Long id){
        personListRepository.deleteById(id);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void fillDb(){
        save( new PersonList(1L,"Tom","pio", LocalDate.of(1990,1,1),"668473113"));
    }
    }

