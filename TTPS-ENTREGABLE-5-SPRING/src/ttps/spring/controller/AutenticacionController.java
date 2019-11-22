package ttps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model2019.Usuario;
import ttps.spring.service.AutenticacionService;

@RestController
@RequestMapping( value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
public class AutenticacionController {
	
	@Autowired
	AutenticacionService authService;
	
	@RequestMapping(value ="/login", params = {"email", "pass"}, method = {RequestMethod.POST})
	public ResponseEntity<Usuario> login(@RequestParam("email") String email,@RequestParam("pass") String pass ){
		System.out.println("entro");
		if(authService.login(email, pass) != null) {
			System.out.println("Error de Logueo");
			return new ResponseEntity<Usuario>(HttpStatus.OK);
		}
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
	
}
