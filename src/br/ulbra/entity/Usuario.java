package br.ulbra.entity;

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

}
