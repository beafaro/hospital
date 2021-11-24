package com.example.bea_alfredo_rrhh.joined;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="personal_limpieza_joined")
@PrimaryKeyJoinColumn(name="idpersona")
@DiscriminatorValue(value="2")

public class Limpieza_Joined extends Persona_Joined {

    @ManyToOne
    @JoinColumn(name="idturno")
    private Turno_Joined turno;

    @OneToMany(mappedBy="limpiador")
    private List<Planta_Joined> plantas;

    public Limpieza_Joined(String dni, String nss, String nombre, String direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }

    public Limpieza_Joined() {
    }

    public Turno_Joined getTurno() {
        return turno;
    }

    public void setTurno(Turno_Joined turno) {
        this.turno = turno;
    }

    public List<Planta_Joined> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<Planta_Joined> plantas) {
        this.plantas = plantas;
    }
}
