package com.seast.demo.controller;

import com.seast.demo.domain.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

//@RestController("/api/v2")
public class UserController {

    /*@GetMapping("/user")
    public Mono<ServerResponse> handleGetUsers() {
        return WebClient.create("http://localhost:8080").get().uri("/api/user")
                .accept(MediaType.APPLICATION_JSON).exchange().flatMap(
                        resp -> ServerResponse.ok().body(resp.bodyToFlux(User.class), User.class));
    }

    @GetMapping("/user/{id}")
    public Mono<ServerResponse> handleGetUserById(@PathVariable String id) {
        return WebClient.create("http://localhost:8080").get().uri("/api/user/" + id)
                .accept(MediaType.APPLICATION_JSON).exchange().flatMap(
                        resp -> ServerResponse.ok().body(resp.bodyToMono(User.class), User.class));
    }*/
}
