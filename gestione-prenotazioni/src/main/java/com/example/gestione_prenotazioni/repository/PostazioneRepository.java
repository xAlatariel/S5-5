package com.example.gestione_prenotazioni.repository;

import com.example.gestione_prenotazioni.model.Postazione;
import com.example.gestione_prenotazioni.model.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);

    List<Postazione> findByTipoAndEdificio_Citta();
}