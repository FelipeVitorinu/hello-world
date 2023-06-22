package com.generation.helloworld.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizagem")
public class DesafiosDeAprendizagem {
	@GetMapping
	public String DesafiosDeAprendizagem() {
		return "Para até o final dessa semana, pretendo recuperar as partes de aula que eu perdi"
				+ " lendo toda a documentação para que eu possa voltar a acompanhar a turma e contribuir com a minha equipe.";
	}
}
