package com.igh.ingenierosbackendsupport.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cpc_historicos")
public class CpcHistorico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String problemas;
    private Long ganancias;
    private int faltas;
    private int numeroProyecto;

    @OneToOne(mappedBy = "cpcHistorico")
    private Proyecto proyecto;
}
