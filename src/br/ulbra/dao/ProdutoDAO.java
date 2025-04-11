package br.ulbra.dao;

import br.ulbra.config.ConnectionFactory;
import br.ulbra.entity.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    Connection con;

    public ProdutoDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }
     public void create(Produto p) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" INSERT INTO tbproduto(nomeprod, dataCadProd, categoriaProd, valorUnitProd, quantEstoqueProd) VALUES(?,?,?,?,?) ");
            stmt.setString(1, p.getNomeProd());
            stmt.setString(2, p.getDataCadProd());
            stmt.setString(3, p.getCategoriaProd());
            stmt.setDouble(4, p.getValorUnitProd());
            stmt.setInt(5, p.getQuantEstoqueProd());
           

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
