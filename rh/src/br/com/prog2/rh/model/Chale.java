package br.com.prog2.rh.model;

public class Chale {
	
    public Integer codChale;
    
    public String localizacao;
    
    public Integer capacidade;
    
    public Float valorAltaEstacao;
    
    public Float valorBaixaEstacao;  

    public Chale(Integer codChale, String localizacao, Integer capacidade, Float valorAltaEstacao, Float valorBaixaEstacao) {
        this.codChale = codChale;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.valorAltaEstacao = valorAltaEstacao;
        this.valorBaixaEstacao = valorBaixaEstacao;
    }

    public Integer getCodChale() {
        return codChale;
    }

    public void setCodChale(Integer codChale) {
        this.codChale = codChale;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Float getValorAltaEstacao() {
        return valorAltaEstacao;
    }

    public void setValorAltaEstacao(Float valorAltaEstacao) {
        this.valorAltaEstacao = valorAltaEstacao;
    }

    public Float getValorBaixaEstacao() {
        return valorBaixaEstacao;
    }

    public void setValorBaixaEstacao(Float valorBaixaEstacao) {
        this.valorBaixaEstacao = valorBaixaEstacao;
    }

    @Override
    public String toString() {
        return "Chale{" + "codChale=" + codChale + ", localizacao=" + localizacao + ", capacidade=" + capacidade + ", valorAltaEstacao=" + valorAltaEstacao + ", valorBaixaEstacao=" + valorBaixaEstacao + '}';
    }

}