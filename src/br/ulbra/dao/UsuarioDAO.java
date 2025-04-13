package br.ulbra.dao;

import br.ulbra.config.ConnectionFactory;
import br.ulbra.entity.Usuario;
import br.ulbra.view.FrmListaUsu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection con;

    public UsuarioDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String email, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            stmt = con.prepareStatement(
                    "SELECT * FROM tbusuario WHERE emailusu =  ? and  senhausu =  ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }

    public void create(Usuario u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" INSERT INTO tbusuario(nomeusu, emailusu, senhausu, foneusu, cpfusu,cepusu,logradourousu,numerousu,bairrousu,cidadeusu,estadousu) VALUES(?,?,?,?,?,?,?,?,?,?,?) ");
            stmt.setString(1, u.getNomeusu());
            stmt.setString(2, u.getEmailusu());
            stmt.setString(3, u.getSenhausu());
            stmt.setString(4, u.getFoneusu());
            stmt.setString(5, u.getCpfusu());
            stmt.setString(6, u.getCepusu());
            stmt.setString(7, u.getLogradourousu());
            stmt.setString(8, u.getNumerousu());
            stmt.setString(9, u.getBairrousu());
            stmt.setString(10, u.getCidadeusu());
            stmt.setString(11, u.getEstadousu());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean checkSenha(String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            stmt = con.prepareStatement("SELECT * FROM tbusuario WHERE and senhaUsu = ?");
            stmt.setString(1, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }

    public ArrayList<Usuario> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbUsuario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usu = new Usuario();
                usu.setNomeusu(rs.getString("nomeusu"));
                usu.setEmailusu(rs.getString("emailusu"));
                usu.setFoneusu(rs.getString("foneusu"));
                usu.setCpfusu(rs.getString("cpfusu"));
                usuarios.add(usu);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Usuario>) usuarios;
    }

}
