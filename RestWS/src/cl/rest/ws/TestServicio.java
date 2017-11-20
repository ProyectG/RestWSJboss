package cl.rest.ws;


import java.util.List;

import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/mensaje")
public class TestServicio {
	
	
	 	@Path("xml")
	    @POST
	    @Consumes({MediaType.APPLICATION_XML})
	 	public void printMessage(Student s)
	    {
	        System.out.println("****Mensaje*****");
	        System.out.println("nombre : "+s.getName());
	        System.out.println("edad  : "+s.getAge());
	    }
	 	
	 	@Path("json")
	    @POST
	    @Consumes({MediaType.APPLICATION_JSON})
	 	public void mensaje(Student s)
	    {
	        System.out.println("****Mensaje*****");
	        System.out.println("nombre : "+s.getName());
	        System.out.println("edad  : "+s.getAge());
	    }
	

//	@GET
//	@Path("/{param}/{param1}")
//	@Produces({"application/xml"})
//	public Response printMessage(@PathParam("param") String nombre, @PathParam("param1") String apellido) {
//
//		
//		String result = "Hola "+nombre+" "+apellido;
//		//return result;
//		
//		//Retorno texto
//		return Response.status(200).entity(result).build();
//		
//		//Retorno XML
//		 //return Response.status(200).type(MediaType.APPLICATION_XML).entity(resu).build();
//		
//
//	}


	
	
	
}

