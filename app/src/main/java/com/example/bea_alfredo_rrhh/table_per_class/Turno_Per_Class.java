package com.example.bea_alfredo_rrhh.table_per_class;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="turnos_per_class")
public class Turno_Per_Class {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idturno")
    private int id;

    @Column
    private String horaInicio;
    @Column
    private String horaFin;

    @OneToMany(mappedBy="turno")
    private List<Limpieza_Per_Class> personalLimpieza;

    @OneToMany(mappedBy="turno")
    private List<Enfermero_Per_Class> enfermero;;

    public Turno_Per_Class() {
    }

    public Turno_Per_Class(String horaInicio, String horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public List<Limpieza_Per_Class> getPersonalLimpieza() {
        return personalLimpieza;
    }

    public void setPersonalLimpieza(List<Limpieza_Per_Class> personalLimpieza) {
        this.personalLimpieza = personalLimpieza;
    }

    public List<Enfermero_Per_Class> getEnfermeros() {
        return enfermero;
    }

    public void setEnfermeros(List<Enfermero_Per_Class> enfermero) {
        this.enfermero = enfermero;
    }
}
