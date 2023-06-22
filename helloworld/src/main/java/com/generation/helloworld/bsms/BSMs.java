package com.generation.helloworld.bsms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms-gen")
public class BSMs {
	@GetMapping
	public String bsms() {
		return "Proatividade, Orientação aos Detalhes, "
				+ "Orientação ao Futuro, Proatividade, Persistência, "
				+ "Comunicação, Mentalidade de Crescimento,"
				+ "Gestão de Tempo e Responsabilidade Pessoal.";
	}

}
