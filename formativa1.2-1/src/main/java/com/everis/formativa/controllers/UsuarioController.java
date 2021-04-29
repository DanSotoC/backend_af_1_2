package com.everis.formativa.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {
	    @RequestMapping("/")
	    public String home(){
	    	return "index.jsp";
	    }
	    
	    @RequestMapping("/formulario")
		public String formulario(@RequestParam(value="nombre") String name,
				@RequestParam(value="pass") String lastname ,
				@RequestParam(value="pass") int limit,
				@RequestParam(value="pass") String postalCode,
				Model model){
				//System.out.println(nombre+" - "+pass);
		    	int validator=5;
		    	if(name != "" && lastname != "" && postalCode != "" ){
		    		validator--;
		    		return "<script>alert('Agregue un valor, no se aceptan campos nulos')<script>";
		    	}
		    	if(name.length() < 1  && name.length() > 10) {
	    			// mostrar error
		    		validator--;
		    		return "<script>alert('Minimo de caracteres 1 y Maximo 10')<script>";
		    	}
		    	if(lastname.length() < 1  && lastname.length() > 10) {
				// mostrar error
		    		validator--;
		    		return "<script>alert('Minimo de caracteres 1 y Maximo 10')<script>";
		    	}
		    	if(limit<0 && Integer.toString(limit).length()>6){
		    		validator--;
		    		return "<script>alert('Limit debe ser positivo y no mayor a 6 digitos')<script>";
		    	}
		    	if(postalCode.length() == 8){
		    		validator--;
		    		return "<script>alert('El codigo postal debe tene 8 digitos')<script>";
		    	}
		    	if (validator == 5) {
		    		model.addAttribute("nombre", name);
					model.addAttribute("apellido", lastname);
					model.addAttribute("limit", limit);
					model.addAttribute("postalCode", postalCode);
					return "inicio.jsp";
		    	}
				return  "index.jsp";
		    	
	    }
	    	
	    
	    
}
