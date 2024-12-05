package com.example.stageapi.service;


import com.example.stageapi.model.OffreStage;
import com.example.stageapi.repository.OffreRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class OffreStageService implements OffreServiceInterface {
    @Autowired
    private OffreRepository offreRepository;
    public OffreStageService(OffreRepository offreRepository) {this.offreRepository = offreRepository;}


    @Override
    public List<OffreStage> getAllOffreStage() {
        return offreRepository.findAll();
    }
    @Override
    public OffreStage getOffreStageById(Long id) {
        return offreRepository.findById(id).get();
    }
    @Override
    public OffreStage updateOffreStageById(Long code,OffreStage offre) {
        return offreRepository.save(offre);
    }
    @Override
    public void deleteOffreStageById(Long id) {
        offreRepository.deleteById(id);
    }
    @Override
    public OffreStage createOffreStage(OffreStage offre){
        return offreRepository.save(offre);
    }

    @Override
    public List<OffreStage> getStagesByIntitule(String intitule) {
        return offreRepository.findByIntitule(intitule);
    }

    @Override
    public List<OffreStage> getStagesBySociete(Long idSociete) {
        return offreRepository.findBySocieteId(idSociete);
    }

    @Override
    public List<OffreStage> getStagesByPays(String pays) {
        return offreRepository.findBySociete_Pays(pays);
    }

    @Override
    public void deleteStageBySpecialite(String specialite) {
        offreRepository.deleteBySocieteSpecialite(specialite);
    }
}
