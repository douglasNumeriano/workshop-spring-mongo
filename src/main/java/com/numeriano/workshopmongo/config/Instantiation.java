package com.numeriano.workshopmongo.config;

import com.numeriano.workshopmongo.domain.User;
import com.numeriano.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//Classe que implementa alguns registros no banco de dados

@Configuration
public class Instantiation implements CommandLineRunner {


    @Autowired
    private UserRepository userReposiroty;

    @Override
    public void run(String... args) throws Exception {

        userReposiroty.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
    }
}
