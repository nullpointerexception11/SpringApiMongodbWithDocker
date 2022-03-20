package com.example.springapimongodbwithdocker;

import com.example.springapimongodbwithdocker.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringApiMongodbWithDockerApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringApiMongodbWithDockerApplication.class, args);
    }

}
