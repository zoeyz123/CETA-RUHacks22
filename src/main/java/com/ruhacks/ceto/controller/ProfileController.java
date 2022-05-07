package com.ruhacks.ceto.controller;

import com.ruhacks.ceto.model.Profile;
import com.ruhacks.ceto.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {
    @Autowired
    ProfileService service;

    @GetMapping(path = "/profiles/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    private Profile getProfile(@PathVariable String email) {
       return service.getProfile(email);
    }

    @PostMapping(path = "/profiles", consumes = MediaType.APPLICATION_JSON_VALUE)
    private void addProfile(@RequestBody Profile profile) {
        service.insertProfile(profile);
    }

}
