package com.vatsalya.miscellaneous.dao;

import com.vatsalya.miscellaneous.dto.MoviesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends CrudRepository <MoviesEntity,Long> {

}
