package cl.ws.data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestNombreResult {

	private String mensaje ="";
	private String nombre ="";
	
	public TestNombreResult(){
		super();
	}
	
	public TestNombreResult(TestNombre parameters) {
		// TODO Auto-generated constructor stub
		
		this.nombre = parameters.getNombre().concat(" ").concat(parameters.getApellido());
		
		try
		{
			
		
			if(Integer.parseInt(parameters.getEdad()) >= 40)
			{
				this.mensaje = "Es hora de pensar en hacer otra cosa.";
			}
			
		}catch(Exception e)
		{
			this.mensaje ="Error la edad no es numerica";
		}
	}

}
