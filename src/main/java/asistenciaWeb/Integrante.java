package main.java.asistenciaWeb;
import java.util.Date;

public class Integrante {
	
	//Atributos
    private String nombre;
    private String identificacion;
    private String fechaNacimiento;
    private String eps;
    private String telefono;
    private String profesion;
    private String direccion;
    private String contactoEmergencia;
    private String telefonoContactoEmergencia;
    private String rol;

    //Método Constructor
    public Integrante(){
    }
    
    public Integrante(String nombre, String identificacion, String eps, String telefono, String profesion, String direccion, String contactoEmergencia, String telefonoContactoEmergencia, String rol){
		  this.nombre = nombre;
		  this.identificacion = identificacion;
		  this.eps = eps;
		  this.telefono = telefono;
		  this.profesion = profesion;
		  this.direccion = direccion;
		  this.contactoEmergencia = contactoEmergencia;
		  this.telefonoContactoEmergencia = telefonoContactoEmergencia;
		  this.rol = rol;
	  }
    

    //Métodos getter
    public String getNombre(){
        return nombre;
    }

    public String getIdentificacion(){
        return identificacion;
    }

    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    public String getEps(){
        return eps;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getProfesion(){
        return profesion;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getContactoEmergencia(){
        return contactoEmergencia;
    }

    public String getTelefonoContactoEmergencia(){
        return telefonoContactoEmergencia;
    }

    public String getRol(){
        return rol;
    }

    //Métodos setter
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void setIdentificacion(String nuevaIdentificacion){
        this.identificacion = nuevaIdentificacion;
    }

    public void setFechaNacimiento(String nuevaFechaNacimiento){
        this.fechaNacimiento = nuevaFechaNacimiento;
    }

    public void setEps(String nuevaEps){
        this.eps = nuevaEps;
    }

    public void setTelefono(String nuevoTelefono){
        this.telefono = nuevoTelefono;
    }

    public void setProfesion(String nuevaProfesion){
        this.profesion = nuevaProfesion;
    }

    public void setDireccion(String nuevaDirección){
        this.direccion = nuevaDirección;
    }

    public void setContactoEmergencia(String nuevoContacto){
        this.contactoEmergencia = nuevoContacto;
    }

    public void setTelefonoContactoEmergencia(String nuevoTelefonoContacto){
        this.telefonoContactoEmergencia = nuevoTelefonoContacto;
    }

    public void getRol(String nuevoRol){
        this.rol =  nuevoRol;
    }

}
