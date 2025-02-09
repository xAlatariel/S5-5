package com.example.gestione_prenotazioni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="prenotazioni")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id",nullable = false)
    private Postazione postazione;

    @Column(nullable = false)
    private LocalDate dataPrenotazione;

    public Prenotazione(LocalDate dataPrenotazione, Postazione postazione, Utente utente) {
        this.dataPrenotazione = dataPrenotazione;
        this.postazione = postazione;
        this.utente = utente;
    }
}