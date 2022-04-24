
package citas.cliente;

import java.rmi.*;
import java.rmi.server.*;
import citas.servidor.*;

public class Cliente{
    static public void main (String args[]) {
        if (args.length<5) {
            System.err.println("Uso: Cliente hostregistro numPuertoRegistro usuario pass rol");
            return;
        }

       if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());

        try {
            String user = args[2];
            String pass = args[3];
            String tipo = args[4];

            FabricaUsuarios fabricaUsuarios = (FabricaUsuarios) Naming.lookup("//"+ args[0] +":" + args[1] + "/CitasMedicasFabricaUsuarios");
            
            Usuario usuario = fabricaUsuarios.doLogin(user, pass, tipo); 
            System.out.println(usuario);

        }
        catch (RemoteException e) {
            System.err.println("Error de comunicacion: " + e.toString());
        }
        catch (Exception e) {
            System.err.println("Excepcion en ClienteEco:");
            e.printStackTrace();
        }
    }
}
