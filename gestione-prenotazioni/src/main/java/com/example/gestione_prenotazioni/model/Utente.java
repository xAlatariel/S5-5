package com.example.gestione_prenotazioni.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utenti")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String nomeCognome;

    @Column(nullable = false, unique = true)
    private String email;

    public Utente(String username, String nomeCognome, String email) {
        this.username = username;
        this.nomeCognome = nomeCognome;
        this.email = email;
    }
}
