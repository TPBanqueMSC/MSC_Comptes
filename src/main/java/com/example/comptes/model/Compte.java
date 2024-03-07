package com.example.comptes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {

    @Id
    private String id;
    private String numeroCompte;
    private String titulaireCompte;
    private double solde;

}
