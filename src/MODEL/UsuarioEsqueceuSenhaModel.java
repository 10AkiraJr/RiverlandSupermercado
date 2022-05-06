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
public class UsuarioEsqueceuSenhaModel {

    public UsuarioEsqueceuSenhaModel(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the data_nascimento
     */
    public String getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    /**
     * @return the nome_mae
     */
    public String getNome_mae() {
        return nome_mae;
    }

    /**
     * @param nome_mae the nome_mae to set
     */
    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }
    private String cpf;
    private String data_nascimento;
    private String nome_mae;
    private String senha;

    public UsuarioEsqueceuSenhaModel() {
        cpf = new String();
        data_nascimento = new String();
        nome_mae = new String();
        senha = new String();
    }

    public UsuarioEsqueceuSenhaModel(String cpf, String data_nascimento, String nome_mae, String senha) {
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.nome_mae = nome_mae;
        this.senha = senha;
    }
    
}
