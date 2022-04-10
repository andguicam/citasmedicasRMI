package RMI.servidor;

import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import javax.naming.NameNotFoundException;

public class FabricaUsuariosImpl extends UnicastRemoteObject implements FabricaUsuarios{
    private static final String url = "jdbc:postgresql://localhost:5432/dit";
    private static String dbuser = "dit";
    private static final String dbpass = "dit";
    private Connection conn;
    protected FabricaUsuariosImpl() throws RemoteException, SQLException {
        conn = DriverManager.getConnection(url, dbuser, dbpass);
    }

    @Override
    public Usuario doLogin(String user, String pass) throws RemoteException {

        // TODO: Consulta SQL
        //Necesario: Nombre, apellido, dni, fecha de nacimiento, direccion y tipo de usuario

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));

        if(tipo="Administrador"){
            Usuario user = new Administrador(nom, ap, d, fech, dir, tipo);
            return user;
        }
        if (tipo = "Medico") {
            Usuario user = new Medico(nom, ap, d, fech, dir, tipo);
            return user;
        }
        if (tipo = "Paciente") {
            Usuario user = new Paciente(nom, ap, d, fech, dir, tipo);
            return user;
        }

    }

    @Override
    public Boolean agregarUsuario(String nombre, String apellidos, String dni, Date fechaDeNacimiento, String direccion) throws RemoteException {
        // TODO: Consulta SQL
        //
        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));

        // Pseudocodigo para este metodo (tras sentencia SQL)
        // if(exito){
        //     return true;
        // }else{
        //     return false;
        // }

        // TODO: Borrar al implementar
        return null;
    }

    @Override
    public Boolean eliminarUsuario(Usuario usuario) throws RemoteException {

        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));

        // Pseudocodigo para este metodo (tras sentencia SQL)
        // if(exito){
        // return true;
        // }else{
        // return false;
        // }

        //TODO: Borrar al implementar
        return null;
    }

    @Override
    public Usuario getUsuario(String DNI) throws RemoteException {

        // TODO: Consulta SQL, a partir del DNI

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));

        
        // Pseudocodigo para este metodo (tras sentencia SQL)
        // if(exito){
        // return true;
        // }else{
        // return false;
        // }
        Usuario user;
        user = new Usuario(nom, ap, d, fech, dir, tipo);
        return user;
    }

    @Override
    public Boolean modificarUsuario(Usuario user_antiguo, Usuario user_nuevo) throws RemoteException {

        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
       
        // Pseudocodigo para este metodo (tras sentencia SQL)
        // if(exito){
        // return true;
        // }else{
        // return false;
        // }

        // TODO: Borrar al implementar
        return null;
    }

}
