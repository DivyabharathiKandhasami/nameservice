package com.namemicro.namemicroservice.contro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
@GetMapping
@RequestMapping("/api/name")
public String getname() {   //using spring cloud resilience4j to create a circuit breaker.
return " Hi, 😊 Divya from name api ";
}
}
