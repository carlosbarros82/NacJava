package br.com.fiap.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.model.EletronicosModel;
import br.com.fiap.repository.EletronicosRepository;


@Controller
public class EletronicosController {
	
	private EletronicosRepository eletronicosRepository = new EletronicosRepository();
	
	@RequestMapping (value= {"/eletronico", "/"}, method = RequestMethod.GET)
	public String findAll(Model model) {
	
		List<EletronicosModel> listaEletronicos = eletronicosRepository.findAll();
		
		model.addAttribute("eletronicos", listaEletronicos);
		return "eletronicos";
	}
	
	@RequestMapping(value = "/eletronico/{id}", method = RequestMethod.GET)
	public String findById(@PathVariable("id") long id, Model model) {
		
		EletronicosModel eletronicoEncontrado = eletronicosRepository.findById(id);
		
		model.addAttribute("eletronico", eletronicoEncontrado);
		
		return "eletronico-detalhe";
	}
	
	@RequestMapping(value = "/eletronico/new", method = RequestMethod.GET)
	public String form() {
		return "eletronico-novo";
	}
	
	@RequestMapping(value = "/eletronico/new", method = RequestMethod.POST)
	public String save(EletronicosModel eletronicoModel) {
		
		eletronicosRepository.save(eletronicoModel);
		
		return "eletronico-novo-sucesso";
	}
	
	@RequestMapping(value = "/eletronico/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable("id") long id, Model model) {
		
		model.addAttribute("eletronico", eletronicosRepository.findById(id));
		
		return "eletronico-editar";
	}
	
	@RequestMapping(value = "/eletronico/update", method = RequestMethod.POST)
	public String updateProduto(EletronicosModel eletronicoModel, Model model) {
		
		eletronicosRepository.update(eletronicoModel);
		
		model.addAttribute("produtos", eletronicosRepository.findAll());
		
		return "eletronicos";
	}
}

