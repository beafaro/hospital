package com.example.bea_alfredo_rrhh.joined;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="consulta_joined")
public class Consulta_Joined {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idconsulta")
    private int id;

    @Column
    private String descripcion;
    @Column
    private Date fecha;

    @OneToOne(mappedBy="consulta")
    private Enfermero_Joined enfermero;

    @ManyToOne
    @JoinColumn(name="idplantaa")
    private Planta_Joined planta;

    public Consulta_Joined(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Consulta_Joined() {

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

    public Enfermero_Joined getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero_Joined enfermero) {
        this.enfermero = enfermero;
    }

    public Planta_Joined getPlanta() {
        return planta;
    }

    public void setPlanta(Planta_Joined planta) {
        this.planta = planta;
    }
}
