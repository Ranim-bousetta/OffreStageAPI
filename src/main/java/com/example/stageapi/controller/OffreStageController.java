package com.example.stageapi.controller;

import com.example.stageapi.model.OffreStage;
import com.example.stageapi.service.OffreStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stages")
public class OffreStageController {
    @Autowired
    private OffreStageService offreStageService;
    public OffreStageController(){}
    public OffreStageController(OffreStageService offreStageService) {
        this.offreStageService = offreStageService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<OffreStage>> getAll() {
        return ResponseEntity.ok(offreStageService.getAllOffreStage());
    }
    @GetMapping("/get-by-id/{code}")
    public ResponseEntity<OffreStage> getById(@PathVariable Long code) {
        return ResponseEntity.ok(offreStageService.getOffreStageById(code));
    }

    @PostMapping("/save")
    public ResponseEntity<OffreStage> save(@RequestBody OffreStage offreStage) {
        return ResponseEntity.ok(offreStageService.createOffreStage(offreStage));
    }
    @PutMapping("/update/{code}")
    public ResponseEntity<OffreStage> update(@PathVariable Long code, @RequestBody OffreStage offreStage) {
        return ResponseEntity.ok(offreStageService.updateOffreStageById(code, offreStage));
    }
    @DeleteMapping("{code}")
    public void delete(@PathVariable Long code) {
        offreStageService.deleteOffreStageById(code);
    }
    @GetMapping("/intitule/{intitule}")
    public ResponseEntity<List<OffreStage>> getByIntitule(@PathVariable String intitule) {
        return ResponseEntity.ok(offreStageService.getStagesByIntitule(intitule));
    }

    @GetMapping("/societe/{idSociete}")
    public ResponseEntity<List<OffreStage>> getBySociete(@PathVariable Long idSociete) {
        return ResponseEntity.ok(offreStageService.getStagesBySociete(idSociete));
    }

    @GetMapping("/pays/{pays}")
    public List<OffreStage> getStagesByPays(@PathVariable String pays) {
        return offreStageService.getStagesByPays(pays);
    }
    @DeleteMapping("/specialite/{specialite}")
    public ResponseEntity<Void> deleteBySpecialite(@PathVariable String specialite) {
        offreStageService.deleteStageBySpecialite(specialite);
        return ResponseEntity.noContent().build();
    }
}
