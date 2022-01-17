package com.laetprojetos.dsmovie.repositories;

import com.laetprojetos.dsmovie.entities.Score;
import com.laetprojetos.dsmovie.entities.ScorePK;
import com.laetprojetos.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
