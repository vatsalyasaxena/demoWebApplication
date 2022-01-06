package com.vatsalya.miscellaneous.service;

import com.vatsalya.miscellaneous.dao.MoviesRepository;
import com.vatsalya.miscellaneous.dto.MoviesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MoviesService {

    @Autowired
    MoviesRepository repository;

    public Mono<?> moviesInquiry(){
        return Mono.just(repository.findAll());
    }

    public Mono<?> saveMovies(MoviesEntity moviesEntity){
        return Mono.just(repository.save(moviesEntity));
    }
}
