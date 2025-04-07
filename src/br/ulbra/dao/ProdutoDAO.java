package br.ulbra.dao;

import br.ulbra.config.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class ProdutoDAO {
    Connection con;

    public ProdutoDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }
    
}
