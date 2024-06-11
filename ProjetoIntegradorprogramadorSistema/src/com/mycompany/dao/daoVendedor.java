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
public class daoVendedor {
    private String sql;
    
    public Boolean inserir (int id, String nome, String usuario, String senha){
        try{
            sql= "INSERT INTO vendedor (id, nome, usuario, senha) values (?,?,?,?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, nome);
            getStatement().setString(3, usuario);
            getStatement().setString(4, senha);
            
            getStatement().executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
      public Boolean alterar (int id, String nome, String usuario, String senha){
        try{
            sql= "UPDATE vendedor set nome = ?, usuario = ?, senha = ? where id = ?";
            
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
            sql= "DELETE FROM vendedor WHERE ID = ?";
            
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
                 select v.id, v.nome, v.usuario, v.senha, count(c.id_vendedor) AS Qtt_Clientes
                 	from vendedor v
                 left join cliente c ON c.id_vendedor = v.id
                 	group by  v.id, v.nome, v.usuario, v.senha
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
                 select v.id, v.nome, v.usuario, v.senha, count(c.id_vendedor) AS Qtt_Clientes
                 	from vendedor v
                 left join cliente c ON c.id_vendedor = v.id
                 	where v.id = ?
                 group by  v.id, v.nome, v.usuario, v.senha
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
   
   public ResultSet SelecionarPorVendedor(String vendedorNome){
       try{
           sql= """
                select v.id, v.nome, v.usuario, v.senha, count(c.id_vendedor) AS Qtt_Clientes
                	from vendedor v
                left join cliente c ON c.id_vendedor = v.id
                	where v.nome like = ?
                group by  v.id, v.nome, v.usuario, v.senha
                """;
          
           
           setStatement(getConexao().prepareStatement(sql));
           
           getStatement().setString(1, vendedorNome + "%" );
           
           getStatement().executeQuery();
           
           setResultado(getStatement().executeQuery());
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
           
       }
       return getResultado();
   }
      
      public int ProximoIdVendedor(){
        int id = 0;
        try{
            sql= "SELECT IFNULL(MAX(ID), 0) + 1 FROM VENDEDOR";
            
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
