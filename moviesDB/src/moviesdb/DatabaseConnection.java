package moviesdb;
import java.sql.*;

public class DatabaseConnection {

    
    public void conectarseAMoviesDB(){
    
    try{
        // 1.- Creamos la conexión a la Base de Datos a través del controlador JDBC Conector J y DriveManager
        
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesDB", "root", "");
    
        // 2- Creamos un objeto Statement para poder enviar las consultas o querys al SQL
        
        Statement statement = conexion.createStatement();
        
        // 3.- Ejecutar la instrucción SQL mediante statement. La consulta devolverá un objeto ResultSet
        
        ResultSet resultset = statement.executeQuery("SELECT * FROM MOVIE");
        
        // 4.- Ya tenemos la consulta en una tabla virtual llamada ResultSet. Ahora debemos iterar y leer esa tabla.
        
        while(resultset.next()) {
        
            System.out.println(resultset.getString("ID_Pelicula") + " " + resultset.getString("titulo_pelicula") + " " + resultset.getString("director_pelicula") + " " + resultset.getString("año_pelicula") + " " + resultset.getString("duracion_pelicula") + " " + resultset.getString("genero_pelicula"));
            
        }
         
        resultset.close();
        statement.close();
        conexion.close();
        
    }catch(SQLException e) {
    
        System.out.println("No ha sido posible conectarse a la base de datos");
        e.printStackTrace();
        
    }
        
    }
    
    public static void main(String[] args) {
        
        DatabaseConnection conexion = new DatabaseConnection();
        
        conexion.conectarseAMoviesDB();
        
    }
    
}
