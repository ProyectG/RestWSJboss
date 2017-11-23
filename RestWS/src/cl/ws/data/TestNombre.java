package cl.ws.data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestNombre {
	
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
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	
	private String nombre ="";
	private String apellido ="";
	private String edad ="";
	
	
	public TestNombre()
	{
		super();
	}
	
	

}
