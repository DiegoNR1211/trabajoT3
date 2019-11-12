package com.rgb.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@RequestMapping("/paquete")

@SessionAttributes("paquete")
public class PaqueteController {

	
	@GetMapping
	public String inicio(Model model) {
		
		return "/paquete/inicio";
	}
	
	
	
}
