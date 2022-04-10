package RMI.servidor;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public class Medico extends Usuario {
    private ServicioCitas sc;
    Medico (String nom, String ap, String d, Date fech, String dir, String tipo) throws RemoteException{
        super(nom, ap, d, fech, dir, tipo);
        sc= new ServicioCitasImpl();
    }

    public List<Cita> verCitas() throws RemoteException{
        return sc.obtenerListaCitas();
    }

    //Devuelve: True si ha tenido exito, False si no
    public Boolean agregarCita(String id, Date fechaInicio, Date fechaFin, String consulta, Medico medicoResponsable) throws RemoteException{
        return sc.agregarCita(id, fechaInicio, fechaFin, consulta, medicoResponsable);
    }
    //Devuelve: True si ha tenido exito, False si no
    public Boolean eliminarCita(Cita cita) throws RemoteException{
        return sc.eliminarCita(cita);
    }
}
