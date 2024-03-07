package com.example.comptes.repository;

import com.example.comptes.model.Compte;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompteRepository extends MongoRepository<Compte, String> {
    // Vous pouvez ajouter des méthodes de requête personnalisées si nécessaire
}
