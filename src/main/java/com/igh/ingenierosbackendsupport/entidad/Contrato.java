package com.igh.ingenierosbackendsupport.entidad;

import javax.persistence.Column;
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
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean estadoContrato;
    @Column(length = 8)
    private String codigoContrato;
    @Column(length = 50)
    private String liderContrato;
    @Column(precision = 7, scale = 2)
    private Float precio;

    @OneToOne(mappedBy = "contrato")
    private Proyecto proyecto;
    
}
