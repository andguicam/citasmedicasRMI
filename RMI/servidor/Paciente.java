package RMI.servidor;
import java.util.Date;
import java.util.List;

import RMI.servidor.ServicioCitas;

public class Paciente extends Usuario {
    private List<Cita> citas;

    Paciente (String nom, String ap, String d, Date fech, String dir, String tipo){
        super(nom, ap, d, fech, dir, tipo);
    }

    // TODO: Que devuelve cada metodo
    // TODO: Parametros
    List<Cita> public verCitas(){
        ServicioCitas sc = new ServicioCitasImpl();
        sc.obtenerListaCitas(); //Esto devuelve una lista
    }
    // Devuelve: True si ha tenido exito, False si no
    Boolean public reservarCita(){
        ServicioCitas sc = new ServicioCitasImpl();
        sc.reservarCita();
    }
    // Devuelve: True si ha tenido exito, False si no
    Boolean public anularCita(){
        ServicioCitas sc = new ServicioCitasImpl();
        sc.anularCita();
    }
}
