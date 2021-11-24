package com.example.bea_alfredo_rrhh.table_per_class;

import javax.persistence.*;

@Entity
@Table(name="enfermeros_per_class")
public class Enfermero_Per_Class extends Persona_Per_Class {
    @OneToOne
    @JoinColumn(name="idconsulta")
    private Consulta_Per_Class consulta;

    @ManyToOne
    @JoinColumn(name="idplanta")
    private Planta_Per_Class planta;

    @ManyToOne
    @JoinColumn(name="idturno")
    private Turno_Per_Class turno;

    public Enfermero_Per_Class(String dni, String nss, String nombre, String direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }

    public Enfermero_Per_Class() {
    }

    public Consulta_Per_Class getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta_Per_Class consulta) {
        this.consulta = consulta;
    }

    public Planta_Per_Class getPlanta() {
        return planta;
    }

    public void setPlanta(Planta_Per_Class planta) {
        this.planta = planta;
    }

    public Turno_Per_Class getTurno() {
        return turno;
    }

    public void setTurno(Turno_Per_Class turno) {
        this.turno = turno;
    }
}
