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
@Table(name = "contratos")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private String descripcion;
    private Boolean estadoContrato;
    private String codigoContrato;
    private String lideContrato;
    private Long precio;

    @OneToOne(mappedBy = "contrato")
    private Proyecto proyecto;
    
}
