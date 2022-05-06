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
public class ClientesModel {

    public ClientesModel(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the cod_cliFisico
     */
    public int getCod_cliFisico() {
        return cod_cliFisico;
    }

    /**
     * @param cod_cliFisico the cod_cliFisico to set
     */
    public void setCod_cliFisico(int cod_cliFisico) {
        this.cod_cliFisico = cod_cliFisico;
    }

    /**
     * @return the cod_cliJuridico
     */
    public int getCod_cliJuridico() {
        return cod_cliJuridico;
    }

    /**
     * @param cod_cliJuridico the cod_cliJuridico to set
     */
    public void setCod_cliJuridico(int cod_cliJuridico) {
        this.cod_cliJuridico = cod_cliJuridico;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the incrEstadual
     */
    public String getIncrEstadual() {
        return incrEstadual;
    }

    /**
     * @param incrEstadual the incrEstadual to set
     */
    public void setIncrEstadual(String incrEstadual) {
        this.incrEstadual = incrEstadual;
    }

    /**
     * @return the logadouro
     */
    public String getLogadouro() {
        return logadouro;
    }

    /**
     * @param logadouro the logadouro to set
     */
    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    private int cod_cliFisico;
    private int cod_cliJuridico;
    private String nome;
    private String cpf;
    private String razaoSocial;
    private String cnpj;
    private String incrEstadual;
    private String logadouro;
    private String numero;
    private String complemento;
    private String bairro;
    private int cep;
    private String cidade;
    private String estado;
    private String email;
    private int telefone;

    public ClientesModel() {
        cod_cliFisico = 0;
        cod_cliJuridico = 0;
        nome = new String();
        cpf = new String();
        razaoSocial = new String();
        cnpj = new String();
        incrEstadual = new String();
        logadouro = new String();
        numero = new String();
        complemento = new String();
        bairro = new String();
        cep = 0;
        cidade = new String();
        estado = new String();
        email = new String();
        telefone = 0;
    }

    public ClientesModel(int cod_cliFisico, int cod_cliJuridico, String nome, String cpf, 
            String razaoSocial, String cnpj, String incrEstadual, String logadouro, 
            String numero, String complemento, String bairro, int cep, String cidade, 
            String estado, String email, int telefone) {
        this.cod_cliFisico = cod_cliFisico;
        this.cod_cliJuridico = cod_cliJuridico;
        this.nome = nome;
        this.cpf = cpf;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.incrEstadual = incrEstadual;
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.telefone = telefone;
    }
    
    
}
