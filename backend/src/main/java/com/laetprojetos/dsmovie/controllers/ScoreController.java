package com.laetprojetos.dsmovie.controllers;

import com.laetprojetos.dsmovie.dto.MovieDTO;
import com.laetprojetos.dsmovie.dto.ScoreDTO;
import com.laetprojetos.dsmovie.services.MovieService;
import com.laetprojetos.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }

}
