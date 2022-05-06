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
public class LancarEntradaModel {

    public LancarEntradaModel(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LancarEntradaModel(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LancarEntradaModel(String string, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     * @return the unidadeMedida
     */
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * @param unidadeMedida the unidadeMedida to set
     */
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
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
     * @return the precoUnitCompra
     */
    public double getPrecoUnitCompra() {
        return precoUnitCompra;
    }

    /**
     * @param precoUnitCompra the precoUnitCompra to set
     */
    public void setPrecoUnitCompra(double precoUnitCompra) {
        this.precoUnitCompra = precoUnitCompra;
    }

    /**
     * @return the precoUnitVenda
     */
    public double getPrecoUnitVenda() {
        return precoUnitVenda;
    }

    /**
     * @param precoUnitVenda the precoUnitVenda to set
     */
    public void setPrecoUnitVenda(double precoUnitVenda) {
        this.precoUnitVenda = precoUnitVenda;
    }

    /**
     * @return the fornecedor
     */
    public int getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }
    private String data;
    private int codigo;
    private String descricao;
    private String unidadeMedida;
    private int quantidade;
    private double precoUnitCompra;
    private double precoUnitVenda;
    private int fornecedor;

    public LancarEntradaModel() {
        data = new String();
        codigo = 0;
        descricao = new String();
        unidadeMedida = new String();
        quantidade = 0;
        precoUnitCompra = 0;
        precoUnitVenda = 0;
        fornecedor = 0;
    }

    public LancarEntradaModel(String data, int codigo, String descricao, String unidadeMedida, 
            int quantidade, double precoUnitCompra, double precoUnitVenda, int fornecedor) {
        this.data = data;
        this.codigo = codigo;
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
        this.quantidade = quantidade;
        this.precoUnitCompra = precoUnitCompra;
        this.precoUnitVenda = precoUnitVenda;
        this.fornecedor = fornecedor;
    }
    
    
}
