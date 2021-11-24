package com.example.bea_alfredo_rrhh.single_table;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue(value="2")

public class Limpieza_Single extends Persona_Single {

    @ManyToOne
    @JoinColumn(name="idturno")
    private Turno_Single turno;

    @OneToMany(mappedBy="limpiador")
    private List<Planta_Single> planta;

    public Limpieza_Single(String dni, String nss, String nombre, String direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }

    public Limpieza_Single() {
    }

    public Turno_Single getTurno() {
        return turno;
    }

    public void setTurno(Turno_Single turno) {
        this.turno = turno;
    }

    public List<Planta_Single> getPlantas() {
        return planta;
    }

    public void setPlantas(List<Planta_Single> planta) {
        this.planta = planta;
    }
}
