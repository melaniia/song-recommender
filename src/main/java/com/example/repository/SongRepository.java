package com.example.repository;

import com.example.entity.SongEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<SongEntity, Integer> {

}
