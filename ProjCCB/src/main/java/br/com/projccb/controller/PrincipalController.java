package br.com.projccb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PrincipalController {

	@RequestMapping(value="/principal", method=RequestMethod.GET)
	public String form(){
		return "principal/index";
	}
	
}
