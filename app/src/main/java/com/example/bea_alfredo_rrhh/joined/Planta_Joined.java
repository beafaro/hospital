package com.example.bea_alfredo_rrhh.joined;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="plantas_joined")
public class Planta_Joined {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "planta")
    private List<Enfermero_Joined> enfermero;

    @ManyToOne
    @JoinColumn(name="plantas")
    private Limpieza_Joined limpiador;

    @OneToMany(mappedBy="planta")
    private List<Consulta_Joined> consulta;

    public Planta_Joined() {
    }

    public Planta_Joined(List<Enfermero_Joined> enfermero) {
        this.enfermero = enfermero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Enfermero_Joined> getEnfermeros() {
        return enfermero;
    }

    public void setEnfermeros(List<Enfermero_Joined> enfermero) {
        this.enfermero = enfermero;
    }

    public Limpieza_Joined getLimpiador() {
        return limpiador;
    }

    public void setLimpiador(Limpieza_Joined limpiador) {
        this.limpiador = limpiador;
    }

    public List<Consulta_Joined> getConsultas() {
        return consulta;
    }

    public void setConsultas(List<Consulta_Joined> consulta) {
        this.consulta = consulta;
    }
}
