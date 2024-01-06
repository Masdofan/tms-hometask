package com.example.hometask44_les48.service;

import com.example.hometask44_les48.dto.UserDto;
import com.example.hometask44_les48.model.Person;
import com.example.hometask44_les48.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DBUserDetailsService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    private final PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return personRepository.findByLogin(username)
                .orElse(null);
    }

    public void save(UserDto user) {

        String username = user.getUsername();
        String password = user.getPassword();

        Person person = new Person();
        person.setLogin(username);
        person.setPassword(passwordEncoder.encode(password));

        personRepository.save(person);
    }
}
