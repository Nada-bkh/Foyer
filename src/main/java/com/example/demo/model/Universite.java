package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdUniversite;
    private String nomUniversite;
    private String adresse;

    public Universite() {
    }

    public long getIdUniversite() {
        return IdUniversite;
    }

    public void setIdUniversite(long idUniversite) {
        IdUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Universite that = (Universite) o;
        return IdUniversite == that.IdUniversite && Objects.equals(nomUniversite, that.nomUniversite) && Objects.equals(adresse, that.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdUniversite, nomUniversite, adresse);
    }
}
