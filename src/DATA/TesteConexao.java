/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

/**
 *
 * @author Roberto Junior Akira
 */
public class TesteConexao {
    public static void main(String[] args) {
        try {
            Conexao c = new Conexao();
            System.out.println("Conexão ok.");
            String sql = "insert into tbentrada (entrada_data, entrada_descricao, entrada_unidmedida, entrada_quantidade, entrada_valorcompra, entrada_valorvenda, forn_razaosocial) "
                    + "values ('01/08/2021', 'peixe', 'un', 4, 50, 60, 1)";
            java.sql.PreparedStatement ps = c.getConexao().prepareStatement(sql);
            if (ps.executeUpdate()>0){
                System.out.println("Registro Salvo com sucesso!");
            }
            else{
                System.out.println("Erro ao salvar!");
            }
            
        } catch (Exception ex) {
            System.out.println("Erro." + ex.getMessage());
        }
        
    }
}
