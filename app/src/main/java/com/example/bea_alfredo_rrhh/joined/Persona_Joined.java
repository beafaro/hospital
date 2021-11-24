package com.example.bea_alfredo_rrhh.joined;

import javax.persistence.*;

@Entity
@Table(name="personal_joined")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo_personal", discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue(value="0")

public class Persona_Joined {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idpersona")
    private int id;

    private String dni, nss, nombre, direccion, telefono;

    public Persona_Joined(String dni, String nss, String nombre, String direccion, String telefono) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Persona_Joined() {}
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
