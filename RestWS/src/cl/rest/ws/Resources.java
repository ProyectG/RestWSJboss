package cl.rest.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="demo")
public class Resources {
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	@XmlElement(required=false, type=String.class, name="nombre")
	private String nombre;
	
	@XmlElement(required=false, type=String.class, name="apellido")
	private String apellido;
	
	
	
	public Resources()
	{
		super();
	}

}
