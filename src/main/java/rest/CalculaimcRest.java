package rest;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/restcalculaimc")
public class CalculaimcRest extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {

		float altura = 0;
		float peso = 0;
		String sexo="";
		String resultado = "";
		float result = 0;
        float imc;
        
        try {
        
        altura = Float.parseFloat(req.getParameter("altura"));
        peso = Float.parseFloat(req.getParameter("sexo"));
        sexo = req.getParameter("sexo");
        	
        }catch(Exception e){}
        
        result = (peso) / (((float)altura/100*(float)altura/100));			
				
		if (sexo.toUpperCase().equals("F")) {
			if (result < 19.1) {
				resultado = "Abaixo do Peso";
			} else if (result >= 19.1 && result <= 25.8) {
				resultado = "Peso Ideal";
			} else if (result >= 25.9 && result <= 27.3) {
				resultado = "Pouco Acima do Peso";
			} else if (result >= 27.4 && result <= 32.3) {
				resultado = "Acima do Peso";
			} else if (result >= 32.4) {
				resultado = "Obesidade";
			}
	
		} else if (sexo.toUpperCase().equals("M")) {
			if (result < 20.7) {
				resultado = "Abaixo do Peso";
			} else if (result >= 20.7 && result <= 26.4) {
				resultado = "Peso Ideal";
			} else if (result >= 26.5 && result <= 27.8) {
				resultado = "Pouco Acima do Peso";
			} else if (result >= 27.9 && result <= 31.1) {
				resultado = "Acima do Peso";
			} else if (result >= 31.2) {
				resultado = "Obesidade";
			}
		}

		resp.getOutputStream().print(
                "{"
                + "\"resultado\":\"" + resultado + "\""
              + "}");
    }

}