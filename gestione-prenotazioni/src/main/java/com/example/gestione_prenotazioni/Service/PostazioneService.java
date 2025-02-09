package com.example.gestione_prenotazioni.Service;

import com.example.gestione_prenotazioni.model.Postazione;
import com.example.gestione_prenotazioni.model.TipoPostazione;
import com.example.gestione_prenotazioni.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;

    public List<Postazione> getAllPostazioni() {
        return postazioneRepository.findAll();
    }

    public List<Postazione> findPostazioniByTipoAndCitta(TipoPostazione tipo, String citta) {
        return postazioneRepository.findByTipoAndEdificio_Citta(tipo, citta);
    }

    public Postazione getPostazioneById(Long id) {
        Optional<Postazione> postazione = postazioneRepository.findById(id);
        return postazione.orElse(null); // Restituisce null se non trovato
    }

    public Postazione savePostazione(Postazione postazione) {
        return postazioneRepository.save(postazione);
    }

    public void deletePostazione(Long id) {
        postazioneRepository.deleteById(id);
    }

//    public List<Postazione> findDisponibiliByCitta(String citta) {
//        return postazioneRepository.findByTipoAndEdificio_Citta (citta);
//    }

}