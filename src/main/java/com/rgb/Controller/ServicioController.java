package com.rgb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rgb.model.entity.Servicio;
import com.rgb.service.ServicioService;

@Controller
@RequestMapping("/servicio")

@SessionAttributes("servicio")
public class ServicioController {
	@Autowired
	
	private ServicioService servicioService;
	

	@GetMapping
	public String inicio(Model model) {
		try {
			List<Servicio> servicio = servicioService.findAll();
			model.addAttribute(" servicio",  servicio);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/Servicios/inicio";
	}
}
