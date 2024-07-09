package EncriptacionMensajes;

public class Encriptacion {
    
    public static String encriptacion(String mensaje, int clave) {
    
    StringBuilder mensajeEncriptado = new StringBuilder();
    
    for(char c : mensaje.toCharArray()) {
        mensajeEncriptado.append((char) (c + clave));
    }
    return mensajeEncriptado.toString();
    }
    
    
    public static String desencriptacion(String mensajeEncriptado, int clave) {
    StringBuilder mensajeDesencriptado = new StringBuilder();
    
    for(char c : mensajeEncriptado.toCharArray()) {
        mensajeDesencriptado.append((char) (c - clave));
    }
    return mensajeDesencriptado.toString();
    }
}
