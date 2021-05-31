package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Response;
import com.example.demo.service.ReactiveService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveController {
	
	@Autowired
	ReactiveService reactiveService;
	
	@GetMapping("/square/{input}")
	public Mono<Response> findSquare(@PathVariable int input){
		return this.reactiveService.findSquare(input);
	}
	
	@GetMapping(value="/multiply/{input}/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Response> findMultipication(@PathVariable int input){
		return this.reactiveService.multiplication(input);
	}

}
