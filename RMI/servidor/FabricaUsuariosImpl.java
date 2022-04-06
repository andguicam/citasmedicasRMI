package RMI.servidor;

import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.naming.NameNotFoundException;

public class FabricaUsuariosImpl extends UnicastRemoteObject implements FabricaUsuarios{

    protected FabricaUsuariosImpl() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public Usuario doLogin() throws RemoteException, NameNotFoundException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    @Override
    public Boolean agregarUsuario() throws RemoteException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    @Override
    public Boolean eliminarUsuario() throws RemoteException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    @Override
    public Usuario getUsuario() throws RemoteException, NameNotFoundException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    @Override
    public Boolean modificarUsuario() throws RemoteException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    
}
