package projeto;

import projeto.ConexaoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consulta {
    public static void executarConsulta() {
        try {
            Connection conexao = ConexaoDB.getConnection();

            String sql = "SELECT * FROM projeto.Cliente";
            PreparedStatement statement = conexao.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String telefone = resultSet.getString("telefone");
            }

            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection conexao = ConexaoDB.getConnection();

            String sql = "SELECT * FROM projeto.Doces";
            PreparedStatement statement = conexao.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                float preco = resultSet.getFloat("preco");
            }
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection conexao = ConexaoDB.getConnection();

            String sql = "SELECT * FROM projeto.DocesAzedos";
            PreparedStatement statement = conexao.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                float preco = resultSet.getFloat("preco");
                int nivelDeAzedo = resultSet.getInt("nivelDeAzedo");
            }

            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection conexao = ConexaoDB.getConnection();

            String sql = "SELECT * FROM Chocolate";
            PreparedStatement statement = conexao.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String tipo = resultSet.getString("tipo");
                float preco = resultSet.getFloat("preco");
            }

            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}