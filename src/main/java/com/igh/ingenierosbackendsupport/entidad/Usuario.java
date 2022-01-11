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
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 15)
    private String username;
    @Column(length = 150)
    private String password;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean estado;

    @OneToOne(mappedBy = "usuario")
    private Persona persona;
}
