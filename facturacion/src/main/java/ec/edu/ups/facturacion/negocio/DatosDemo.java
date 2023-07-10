package ec.edu.ups.facturacion.negocio;

import ec.edu.ups.facturacion.datos.PersonaDao;
import ec.edu.ups.facturacion.modelo.Persona;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class DatosDemo {
	@Inject
	private PersonaDao daoPersona;
	
	 @PostConstruct
	 public void init() {
		 System.out.println("hola mundo");
		 Persona p = new Persona();
		 p.setCedula("0107083511");
		 p.setNombre("Noe");
		 p.setDireccion("San Joaquin");
		 
	 }

}
