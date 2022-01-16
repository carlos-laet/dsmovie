package com.laetprojetos.dsmovie.repositories;

import com.laetprojetos.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {


}
