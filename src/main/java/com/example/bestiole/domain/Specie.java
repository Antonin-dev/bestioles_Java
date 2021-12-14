package com.example.bestiole.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Specie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native",strategy = "native")

    private Long id;
    @Column
    private String commonName;
    @Column
    private String latinName;

    public Specie(){
    }

    // Constructor pour la création de l'entite
    public Specie(Long id, String commonName, String latinName) {
        this.id = id;
        this.commonName = commonName;
        this.latinName = latinName;
    }
    public Specie( String commonName, String latinName) {
        super();
        this.commonName = commonName;
        this.latinName = latinName;
    }

    // getter et setter
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    // Méthode to string pour renvoyer en string
    @Override
    public String toString() {
        return "Specie{" +
                "Id=" + this.id +
                ", commonName='" + commonName + '\'' +
                ", latinName='" + latinName + '\'' +
                '}';
    }

}
