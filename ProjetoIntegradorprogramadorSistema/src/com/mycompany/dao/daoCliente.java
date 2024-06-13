/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import static com.mycompany.utilidades.BancoDeDadosMySql.getConexao;
import static com.mycompany.utilidades.BancoDeDadosMySql.getResultado;
import static com.mycompany.utilidades.BancoDeDadosMySql.getStatement;
import static com.mycompany.utilidades.BancoDeDadosMySql.setResultado;
import static com.mycompany.utilidades.BancoDeDadosMySql.setStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author liberalino.1980
 */
public class daoCliente {
    private String sql;
    
    public Boolean inserir (int id, String nome, String usuario, String senha, int id_vendedor){
        try{
            sql= "INSERT INTO cliente (id, nome, usuario, senha, id_vendedor) values (?,?,?,?,?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, nome);
            getStatement().setString(3, usuario);
            getStatement().setString(4, senha);
            getStatement().setInt(5, id_vendedor);
            
            getStatement().executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
      public Boolean alterar (int id, String nome, String usuario, String senha, int id_vendedor){
        try{
            sql= "UPDATE cliente set nome = ?, usuario = ?, senha = ? where id = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(4, id);
            getStatement().setString(1, nome);
            getStatement().setString(2, usuario);
            getStatement().setString(3, senha);
            
            getStatement().executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    public Boolean excluir(int id){
        try{
            sql= "DELETE FROM cliente WHERE ID = ?";
            
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
                 select c.id, c.nome, c.usuario, c.senha, c.id_vendedor
                   from cliente c
                 left join vendedor v  ON c.id_vendedor = v.id
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
                 select c.id, c.nome, c.usuario, c.senha, c.id_vendedor
                 from cliente c
                 left join vendedor v  ON c.id_vendedor = v.id
                 	where c.id like ?
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
   
   public ResultSet SelecionarPorIdVendedor(int id_vendedor){
        try{
            sql= """
                 select c.id, c.nome, c.usuario, c.senha, c.id_vendedor
                   from cliente c
                left join vendedor v  ON c.id_vendedor = v.id
                   where c.id_vendedor like ?
                 """;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id_vendedor);
            
            getStatement().executeQuery();
            
            setResultado(getStatement().executeQuery());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
   
   public ResultSet SelecionarPorCliente(String clienteNome){
       try{
           sql= """
                select c.id, c.nome, c.usuario, c.senha, c.id_vendedor
                from cliente c
                left join vendedor v  ON c.id_vendedor = v.id
                	where c.nome like ?
                """;
          
           
           setStatement(getConexao().prepareStatement(sql));
           
           getStatement().setString(1, clienteNome + "%" );
           
           getStatement().executeQuery();
           
           setResultado(getStatement().executeQuery());
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
           
       }
       return getResultado();
   }
      
      public int ProximoIdCliente(){
        int id = 0;
        try{
                sql= "SELECT IFNULL(MAX(ID), 0) + 1 FROM CLIENTE";
            
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
