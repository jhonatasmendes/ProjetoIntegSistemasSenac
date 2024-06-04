/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author liberalino.1980
 */
public class modeloConteudo {
    int id;
    String nome;
    int id_categoria;
    int id_genero;

    @Override
    public String toString() {
        return "modeloConteudo{" + "id=" + id + ", nome=" + nome + ", id_categoria=" + id_categoria + ", id_genero=" + id_genero + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public int getId_genero() {
        return id_genero;
    }

    public modeloConteudo() {
    }
}
