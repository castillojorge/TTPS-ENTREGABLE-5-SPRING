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
	
	//@Autowired
	//AutenticacionService authService;
	
	//@RequestMapping(value ="/login", params = {"email", "pass"}, method = {RequestMethod.POST})
	@GetMapping
	//public ResponseEntity<String> login(@RequestParam("email") String email,@RequestParam("pass") String pass ){
	public List<String> login(){
		System.out.println("entro");
		List <String> l = new ArrayList();
		l.add("aadd");
		l.add("eee");
		return l;
		//return new ResponseEntity<String>(HttpStatus.OK);
		/*if(authService.login(email, pass) != null) {
			System.out.println("Error de Logueo");
			return new ResponseEntity<Usuario>(HttpStatus.OK);
		}
		return new ResponseEntity<Usuario>(HttpStatus.OK);*/
	}
	
}
