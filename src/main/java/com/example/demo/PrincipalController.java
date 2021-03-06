package com.example.demo;

import com.system.model.Contact;
import com.system.model.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PrincipalController {
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/p1")
	public String Pagina1() {
		return "pagina1";
	}

	@GetMapping("/p2")
	public String Pagina2() {
		return "pagina2";
	}
}