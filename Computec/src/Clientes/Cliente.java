
package Clientes;

import Controllers.DatabaseConection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Cliente {
    
    
    String rutCliente;
    String nombreCliente;
    String comunaCliente;
    String direccionCliente;
    String emailCliente;
    int telefonoCliente;
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String rutCliente, String nombreCliente, String comunaCliente, String direccionCliente, String emailCliente, int telefonoCliente) {
        this.rutCliente = rutCliente;
        this.nombreCliente = nombreCliente;
        this.comunaCliente = comunaCliente;
        this.direccionCliente = direccionCliente;
        this.emailCliente = emailCliente;
        this.telefonoCliente = telefonoCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getComunaCliente() {
        return comunaCliente;
    }

    public void setComunaCliente(String comunaCliente) {
        this.comunaCliente = comunaCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    
    public void registroCliente(JTextField rut, JTextField nombre, JTextField comuna, JTextField direccion, JTextField email, JTextField telefono) {
    
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setRutCliente(rut.getText());
        nuevoCliente.setNombreCliente(nombre.getText());
        nuevoCliente.setComunaCliente(comuna.getText());
        nuevoCliente.setDireccionCliente(direccion.getText());
        nuevoCliente.setEmailCliente(email.getText());
        nuevoCliente.setTelefonoCliente(Integer.parseInt(telefono.getText()));
        listaClientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
        
        if(nuevoCliente == null) {
        JOptionPane.showMessageDialog(null, "Error al registrar el nuevo cliente. Intente otra vez");
        }
    
    }
    
    public void mostrarClientes(JTable clientList){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Rut Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Comuna");
        modelo.addColumn("Dirección");
        modelo.addColumn("E-mail");
        modelo.addColumn("Teléfono");
        clientList.setModel(modelo);
        
        for(Cliente cliente : listaClientes) {
            String rut = cliente.getRutCliente();
            String nombre = cliente.getNombreCliente();
            String comuna = cliente.getComunaCliente();
            String direccion = cliente.getDireccionCliente();
            String email = cliente.getEmailCliente();
            int telefono = cliente.getTelefonoCliente();
            
            modelo.addRow(new Object [] {rut, nombre, comuna, direccion, email, telefono});
            clientList.setModel(modelo);
    }
    

    }
    
    public void mostrarClientesBBDD(JTable clientList){
    
        DatabaseConection conexion = new DatabaseConection();
        DefaultTableModel modelo = new DefaultTableModel();
        String consultaSQL = "SELECT * FROM CLIENTE;";
        
        modelo.addColumn("Rut Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Comuna");
        modelo.addColumn("Dirección");
        modelo.addColumn("E-mail");
        modelo.addColumn("Teléfono");
        clientList.setModel(modelo);
        
        try{
        
            Statement st = conexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            
            while(rs.next()) {
            
            String rut = rs.getString("rutCliente");
            String nombre = rs.getString("nombre");
            String direccion = rs.getString("direccion");
            String comuna = rs.getString("comuna");
            String email = rs.getString("email");
            String telefono = rs.getString("telefono");
            
            modelo.addRow(new Object [] {rut, nombre, direccion, comuna, email, telefono});
            
            clientList.setModel(modelo);
            }
            
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, "Error al mostrar la lista de base de datos");
            
        }
        
        finally {
        
        conexion.desconectarBD();
        }
    
    
    
    }
    
    
    
    
}
