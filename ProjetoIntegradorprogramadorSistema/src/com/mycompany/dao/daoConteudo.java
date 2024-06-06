/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.utilidades.BancoDeDadosMySql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author liberalino.1980
 */
public class daoConteudo extends BancoDeDadosMySql{
    
    private String sql;
    
    public Boolean inserir (int id, String nome, int id_categoria, int id_genero){
        try{
            sql= "INSERT INTO conteudos (id, nome, id_categoria, id_genero) values (?,?,?,?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, nome);
            getStatement().setInt(3, id_categoria);
            getStatement().setInt(4, id_genero);
            
            getStatement().executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
      public Boolean alterar (int id, String nome, int id_categoria, int id_genero){
        try{
            sql= "UPDATE conteudos set nome = ?, id_categoria = ?, id_genero = ? where id = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(4, id);
            getStatement().setString(1, nome);
            getStatement().setInt(2, id_categoria);
            getStatement().setInt(3, id_genero);
            
            getStatement().executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    public Boolean excluir(int id){
        try{
            sql= "DELETE FROM CONTEUDOS WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
   
    public ResultSet SelecionarTodos(){
        try{
            sql= """
                 SELECT co.id , co.nome , ca.nome as categoria, g.nome as genero
                 FROM conteudos co
                 join categoria ca
                 	on co.id_categoria = ca.id 
                 join genero g
                 	on co.id_genero = g.id
                 order by co.id
                 """;
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
        }catch(SQLException e){
            System.out.println( e.getMessage());
        }
        return getResultado();
    }
    
   public ResultSet SelecionarPorId(int id){
        try{
            sql= """
                 SELECT co.id , co.nome , ca.nome as categoria, g.nome as genero
                                  FROM conteudos co
                                  join categoria ca
                                  	on co.id_categoria = ca.id 
                                  join genero g
                                  	on co.id_genero = g.id 
                                  where co.id = ?
                 """;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeQuery();
            
            setResultado(getStatement().executeQuery());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
   
   public ResultSet SelecionarPorConteudo(String conteudoNome){
       try{
           sql= """
                SELECT co.id , co.nome , ca.nome as categoria, g.nome as genero
                                                  FROM conteudos co
                                                  join categoria ca
                                                  	on co.id_categoria = ca.id 
                                                  join genero g
                                                  	on co.id_genero = g.id 
                                                  where co.nome like ?
                """;
          
           
           setStatement(getConexao().prepareStatement(sql));
           
           getStatement().setString(1, conteudoNome + "%" );
           
           getStatement().executeQuery();
           
           setResultado(getStatement().executeQuery());
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
           
       }
       return getResultado();
   }
    
      public ResultSet SelecionarPorCategoria(String categoriaNome){
       try{
           sql= """
                SELECT co.id , co.nome , ca.nome as categoria, g.nome as genero
                                                  FROM conteudos co
                                                  join categoria ca
                                                  	on co.id_categoria = ca.id 
                                                  join genero g
                                                  	on co.id_genero = g.id 
                                                  where ca.nome like ?
                """;
          
           
           setStatement(getConexao().prepareStatement(sql));
           
           getStatement().setString(1, categoriaNome + "%" );
           
           getStatement().executeQuery();
           
           setResultado(getStatement().executeQuery());
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
           
       }
       return getResultado();
   }
      public ResultSet SelecionarPorGenero(String generoNome){
       try{
           sql= """
                SELECT co.id , co.nome , ca.nome as categoria, g.nome as genero
                                                  FROM conteudos co
                                                  join categoria ca
                                                  	on co.id_categoria = ca.id 
                                                  join genero g
                                                  	on co.id_genero = g.id 
                                                  where g.nome like ?
                """;
          
           
           setStatement(getConexao().prepareStatement(sql));
           
           getStatement().setString(1, generoNome + "%" );
           
           getStatement().executeQuery();
           
           setResultado(getStatement().executeQuery());
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
           
       }
       return getResultado();
   }
      
      public int ProximoIdConteudo(){
        int id = 0;
        try{
            sql= "SELECT IFNULL(MAX(ID), 0) + 1 FROM CONTEUDOS";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next();
            
            id = getResultado().getInt(1);
        }catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        
        return id;
    }
}
