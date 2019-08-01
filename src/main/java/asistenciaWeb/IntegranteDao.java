package main.java.asistenciaWeb;
import java.util.List;

public interface IntegranteDao {
	public List<Integrante> getAllIntegrantes();
	public boolean saveIntegrante(Integrante integrante);
	

}
