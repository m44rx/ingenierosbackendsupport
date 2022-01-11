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
@Table(name = "tipo_documentos")
public class DocumentoIdentidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 10)
    private String nombreCorto;
    @Column(length = 45)
    private String nombreLargo;

    @OneToOne(mappedBy = "documentoIdentidad")
    private Persona persona;
}
