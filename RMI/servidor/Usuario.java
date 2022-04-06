package RMI.servidor;

import java.util.Date;

class Usuario {
    private String nombre;
    private String apellidos;
    private String dni;
    private Date fechaDeNacimiento;
    private String direccion;

    Usuario(String nom, String ap, String d, Date fech, String dir) {
        nombre = nom;
        apellidos = ap;
        dni = d;
        fechaDeNacimiento = fech;
        direccion = dir;
    }

    // Getters
    String getNombre() {
        return nombre;
    }

    String getApellidos() {
        return apellidos;
    }

    String getDni() {
        return dni;
    }

    Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    String getDireccion() {
        return direccion;
    }

    //Setters

    void setNombre(String nombre) {
        this.nombre=nombre;
    }

    void setApellidos(String apellidos) {
        this.apellidos=apellidos;
    }

    void setDni(String dni) {
        this.dni=dni;
    }

    void setFechaDeNacimiento(Date fecha) {
       this.fechaDeNacimiento=fecha;
    }

    void setDireccion(String direccion) {
        this.direccion=direccion;
    }
}