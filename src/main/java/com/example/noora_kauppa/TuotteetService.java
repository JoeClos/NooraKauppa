package com.example.noora_kauppa;

import java.util.List;

public interface TuotteetService {


    List<Tuote> getAllTuotteet();
    Tuote getTuotteetById(long id);
    static List<Tuote> haeKaikkiKahvilaitteet(List<Long> kahvilaitteet) {
        return null;
    }
       

  
}
