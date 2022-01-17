package com.laetprojetos.dsmovie.repositories;

import com.laetprojetos.dsmovie.entities.Movie;
import com.laetprojetos.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
