package citas.servidor; 

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

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
        	LocateRegistry.createRegistry(22334);
            FabricaUsuarios fu = new FabricaUsuariosImpl();
            ServicioCitas sc = new ServicioCitasImpl(); 
            System.out.println(" despues de FabricaUsuarios");
            Naming.rebind("rmi://localhost:"+args[0]+"/CitasMedicasFabricaUsuarios", fu);
            Naming.rebind("rmi://localhost:"+args[0]+"/CitasMedicasServicioCitas", sc);

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