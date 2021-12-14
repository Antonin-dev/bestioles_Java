package com.example.bestiole.service;

import com.example.bestiole.domain.Specie;
import com.example.bestiole.repo.SpecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class SpecieService {
    @Autowired
    SpecieRepository repository;

    public List<Specie> list(){
        return (List<Specie>) repository.findAll();
    }

    public Long create(Specie sp){
        sp.setId(null);
        sp = repository.save(sp);
        return sp.getId();
    }

    public void deleteById (Long id) {
        repository.deleteById(id);
    }

}
