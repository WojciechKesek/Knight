package com.examples.services;

import com.examples.knights.Knight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KnightService {
    @Autowired
    Knight knight;

    public void sendKnight(){
        knight.embarkOnQuest();
    }
}
