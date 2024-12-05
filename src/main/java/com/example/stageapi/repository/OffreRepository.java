package com.example.stageapi.repository;

import com.example.stageapi.model.OffreStage;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OffreRepository extends JpaRepository<OffreStage, Long> {
    List<OffreStage> findByIntitule(String intitule);

    @Query("SELECT offre FROM OffreStage offre WHERE offre.societe.idSociete = ?1")
    List<OffreStage> findBySocieteId(Long idSociete);

    List<OffreStage> findBySociete_Pays(String pays);
    @Query("SELECT o FROM OffreStage o WHERE o.societe.pays = :pays")
    List<OffreStage> findByPays(@Param("pays") String pays);

    @Transactional
    @Modifying
    @Query("DELETE FROM OffreStage o WHERE o.specialite = ?1")
    void deleteBySocieteSpecialite(String specialite);
}


