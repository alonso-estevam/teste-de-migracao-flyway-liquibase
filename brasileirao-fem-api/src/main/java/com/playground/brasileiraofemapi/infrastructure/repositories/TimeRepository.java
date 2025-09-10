package com.playground.brasileiraofemapi.infrastructure.repositories;

import com.playground.brasileiraofemapi.infrastructure.entities.TimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<TimeEntity, Long> {

}
