package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model2019.Dueño;
import ttps.spring.model2019.Mascota;
import ttps.spring.service.DueñoService;

@RestController
@RequestMapping(value="/duenio", produces = MediaType.APPLICATION_JSON_VALUE)
public class DueñoController {

	@Autowired
	private DueñoService dueñoService;
	
	@GetMapping("/{id}/mascotas")
	public ResponseEntity<List<Mascota>> mascotas(@PathVariable("id") int id){
		System.out.println(id);
		Dueño d = dueñoService.findById(id);
		List<Mascota> lmascota = d.getMascotas();
		//System.out.println(d.toString());
		return new ResponseEntity<List<Mascota>>(lmascota,HttpStatus.OK);
	}
}
