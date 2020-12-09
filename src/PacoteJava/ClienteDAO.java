package PacoteJava;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    private Connection con;

    public ClienteDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserirCliente(ClienteBean cliente) {
        String sql = "insert into tbclientes(id,nomeCli,telResidencial,telComercial,telCelular,emailCli)values(?,?,?,?,?,?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setInt(1, cliente.getId());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getTelResidencial());
            ps.setString(4, cliente.getTelComercial());
            ps.setString(5, cliente.getTelCelular());
            ps.setString(6, cliente.getEmail());

            if (ps.executeUpdate() > 0) {
                return "Cliente cadastrado com sucesso!!!";
            } else {
                return "Erro ao cadastrar!!!";
            }

        } catch (SQLException e) {
            return e.getMessage();

        }
    }

    public String alterarCliente(ClienteBean cliente) {
        String sql = "update tbclientes set nomeCli = ?,telResidencial = ?, telComercial = ?, telCelular = ?, "
                + "emailCli = ? where id = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelResidencial());
            ps.setString(3, cliente.getTelComercial());
            ps.setString(4, cliente.getTelCelular());
            ps.setString(5, cliente.getEmail());            
            ps.setInt(6, cliente.getId());
            

            if (ps.executeUpdate() > 0) {

                return "Alterado com sucesso!!!";

            } else {
                return "Erro ao alterar!!!";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public String deletarCliente(ClienteBean cliente) {
        String sql = "delete from tbclientes where id = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setInt(1, cliente.getId());

            if (ps.executeUpdate() > 0) {
                return "Excluido com sucesso!!!";
            } else {
                return "Erro ao excluir!!!";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public List<ClienteBean> listarTodos() {
        String sql = "select * from tbclientes";

        List<ClienteBean> listaCliente = new ArrayList<ClienteBean>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            

            if (rs != null) {
                while (rs.next()) {
                    ClienteBean cb = new ClienteBean();
                    cb.setId(rs.getInt(1));
                    cb.setNome(rs.getString(2));
                    cb.setTelResidencial(rs.getString(3));
                    cb.setTelComercial(rs.getString(4));
                    cb.setTelCelular(rs.getString(5));
                    cb.setEmail(rs.getString(6));
                    listaCliente.add(cb);
                }
                return listaCliente;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    
    public void pegaTelefone(ClienteBean cb ){
        String sql = "select telResidencial, telComercial, telCelular from tbclientes where id = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cb.getTelResidencial());
            ps.setString(2, cb.getTelComercial());
            ps.setString(3, cb.getTelCelular());
            ps.setInt(5, cb.getId());
            
            
            ResultSet rs = ps.executeQuery();
                
            rs.next();              
            
                    
                    
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
