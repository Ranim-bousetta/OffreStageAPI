package com.example.stageapi.model;

import jakarta.persistence.*;



@Entity
@Table
public class OffreStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long code;
    String intitule;
    String specialite;

    @ManyToOne
    @JoinColumn(name="idSociete", nullable=false)
    Societe societe;

    public OffreStage() {}

    public OffreStage(String intitule, String specialite, Societe societe) {
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

}
