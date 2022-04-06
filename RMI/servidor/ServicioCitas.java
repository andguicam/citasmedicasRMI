package RMI.servidor;

import java.rmi.*;
import java.util.*;


interface ServicioCitas extends Remote {
    // TODO: rellenar los parametros que se le pasan a cada uno una vez tenga
    // definida la clase Cita

    //Terminar de hilar todo
    //ServicioCitas crearCita() throws RemoteException;
    List<Cita> obtenerListaCitas() throws RemoteException;
    Boolean reservarCita() throws RemoteException;
    Boolean anularCita() throws RemoteException;
    Boolean agregarCita() throws RemoteException;
    Boolean eliminarCita() throws RemoteException;
    Cita obtenerCita() throws RemoteException;
}
