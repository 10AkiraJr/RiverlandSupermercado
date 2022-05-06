/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.UsuarioModel;
import java.sql.PreparedStatement;
/**
 *
 * @author Roberto Junior Akira
 */
public class UsuarioData extends Conexao{
    public UsuarioData() throws Exception{}
    public boolean alterar1(UsuarioModel obj) throws Exception{ 
        String sql = "update tbusuarioadmin set login=?, senha=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getUsuario());
        ps.setString(2, obj.getSenha());
        return ps.executeUpdate()>0;
        //Altera o Usuário e a Senha tanto do Administrador quanto do Funcionário.
    }
    
    public boolean alterar2(UsuarioModel obj) throws Exception{
        String sql = "update tbfuncionario set nome=?, cpf=?, email=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getUsuario());
        ps.setString(2, obj.getCpf());
        ps.setString(3, obj.getEmail());
        return ps.executeUpdate()>0;
        //Altera o Nome o CPF e o E-mail do Funcionario.
    }
    
    public boolean alterar3(UsuarioModel obj) throws Exception{
        String sql = "update tbtelfuncionario set telefone=?"
                + "values (?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getTelefone());
        return ps.executeUpdate()>0;
        //Altera o Telefone do Funcionário.
    }
}
