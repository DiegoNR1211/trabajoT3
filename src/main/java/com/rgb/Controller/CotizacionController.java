package com.rgb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rgb.model.entity.Cotizacion;
import com.rgb.service.CotizacionService;



@Controller
@RequestMapping("/cotizacion")

@SessionAttributes("cotizacion")
public class CotizacionController {
	@Autowired
	private CotizacionService cotizacionService;
	
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Cotizacion> cotizacion = cotizacionService.findAll();
			model.addAttribute(" cotizacion",  cotizacion);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/cotizacion/contacto";
	}
	
	
}
