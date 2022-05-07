package com.ruhacks.ceto.repo;

import com.ruhacks.ceto.model.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepo extends CrudRepository<Profile, String> {
    Profile findProfileByEmail(String email);
}
