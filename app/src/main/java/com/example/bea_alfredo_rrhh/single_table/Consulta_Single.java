package com.example.bea_alfredo_rrhh.single_table;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="consulta_single_table")
public class Consulta_Single {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idconsulta")
    private int id;

    @Column
    private String descripcion;
    @Column
    private Date fecha;

    @OneToOne(mappedBy="consulta")
    private Enfermero_Single enfermero;

    @ManyToOne
    @JoinColumn(name="idplanta")
    private Planta_Single planta;


    public Consulta_Single() {

    }

    public Consulta_Single(String descripcion, Date fecha) {
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

    public Enfermero_Single getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero_Single enfermero) {
        this.enfermero = enfermero;
    }

    public Planta_Single getPlanta() {
        return planta;
    }

    public void setPlanta(Planta_Single planta) {
        this.planta = planta;
    }
}
