/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.LoginModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Roberto Junior Akira
 */
public class LoginData extends Conexao{
    public LoginData() throws Exception{}
        public LoginModel validarUsuario(String usuario, String senha) throws Exception {
        LoginModel obj = null;
        String sql = "Select * from tbusuario where usuario=? and senha=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,usuario);
        ps.setString(2,senha);
        ResultSet rs = ps.executeQuery();
        return obj;
    }
}
