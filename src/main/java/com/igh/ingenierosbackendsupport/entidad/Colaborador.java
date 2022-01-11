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
@Table(name = "colaboradores")
public class Colaborador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idColaborador;
    @Column(length = 8)
    private String codColaborador;
    @Column(length = 120)
    private String correoContractor;
    @Column(length = 120)
    private String correoEmpresa;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean estado;
    
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    private String documentoCv;

    //idCargo
    @OneToOne
    @JoinColumn(name = "id_cargo",referencedColumnName = "id")
    private Cargo cargo;
    //idPersona
    @OneToOne
    @JoinColumn(name = "id_persona",referencedColumnName = "idPersona")
    private Persona persona;

    @OneToOne(mappedBy = "colaborador")
    private Proyecto proyecto;
}
