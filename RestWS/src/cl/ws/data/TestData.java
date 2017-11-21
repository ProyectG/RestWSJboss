package cl.ws.data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestData {
	
	private int numero = 0;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public TestData()
	{
		super();
	}
	
	

}
