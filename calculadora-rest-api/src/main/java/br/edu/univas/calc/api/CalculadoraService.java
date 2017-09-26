package br.edu.univas.calc.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalculadoraService {
	
	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result somar(@QueryParam("first") float first, @QueryParam("second") float second);
	
	@POST
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	Result subtrair(@FormParam("first") float first, @FormParam("second") float second);
	
}
