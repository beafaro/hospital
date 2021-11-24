package com.example.bea_alfredo_rrhh;


import com.example.bea_alfredo_rrhh.joined.*;
import com.example.bea_alfredo_rrhh.single_table.*;
import com.example.bea_alfredo_rrhh.table_per_class.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Single table
        Consulta_Single cons1 = new Consulta_Single("desc", new Date());
        Turno_Single turnoSingle1 = new Turno_Single("", "");
        Planta_Single plantaSingle1 = new Planta_Single();
        Enfermero_Single enf1 = new Enfermero_Single();
        enf1.setConsulta(cons1);
        cons1.setEnfermero(enf1);
        enf1.setTurno(turnoSingle1);
        turnoSingle1.setEnfermeros(new ArrayList<Enfermero_Single>(Arrays.asList (enf1)));
        enf1.setPlanta(plantaSingle1);
        plantaSingle1.setEnfermeros(new ArrayList<Enfermero_Single>(Arrays.asList (enf1)));

        Limpieza_Single limp1 = new Limpieza_Single();
        limp1.setTurno(turnoSingle1);
        turnoSingle1.setPersonalLimpieza(new ArrayList<Limpieza_Single>(Arrays.asList(limp1)));
        limp1.setPlantas(new ArrayList<Planta_Single>(Arrays.asList (plantaSingle1)));
        plantaSingle1.setLimpiador(limp1);

        em.persist(enf1);
        em.persist(limp1);
        em.persist(turnoSingle1);
        em.persist(plantaSingle1);
        em.persist(cons1);

        // Table per class
        Consulta_Per_Class cons2 = new Consulta_Per_Class("desc", new Date());
        Turno_Per_Class turnoPerClass2 = new Turno_Per_Class("", "");
        Planta_Per_Class plantaPerClass2 = new Planta_Per_Class();
        Enfermero_Per_Class enf2 = new Enfermero_Per_Class();
        enf2.setConsulta(cons2);
        cons2.setEnfermero(enf2);
        enf2.setTurno(turnoPerClass2);
        turnoPerClass2.setEnfermeros(new ArrayList<Enfermero_Per_Class>(Arrays.asList (enf2)));
        enf2.setPlanta(plantaPerClass2);
        plantaPerClass2.setEnfermeros(new ArrayList<Enfermero_Per_Class>(Arrays.asList (enf2)));

        Limpieza_Per_Class limp2 = new Limpieza_Per_Class();
        limp2.setTurno(turnoPerClass2);
        turnoPerClass2.setPersonalLimpieza(new ArrayList<Limpieza_Per_Class>(Arrays.asList(limp2)));
        limp2.setPlantas(new ArrayList<Planta_Per_Class>(Arrays.asList (plantaPerClass2)));
        plantaPerClass2.setLimpiador(limp2);

        em.persist(enf2);
        em.persist(limp2);
        em.persist(turnoPerClass2);
        em.persist(plantaPerClass2);
        em.persist(cons2);

        // Joined
        Consulta_Joined cons3 = new Consulta_Joined("desc", new Date());
        Turno_Joined turnoJoined3 = new Turno_Joined("", "");
        Planta_Joined plantaJoined3 = new Planta_Joined();
        Enfermero_Joined enf3 = new Enfermero_Joined();
        enf3.setConsulta(cons3);
        cons3.setEnfermero(enf3);
        enf3.setTurno(turnoJoined3);
        turnoJoined3.setEnfermeros(new ArrayList<Enfermero_Joined>(Arrays.asList (enf3)));
        enf3.setPlanta(plantaJoined3);
        plantaJoined3.setEnfermeros(new ArrayList<Enfermero_Joined>(Arrays.asList (enf3)));

        Limpieza_Joined limp3 = new Limpieza_Joined();
        limp3.setTurno(turnoJoined3);
        turnoJoined3.setPersonalLimpieza(new ArrayList<Limpieza_Joined>(Arrays.asList(limp3)));
        limp3.setPlantas(new ArrayList<Planta_Joined>(Arrays.asList (plantaJoined3)));
        plantaJoined3.setLimpiador(limp3);

        em.persist(enf3);
        em.persist(limp3);
        em.persist(turnoJoined3);
        em.persist(plantaJoined3);
        em.persist(cons3);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
