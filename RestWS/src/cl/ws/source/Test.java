package cl.ws.source;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.ws.data.TestData;
import cl.ws.data.TestDataResult;
import cl.ws.data.TestNombre;
import cl.ws.data.TestNombreResult;


@Path("Test")
public class Test {
	
	@Path("numero")
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public TestDataResult test( TestData parameters) {
		
		TestDataResult tdr = new TestDataResult(parameters);
	
		return tdr;
	}
	
	
	@Path("nombre")
	@POST
	@Consumes({MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_XML})
	public TestNombreResult nombre(TestNombre parameters)
	{
		TestNombreResult tnr = new TestNombreResult(parameters);
		return tnr;
	}

}
