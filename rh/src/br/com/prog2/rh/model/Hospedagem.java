package br.com.prog2.rh.model;

public class Hospedagem {
    
    public Integer codHospedagem;
    public Integer codChale;
    public String estado;
    public String dataInicio;
    public String dataFim;
    public Integer qtdPessoas;
    public Float desconto;
    public Float valorFinal;

    public Hospedagem(Integer codHospedagem, Integer codChale, String estado, String dataInicio, String dataFim, Integer qtdPessoas, Float desconto, Float valorFinal) {
        this.codHospedagem = codHospedagem;
        this.codChale = codChale;
        this.estado = estado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.qtdPessoas = qtdPessoas;
        this.desconto = desconto;
        this.valorFinal = valorFinal;
    }

    public Integer getCodHospedagem() {
        return codHospedagem;
    }

    public void setCodHospedagem(Integer codHospedagem) {
        this.codHospedagem = codHospedagem;
    }

    public Integer getCodChale() {
        return codChale;
    }

    public void setCodChale(Integer codChale) {
        this.codChale = codChale;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Integer getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(Integer qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

    public Float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Float valorFinal) {
        this.valorFinal = valorFinal;
    }

    @Override
    public String toString() {
        return "Hospedagem{" + "codHospedagem=" + codHospedagem + ", codChale=" + codChale + ", estado=" + estado + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", qtdPessoas=" + qtdPessoas + ", desconto=" + desconto + ", valorFinal=" + valorFinal + '}';
    }
}