package com.rgb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.rgb.model.entity.Producto;
import com.rgb.service.ProductoService;


@Controller
@RequestMapping("/producto")

@SessionAttributes("producto")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Producto> producto = productoService.findAll();
			model.addAttribute("productos",producto);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "/producto/inicio";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		Producto producto = new Producto();
		model.addAttribute("producto",producto);
		
		return "/producto/nuevo";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute("producto") Producto producto, 
			Model model, SessionStatus status) {
		try {
			productoService.save(producto);
			status.setComplete();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/producto";
	}
}
