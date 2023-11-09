package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaController {

    public void consultarFuncionarios() throws SQLException {
        // Instanciar Conexão
        Conexao conexao = new Conexao();

        // Referencia do nosso banco no controller
        Connection connection = conexao.getConnection();

        // Responsavel por executar a query do banco
        Statement statement = connection.createStatement();

        // Query
        String queryConsulta = "SELECT * FROM funcionario";

        // Armazena o retorno do banco
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){
            int idFuncionario = resultSet.getInt("idFuncionario");
            String nome = resultSet.getString("nome");
            String sobrenome = resultSet.getString("sobrenome");
            int matricula = resultSet.getInt("matricula");

            System.out.println(idFuncionario);
            System.out.println(nome + " " + sobrenome);
            System.out.println(matricula);
            System.out.println("=0=0= -- =0=0= -- =0=0= -- =0=0=");
        }


    }

}
