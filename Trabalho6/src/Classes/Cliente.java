/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author heloh
 */
public class Cliente {
    
  public Integer codCliente;
  public String nomeCliente;
  public Integer rgCliente;
  public String enderecoCliente;
  public String bairroCliente;
  public String cidadeCliente;
  public String estadoCliente;
  public Integer CEPCliente;
  public String nascimentoCliente;
  
    public Cliente(Integer codCliente, String nomeCliente, Integer rgCliente, String enderecoCliente, String bairroCliente, String cidadeCliente, String estadoCliente, Integer CEPCliente, String nascimentoCliente) {
        this.codCliente = codCliente;
        this.nomeCliente = nomeCliente;
        this.rgCliente = rgCliente;
        this.enderecoCliente = enderecoCliente;
        this.bairroCliente = bairroCliente;
        this.cidadeCliente = cidadeCliente;
        this.estadoCliente = estadoCliente;
        this.CEPCliente = CEPCliente;
        this.nascimentoCliente = nascimentoCliente;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(Integer rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public Integer getCEPCliente() {
        return CEPCliente;
    }

    public void setCEPCliente(Integer CEPCliente) {
        this.CEPCliente = CEPCliente;
    }

    public String getNascimentoCliente() {
        return nascimentoCliente;
    }

    public void setNascimentoCliente(String nascimentoCliente) {
        this.nascimentoCliente = nascimentoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", nomeCliente=" + nomeCliente + ", rgCliente=" + rgCliente + ", enderecoCliente=" + enderecoCliente + ", bairroCliente=" + bairroCliente + ", cidadeCliente=" + cidadeCliente + ", estadoCliente=" + estadoCliente + ", CEPCliente=" + CEPCliente + ", nascimentoCliente=" + nascimentoCliente + '}';
    }

    
  
}