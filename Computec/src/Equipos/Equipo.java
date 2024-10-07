package Equipos;

import Controllers.DatabaseConection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Equipo {
    
    
        String nombreEquipo;
        String tipoEquipo;
        String cpuEquipo;
        int nucleosCpu;
        String velocidadCpu;
        String tipoAlmacenamiento;
        String rampEquipo;
        String tipoGabinete;
        int precioEquipo;
        public static ArrayList<Equipo> listaEquipos = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String tipoEquipo, String cpuEquipo, int nucleosCpu, String velocidadCpu, String tipoAlmacenamiento, String rampEquipo, String tipoGabinete, int precioEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.tipoEquipo = tipoEquipo;
        this.cpuEquipo = cpuEquipo;
        this.nucleosCpu = nucleosCpu;
        this.velocidadCpu = velocidadCpu;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.rampEquipo = rampEquipo;
        this.tipoGabinete = tipoGabinete;
        this.precioEquipo = precioEquipo;
    }


    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getCpuEquipo() {
        return cpuEquipo;
    }

    public void setCpuEquipo(String cpuEquipo) {
        this.cpuEquipo = cpuEquipo;
    }

    public int getNucleosCpu() {
        return nucleosCpu;
    }

    public void setNucleosCpu(int nucleosCpu) {
        this.nucleosCpu = nucleosCpu;
    }

    public String getVelocidadCpu() {
        return velocidadCpu;
    }

    public void setVelocidadCpu(String velocidadCpu) {
        this.velocidadCpu = velocidadCpu;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public String getRampEquipo() {
        return rampEquipo;
    }

    public void setRampEquipo(String rampEquipo) {
        this.rampEquipo = rampEquipo;
    }

    public String getTipoGabinete() {
        return tipoGabinete;
    }

    public void setTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }

    public int getPrecioEquipo() {
        return precioEquipo;
    }

    public void setPrecioEquipo(int precioEquipo) {
        this.precioEquipo = precioEquipo;
    }
        
    
    
    
        // cpu = intel o amd o apple arm 
    public void registrarEquipo(JTextField nombre, JTextField tipo, JTextField cpu, JTextField nucleosCPU, JTextField velocidadCPU, JTextField tipoAlmacenamiento, JTextField ram, JTextField gabinete, JTextField precio) {
    
        Equipo nuevoEquipo = new Equipo();
        nuevoEquipo.setNombreEquipo(nombre.getText());
        nuevoEquipo.setTipoEquipo(tipo.getText());
        nuevoEquipo.setCpuEquipo(cpu.getText());
        nuevoEquipo.setNucleosCpu(Integer.parseInt(nucleosCPU.getText()));
        nuevoEquipo.setVelocidadCpu(velocidadCPU.getText());
        nuevoEquipo.setTipoAlmacenamiento(tipoAlmacenamiento.getText());
        nuevoEquipo.setRampEquipo(ram.getText());
        nuevoEquipo.setTipoGabinete(gabinete.getText());
        nuevoEquipo.setPrecioEquipo(Integer.parseInt(precio.getText()));
        listaEquipos.add(nuevoEquipo);
        JOptionPane.showMessageDialog(null, "El equipo se ha registrado con éxito");
        
        if(nuevoEquipo == null){
        JOptionPane.showMessageDialog(null, "Error al guardar el producto. Intente otra vez");
        }

    }
    
    
    public void mostrarEquipos(JTable productList){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        modelo.addColumn("Procesador");
        modelo.addColumn("Cant. Nucleos");
        modelo.addColumn("Velocidad Procesador");
        modelo.addColumn("Tipo Almacenamiento");
        modelo.addColumn("Memoria RAM");
        modelo.addColumn("Tipo Gabinete");
        modelo.addColumn("Precio");
        
        productList.setModel(modelo);
        
        for(Equipo equipo : listaEquipos) {
            String nombre = equipo.getNombreEquipo();
            String tipo = equipo.getTipoEquipo();              
            String procesadorCPU = equipo.getCpuEquipo();
            int nucleosCPU = equipo.getNucleosCpu();
            String velocidadCPU = equipo.getVelocidadCpu();
            String almacenamiento = equipo.getTipoAlmacenamiento();
            String ram = equipo.getRampEquipo();
            String gabinete = equipo.getTipoGabinete();
            int precio = equipo.getPrecioEquipo();
            
            modelo.addRow(new Object [] {nombre, tipo, procesadorCPU, nucleosCPU, velocidadCPU, almacenamiento, ram, gabinete, precio});
            productList.setModel(modelo);
    }
    }

    @Override
    public String toString() {
        return nombreEquipo;
    }
    
    
    public void mostrarEquipoBBDD(JTable productList){
    
        DatabaseConection conexion = new DatabaseConection();
        DefaultTableModel modelo = new DefaultTableModel();
        String consultaSQL = "SELECT * FROM EQUIPO;";
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        modelo.addColumn("Procesador");
        modelo.addColumn("Cant. Nucleos");
        modelo.addColumn("Velocidad Procesador");
        modelo.addColumn("Tipo Almacenamiento");
        modelo.addColumn("Memoria RAM");
        modelo.addColumn("Tipo Gabinete");
        modelo.addColumn("Precio");
        productList.setModel(modelo);
        
        try{
        
            Statement st = conexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            
            while(rs.next()) {
            
            String nombre = rs.getString("nombre");
            String tipo = rs.getString("tipo");
            String procesador = rs.getString("cpu");
            String cantNucleos = rs.getString("nucleos_cpu");
            String veloProc = rs.getString("velocidad_cpu");
            String almacenamiento = rs.getString("tipo_almacenamiento");
            String ram = rs.getString("ram");
            String gabinete = rs.getString("tipo_gabinete");
            String precio = rs.getString("precio");
            
            modelo.addRow(new Object [] {nombre, tipo, procesador, cantNucleos, veloProc, almacenamiento, ram, gabinete, precio});
            
            productList.setModel(modelo);
            }
            
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, "Error al mostrar la lista de base de datos");
            
        }
        
        finally {
        
        conexion.desconectarBD();
        }
    
    }
    
    
}
