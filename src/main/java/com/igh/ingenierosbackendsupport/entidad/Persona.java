package com.igh.ingenierosbackendsupport.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correo;
    private int celular;
    private String foto;
    private int numDocumento;

    @OneToOne
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id")
    private DocumentoIdentidad documentoIdentidad;

    @OneToOne
    @JoinColumn(name = "id_usuario",referencedColumnName = "id")
    private Usuario usuario;

    @OneToOne(mappedBy = "persona")
    private Colaborador colaborador;
}
