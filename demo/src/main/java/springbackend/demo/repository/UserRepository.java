package springbackend.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbackend.demo.model.User;
// permet d'acceder aux methodes de repository que met à dispo JPA
// https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // cette interface qui nous indiquera les methodes qui permettront de manipuler les donnees dans la bdd 
}
