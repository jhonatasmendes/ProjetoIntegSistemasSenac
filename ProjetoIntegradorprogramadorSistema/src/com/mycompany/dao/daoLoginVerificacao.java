/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.utilidades.BancoDeDadosMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author liberalino.1980
 */
public class daoLoginVerificacao extends BancoDeDadosMySql{
          
      public boolean verificarLoginAdm(String usuario, String senha) {
        boolean verificacaoLogin = false;
        String sql = """
                     select * from
                     administrador a
                     where a.usuario = ? and a.senha = ?
                     """;

        try (Connection conn = BancoDeDadosMySql.obterConexao(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    verificacaoLogin = true;
                }
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return verificacaoLogin;
    }
      
      public boolean verificarLoginVendedor(String usuario, String senha) {
        boolean verificacaoLogin = false;
        String sql = """
                     select * from
                     vendedor v
                     where v.usuario = ? and v.senha = ?
                     """;

        try (Connection conn = BancoDeDadosMySql.obterConexao(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             

            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    verificacaoLogin = true;
                }
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return verificacaoLogin;
    }
      
      public boolean verificarLoginCliente(String usuario, String senha) {
        boolean verificacaoLogin = false;
        String sql = """
                     select * from
                     cliente c
                     where c.usuario = ? and c.senha = ?
                     """;

        try (Connection conn = BancoDeDadosMySql.obterConexao(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    verificacaoLogin = true;
                }
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return verificacaoLogin;
    }
      
      public ResultSet idVendedorLogado (String usuario, String senha){
        try{
            String sql = """
                     select v.id from
                     vendedor v
                     where v.usuario = ? and v.senha = ?
                     """;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, usuario);
            getStatement().setString(2, senha);
            
            getStatement().executeQuery();
            
            setResultado(getStatement().executeQuery());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
}
