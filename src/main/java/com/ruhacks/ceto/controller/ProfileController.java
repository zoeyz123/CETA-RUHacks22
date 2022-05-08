package com.ruhacks.ceto.controller;

import com.ruhacks.ceto.model.Profile;
import com.ruhacks.ceto.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {
    @Autowired
    ProfileRepo repo;

    @GetMapping(path = "/profiles/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Profile getProfile(@PathVariable String email) {
       return repo.findProfileByEmail(email);
    }

    @PostMapping(path = "/profiles", consumes = MediaType.APPLICATION_JSON_VALUE)
    private void addProfile(@RequestBody Profile profile) {
        repo.save(profile);
    }

    @GetMapping("/profiles")
    private Boolean userAuthen(@RequestParam String email, @RequestParam String password) {
        return repo.existsByEmailAndPassword(email, password);
    }

}
