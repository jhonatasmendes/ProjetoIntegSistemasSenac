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
             
            // Configura os parâmetros do PreparedStatement
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            // Executa a consulta e obtém o ResultSet
            try (ResultSet rs = stmt.executeQuery()) {
                // Se houver pelo menos um registro, o login é válido
                if (rs.next()) {
                    verificacaoLogin = true;
                }
            }
            
        } catch (SQLException e) {
            // Imprime a mensagem de erro para depuração
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
             
            // Configura os parâmetros do PreparedStatement
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            // Executa a consulta e obtém o ResultSet
            try (ResultSet rs = stmt.executeQuery()) {
                // Se houver pelo menos um registro, o login é válido
                if (rs.next()) {
                    verificacaoLogin = true;
                }
            }
            
        } catch (SQLException e) {
            // Imprime a mensagem de erro para depuração
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
             
            // Configura os parâmetros do PreparedStatement
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            // Executa a consulta e obtém o ResultSet
            try (ResultSet rs = stmt.executeQuery()) {
                // Se houver pelo menos um registro, o login é válido
                if (rs.next()) {
                    verificacaoLogin = true;
                }
            }
            
        } catch (SQLException e) {
            // Imprime a mensagem de erro para depuração
            System.out.println(e.getMessage());
        }

        return verificacaoLogin;
    }
}
