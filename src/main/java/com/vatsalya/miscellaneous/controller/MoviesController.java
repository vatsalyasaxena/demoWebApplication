package com.vatsalya.miscellaneous.controller;

import com.vatsalya.miscellaneous.dto.MoviesEntity;
import com.vatsalya.miscellaneous.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MoviesController {

    @Autowired
    MoviesService moviesService;

    @GetMapping("reactor-cassandra/movies")
    public Mono<?> inquireMovies(){
       return  moviesService.moviesInquiry();
    }

    @PostMapping(value = "reactor-cassandra/movies",consumes = "application/json")
    public Mono<?> postMovie(@RequestBody MoviesEntity moviesEntity){
        return moviesService.saveMovies(moviesEntity);
    }
}
