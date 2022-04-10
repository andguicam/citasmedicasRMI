package RMI.servidor;

import java.util.Date;

class Usuario {
    private String nombre;
    private String apellidos;
    private String dni;
    private Date fechaDeNacimiento;
    private String direccion;
    private String tipo_usuario;

    Usuario(String nom, String ap, String d, Date fech, String dir,String tipo) {
        nombre = nom;
        apellidos = ap;
        dni = d;
        fechaDeNacimiento = fech;
        direccion = dir;
        tipo_usuario=tipo;
    }

    
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }
    
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public String getTipo_usuario() {
        return tipo_usuario;
    }
    //Setters

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos=apellidos;
    }
    
    public void setDni(String dni) {
        this.dni=dni;
    }

    public void setFechaDeNacimiento(Date fecha) {
       this.fechaDeNacimiento=fecha;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }
    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
}