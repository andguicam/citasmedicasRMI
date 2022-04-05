import java.rmi.*;
import java.utils.*;

class Usuario {
	private String nombre; 
	private String apellidos; 
	private String dni; 
	private Date fechaDeNacimiento; 
	private String direccion; 

	Usuario (String nom, String ap, String d, Date fech, String dir){
		nombre = nom;
		apellidos = ap;
		dni = d;
		fechaDeNacimiento = fech;
		direccion = dir; 
	}

	// Getters
	String getNombre () {
		return nombre;
	}
	String getApellidos (){
		return apellidos;
	}
	String getDni (){
		return dni;
	}
	Date getFechaDeNacimiento (){
		return fechaDeNacimiento; 
	}
	String getDireccion(){
		return direccion;
	}
}