package cl.rest.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.Element;

@XmlRootElement(name="")
public class StudentResponse {
	
	@XmlElement
	private int edad = 0;
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement
	private String nombre ="";
	
	
	public StudentResponse()
	{
		super();
	}
	
	
	public StudentResponse(Element s)
	{
		//this.edad = s.getAge();
		//this.nombre = s.getName();
	}
	
	
	
	

}
