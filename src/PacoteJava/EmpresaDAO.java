package PacoteJava;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class EmpresaDAO {
    Connection con;

    public EmpresaDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserirEmpresa(EmpresaBean empresa){
        String sql = "insert into tbempresas (codigo, nomeEmpresa, cnpj, razaoSocial)values(?,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, empresa.getCodigo());
            ps.setString(2, empresa.getNome());
            ps.setString(3, empresa.getCnpj());
            ps.setString(4, empresa.getRazaoSocial());
            
            if (ps.executeUpdate() > 0) {
                return "Empresa cadastrada com sucesso!!!";
            } else {
                return "Erro ao cadastrar!!!";
            }           
            
            
        } catch (SQLException ex) {
            return ex.getMessage();
        }
        
        
    }
    
    public String alterarEmpresa(EmpresaBean empresa){
        String sql = "update tbempresas set nomeEmpresa = ?, cnpj = ?, razaoSocial = ? where codigo = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, empresa.getNome());
            ps.setString(2, empresa.getCnpj());
            ps.setString(3, empresa.getRazaoSocial());
            ps.setInt(4, empresa.getCodigo());
            
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso!!!";
            } else {
                return "Erro ao cadastrar!!!";
            }
            
            
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public String deletarEmpresa(EmpresaBean empresa){
        String sql = "delete from tbempresas where codigo = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setInt(1, empresa.getCodigo());

            if (ps.executeUpdate() > 0) {
                return "Excluido com sucesso!!!";
            } else {
                return "Erro ao excluir!!!";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public List<EmpresaBean> listaTodos(){
        String sql = "select * from tbempresas";
        
        List<EmpresaBean> listaEmpresa = new ArrayList<EmpresaBean>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    EmpresaBean eb = new EmpresaBean();
                    eb.setCodigo(rs.getInt(1));
                    eb.setNome(rs.getString(2));
                    eb.setCnpj(rs.getString(3));
                    eb.setRazaoSocial(rs.getString(4));
                    listaEmpresa.add(eb);
                }
                return listaEmpresa;
            } else {
                return null;
            }
        }catch(SQLException e){
            return null;
        }
        
    }
}
