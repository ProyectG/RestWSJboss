package cl.ws.source;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.ws.data.TestData;
import cl.ws.data.TestDataResult;


@Path("Test")
public class Test {
	
	@POST
	@Consumes({ MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML })
	public TestDataResult test( TestData parameters) {
		
		TestDataResult tdr = new TestDataResult(parameters);
	
		return tdr;
	}

}
