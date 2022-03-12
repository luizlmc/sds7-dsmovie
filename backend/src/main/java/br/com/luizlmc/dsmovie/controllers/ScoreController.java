package br.com.luizlmc.dsmovie.controllers;

import br.com.luizlmc.dsmovie.dto.MovieDTO;
import br.com.luizlmc.dsmovie.dto.ScoreDTO;
import br.com.luizlmc.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService  scoreService;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO){
        MovieDTO movieDTO = scoreService.saveScore(scoreDTO);
        return movieDTO;
    }
}
