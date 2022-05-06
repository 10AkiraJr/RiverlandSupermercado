/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Roberto Junior Akira
 */
public class LancarVendaModel {

    /**
     * @return the codCliente
     */
    public int getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * @return the cnpjCpf
     */
    public String getCnpjCpf() {
        return cnpjCpf;
    }

    /**
     * @param cnpjCpf the cnpjCpf to set
     */
    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    /**
     * @return the razaoSocialNome
     */
    public String getRazaoSocialNome() {
        return razaoSocialNome;
    }

    /**
     * @param razaoSocialNome the razaoSocialNome to set
     */
    public void setRazaoSocialNome(String razaoSocialNome) {
        this.razaoSocialNome = razaoSocialNome;
    }

    /**
     * @return the codVenda
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the codEntrada
     */
    public int getCodEntrada() {
        return codEntrada;
    }

    /**
     * @param codEntrada the codEntrada to set
     */
    public void setCodEntrada(int codEntrada) {
        this.codEntrada = codEntrada;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the unMedida
     */
    public String getUnMedida() {
        return unMedida;
    }

    /**
     * @param unMedida the unMedida to set
     */
    public void setUnMedida(String unMedida) {
        this.unMedida = unMedida;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnit
     */
    public int getValorUnit() {
        return valorUnit;
    }

    /**
     * @param valorUnit the valorUnit to set
     */
    public void setValorUnit(int valorUnit) {
        this.valorUnit = valorUnit;
    }

    /**
     * @return the valorTotal
     */
    public int getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the valorGlobal
     */
    public int getValorGlobal() {
        return valorGlobal;
    }

    /**
     * @param valorGlobal the valorGlobal to set
     */
    public void setValorGlobal(int valorGlobal) {
        this.valorGlobal = valorGlobal;
    }
    
    private int codCliente;
    private String cnpjCpf;
    private String razaoSocialNome;
    private int codVenda;
    private String data;
    private int codEntrada;
    private String descricao;
    private String unMedida;
    private int quantidade;
    private int valorUnit;
    private int valorTotal;
    private int valorGlobal;

    public LancarVendaModel() {
        codCliente = 0;
        cnpjCpf = new String();
        razaoSocialNome = new String();
        codVenda = 0;
        data = new String();
        codEntrada = 0;
        descricao = new String();
        unMedida = new String();
        quantidade = 0;
        valorUnit = 0;
        valorTotal = 0;
        valorGlobal = 0;
    }

    public LancarVendaModel(int codCliente, String cnpjCpf, String razaoSocialNome, int codVenda,
            String data, int codEntrada, String descricao, String unMedida, int quantidade,
            int valorUnit, int valorTotal, int valorGlobal) {
        this.codCliente= codCliente;
        this.cnpjCpf = cnpjCpf;
        this.razaoSocialNome = razaoSocialNome;
        this.codVenda = codVenda;
        this.data = data;
        this.codEntrada = codEntrada;
        this.descricao = descricao;
        this.unMedida = unMedida;
        this.quantidade = quantidade;
        this.valorUnit = valorUnit;
        this.valorTotal = valorTotal;
        this.valorGlobal = valorGlobal;
    }
    
    
}
