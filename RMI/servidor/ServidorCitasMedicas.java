import java.rmi.*;
import java.rmi.server.*;

class ServidorCitasMedicas {
    static public void main(String args[]) {
        if (args.length != 1) {
            System.err.println("Uso: ServidorCitasMedicas numPuertoRegistro");
            return;
        }
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            //TODO: Metodo principal, juntar las dos fabricas en una?
            FabricaUsuarios fu = new FabricaUsuariosImpl();
            Naming.rebind("rmi://localhost:" + args[0] + "/CitasMedicasFabricaUsuarios", fu);
            ServicioCitas fc = new ServicioCitasImpl();
            Naming.rebind("rmi://localhost:" + args[0] + "/CitasMedicasServicioCitas", fu);

        } catch (RemoteException e) {
            System.err.println("Error de comunicacion: " + e.toString());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Excepcion en ServidorFabricaLog:");
            e.printStackTrace();
            System.exit(1);
        }
    }
}