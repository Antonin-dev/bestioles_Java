package com.example.bestiole.repo;

import com.example.bestiole.domain.Specie;
import org.springframework.data.repository.CrudRepository;

public interface SpecieRepository extends CrudRepository<Specie, Long> {
}