package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/list-users")
    public List<String> listUsers() {
        return Arrays.asList("Alice", "Bob", "Charlie", "Diana");
    }

    @GetMapping("/list-countries")
    public List<String> listCountries() {
        return Arrays.asList("United States", "Canada", "United Kingdom", "Japan", "India");
    }
}
