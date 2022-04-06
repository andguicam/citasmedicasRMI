package RMI.servidor;
import java.util.List;

import RMI.servidor.ServicioCitas;

public class Paciente extends Usuario {
    private List<Cita> citas;

    Paciente (String nombre, String DNI, int edad){
        //Rellenar segun usuario?
    }

    // TODO: Que devuelve cada metodo
    // TODO: Parametros
    public verCitas(){
        ServicioCitas sc = new ServicioCitasImpl();
        sc.obtenerListaCitas(); //Esto devuelve una lista
    }

    public reservarCita(){
        ServicioCitas sc = new ServicioCitasImpl();
        sc.reservarCita();
    }
    public anularCita(){
        ServicioCitas sc = new ServicioCitasImpl();
        sc.anularCita();
    }
}
