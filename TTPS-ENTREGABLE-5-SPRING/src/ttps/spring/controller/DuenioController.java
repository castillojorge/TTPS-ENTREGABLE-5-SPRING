package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model2019.Dueño;
import ttps.spring.model2019.Mascota;
import ttps.spring.service.DuenioService;

@RestController
@RequestMapping(value="/duenio", produces = MediaType.APPLICATION_JSON_VALUE)
public class DuenioController {

	@Autowired
	private DuenioService duenioService;
	
	@GetMapping("/{id}/mascotas")
	public ResponseEntity<List<Mascota>> mascotas(@PathVariable("id") int id){
		Dueño d = duenioService.findById(id);
		if (d != null) {
			List<Mascota> lmascota = d.getMascotas();
			return new ResponseEntity<List<Mascota>>(lmascota,HttpStatus.OK);
		}
	    return new ResponseEntity<List<Mascota>>(HttpStatus.NOT_FOUND);
	}
	@PostMapping("/{id}/mascota")
	public ResponseEntity<Void> mascotas(@PathVariable("id") int id, @RequestBody Mascota m) {
		System.out.println(m.toString());
		if(duenioService.existDueño(id)) {
			duenioService.saveMascota(id, m);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		else return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
