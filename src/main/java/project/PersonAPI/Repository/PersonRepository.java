package project.PersonAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.PersonAPI.Entity.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
