package br.gov.sp.fatec.springbootapp.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alu_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alu_id")
    private Long id;

    @Column(name = "alu_nome_completo", nullable = false)
    private String nomeCompleto;

    @Column(name = "alu_email_institucional", nullable = false)
    private String emailInstitucional;

    @Column(name = "alu_data_matricula", nullable = false)
    private LocalDate dataMatricula;

    @Column(name = "alu_indice")
    private Float indice;

    public Aluno() {}

    public Aluno(String nomeCompleto, String emailInstitucional, LocalDate dataMatricula, Float indice) {
        this.nomeCompleto = nomeCompleto;
        this.emailInstitucional = emailInstitucional;
        this.dataMatricula = dataMatricula;
        this.indice = indice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Float getIndice() {
        return indice;
    }

    public void setIndice(Float indice) {
        this.indice = indice;
    }
}