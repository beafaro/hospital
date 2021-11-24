package com.example.bea_alfredo_rrhh.joined;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="turnos_joined")
public class Turno_Joined {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idturno")
    private int id;

    @Column
    private String horaInicio;
    @Column
    private String horaFin;

    @OneToMany(mappedBy="turno")
    private List<Limpieza_Joined> personallimpieza;

    @OneToMany(mappedBy="turno")
    private List<Enfermero_Joined> enfermero;

    public Turno_Joined() {
    }

    public Turno_Joined(String horaInicio, String horaFin) {
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

    public List<Limpieza_Joined> getPersonalLimpieza() {
        return personallimpieza;
    }

    public void setPersonalLimpieza(List<Limpieza_Joined> personallimpieza) {
        this.personallimpieza = personallimpieza;
    }

    public List<Enfermero_Joined> getEnfermeros() {
        return enfermero;
    }

    public void setEnfermeros(List<Enfermero_Joined> enfermero) {
        this.enfermero = enfermero;
    }
}
