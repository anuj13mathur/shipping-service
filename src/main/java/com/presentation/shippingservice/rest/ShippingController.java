package com.presentation.shippingservice.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(value = "/shipping")
public class ShippingController {

    @PostMapping(value = "/orders")
    public ResponseEntity<String> createShippingOrder() throws URISyntaxException {
        return ResponseEntity
                .created(new URI("http://localhost:8085/orders/123"))
                .build();
    }
}
