package RMI.servidor;

import java.rmi.*;
import java.util.*;

import javax.naming.NameNotFoundException;

interface FabricaUsuarios extends Remote {
    //TODO: rellenar los parametros que se le pasan a cada uno una vez tenga definida la clase usuario
    Usuario doLogin() throws RemoteException,NameNotFoundException; //Esa excepcion por ejemplo, aunque podria ser solo RemoteException (probablemente acabe poniendo esa);
    Boolean agregarUsuario() throws RemoteException;
    Boolean eliminarUsuario() throws RemoteException;
    Usuario getUsuario() throws RemoteException,NameNotFoundException; //Idem que arriba
    Boolean modificarUsuario() throws RemoteException;
}
