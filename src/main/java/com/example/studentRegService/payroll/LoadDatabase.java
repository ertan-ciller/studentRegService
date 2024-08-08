package com.example.studentRegService.payroll;

import com.example.studentRegService.dataAccess.StudentRepository;
import com.example.studentRegService.entites.Student;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

public class LoadDatabase {

    private static final Logger log = (Logger) LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabse(StudentRepository repository){
        return args -> {
            log.info("PreLoading " + repository.save(new Student()));

        };

    }

}
