package com.webServiveApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.webServiveApp.model.Cliente;
import com.webServiveApp.repository.ClienteRepository;

@Service
public class ClienteService extends AbstractService<Cliente> {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	//regras de negócio
	/**
	 implementar regra de negócio aqui
	 **/
	
	@Override
    protected JpaRepository <Cliente,Long>  getRepository() {
        return clienteRepository;
    }
	

}
