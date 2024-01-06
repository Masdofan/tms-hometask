package com.example.hometask44_les48.repository;

import com.example.hometask44_les48.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Optional<Person> findByLogin(String login);
}
