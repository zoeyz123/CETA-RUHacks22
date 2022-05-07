package com.ruhacks.ceto.service;

import com.ruhacks.ceto.model.Profile;
import com.ruhacks.ceto.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    ProfileRepo repo;

    public Profile getProfile(String email) {
        return repo.findProfileByEmail(email);
    }

    public void insertProfile(Profile profile) {
        repo.save(profile);
    }
}
