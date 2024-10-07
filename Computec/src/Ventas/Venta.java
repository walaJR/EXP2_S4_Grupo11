package Ventas;

import Clientes.Cliente;
import Controllers.DatabaseConection;
import Controllers.EquipoAppleCareDecorator;
import Equipos.Equipo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Venta {
    
    LocalDateTime fechaVenta;
    int totalVenta;
    public static ArrayList<Venta> listaVentas = new ArrayList<>();

    public Venta() {
    }

    public Venta(LocalDateTime fechaVenta, int totalVenta) {
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    public void realizarVenta(JTextField total, JTextField fecha, JTextField rut, JRadioButton boton){
    
        String rutCliente = rut.getText();
        for(Cliente cliente : Cliente.listaClientes) {
            if(rutCliente.equalsIgnoreCase(cliente.getRutCliente())){
            
                Venta ventaActual = new Venta();
                LocalDateTime ahora = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String fechaHora = ahora.format(formato);
                ventaActual.setFechaVenta(ahora);
                fecha.setText(fechaHora);
                int totalCompra = Integer.parseInt(total.getText());
                if(boton.isSelected()) {
                 EquipoAppleCareDecorator appleCare = EquipoAppleCareDecorator.obtenerInstancia();
                 appleCare.ejecutar(totalCompra);
                int nuevoTotal = totalCompra + 320000;
                total.setText(String.valueOf(nuevoTotal));
                ventaActual.setTotalVenta(Integer.parseInt(total.getText()));
                listaVentas.add(ventaActual);
                //JOptionPane.showMessageDialog(null, "Venta realizada con éxito");
                } else {
                ventaActual.setTotalVenta(Integer.parseInt(total.getText()));
                listaVentas.add(ventaActual);
                JOptionPane.showMessageDialog(null, "Venta realizada con éxito");
                }
                
                if(ventaActual == null){
                    JOptionPane.showMessageDialog(null, "La venta no se ha podido realizar. Intente otra vez");
        
                }
            
            
            } else {
            JOptionPane.showMessageDialog(null, "Rut de cliente no existe. Debe registrar al cliente primero");
            
            }
            
            
        
        }
        
        
     }
    
    public void mostrarVentas(JTable ventas){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Fecha venta");
        modelo.addColumn("Total venta");
        
        ventas.setModel(modelo);
        
        for(Venta venta : listaVentas) {
            LocalDateTime fecha = venta.getFechaVenta();
            int total = venta.getTotalVenta();
            
            modelo.addRow(new Object [] {fecha, total});
            ventas.setModel(modelo);
    }
    
    }
    
    public void mostrarComboBox(JComboBox cb, JTextField total){
    
        cb.removeAllItems();
        DatabaseConection conexion = new DatabaseConection(); // nuevo
        String consultaSQL = "SELECT * FROM EQUIPO;";
        
        try{
        
            Statement st = conexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            
            while(rs.next()) {
                
            String producto = rs.getString("nombre");
            cb.addItem(producto);
            }
            
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, "Error al mostrar la lista de base de datos");
            
        }// hasta aqui
        
        
        /*for (Equipo equipo : Equipo.listaEquipos) {
            cb.addItem(equipo);
            total.setText(String.valueOf(equipo.getPrecioEquipo()));
        }
        
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Equipo equipoSeleccionado = (Equipo) cb.getSelectedItem();
                
                if (equipoSeleccionado != null) {
                    total.setText(String.valueOf(equipoSeleccionado.getPrecioEquipo()));
                }
            }
        });*/
    
    }
    
    
    public void mostrarVentaBBDD(JTable listaVentas){
    
        DatabaseConection conexion = new DatabaseConection();
        DefaultTableModel modelo = new DefaultTableModel();
        String consultaSQL = "SELECT * FROM VENTA;";
        
        modelo.addColumn("Fecha venta");
        modelo.addColumn("Total venta");
        listaVentas.setModel(modelo);
        
        try{
        
            Statement st = conexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            
            while(rs.next()) {
            
            java.sql.Date fechaSQL = rs.getDate("fecha_venta");
            String total= rs.getString("total_venta");
            //java.sql.Date fechaSQL = rs.getDate("año_pelicula");
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String nuevaFecha = sdf.format(fechaSQL);
            modelo.addRow(new Object [] {nuevaFecha, total});
            
            listaVentas.setModel(modelo);
            }
            
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, "Error al mostrar la lista de base de datos");
            
        }
        
        finally {
        
        conexion.desconectarBD();
        }
        
        
    
    }
    
    
    
}


