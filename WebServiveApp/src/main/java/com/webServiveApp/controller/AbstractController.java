package com.webServiveApp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webServiveApp.model.AbstractEntity;
import com.webServiveApp.service.AbstractService;

import javassist.NotFoundException;

public abstract class AbstractController <T extends AbstractEntity> {
	
	 protected abstract AbstractService<T> getService();

	    @RequestMapping(method = RequestMethod.GET)
	    public List<T> list() {
	        return getService().listar();
	    }
	     
	    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
	    public T getOne(@PathVariable Long id) throws NotFoundException {
	    	//try {
			return getService().get(id);
		
	      //  } catch (Exception e) {
	        	//return null;
			//}
	    }
			

	    @RequestMapping(method=RequestMethod.POST)
	    public T post(@RequestBody T entity){
	        return getService().save(entity);
	    }

	    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	    public HttpStatus put(@PathVariable Long id,@RequestBody T entity) {
	        try {
	            entity.setId(id);
	            getService().save(entity);

	            return HttpStatus.OK;
	        } catch (Exception e) {
	            return HttpStatus.INTERNAL_SERVER_ERROR;
	        }
	    }

	    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	    public HttpStatus delete(@PathVariable Long id) {
	        try {
	            getService().delete(id);

	            return HttpStatus.OK;
	        } catch (Exception e) {
	            return HttpStatus.INTERNAL_SERVER_ERROR;
	        }
	    }

	}
