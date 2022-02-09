package com.example.serseribf.repository;

import com.example.serseribf.model.Things;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ThingsRepository extends JpaRepository<Things, Long> {

    @Query("SELECT COUNT(t) FROM Things t")
    Integer findThingsCount();

}
