package br.ulbra.dao;

import br.ulbra.config.ConnectionFactory;
import br.ulbra.entity.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     public ArrayList<Produto> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> prods = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbProduto");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto pro = new Produto();
                pro.setNomeProd(rs.getString("nomeprod"));
                pro.setCategoriaProd(rs.getString("categoriaProd"));
                pro.setQuantEstoqueProd(rs.getInt("quantEstoqueProd"));
                pro.setValorUnitProd((int) rs.getDouble("valorUnitProd"));
                pro.setDataCadProd(rs.getString("dataCadProd"));
                prods.add(pro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Produto>) prods;
    }
}
