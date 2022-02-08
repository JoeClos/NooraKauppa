package com.example.noora_kauppa;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TuotteetServiceImpl implements TuotteetService {
    @Autowired
    private TuoteRepository tuoteRepository;

    @Override
    public List<Tuote> getAllTuotteet() {
        return tuoteRepository.findAll();
    }

    @Override
    public Tuote getTuotteetById(long id) {
        Optional<Tuote> optional = tuoteRepository.findById(id);
		Tuote tuote = null;
		if (optional.isPresent()) {
			tuote = optional.get();
		} else {
			throw new RuntimeException(" Tuote not found for id :: " + id);
		}
		return tuote;
    }

    
   
}
