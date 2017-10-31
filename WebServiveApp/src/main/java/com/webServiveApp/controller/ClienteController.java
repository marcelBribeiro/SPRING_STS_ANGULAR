package com.webServiveApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webServiveApp.model.Cliente;
import com.webServiveApp.service.AbstractService;
import com.webServiveApp.service.ClienteService;

@RestController
@CrossOrigin
@RequestMapping("/cliente")
public class ClienteController extends AbstractController<Cliente>{
	
	@Autowired
	private ClienteService ClienteService;
	
	@Override
	protected AbstractService <Cliente>  getService() {
		return ClienteService;
	}

	

}
