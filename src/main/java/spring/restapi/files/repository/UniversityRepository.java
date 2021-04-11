package spring.restapi.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.restapi.files.model.University;

/**
 * Class is an interface that extends JpaRepository for persisting data.
 */


public interface UniversityRepository extends JpaRepository<University, Long>{
}
