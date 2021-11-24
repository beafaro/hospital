package com.example.bea_alfredo_rrhh.single_table;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="turnos_single_table")
public class Turno_Single {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idturno")
    private int id;

    @Column
    private String horaInicio;
    @Column
    private String horaFin;

    @OneToMany(mappedBy="turno")
    private List<Limpieza_Single> personalLimpieza;

    @OneToMany(mappedBy="turno")
    private List<Enfermero_Single> enfermero;

    public Turno_Single() {
    }

    public Turno_Single(String horaInicio, String horaFin) {
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

    public List<Limpieza_Single> getPersonalLimpieza() {
        return personalLimpieza;
    }

    public void setPersonalLimpieza(List<Limpieza_Single> personalLimpieza) {
        this.personalLimpieza = personalLimpieza;
    }

    public List<Enfermero_Single> getEnfermeros() {
        return enfermero;
    }

    public void setEnfermeros(List<Enfermero_Single> enfermero) {
        this.enfermero = enfermero;
    }
}
