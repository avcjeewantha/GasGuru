package com.GasGuru.GasGuru.model;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class JwtResponse implements Serializable {
	private static final long serialVersionUID = -8091879091924046844L;
	private String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

}
