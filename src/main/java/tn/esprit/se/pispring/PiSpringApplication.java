package tn.esprit.se.pispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableScheduling
@SpringBootApplication
@EnableScheduling

public class PiSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PiSpringApplication.class, args);
    }


    @Bean
    public PasswordEncoder passwordEncoder () {

        return new BCryptPasswordEncoder(11);
    }
}
