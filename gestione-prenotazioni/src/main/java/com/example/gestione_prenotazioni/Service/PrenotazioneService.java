package com.example.gestione_prenotazioni.Service;

import com.example.gestione_prenotazioni.model.Prenotazione;
import com.example.gestione_prenotazioni.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public List<Prenotazione> getAllPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    public Prenotazione getPrenotazioneById(Long id) {
        return prenotazioneRepository.findById(id).orElse(null);
    }

//    public Prenotazione savePrenotazione(Prenotazione prenotazione) {
//        if (prenotazione.getPostazione().isDisponibile()) {
//            prenotazione.getPostazione().setDisponibile(false);
//            return prenotazioneRepository.save(prenotazione);
//        } else {
//            throw new RuntimeException("Postazione non disponbile");
//        }
//    }
}