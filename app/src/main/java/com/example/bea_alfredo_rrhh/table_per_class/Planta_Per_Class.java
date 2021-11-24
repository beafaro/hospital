package com.example.bea_alfredo_rrhh.table_per_class;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="plantas_per_class")
public class Planta_Per_Class {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "planta")
    private List<Enfermero_Per_Class> enfermero;;

    @ManyToOne
    @JoinColumn(name="plantas")
    private Limpieza_Per_Class limpiador;

    @OneToMany(mappedBy="planta")
    private List<Consulta_Per_Class> consulta;;

    public Planta_Per_Class() {
    }

    public Planta_Per_Class(List<Enfermero_Per_Class> enfermero) {
        this.enfermero = enfermero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Enfermero_Per_Class> getEnfermeros() {
        return enfermero;
    }

    public void setEnfermeros(List<Enfermero_Per_Class> enfermero) {
        this.enfermero = enfermero;
    }

    public List<Consulta_Per_Class> getConsultas() {
        return consulta;
    }

    public void setConsultas(List<Consulta_Per_Class> consulta) {
        this.consulta = consulta;
    }

    public Limpieza_Per_Class getLimpiador() {
        return limpiador;
    }

    public void setLimpiador(Limpieza_Per_Class limpiador) {
        this.limpiador = limpiador;
    }
}
