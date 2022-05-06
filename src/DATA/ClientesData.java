/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.ClientesModel;
import java.sql.PreparedStatement;

/**
 *
 * @author Roberto Junior Akira
 */
public class ClientesData extends Conexao{
    public ClientesData() throws Exception{}
    
    public boolean incluirCliFiscico(ClientesModel obj) throws Exception{
    String sql = "insert into tbclifisico (nome, cpf, email)"
            + "values (?,?,?)";
    PreparedStatement ps = getConexao().prepareStatement(sql);
    ps.setString(1, obj.getNome());
    ps.setString(2, obj.getCpf());
    ps.setString(3, obj.getEmail());
    return ps.executeUpdate()>0;
    }
    
    public boolean incluirEnderecoCliFiscico(ClientesModel obj) throws Exception{
    String sql = "insert into tbendclifisico (cod_clifisico, logadouro, numeroendereco, complemento, bairro, cep, cidade, estado)"
            + "values (?,?,?,?,?,?,?,?)";
    PreparedStatement ps = getConexao().prepareStatement(sql);
    ps.setInt(1, obj.getCod_cliFisico());
    ps.setString(2, obj.getLogadouro());
    ps.setString(3, obj.getNome());
    ps.setString(4, obj.getComplemento());
    ps.setString(5, obj.getBairro());
    ps.setInt(6, obj.getCep());
    ps.setString(7, obj.getCidade());
    ps.setString(8, obj.getEstado());
    return ps.executeUpdate()>0;
    }
    
    public boolean incluirTelefoneCliFiscico(ClientesModel obj) throws Exception{
    String sql = "insert into tbtelclifisico (cod_clifisico, telefone)"
            + "values (?,?)";
    PreparedStatement ps = getConexao().prepareStatement(sql);
    ps.setInt(1, obj.getCod_cliFisico());
    ps.setInt(2, obj.getTelefone());
    return ps.executeUpdate()>0;
    }
    
//    public boolean excluir(int codigo) throws Exception {
//        String sql="Delete from tbclifisico where codigo=?";
//        PreparedStatement ps = getConexao().prepareStatement(sql);
//        ps.setcod_cliFisico(1, codigo);
//    return ps.executeUpdate()>0;
}
    
}
