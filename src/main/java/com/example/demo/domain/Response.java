package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Response implements Serializable{

	private static final long serialVersionUID = 1L;

	@JsonProperty("Date")
	private Date date;
	
	@JsonProperty("Output")
	private int output;
	
	public Response(int output) {
		this.output=output;
	}

}
