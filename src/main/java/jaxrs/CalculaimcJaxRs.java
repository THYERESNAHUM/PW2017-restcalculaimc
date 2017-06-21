package jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/restcalculaimc")
public class CalculaimcJaxRs {

	@GET
	@Path("/restcalculaimc")
	@Produces("application/json")
	public Calculaimc calcular(@QueryParam("peso,altura,sexo") Float peso, Float altura, String sexo) {
	  Calculaimc calculaimc = new Calculaimc(peso,altura,sexo);
	  calculaimc.calculaIMC(peso, altura, sexo);
	  return calculaimc;
	}
}