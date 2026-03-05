package com.delpadre.scool.models;

import com.delpadre.scool.enums.AlunoEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "TBL_ALUNO")
public class AlunoModel {

    @Id // cria chave primeria  no banco
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String matricula;
    private String endereco;
    private AlunoEnum status;

    public AlunoModel() {
    }

    public AlunoEnum getStatus() {
        return status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
