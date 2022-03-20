package com.example.springapimongodbwithdocker.controller;

import com.example.springapimongodbwithdocker.model.Kullanici;
import com.example.springapimongodbwithdocker.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciController {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @PostConstruct
    public void init() {
        Kullanici kullanici = new Kullanici();
        kullanici.setName("Orhan");
        kullanici.setSurname("Dgdu");
        kullaniciRepository.save(kullanici);
    }

    @PostMapping("")
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici) {
        return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @GetMapping("")
    public ResponseEntity<List<Kullanici>> tumunuListele() {
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }
}
