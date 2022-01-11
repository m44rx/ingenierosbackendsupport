package com.igh.ingenierosbackendsupport.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "proyectos")
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProyecto;
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    @Column(length = 8)
    private String codigoProyecto;
    @Column(columnDefinition = "TINYINT (1)")
    private Boolean estadoProyecto;
    
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @OneToOne
    @JoinColumn(name = "id_contrato",referencedColumnName = "id")
    private Contrato contrato;

    @OneToOne
    @JoinColumn(name = "id_cpc_historico", referencedColumnName = "id")
    private CpcHistorico cpcHistorico;

    @OneToOne
    @JoinColumn(name = "id_colaborador",referencedColumnName = "idColaborador")
    private Colaborador colaborador;
}
