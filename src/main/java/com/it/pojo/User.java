package com.it.pojo;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@lombok.Data
@Table(name = "tb_user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String username;
	private String password;
	private String phone;
	private Data created;
	
}
