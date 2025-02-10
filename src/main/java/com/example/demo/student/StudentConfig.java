package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student ahmet = new Student(
                    "Ahmet Taha",
                    "ahmettahaklc@gmail.com",
                    LocalDate.of(2003, APRIL,3)

            );

            Student mehmet = new Student(

                    "Mehmet Ali",
                    "mehmetali_klc@gmail.com",
                    LocalDate.of(2001, SEPTEMBER,21)

            );

            repository.saveAll(
                    List.of(mehmet, ahmet)
            );
        };
    }
}
