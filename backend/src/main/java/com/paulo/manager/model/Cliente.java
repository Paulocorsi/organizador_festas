package com.paulo.manager.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    @NotNull
    private float cpf;

    private String telefone;

    @NotNull
    private Date data_nascimento;

    public Cliente(){}

    public Cliente(String nome, float cpf, String telefone, Date data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCpf() { return cpf; }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
