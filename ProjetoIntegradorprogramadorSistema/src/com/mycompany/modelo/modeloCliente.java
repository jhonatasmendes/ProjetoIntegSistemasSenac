/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author liberalino.1980
 */
public class modeloCliente {
    int id;
    String nome;
    String usuario;
    String senha;
    int id_vendedor;

    public modeloCliente() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    @Override
    public String toString() {
        return "modeloCliente{" + "id=" + id + ", nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + ", id_vendedor=" + id_vendedor + '}';
    }
    
    
}
