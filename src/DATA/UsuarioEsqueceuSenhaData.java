/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.UsuarioEsqueceuSenhaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Roberto Junior Akira
 */
public class UsuarioEsqueceuSenhaData extends Conexao{

    public UsuarioEsqueceuSenhaData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public UsuarioEsqueceuSenhaModel recuperarSenha(String cpf, String data_nascimento, String nome_mae) throws Exception{
        UsuarioEsqueceuSenhaModel obj = null;
        String sql = "select * from tbfuncionario where cpf=? and data_nascimento=? and nome_mae=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, cpf);
        ps.setString(2, data_nascimento);
        ps.setString(3, nome_mae);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            obj = new UsuarioEsqueceuSenhaModel(rs.getString("cpf"), rs.getString("data_nascimento"), rs.getString("nome_mae"));
        }
        return obj;
    }
}
