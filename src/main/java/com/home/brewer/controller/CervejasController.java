package com.home.brewer.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.home.brewer.model.Cerveja;
import com.home.brewer.repository.Cervejas;

@Controller
public class CervejasController {
	private static final Logger logger = LoggerFactory.getLogger(CervejasController.class);

//	@Autowired
//	private Cervejas cervejas;

	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		if (logger.isDebugEnabled()) {
			logger.debug("Objeto cerveja: " + cerveja);
		}
//		cervejas.findAll(); //TODO remover
		return "cerveja/CadastroCerveja";
	}

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attr) {
		if (result.hasErrors()) {
			return novo(cerveja);
		}
		attr.addFlashAttribute("mensagem", "Cerveja gravada com sucesso!");
		System.out.println("Cadastro Cerveja >>> " + cerveja.getSku() + ", " + cerveja.getNome());
		return "redirect:/cervejas/novo";
	}

	@RequestMapping("/cervejas/cadastro")
	public String cadastro() {
		return "estilo/CadastroEstilo";
	}

}
