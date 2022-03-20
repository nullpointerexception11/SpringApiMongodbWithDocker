package com.example.springapimongodbwithdocker.repository;

import com.example.springapimongodbwithdocker.model.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository<Kullanici, String> {

}
