package com.example.bea_alfredo_rrhh.single_table;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="plantas_single_table")
public class Planta_Single {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "planta")
    private List<Enfermero_Single> enfermero;

    @ManyToOne
    @JoinColumn(name="plantas")
    private Limpieza_Single limpiador;

    @OneToMany(mappedBy="planta")
    private List<Consulta_Single> consulta;

    public Planta_Single() {
    }

    public Planta_Single(List<Enfermero_Single> enfermero) {
        this.enfermero = enfermero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Enfermero_Single> getEnfermeros() {
        return enfermero;
    }

    public void setEnfermeros(List<Enfermero_Single> enfermero) {
        this.enfermero = enfermero;
    }

    public List<Consulta_Single> getConsultas() {
        return consulta;
    }

    public void setConsultas(List<Consulta_Single> consulta) {
        this.consulta = consulta;
    }

    public Limpieza_Single getLimpiador() {
        return limpiador;
    }

    public void setLimpiador(Limpieza_Single limpiador) {
        this.limpiador = limpiador;
    }
}
