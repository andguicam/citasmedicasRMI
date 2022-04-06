package RMI.servidor;

public class Administrador extends Usuario {

    Administrador (String nombre, String DNI, int edad){
        // Rellenar segun usuario?
    }

    //TODO: Que devuelve cada metodo
    //TODO: Parametros metodos

    public agregarUsuario(){
        FabricaUsuarios fu = new FabricaUsuariosImpl();
        fu.agregarUsuario();
    }

    public eliminarUsuario(){

        FabricaUsuarios fu = new FabricaUsuariosImpl();
        fu.eliminarUsuario();

    }
    public modificarUsuario(){
        FabricaUsuarios fu = new FabricaUsuariosImpl();
        fu.modificarUsuario();
        
    }
}
