package br.com.fiap.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EletronicosController {
	
	@RequestMapping (value= {"/eletronicos", "/"}, method = RequestMethod.GET)
	public String eletronicos(Model model) {
		model.addAttribute("teste", "Teste do Controller");
		return "teste";
	}
}
