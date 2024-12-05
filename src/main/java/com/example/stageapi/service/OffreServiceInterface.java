package com.example.stageapi.service;

import com.example.stageapi.model.OffreStage;

import java.util.List;

public interface OffreServiceInterface {

    List<OffreStage> getAllOffreStage();


    OffreStage getOffreStageById(Long id);


    OffreStage updateOffreStageById(Long code, OffreStage offre);


    void deleteOffreStageById(Long id);


    OffreStage createOffreStage(OffreStage offre);

    List<OffreStage> getStagesByIntitule(String intitule);

    List<OffreStage> getStagesBySociete(Long idSociete);

    List<OffreStage> getStagesByPays(String pays);

    void deleteStageBySpecialite(String specialite);
}
