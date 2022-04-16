package citas.servidor;

import java.rmi.RemoteException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner; 

public class testFabricaUsuarios {

	public static void main(String[] args) {
		FabricaUsuariosImpl fu = null;
		Scanner keyInput = new Scanner(System.in);
		Scanner input =  new Scanner (System.in);
		try {
			fu = new FabricaUsuariosImpl();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		while (true) {

			System.out.println( "\n"+
								"------Testing del acceso a la base de datos------\n"+
								"Elige una opción: \n"+
								"1. Login \n"+
								"2. Agregar un usuario \n"+
								"3. Eliminar un uuario \n"+
								"4. Obtener un usuario \n"+
								"5. Modificar un usuario\n"+
								"6. Salir");
			int key = keyInput.nextInt();
			
			switch (key) {
				case 1: {
					System.out.println("----LOGIN----");
					System.out.println("DNI: ");
					String user = input.nextLine();
					System.out.println("CONTRASEÑA: ");
					String pass = input.nextLine();
					System.out.println("TIPO DE USUARIO (paciente | medico | adminstrador):  "); 
					String tipo = input.nextLine();
					try {
						Usuario usuario = fu.doLogin(user, pass, tipo);
						System.out.println(usuario);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				case 2: {
					System.out.println("---AGREGAR USUARIO---");
					System.out.println("NOMBRE: ");
					String nombre = input.nextLine();
					System.out.println("APELLIDOS: ");
					String apellidos = input.nextLine(); 
					System.out.println("DNI: ");
					String dni =input.nextLine(); 
					System.out.println("CONTRASEÑA: ");
					String password = input.nextLine();
					System.out.println("FECHA DE NACIMIENTO (AAAA-MM-DD): ");
					SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); 
					Date fechaDeNacimiento = null;
					try {
						fechaDeNacimiento = sf.parse(input.nextLine());
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					System.out.println("DIRECCIÓN: ");
					String direccion = input.nextLine();
					System.out.println("TIPO DE USUARIO (paciente | medico | adminstrador):  ");
					String tipo = input.nextLine();
					
					try {
						Boolean esAgregado = fu.agregarUsuario(nombre, apellidos, dni, password, fechaDeNacimiento, direccion, tipo);
						if (esAgregado) {
							System.out.println("El usuario ha sido agregado correctamente");
						}
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				case 3: {
					System.out.println("---ELIMINAR USUARIO---");
					System.out.println("DNI: ");
					String dni =input.nextLine();
					System.out.println("TIPO DE USUARIO (paciente | medico | adminstrador):  ");
					String tipo = input.nextLine();
					
					Usuario usuario = null; 
					try {
						usuario = fu.getUsuario(dni, tipo);
						System.out.println(usuario);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 					
					
					try {
						Boolean esEliminado = fu.eliminarUsuario(usuario);
						if (esEliminado) {
							System.out.println("El usuario ha sido eliminado correctamente");
						}
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					break;
				}
				case 4: {
					System.out.println("---OBTENER USUARIO---");
					System.out.println("DNI: ");
					String dni =input.nextLine();
					System.out.println("TIPO DE USUARIO (paciente | medico | adminstrador):  ");
					String tipo = input.nextLine();
					try {
						Usuario usuario = fu.getUsuario(dni, tipo);
						System.out.println(usuario);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					break;
				}
				case 5: {
					System.out.println("---MODIFICAR USUARIO---");
					System.out.println("! INTRODUZCA LOS DATOS ACTUALES");
					System.out.println("DNI: ");
					String dni =input.nextLine();
					System.out.println("TIPO DE USUARIO (paciente | medico | adminstrador):  ");
					String tipo = input.nextLine();
					
					Usuario usuarioAntiguo = null; 
					try {
						usuarioAntiguo = fu.getUsuario(dni, tipo);
						System.out.println(usuarioAntiguo);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
	
					System.out.println("! INTRODUZCA LOS NUEVOS DATOS");
					System.out.println("NOMBRE: ");
					String nombre2 = input.nextLine();
					System.out.println("APELLIDOS: ");
					String apellidos2 = input.nextLine(); 
					System.out.println("DNI: ");
					String dni2 =input.nextLine(); 
					System.out.println("CONTRASEÑA: ");
					String password2 = input.nextLine();
					System.out.println("FECHA DE NACIMIENTO (AAAA-MM-DD): ");
					SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); 
					Date fechaDeNacimiento2 = null;
					try {
						fechaDeNacimiento2 = sf.parse(input.nextLine());
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					System.out.println("DIRECCIÓN: ");
					String direccion2 = input.nextLine();
					System.out.println("TIPO DE USUARIO (paciente | medico | adminstrador):  ");
					String tipo2 = input.nextLine();
					
					Usuario usuarioNuevo = new Usuario(nombre2, apellidos2, dni2, password2, fechaDeNacimiento2, direccion2, tipo2);
					
					try {
						Boolean haSidoModificado = fu.modificarUsuario(usuarioAntiguo, usuarioNuevo);
						if (haSidoModificado) {
							System.out.println("El usuario ha sido modificado correctamente");
						}
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					break;
				}
				case 6: {
					System.out.println("Saliendo...");
					System.exit(0);
				}
				default:
					System.out.println("Valor erroneo, intentelo de nuevo: ");
					break;
				}
		}
	}
}