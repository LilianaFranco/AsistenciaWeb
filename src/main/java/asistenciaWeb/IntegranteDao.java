package main.java.asistenciaWeb;
import java.util.List;

//Interfaz donde solo se dan nombres de m�todos
public interface IntegranteDao {
	public List<Integrante> getAllIntegrantes();
	public boolean saveIntegrante(Integrante integrante);
	

}
