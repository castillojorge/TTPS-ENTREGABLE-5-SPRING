package ttps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.service.DueñoService;

@RestController
public class DueñoController {

	@Autowired
	private DueñoService dueñoService;
}
