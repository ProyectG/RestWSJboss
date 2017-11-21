package cl.rest.ws;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
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
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.Element;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jdom.Document;
import org.jdom.input.SAXBuilder;

import net.sf.saxon.s9api.DocumentBuilder;

@Path("/mensaje")
public class TestServicio {
	
	
	 	@Path("xml")
	    @POST
	    @Consumes("application/xml")
	 	@Produces("application/xml")
	 	public StudentResponse mensajeXml(Student xml)
	    {
	 		try {
	 			
	 			System.out.println(xml.getName().toString());
	 			//System.out.println(xml.toString());
	 			
//				String s = new String(xml, "ISO-8859-1");
//				Element xml2 = getElement(s);
//				System.out.println(s);
	 			//System.out.println(xml2.toString());
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		
	 		StudentResponse sr = new StudentResponse();
	 		//return Response.status(Status.OK).entity(sr).build();
//	        
	        return sr;
	    }
	 	
	 	@Path("json")
	    @POST
	    @Consumes({MediaType.APPLICATION_JSON})
	 	@Produces({MediaType.APPLICATION_JSON})
	 	public void mensajeJson(Student s)
	    {
	       
	    }
	 	
	 	
	 	
	 	private Element getElement(String xml)
	    {
	        InputStream is = new ByteArrayInputStream(xml.getBytes());
	        Element root = null;
	        try
	            {
	                root = (Element) new SAXBuilder().build(is).getRootElement();
	            }
	            catch (Exception e1)
	            {
	                e1.printStackTrace();
	            }
	        return root;
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

