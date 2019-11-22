package ttps.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model2019.Usuario;
import ttps.spring.service.AutenticacionService;

@RestController
@RequestMapping( "/login") //, produces = MediaType.APPLICATION_JSON_VALUE)
public class AutenticacionController {
	
	@Autowired
	AutenticacionService autenticacionService;
	
	@GetMapping(params = {"email", "pass"})
	public ResponseEntity<String> login(@RequestParam("email") String email,@RequestParam("pass") String pass ){
		Usuario u = autenticacionService.login(email, pass) ;
		if(u != null) {
			//Preguntar Como Armar este token
			String token = String.valueOf(u.getId_user())+"123456";
			return new ResponseEntity<String>(token,HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
}
