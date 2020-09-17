package pacote;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author jonas
 */
public class ContaController1 {
    
    //Conta objConta;
    //JTable jtbContas = null;
    
//    public ContaController(Conta objConta, JTable jtbContas) {
//        this.objConta = objConta;
//        this.jtbContas = jtbContas;
//    }
    
//    public Conta buscar(String id)
//    {
//        try {
//            Conexao.abreConexao();
//            ResultSet rs = null;
//
//            String SQL = "";
//            SQL = " SELECT id, nome ";
//            SQL += " FROM area ";
//            SQL += " WHERE id = '" + id + "'";
//            SQL += " AND COALESCE(dataExclusao,'') = '' ";
//            //stm.executeQuery(SQL);
//
//            try{
//                System.out.println("Vai Executar Conexão em buscar area");
//                rs = Conexao.stmt.executeQuery(SQL);
//                System.out.println("Executou Conexão em buscar area");
//
//                objConta = new Conta();
//                
//                if(rs.next() == true)
//                {
//                    objConta.setId(rs.getInt(1));
//                    objConta.setNome(rs.getString(2));
//                }
//            }
//
//            catch (SQLException ex )
//            {
//                System.out.println("ERRO de SQL: " + ex.getMessage().toString());
//                return null;
//            }
//
//        } catch (Exception e) {
//            System.out.println("ERRO: " + e.getMessage().toString());
//            return null;
//        }
//        
//        System.out.println ("Executou buscar area com sucesso");
//        return objConta;
//    }
//    
//    public boolean incluir(){
//        
//        Conexao.abreConexao();
//        Connection con = Conexao.getConnection();
//        PreparedStatement stmt = null;
//        
//        try {
//            stmt = con.prepareStatement(" INSERT INTO area (nome)VALUES(?)");
//            stmt.setString(1, objConta.getNome());
//            
//            stmt.executeUpdate();
//            
//            return true;
//            
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//            return false;
//        }finally{
//            Conexao.closeConnection(con, stmt);
//        }
//        
//    }
//    
//    public boolean alterar(){
//        
//        Conexao.abreConexao();
//        Connection con = Conexao.getConnection();
//        PreparedStatement stmt = null;
//        
//        try {
//            stmt = con.prepareStatement("UPDATE area SET nome=? WHERE id=?");
//            stmt.setString(1, objConta.getNome());
//            stmt.setInt(2, objConta.getId());
//            
//            stmt.executeUpdate();
//            
//            return true;
//            
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//            return false;
//        }finally{
//            Conexao.closeConnection(con, stmt);
//        }
//        
//    }
//    
//    public boolean excluir(){
//        
//        Conexao.abreConexao();
//        Connection con = Conexao.getConnection();
//        PreparedStatement stmt = null;
//        
//        try {
//            stmt = con.prepareStatement("UPDATE area SET dataExclusao=? WHERE id=?");
//            stmt.setString(1, objConta.getDataExclusao());//1º?
//            stmt.setInt(2, objConta.getId());//5º?
//                        
//            stmt.executeUpdate();
//            
//            return true;
//            
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//            return false;
//        }finally{
//            Conexao.closeConnection(con, stmt);
//        }
//        
//    }
//    
//    public ArrayList<Conta> listaContas() {
//
//        Conexao.abreConexao();
//        
//        ArrayList<Conta> listagem_areas = new ArrayList();
//        Conta area_item = null;
//        
//        ResultSet result = null;
//        
//        try {
//
//            String SQL = "";
//            SQL = " SELECT id, nome AS nomeConta ";
//            SQL += " FROM area ";
//            SQL += " ORDER BY nome ";
//            
//            result = Conexao.stmt.executeQuery(SQL);
//
//            while (result.next()) {
//                area_item = new Conta();
//                area_item.setId(result.getInt("id"));
//                area_item.setNome(result.getString("nomeConta"));
//                listagem_areas.add(area_item);
//            }
//            
//        } catch (Exception e) {
//            System.out.println("problemas para popular tabela...");
//            System.out.println(e);
//            return null;
//        }
//        
//        return listagem_areas;
//    }
//    
//    public void PreencheContas() {
//
//        Conexao.abreConexao();
//        
//        Vector<String> cabecalhos = new Vector<String>();
//        Vector dadosTabela = new Vector();
//        cabecalhos.add("Código");
//        cabecalhos.add("Nome");
//        
//        ResultSet result = null;
//        
//        try {
//
//            String SQL = "";
//            SQL = " SELECT id, nome ";
//            SQL += " FROM area ";
//            SQL += " WHERE COALESCE(dataExclusao,'') = '' ";
//            SQL += " ORDER BY nome DESC ";
//            
//            result = Conexao.stmt.executeQuery(SQL);
//
//            while (result.next()) {
//                Vector<Object> linha = new Vector<Object>();
//                linha.add(result.getInt(1));
//                linha.add(result.getString(2));
//                dadosTabela.add(linha);
//            }
//            
//        } catch (Exception e) {
//            System.out.println("problemas para popular tabela...");
//            System.out.println(e);
//        }
//
//        jtbContas.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {
//
//            @Override
//            public boolean isCellEditable(int row, int column) {
//              return false;
//            }
//            // permite seleção de apenas uma linha da tabela
//        });
//
//
//        // permite seleção de apenas uma linha da tabela
//        jtbContas.setSelectionMode(0);
//
//        // redimensiona as colunas de uma tabela
//        TableColumn column = null;
//        for (int i = 0; i < 3; i++) {
//            column = jtbContas.getColumnModel().getColumn(i);
//            switch (i) {
//                case 0:
//                    column.setPreferredWidth(80);
//                    break;
//                case 1:
//                    column.setPreferredWidth(200);
//                    break;
//            }
//        }
//        jtbContas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.LIGHT_GRAY);
//                } else {
//                    setBackground(Color.WHITE);
//                }
//                return this;
//            }
//        });
//        //return (true);
//    }
    
}
