package com.example.gestione_prenotazioni.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "postazione")

public class Postazione {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codice;  // Codice univoco della postazione

    @Column(nullable = false)
    private String descrizione;  // Descrizione della postazione (es. "Scrivania vicino alla finestra")

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoPostazione tipo;  // Tipo di postazione (es. "scrivania", "ufficio", ecc.)

    @Column(nullable = false)
    private int maxOccupanti;  // Numero massimo di occupanti

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;  // Relazione con l'edificio in cui si trova la postazione

    private boolean isDisponibile = true;

    public void setDisponibile(boolean b) {
    }
}
