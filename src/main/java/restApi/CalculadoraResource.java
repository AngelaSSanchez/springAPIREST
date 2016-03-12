package restApi;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import restApi.exceptions.MyException;

@RestController
@RequestMapping(Uris.SERVLET_MAP + Uris.ADMINS)
public class CalculadoraResource {

	@RequestMapping(value = Uris.CALCULADORA, method = RequestMethod.GET)
	public String division(@RequestParam(value = "dividendo") int dividendo,
						   @RequestParam(value = "divisor") int divisor) throws MyException
	{	
		int division = dividendo/divisor;
		String response = "{\"division\":"+division+"}";
		return response;
	}
	
    @RequestMapping(value = Uris.CALC2, method = RequestMethod.POST)
    public CalculadoraWrapper body(@RequestBody CalculadoraWrapper wrapper) {
        return wrapper;
    }
}
