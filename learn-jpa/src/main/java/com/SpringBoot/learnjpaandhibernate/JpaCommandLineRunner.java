package com.SpringBoot.learnjpaandhibernate;

import com.SpringBoot.learnjpaandhibernate.jpa.JpaRepository;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaCommandLineRunner implements CommandLineRunner {

    @Autowired
   private JpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
    repository.insert(new Course(1,"krishna","sharma"));
    }
}
