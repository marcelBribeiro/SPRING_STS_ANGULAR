package com.webServiveApp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

// classe abstrata
@MappedSuperclass
public abstract class AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	 public Long getId() {
	        return this.id;
	    }
	 
	    public void setId(final Long id) {
	        this.id = id;
	    }

	//Usa o id para calcular o hashCode.    
    @Override
    public int hashCode() {
           final int prime = 31;
           int result = 1;
           result = prime * result + ((id == null) ? 0 : id.hashCode());
           return result;
    }

    /**
    - Duas entidades são consideradas iguais se forem da mesma classe e tiverem a mesma ID.
    - Uma entidade que não tem ID (isto é, ainda não é persistente) é apenas igual a si mesma.
     **/
    @Override
    public boolean equals(Object obj) {
    	if (this == obj) {
                 return true;
           }
           if (obj == null) {
                 return false;
           }
           if (!(obj instanceof AbstractEntity)) {
                 return false;
           }
           AbstractEntity other = (AbstractEntity) obj;
           if (id == null) {
                 if (other.id != null) {
                        return false;
                 }
           } else if (!id.equals(other.id)) {
                 return false;
           }
           return true;
    }
}