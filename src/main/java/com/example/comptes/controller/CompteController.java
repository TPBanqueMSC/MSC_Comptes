package com.example.comptes.controller;

import com.example.comptes.model.Compte;
import com.example.comptes.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/comptes")
public class CompteController {

    @Autowired
    private CompteService compteService;

    @GetMapping
    public List<Compte> getAllComptes() {
        return compteService.getAllComptes();
    }

        @PostMapping
    public ResponseEntity<Compte> creerCompte(@RequestBody Compte compte) {
        Compte nouveauCompte = compteService.creerCompte(compte);
        return new ResponseEntity<>(nouveauCompte, HttpStatus.CREATED);
    }
}
