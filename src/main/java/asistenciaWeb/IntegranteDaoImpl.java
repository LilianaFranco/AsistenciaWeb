package main.java.asistenciaWeb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

	public class IntegranteDaoImpl implements IntegranteDao {
		
	public IntegranteDaoImpl() {
	}


	public List<Integrante> getAllIntegrantes() {
		
		List<Integrante> losIntegrantes = new ArrayList();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(  
						"jdbc:mysql://localhost:3306/asistencia?serverTimezone=UTC","root","85042453019"); 
				Statement statement=con.createStatement();  
				ResultSet row=statement.executeQuery("select * from integrantes;");
				while(row.next()) {
					Integrante nuevoIntegrante = new Integrante();
					nuevoIntegrante.setNombre(row.getString(1));
					nuevoIntegrante.setIdentificacion(row.getString(2));
					nuevoIntegrante.setFechaNacimiento(row.getString(3));
					nuevoIntegrante.setEps(row.getString(4));
					nuevoIntegrante.setTelefono(row.getString(5));
					nuevoIntegrante.setProfesion(row.getString(6));
					nuevoIntegrante.setDireccion(row.getString(7));
					nuevoIntegrante.setContactoEmergencia(row.getString(8));
					nuevoIntegrante.setTelefonoContactoEmergencia(row.getString(9));
					losIntegrantes.add(nuevoIntegrante);
				}
				con.close();
				
				return losIntegrantes;  
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return losIntegrantes;
		}  
			
		}

		public boolean saveIntegrante(Integrante integrante) {
			Integrante nuevoIntegrante = integrante;
			boolean respuesta = false;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(  
						"jdbc:mysql://localhost:3306/asistencia?serverTimezone=UTC","root","85042453019"); 
				Statement statement=con.createStatement();  
				int insertResult=statement.executeUpdate("insert into integrantes (nombre, identificacion, fecha_nacimiento, eps, telefono, profesion, direccion, nombre_contacto_emergencia, telefono_contacto_emergencia) values ('"+nuevoIntegrante.getNombre()+"', '"+nuevoIntegrante.getIdentificacion()+"', '1985-04-24', '"+nuevoIntegrante.getEps()+"', '"+nuevoIntegrante.getTelefono()+"', '"+nuevoIntegrante.getProfesion()+"', '"+nuevoIntegrante.getDireccion()+"', '"+nuevoIntegrante.getContactoEmergencia()+"', '"+nuevoIntegrante.getTelefonoContactoEmergencia()+"');"); 
				con.close();
				respuesta = true;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			return respuesta;
		}
		

	}
