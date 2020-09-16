package com.teste.demo.controle;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.teste.demo.calculo.CalculoVetor;
import com.teste.demo.modelo.ModeloVetor;

@Controller
public class ControleVetor {

	private ModeloVetor mm;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String form() {
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String forma(@Validated ModeloVetor mod, BindingResult result, RedirectAttributes atributes) {
		if(result.hasErrors()) {
			atributes.addFlashAttribute("mensagem", "Verifique os campos");
			return "index";
		}
		return  validaCompo(mod);
	}

	@RequestMapping("/resposta")
	public ModelAndView modeloVetor() {
		ModelAndView mv = new ModelAndView("resposta");
		mv.addObject("vetors", mm);
		return mv;
	}
	
	 public String validaCompo(ModeloVetor modv) {
			if(modv.getValor() > 99 && modv.getValor() < 1001 && modv.getValor() % 10 == 0) {
				mm = modv;
				mm.setResposta(new CalculoVetor().CalcularVetor(mm.getValor(), mm.getOpcao()));
				return "redirect:/resposta";
			}else {
				return "index";
			}
	 }
}
