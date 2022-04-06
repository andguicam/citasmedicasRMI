package RMI.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ServicioCitasImpl extends UnicastRemoteObject implements ServicioCitas {

    protected ServicioCitasImpl() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public List<Cita> obtenerListaCitas() throws RemoteException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    @Override
    public Boolean reservarCita() throws RemoteException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    @Override
    public Boolean anularCita() throws RemoteException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    @Override
    public Boolean agregarCita() throws RemoteException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    @Override
    public Boolean eliminarCita() throws RemoteException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    @Override
    public Cita obtenerCita() throws RemoteException {
        // TODO Auto-generated method stub
        // TODO: Consulta SQL

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        return null;
    }

    
}
