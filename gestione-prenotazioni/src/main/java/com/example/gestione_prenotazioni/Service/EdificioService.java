package com.example.gestione_prenotazioni.Service;

import com.example.gestione_prenotazioni.model.Edificio;
import com.example.gestione_prenotazioni.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;

    public List<Edificio> getAllEdifici() {
        return edificioRepository.findAll();
    }

    public Edificio getEdificioById(Long id) {
        return edificioRepository.findById(id).orElse(null);
    }


    public Edificio saveEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    public void deleteEdificio(Long id) {
        edificioRepository.deleteById(id);
    }

    public List<Edificio> findEdificiByCitta(String citta) {
        return edificioRepository.findByCitta(citta);
    }
}