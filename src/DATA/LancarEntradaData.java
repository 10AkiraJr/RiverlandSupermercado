/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.LancarEntradaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Roberto Junior Akira
 */
public class LancarEntradaData extends Conexao{
    public LancarEntradaData() throws Exception{}
    public boolean incluir(LancarEntradaModel obj) throws Exception{
        String sql = "insert into tbentrada (data, descricao, unid_medida, quantidade, valorcompra, valorvenda)"
                + "values (?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getData());
        ps.setString(2, obj.getDescricao());
        ps.setString(3, obj.getUnidadeMedida());
        ps.setInt(4, obj.getQuantidade());
        ps.setDouble(5, obj.getPrecoUnitCompra());
        ps.setDouble(6, obj.getPrecoUnitVenda());
        
        return ps.executeUpdate()>0;
    }

//    public ArrayList<LancarEntradaModel> pesquisar(String pesq) throws Exception{
//        ArrayList<LancarEntradaModel> listaEntrada = new ArrayList<>();
//        String sql = "Select * from tbentrada where nome like '"+pesq+"%' order by nome";
//        PreparedStatement ps = getConexao().prepareStatement(sql);
//        ResultSet rs = ps.executeQuery();
//        while(rs.next()){
//            LancarEntradaModel obj new LancarEntradaModel(rs.getString("data"),rs.getInt("codigo")rs.getString("descricao"),
//                    rs.getString("quantidade"),rs.getString("valor compra"),rs.getString("valor venda"));
//                    listaEntrada.add(obj);
//        }
//        return listaEntrada;
//    }
//
//    public boolean excluir(int codigo) throws Exception {
//        String sql="Delete from tbEntrada where codigo=?";
//        PreparedStatement ps = getConexao().prepareStatement(sql);
//        ps.setCodigo(1, codigo);
//    return ps.executeUpdate()>0;
//}
}
