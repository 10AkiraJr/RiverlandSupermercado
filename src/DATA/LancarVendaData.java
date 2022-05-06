/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import MODEL.LancarVendaModel;
import MODEL.ClientesModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Roberto Junior Akira
 */
public class LancarVendaData extends Conexao{
    public LancarVendaData() throws Exception{}
    
    public boolean selecionaCliente(String pesq) throws Exception{
        String sql = "select * from tbcliente where cod_cliente like '" + pesq + "%' order by cod_cliente";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            ClientesModel obj = new ClientesModel(rs.getInt("codigo"));
        }
        return true;
    }
    
    public boolean incluirItens(LancarVendaModel obj) throws Exception{
        String sql = "insert into tbitensaida (cod_entrada, unid_medida, quantidade, valor_unitvenda, valor_totalvenda)"
                + "values (?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getCodEntrada());
        ps.setString(2, obj.getUnMedida());
        ps.setInt(3, obj.getQuantidade());
        ps.setInt(4, obj.getValorUnit());
        ps.setInt(5, obj.getValorTotal());
        return ps.executeUpdate()>0;
    }
    
    public boolean salvarVenda(LancarVendaModel obj) throws Exception{
        String sql = "insert into tbsaida(cod_cliente, valor_globalvenda)" + "values(?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getCodCliente());
        ps.setInt(2, obj.getValorGlobal());
        return ps.executeUpdate()>0;
        
    }
}
