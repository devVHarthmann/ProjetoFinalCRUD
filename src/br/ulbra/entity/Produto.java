package br.ulbra.entity;

public class Produto {

    private int idProd;
    private String nomeProd;
    private String dataCadProd;
    private String categoriaProd;
    private int valorUnitProd;
    private int quantEstoqueProd;

    public Produto() {
    }

    public Produto(int idProd, String nomeProd, String dataCadProd, String categoriaProd, int valorUnitProd, int quantEstoqueProd) {
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.dataCadProd = dataCadProd;
        this.categoriaProd = categoriaProd;
        this.valorUnitProd = valorUnitProd;
        this.quantEstoqueProd = quantEstoqueProd;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getDataCadProd() {
        return dataCadProd;
    }

    public void setDataCadProd(String dataCadProd) {
        this.dataCadProd = dataCadProd;
    }

    public String getCategoriaProd() {
        return categoriaProd;
    }

    public void setCategoriaProd(String categoriaProd) {
        this.categoriaProd = categoriaProd;
    }

    public int getValorUnitProd() {
        return valorUnitProd;
    }

    public void setValorUnitProd(int valorUnitProd) {
        this.valorUnitProd = valorUnitProd;
    }

    public int getQuantEstoqueProd() {
        return quantEstoqueProd;
    }

    public void setQuantEstoqueProd(int quantEstoqueProd) {
        this.quantEstoqueProd = quantEstoqueProd;
    }

}
