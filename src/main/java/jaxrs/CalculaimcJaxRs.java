package jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/restcalculaimc")
public class CalculaimcJaxRs {

	@GET
	@Path("/calculaimc")
	@Produces("application/json")
	public Calcularimc calcular(@QueryParam("pesoidade") Float peso, Float altura String sexo) {
	  Calculaimc calculaimc = new Calculaimc(peso,altura,sexo);
	  calculaimc.calculaIMC(peso, altura, sexo);
	  return calculaimc;
	}
}