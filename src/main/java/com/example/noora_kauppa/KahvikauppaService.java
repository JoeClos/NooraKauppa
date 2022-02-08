package com.example.noora_kauppa;

import java.util.List;

public interface KahvikauppaService {


    List<Tuote> getAllTuotteet();
    Tuoteet getTuotteetById(long id);
       
    
    
}
