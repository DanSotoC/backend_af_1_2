package com.everis.formativa.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {	    
	    @RequestMapping(value = "/formulario")
		public String formulario(@RequestParam(value="name") String name,
				@RequestParam(value="lastname") String lastname ,
				@RequestParam(value="limit") String limit,
				@RequestParam(value="postalCode") String postalCode,
				Model model){
				//System.out.println(nombre+" - "+pass);
	    		//int largo = (int) (Math.log10(limit) + 1);

		    	int validator=5;
		    	if(name == "" || lastname == "" || postalCode == "" || limit == ""){
		    		validator--;
		    		model.addAttribute("alertaGeneral", "Agregue un valor, no se aceptan campos nulos");
		    		System.out.println("Agregue un valor, no se aceptan campos nulos");
		    		return "index.jsp";
		    	}
		    	else {
		  
		    		if(name.length() < 1  || name.length() > 10) {
		    			// mostrar error
			    		validator--;
			    		model.addAttribute("alertaNombre", "Minimo de caracteres 1 y Maximo 10");		    	}
			    	if(lastname.length() < 1  || lastname.length() > 10) {
					// mostrar error
			    		validator--;
			    		model.addAttribute("alertaApellido", "Minimo de caracteres 1 y Maximo 10");
			    	}
			    	if(Integer.parseInt(limit)<0 || limit.length()>6){
			    		validator--;
			    		model.addAttribute("alertaLimit","Limit debe ser positivo y no mayor a 6 digitos");
			    	}
			    	if(postalCode.length() !=8){
			    		validator--;
			    		model.addAttribute("alertaPcode","El codigo postal debe ser igual a 8");
		
			    	}
			    	if (validator == 5) {
			    		System.out.println(validator);
			    		model.addAttribute("nombre", name);
						model.addAttribute("apellido", lastname);
						model.addAttribute("limit", limit);
						model.addAttribute("postalCode", postalCode);
						return "inicio.jsp";
			    	}
		    	}
			    	
		    	return "index.jsp";
	    }

	    	    
	    
}
