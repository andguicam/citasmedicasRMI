package RMI.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ServicioCitasImpl extends UnicastRemoteObject implements ServicioCitas {
    private static final String url = "jdbc:postgresql://localhost:5432/dit";
    private static String dbuser = "dit";
    private static final String dbpass = "dit";
    private Connection conn;
    List<Cita> l;
    protected ServicioCitasImpl() throws RemoteException, SQLException {
        conn=DriverManager.getConnection(url,dbuser,dbpass);
    }

    @Override
    public List<Cita> obtenerListaCitas() throws RemoteException {
        l = new LinkedList<Cita>();

        // TODO: Consulta SQL
        //Necesario:
        // nom, ap, d, fech, dir, tipo -> Para crear el medico responsable
        // id,fechaInicio,fechaFin,consulta -> Para crear Cita

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));
        //ResultSet rs = st.executeQuery("SELECT * FROM usuarios");

        //Modificar codigo comentado de arriba y deberia de funcionar
        while(rs.next()){
            Medico m = new Medico(nom, ap, d, fech, dir, tipo);
            Cita c = new Cita(id,fechaInicio,fechaFin,consulta,m);
            l.add(c);

        }
        return l;
    }

    @Override
    public Boolean reservarCita(Usuario user, Cita cita) throws RemoteException {
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

    @Override
    public Boolean anularCita(Usuario user, Cita cita) throws RemoteException {
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

    @Override
    public Boolean agregarCita(String id, Date fechaInicio, Date fechaFin, String consulta,
            Medico medicoResponsable) throws RemoteException {
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

    @Override
    public Boolean eliminarCita(Cita cita) throws RemoteException {
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

    @Override
    public Cita obtenerCita(String id_cita) throws RemoteException {
        
        // TODO: Consulta SQL
        // Necesario:
        // nom, ap, d, fech, dir, tipo -> Para crear el medico responsable
        // id,fechaInicio,fechaFin,consulta -> Para crear Cita

        // String sql = "SELECT * FROM p WHERE ciudad=?";
        // PreparedStatement st = conn.prepareStatement(sql);
        // st.setString(1, request.getParameter("ciudad"));

        Medico m = new Medico(nom, ap, d, fech, dir, tipo);
        Cita c = new Cita(id, fechaInicio, fechaFin, consulta, m);
        return c;
    }

    
}
