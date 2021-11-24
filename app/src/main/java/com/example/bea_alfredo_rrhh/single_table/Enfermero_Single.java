package com.example.bea_alfredo_rrhh.single_table;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="1")

public class Enfermero_Single extends Persona_Single {
    @OneToOne
    @JoinColumn(name="idconsulta")
    private Consulta_Single consulta;

    @ManyToOne
    @JoinColumn(name="idplanta")
    private Planta_Single planta;

    @ManyToOne
    @JoinColumn(name="idturno")
    private Turno_Single turno;

    public Enfermero_Single(String dni, String nss, String nombre, String direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }

    public Enfermero_Single() {
    }

    public Consulta_Single getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta_Single consulta) {
        this.consulta = consulta;
    }

    public Planta_Single getPlanta() {
        return planta;
    }

    public void setPlanta(Planta_Single planta) {
        this.planta = planta;
    }

    public Turno_Single getTurno() {
        return turno;
    }

    public void setTurno(Turno_Single turno) {
        this.turno = turno;
    }
}
