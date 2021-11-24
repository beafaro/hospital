package com.example.bea_alfredo_rrhh.joined;

import javax.persistence.*;

@Entity
@Table(name="enfermeros_joined")
@PrimaryKeyJoinColumn(name="idpersona")
@DiscriminatorValue(value="1")

public class Enfermero_Joined extends Persona_Joined {
    @OneToOne
    @JoinColumn(name="idconsulta")
    private Consulta_Joined consulta;

    @ManyToOne
    @JoinColumn(name="idplanta")
    private Planta_Joined planta;

    @ManyToOne
    @JoinColumn(name="idturno")
    private Turno_Joined turno;

    public Enfermero_Joined(String dni, String nss, String nombre, String direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }

    public Enfermero_Joined() {
    }

    public Consulta_Joined getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta_Joined consulta) {
        this.consulta = consulta;
    }

    public Planta_Joined getPlanta() {
        return planta;
    }

    public void setPlanta(Planta_Joined planta) {
        this.planta = planta;
    }

    public Turno_Joined getTurno() {
        return turno;
    }

    public void setTurno(Turno_Joined turno) {
        this.turno = turno;
    }
}
