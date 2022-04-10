package RMI.servidor;

import java.rmi.RemoteException;
import java.util.Date;

public class Administrador extends Usuario {

    private FabricaUsuarios fu;
    
    Administrador (String nom, String ap, String d, Date fech, String dir, String tipo) throws RemoteException{
        super(nom, ap, d, fech, dir, tipo);
        fu = new FabricaUsuariosImpl();
    }

    // Devuelve: True si ha tenido exito, False si no
    public Boolean agregarUsuario(String nombre, String apellidos, String dni, Date fechaDeNacimiento, String direccion ) throws RemoteException{
        return fu.agregarUsuario(nombre, apellidos, dni, fechaDeNacimiento, direccion);
    }
    // Devuelve: True si ha tenido exito, False si no
    public Boolean eliminarUsuario(Usuario usuario) throws RemoteException{
        return fu.eliminarUsuario(usuario);

    }
    // Devuelve: True si ha tenido exito, False si no
    public Boolean modificarUsuario(Usuario user_antiguo, Usuario user_nuevo) throws RemoteException{
        return fu.modificarUsuario(user_antiguo, user_nuevo);
        
    }
}
