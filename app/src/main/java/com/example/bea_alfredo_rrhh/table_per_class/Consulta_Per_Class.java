package com.example.bea_alfredo_rrhh.table_per_class;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="consulta_per_class")
public class Consulta_Per_Class {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idconsulta")
    private int id;

    @Column
    private String descripcion;
    @Column
    private Date fecha;

    @OneToOne(mappedBy="consulta")
    private Enfermero_Per_Class enfermero;

    @ManyToOne
    @JoinColumn(name="idplanta")
    private Planta_Per_Class planta;


    public Consulta_Per_Class() {

    }

    public Consulta_Per_Class(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Enfermero_Per_Class getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero_Per_Class enfermero) {
        this.enfermero = enfermero;
    }

    public Planta_Per_Class getPlanta() {
        return planta;
    }

    public void setPlanta(Planta_Per_Class planta) {
        this.planta = planta;
    }
}
