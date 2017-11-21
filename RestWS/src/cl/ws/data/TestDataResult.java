package cl.ws.data;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TestDataResult {
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	private int numero = 0;
	private String descripcion = "";
	
	
	public TestDataResult()
	{
		super();
	}
	
	public TestDataResult( TestData parametros)
	{
		this.setNumero(parametros.getNumero());
		if(parametros.getNumero() > 5)
		{
			this.setDescripcion("Es un numero mayor a 5");
		}
		else
		{
			this.setDescripcion("Es un numero menor a 5");
		}
	}
	
	

}
