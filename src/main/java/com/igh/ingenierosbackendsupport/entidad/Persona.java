package com.igh.ingenierosbackendsupport.entidad;

import javax.persistence.Column;
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
    @Column(length = 100)
    private String nombres;
    @Column(length = 100)
    private String apellidos;
    @Column(length = 100)
    private String direccion;
    @Column(length = 100)
    private String correo;
    @Column(length = 9)
    private int celular;
    private String foto;
    // @Column(nullable = false)
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
