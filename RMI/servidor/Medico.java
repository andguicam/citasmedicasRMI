package RMI.servidor;
   

public class Medico extends Usuario {
    Medico (String nombre, String DNI, int edad){
        // Rellenar segun usuario?        
    }

    // TODO: Que devuelve cada metodo
    // TODO: Rellenar parametros
    public verCitas(){
        ServicioCitas sc = new ServicioCitasImpl();
        sc.obtenerListaCitas();
    }

    public agregarCita(){
        ServicioCitas sc = new ServicioCitasImpl();
        sc.agregarCita();
    }
    public eliminarCita(){
        ServicioCitas sc = new ServicioCitasImpl();
        sc.eliminarCita();
    }
}
