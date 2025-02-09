package com.example.gestione_prenotazioni.repository;

import com.example.gestione_prenotazioni.model.Postazione;
import com.example.gestione_prenotazioni.model.Prenotazione;
import com.example.gestione_prenotazioni.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtente(Utente utente);
    boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate data);
}
