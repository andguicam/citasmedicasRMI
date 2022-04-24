package citas.servidor;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class testCitas {

	public static void main(String[] args) {
		
		ServicioCitasImpl sc = null; 
		FabricaUsuariosImpl fu = null;  
		Scanner keyInput = new Scanner(System.in);
		Scanner input =  new Scanner (System.in);
		try {
			sc = new ServicioCitasImpl();
		} catch (RemoteException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fu = new FabricaUsuariosImpl();
		} catch (RemoteException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while (true) {

			System.out.println( "\n"+
								"------Testing creacion de citas------\n"+
								"Elige una opción: \n"+
								"1. Obtener citas \n"+
								"2. Reservar citas \n"+
								"3. Anular cita \n"+
								"4. Agregar cita \n"+
								"5. Eliminar cita \n"+
								"6. Obtener cita \n"+
								"7. Salir");
			
			int key = keyInput.nextInt();
			
			switch (key) {
				case 1: {
					System.out.println("---- Obtener citas ----");
					List<Cita> citas = null; 
					
					try {
						citas = sc.obtenerListaCitas();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					
					for (Cita cita: citas) {
						System.out.println(cita + "\n");
					}
					break;
				}
				case 2: {
					System.out.println("---- Reservar citas ----");
					System.out.println("DNI del paciente: ");
					String dni = input.next();
					System.out.println("ID de la cita: ");
					String id = input.next(); 
					Usuario usuario = null;
					Cita cita = null;
					
					System.out.println("Reservando...");
					try {
						usuario = fu.getUsuario(dni, "paciente");
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					try {
						cita = sc.obtenerCita(id);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					
					try {
						sc.reservarCita(usuario, cita);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					break;
				}
				case 3: {
					System.out.println("---- Anular cita ----");
					System.out.println("DNI del paciente: ");
					String dni = input.next();
					System.out.println("ID de la cita: ");
					String id = input.next(); 
					Usuario usuario = null;
					Cita cita = null;
					
					System.out.println("Anulando cita...");
					try {
						usuario = fu.getUsuario(dni, "paciente");
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					try {
						cita = sc.obtenerCita(id);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					
					try {
						sc.anularCita(usuario, cita); 
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					break;
				}
				case 4: {
					System.out.println("---- Agregar cita ----");
					System.out.println("ID de la cita: ");
					String id = input.nextLine(); 
					System.out.println("Fecha de inicio (AAAA-MM-DD HH:mm:): ");
					SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-DD HH:mm");

					Date fechaInicio = null; 
					String fecha = input.nextLine(); 
					try {
						fechaInicio = sf.parse(fecha);
						
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 

					System.out.println("Fecha de fin (AAAA-MM-DD HH:mm): ");
					Date fechaFin = null;
					fecha = input.nextLine();
					try {
						fechaFin = sf.parse(fecha);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					
					System.out.println("Consulta: ");
					String consulta = input.nextLine();
					
					System.out.println("DNI del medico responsable: ");
					String dni = input.nextLine();
					
					Usuario usuario = null;  
					try {
						usuario = fu.getUsuario(dni, "medico");
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					
					Medico medicoResponsable = null;
					try {
						medicoResponsable = new Medico(usuario.getNombre(), usuario.getApellidos(),
								usuario.getDni(), usuario.getPassword(), usuario.getFechaDeNacimiento(),
								usuario.getDireccion(), usuario.getTipo_usuario());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					
					try {
						sc.agregarCita(id, fechaInicio, fechaFin, consulta, medicoResponsable);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				case 5: {
					System.out.println("---- Eliminar cita ----");
					System.out.println("Introduzca el ID de la cita: ");
					String id = input.next();
					
					Cita cita = null;
					
					try {
						cita = sc.obtenerCita(id);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(cita);
					
					try {
						sc.eliminarCita(cita);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					break;
				}
				case 6: {
					System.out.println("---- Obtener cita ----");
					System.out.println("Introduzca el ID de la cita: ");
					String id = input.next();
					
					Cita cita = null;
					
					try {
						cita = sc.obtenerCita(id);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(cita);
					break;
				}
				case 7: {
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
