package br.com.fiap.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.model.EletronicosModel;

@Controller
public class EletronicosController {
	
	@RequestMapping (value= {"/eletronico", "/"}, method = RequestMethod.GET)
	public String getEletronicos(Model model) {
	
		ArrayList<EletronicosModel> listaEletronicos = new ArrayList<>();
		listaEletronicos.add(new EletronicosModel("Celular 1", "Celular"));
		listaEletronicos.add(new EletronicosModel("Televis�o 1", "Televis�o"));
		listaEletronicos.add(new EletronicosModel("M�moria Ram 1", "Hardware"));
		listaEletronicos.add(new EletronicosModel("Fonte de Alimenta��o 1", "Hardware"));
		listaEletronicos.add(new EletronicosModel("Notebook 1", "Notebook"));
		listaEletronicos.add(new EletronicosModel("Desktop 1", "Desktop"));
		listaEletronicos.add(new EletronicosModel("Carregador 1", "Acess�rios"));
		listaEletronicos.add(new EletronicosModel("HD 1", "Hardware"));
		model.addAttribute("eletronicos", listaEletronicos);
		return "eletronicos";
	}
}
