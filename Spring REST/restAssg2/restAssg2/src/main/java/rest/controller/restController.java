package rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/rest/auth")

public class restController {
	@GetMapping("/getMsg")
	public String greeting() {
		return ("<h1>Spring Welcome</h1>");
	}
}