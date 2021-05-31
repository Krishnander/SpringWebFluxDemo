package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Response;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactiveService {
	
	public Mono<Response> findSquare(int input){
		return Mono.fromSupplier(()->input*input).map(Response::new);
	}
	
	public Flux<Response> multiplication(int input){
		return Flux.range(0, 10).map((var i)->new Response(i*input));
	}

}
