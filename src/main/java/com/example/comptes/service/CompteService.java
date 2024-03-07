package com.example.comptes.service;

import com.example.comptes.model.Compte;
import com.example.comptes.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {

    @Autowired
    private CompteRepository compteRepository;

    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }

    public Compte creerCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    // Autres méthodes de service si nécessaire
}
