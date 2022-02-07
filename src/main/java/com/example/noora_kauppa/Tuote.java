package com.example.noora_kauppa;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Tuote extends AbstractPersistable<Long>{
    private String nimi;
    private String kuvaus;
    private BigDecimal hinta;
    private String kuva;
    
    @ManyToOne
    private Osasto osasto;

    @ManyToOne
    private Toimittaja toimittaja;

    @ManyToOne
    private Valmistaja valmistaja;
}
