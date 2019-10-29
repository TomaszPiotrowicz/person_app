package pl.tomaszpiotrowicz.person_app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.tomaszpiotrowicz.person_app.dao.entity.PersonList;


@Repository
public interface PersonListRepository extends CrudRepository<PersonList, Long> {
}
