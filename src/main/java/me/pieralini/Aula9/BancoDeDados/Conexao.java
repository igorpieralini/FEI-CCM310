
package me.pieralini.Aula9.BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() throws SQLException {
        String endereco = System.getenv("CCM310_DB_URL");
        String usuario = System.getenv("CCM310_DB_USER");
        String senha = System.getenv("CCM310_DB_PASSWORD");

        if (endereco == null || usuario == null || senha == null) {
            throw new SQLException("Configure as variáveis do PostgreSQL.");
        }

        return DriverManager.getConnection(endereco, usuario, senha);
    }
}
