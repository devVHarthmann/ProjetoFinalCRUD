package br.ulbra.entity;

import br.ulbra.config.ConnectionFactory;
import br.ulbra.dao.UsuarioDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Usuario {

    private int pkidusu;
    private String nomeusu;
    private String emailusu;
    private String senhausu;
    private String foneusu;
    private String cpfusu;
    private String cepusu;
    private String logradourousu;
    private String numerousu;
    private String bairrousu;
    private String cidadeusu;
    private String estadousu;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Usuario() {

    }

    public Usuario(int pkidusu, String nomeusu, String emailusu, String senhausu, String foneusu, String cpfusu, String cepusu, String logradourousu, String numerousu, String bairrousu, String cidadeusu, String estadousu) {
        this.pkidusu = pkidusu;
        this.nomeusu = nomeusu;
        this.emailusu = emailusu;
        this.senhausu = senhausu;
        this.foneusu = foneusu;
        this.cpfusu = cpfusu;
        this.cepusu = cepusu;
        this.logradourousu = logradourousu;
        this.numerousu = numerousu;
        this.bairrousu = bairrousu;
        this.cidadeusu = cidadeusu;
        this.estadousu = estadousu;
    }

    public int getPkidusu() {
        return pkidusu;
    }

    public void setPkidusu(int pkidusu) {
        this.pkidusu = pkidusu;
    }

    public String getNomeusu() {
        return nomeusu;
    }

    public void setNomeusu(String nomeusu) {
        this.nomeusu = nomeusu;
    }

    public String getEmailusu() {
        return emailusu;
    }

    public void setEmailusu(String emailusu) {
        this.emailusu = emailusu;
    }

    public String getSenhausu() {
        return senhausu;
    }

    public void setSenhausu(String senhausu) {
        this.senhausu = senhausu;
    }

    public String getFoneusu() {
        return foneusu;
    }

    public void setFoneusu(String foneusu) {
        this.foneusu = foneusu;
    }

    public String getCpfusu() {
        return cpfusu;
    }

    public void setCpfusu(String cpfusu) {
        this.cpfusu = cpfusu;
    }

    public String getCepusu() {
        return cepusu;
    }

    public void setCepusu(String cepusu) {
        this.cepusu = cepusu;
    }

    public String getLogradourousu() {
        return logradourousu;
    }

    public void setLogradourousu(String logradourousu) {
        this.logradourousu = logradourousu;
    }

    public String getNumerousu() {
        return numerousu;
    }

    public void setNumerousu(String numerousu) {
        this.numerousu = numerousu;
    }

    public String getBairrousu() {
        return bairrousu;
    }

    public void setBairrousu(String bairrousu) {
        this.bairrousu = bairrousu;
    }

    public String getCidadeusu() {
        return cidadeusu;
    }

    public void setCidadeusu(String cidadeusu) {
        this.cidadeusu = cidadeusu;
    }

    public String getEstadousu() {
        return estadousu;
    }

    public void setEstadousu(String estadousu) {
        this.estadousu = estadousu;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public boolean verificarSenha(String senha, String confirmarSenha) {
        if (senha.equals(confirmarSenha)) {
            return true;
        } else {
            return false;
        }

    }

    /*
    public boolean testeSenha(String senha) {
        Pattern pattern1 = Pattern.compile("[^a-zA-Z0-9]", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("[A-Z)]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern1.matcher(senha);
        Pattern pattern3 = Pattern.compile("[a-z)]", Pattern.CASE_INSENSITIVE);
        Matcher matcher3 = pattern3.matcher(senha);
        Pattern pattern4 = Pattern.compile("[0-9)]", Pattern.CASE_INSENSITIVE);
        Matcher matcher4 = pattern4.matcher(senha);
        Matcher matcher2 = pattern2.matcher(senha);
        boolean matchfound = matcher.find();
        boolean matchfound2 = matcher2.find();
        boolean matchfound3 = matcher3.find();
        boolean matchfound4 = matcher4.find();
        boolean result = false;

        if (matchfound2 == true && matchfound == true && matchfound3 == true & & matchfound4 == true &&  == false) {
            result = true;
        }
        if (senha.length() >= 8) {
            return result;
        } else {
            return false;
        }
    }
     */

    @Override
    public String toString() {
        return "Usuario{" + "pkidusu=" + pkidusu + ", nomeusu=" + nomeusu + ", emailusu=" + emailusu + ", senhausu=" + senhausu + ", foneusu=" + foneusu + ", cpfusu=" + cpfusu + ", cepusu=" + cepusu + ", logradourousu=" + logradourousu + ", numerousu=" + numerousu + ", bairrousu=" + bairrousu + ", cidadeusu=" + cidadeusu + ", estadousu=" + estadousu + ", additionalProperties=" + additionalProperties + '}';
    }
}
