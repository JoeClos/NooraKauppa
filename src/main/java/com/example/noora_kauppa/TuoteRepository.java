package com.example.noora_kauppa;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TuoteRepository extends JpaRepository<Tuote, Long> {
    // List<Tuote> findByOsasto_idIN(Collection<Long> tuotteet);
    
}
