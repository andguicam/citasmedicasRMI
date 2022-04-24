package citas.cliente; 

import java.rmi.*;
import java.rmi.server.*;
import citas.servidor.*;

import javax.swing.plaf.FontUIResource;

class Cliente {
    static public void main(String args[]) {
        if (args.length != 5) {
            System.err.println(
                    "Uso: ClienteLog hostregistro numPuertoRegistro nombreFichero identificadorAplicacion nombreCliente");
            return;
        }

        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());

        try {
            FabricaUsuarios fu = (FabricaUsuarios) Naming.lookup("//" + args[0] + ":" + args[1] + "/CitasMedicasFabricaUsuarios");          
            ServicioCitas sc = (ServicioCitas) Naming.lookup("//" + args[0] + ":" + args[1] + "/CitasMedicasServicioCitas");
            formulario form = new formulario(fu, sc);
            form.setVisible(true);

        } catch (RemoteException e) {
            System.err.println("Error de comunicacion: " + e.toString());
        } catch (Exception e) {
            System.err.println("Excepcion en ClienteLog:");
            e.printStackTrace();
        }
    }
}
