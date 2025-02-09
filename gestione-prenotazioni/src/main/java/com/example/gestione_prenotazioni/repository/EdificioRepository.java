package com.example.gestione_prenotazioni.repository;

import com.example.gestione_prenotazioni.model.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {
    List<Edificio> findByCitta(String citta);
}