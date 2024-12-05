package com.example.stageapi.model;

import jakarta.persistence.*;



@Entity
@Table
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idSociete;
    String nomCommercial;
    String activite;
    String pays;

    public Societe() {}

    public Societe(String nomCommercial, String activite, String pays) {
        this.nomCommercial = nomCommercial;
        this.activite = activite;
        this.pays = pays;
    }

    public Long getIdSociete() {
        return idSociete;
    }

    public void setIdSociete(Long idSociete) {
        this.idSociete = idSociete;
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
