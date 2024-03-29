package citas.servidor; 

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Paciente extends Usuario {
    private List<Cita> citas;
    ServicioCitas sc;
    Paciente (String nom, String ap, String d, String pass, Date fech, String dir, String tipo){
        super(nom, ap, d, pass,  fech, dir, tipo);
        this.sc = null; 
    }

    public List<Cita> verCitas() throws RemoteException, SQLException {
        return sc.obtenerListaCitas(); 
    }
    public Boolean reservarCita(Usuario user, Cita cita) throws RemoteException, SQLException{
        return sc.reservarCita(user, cita);
    }
    public  Boolean anularCita(Usuario user, Cita cita) throws RemoteException, SQLException{
        return sc.anularCita(user, cita);
    }
    
    public void setServicioCitas(ServicioCitas sc) {
    	this.sc = sc; 
    }
    
}
