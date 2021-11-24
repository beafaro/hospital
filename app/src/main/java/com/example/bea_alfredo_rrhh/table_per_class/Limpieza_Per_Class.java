package com.example.bea_alfredo_rrhh.table_per_class;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="personal_limpieza_per_class")

public class Limpieza_Per_Class extends Persona_Per_Class {

    @ManyToOne
    @JoinColumn(name="idturno")
    private Turno_Per_Class turno;

    @OneToMany(mappedBy="limpiador")
    private List<Planta_Per_Class> planta;;

    public Limpieza_Per_Class(String dni, String nss, String nombre, String direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }

    public Limpieza_Per_Class() {
    }

    public Turno_Per_Class getTurno() {
        return turno;
    }

    public void setTurno(Turno_Per_Class turno) {
        this.turno = turno;
    }

    public List<Planta_Per_Class> getPlantas() {
        return planta;
    }

    public void setPlantas(List<Planta_Per_Class> planta) {
        this.planta = planta;
    }
}
