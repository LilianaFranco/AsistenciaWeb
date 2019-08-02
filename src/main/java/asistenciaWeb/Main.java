package main.java.asistenciaWeb;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		IntegranteDaoImpl nuevo = new IntegranteDaoImpl();
		List<Integrante> integrantes = nuevo.getAllIntegrantes();
		System.out.println("Terminé");

	}

}
