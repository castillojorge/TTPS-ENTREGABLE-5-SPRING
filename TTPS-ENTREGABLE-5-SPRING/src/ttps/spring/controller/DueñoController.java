package ttps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.service.Due�oService;

@RestController
public class Due�oController {

	@Autowired
	private Due�oService due�oService;
}
