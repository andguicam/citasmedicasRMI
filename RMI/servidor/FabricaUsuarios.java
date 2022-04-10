package RMI.servidor;

import java.rmi.*;
import java.util.*;

interface FabricaUsuarios extends Remote {
    Usuario doLogin(String user, String pass) throws RemoteException;
    Boolean agregarUsuario(String nombre, String apellidos, String dni, Date fechaDeNacimiento, String direccion) throws RemoteException;
    Boolean eliminarUsuario(Usuario usuario) throws RemoteException;
    Usuario getUsuario(String DNI) throws RemoteException;
    Boolean modificarUsuario(Usuario user_antiguo, Usuario user_nuevo) throws RemoteException;
}
