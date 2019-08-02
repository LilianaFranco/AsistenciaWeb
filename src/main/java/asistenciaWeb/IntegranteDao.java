package main.java.asistenciaWeb;
import java.util.List;

//Interfaz donde solo se dan nombres de métodos
public interface IntegranteDao {
	public List<Integrante> getAllIntegrantes();
	public boolean saveIntegrante(Integrante integrante);
	

}
