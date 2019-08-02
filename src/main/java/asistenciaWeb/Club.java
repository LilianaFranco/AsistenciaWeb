package main.java.asistenciaWeb;
import java.util.ArrayList;
import java.util.List;

public class Club {
	
	//Atributos
    private String nombre;
    private String razonSocial;
    private String logo;
    private Integrante presidente;
    private Integrante secretario;
    private Integrante tesorero;
    private Integrante entrenador;
    private List<Integrante> integrantes;

    //M�todo Constructor
    public Club(){
        integrantes = new ArrayList<>();
    }

    //M�todos
    public void agregarIntegrante(Integrante nuevoIntegrante){
        integrantes.add(nuevoIntegrante);
    }

    public Integrante buscarIntegrante(String identificacion){
        for (int i=1; i<=integrantes.size(); i++){
            Integrante integranteActual = integrantes.get(i);
            String identificacionActual = integranteActual.getIdentificacion();
            if (identificacionActual.equals(identificacion)){
                return integranteActual;
            }
        }
        return null;
    }



}
