package main.java.asistenciaWeb;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SesionEntrenamiento {
	
	//Atributos
    private Date fecha;
    private int duracion;
    private String lugar;
    private String planEntrenamiento;
    private List<Integrante> asistencia;

    //Método Constructor
    public SesionEntrenamiento(){
        asistencia = new ArrayList<>();
    }

    public boolean asistio(String identificacionBuscada){
        boolean asistio = false;
        for (int i=0; i<asistencia.size(); i++) {
            Integrante integranteActual = asistencia.get(i);
            String identificacionActual = integranteActual.getIdentificacion();
            if (identificacionActual.equals(identificacionBuscada)) {
                asistio = true;
            }
        }
        return asistio;
    }

    public void agregarAsistente(Integrante integranteAsistente) {
        String identificacionBuscada = integranteAsistente.getIdentificacion();
        if (asistio(identificacionBuscada) == false) {
            asistencia.add(integranteAsistente);
        }
    }
    
    //Métodos getter
    public Date getFecha() {
        return fecha;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public String getLugar() {
        return lugar;
    }
    
     public String getPlanEntrenamiento() {
        return planEntrenamiento;
    }
     
     public List<Integrante> getAsistencia(){
        return asistencia;
    }
    
    //Métodos setter
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setPlanEntrenamiento(String planEntrenamiento) {
        this.planEntrenamiento = planEntrenamiento;
    }

}
