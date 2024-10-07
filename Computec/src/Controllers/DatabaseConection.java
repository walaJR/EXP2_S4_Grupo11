package Controllers;

import Clientes.Cliente;
import Equipos.Equipo;
import Ventas.Venta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.time.ZoneId;


public class DatabaseConection {
    
    Connection connect = null;
    
    String usuario = "root";
    String contraseña = "";
    String bd = "equiposDB"; //  CAMBIAR LA BASE DE DATOS
    String ip = "localhost";
    String puerto = "3306";
    // jdbc:mysql://localhost:3306/equiposDB
    String cadenaConexion = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
    
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(cadenaConexion, usuario, contraseña);
                    
        
        }catch (Exception e){
        
            JOptionPane.showMessageDialog(null, "No ha sido posible conectarse a la Base de Datos");
        }
        
        return connect;
    
    }
    
    public void desconectarBD(){
    
        try{
        
            if(connect != null && !connect.isClosed()) {
            connect.close();
            
            }
            
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión a la Base de Datos.");
        }
    
    }
    
    
    public void agregarClienteDB(JTextField rut, JTextField nombre, JTextField comuna, JTextField direccion, JTextField email, JTextField telefono, JTable listaClientes){
    
        DatabaseConection conexion = new DatabaseConection();
        
        String consulta = "INSERT INTO CLIENTE (rutCliente, nombre, direccion, comuna, email, telefono) VALUES (?, ?, ?, ?, ?, ?)";
        
        try{
        CallableStatement cs = conexion.establecerConexion().prepareCall(consulta);
        cs.setString(1, rut.getText());
        cs.setString(2, nombre.getText());
        cs.setString(3, direccion.getText());
        cs.setString(4, comuna.getText());
        cs.setString(5, email.getText());
        cs.setInt(6, Integer.parseInt(telefono.getText()));
        cs.execute();
        JOptionPane.showMessageDialog(null, "El Cliente se ha guardado correctamente en la Base de Datos");
        
        }catch(SQLException e) {
        
            JOptionPane.showMessageDialog(null, "No se ha podido ingresar el nuevo cliente. Intente nuevamente" + e.toString());
            
        }finally{
            
        conexion.desconectarBD();
        Cliente listaBBDD = new Cliente();
        listaBBDD.mostrarClientesBBDD(listaClientes);
        
        }
    
    }
    
    public void agregarEquipoDB(JTextField nombreE, JTextField tipoE, JTextField cpuE, JTextField nucleosE, JTextField velocidadE, JTextField tipoAlmacenamiento, JTextField ramE, JTextField tipoGabinete, JTextField precioE, JTable listaEquipos){
    
        DatabaseConection conexion = new DatabaseConection();
        
        String consulta = "INSERT INTO EQUIPO (nombre, tipo, cpu, nucleos_cpu, velocidad_cpu, tipo_almacenamiento, ram, tipo_gabinete, precio) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
        CallableStatement cs = conexion.establecerConexion().prepareCall(consulta);
        cs.setString(1, nombreE.getText());
        cs.setString(2, tipoE.getText());
        cs.setString(3, cpuE.getText());
        cs.setInt(4, Integer.parseInt(nucleosE.getText()));
        cs.setString(5, velocidadE.getText());
        cs.setString(6, tipoAlmacenamiento.getText());
        cs.setString(7, ramE.getText());
        cs.setString(8, tipoGabinete.getText());
        cs.setInt(9, Integer.parseInt(precioE.getText()));
        cs.execute();
        JOptionPane.showMessageDialog(null, "El equipo se ha guardado correctamente en la Base de Datos");
        
        }catch(SQLException e) {
        
            JOptionPane.showMessageDialog(null, "No se ha podido guardar el nuevo equipo. Intente nuevamente");
            
        }finally{
            
        conexion.desconectarBD();
        Equipo listaBBDD = new Equipo();
        listaBBDD.mostrarEquipoBBDD(listaEquipos);
        
        }
    
    
    
    
    }
    
    
    public void agregarVentaDB(JTextField total, JTable listaVentass){
    
        DatabaseConection conexion = new DatabaseConection();
        
        String consulta = "INSERT INTO VENTA (fecha_venta, total_venta) VALUES (?, ?)";
        
        try{
        CallableStatement cs = conexion.establecerConexion().prepareCall(consulta);
        
        LocalDateTime ahora = LocalDateTime.now();
        java.util.Date fechaUtil = java.util.Date.from(ahora.atZone(ZoneId.systemDefault()).toInstant());
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
  
        cs.setDate(1, fechaSQL);
        cs.setInt(2, Integer.parseInt(total.getText()));
        
        //Date fechaSeleccionada = fechaPelicula.getDate();
        //java.sql.Date fechaSQL = new java.sql.Date(fechaSeleccionada.getTime());

        cs.execute();
        JOptionPane.showMessageDialog(null, "La Venta se ha guardado correctamente en la Base de Datos");
        
        }catch(SQLException e) {
        
            JOptionPane.showMessageDialog(null, "No se ha podido guardar la venta. Intente nuevamente");
            
        } finally{
            
        conexion.desconectarBD();
        Venta listaBBDD = new Venta();
        listaBBDD.mostrarVentaBBDD(listaVentass);
        
        }
    
    
    }
    
    
    
    
    
}
