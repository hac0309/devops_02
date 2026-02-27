package org.doit.ik.home;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
	
	@GetMapping(value = {"/index", "/"})
	public String index() {
		return "index";
	}

}
