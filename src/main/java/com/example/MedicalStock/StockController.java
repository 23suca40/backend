package com.example.MedicalStock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StockController {

    @GetMapping("/status")
    public String getStatus() {
        return "Medical Stock System is running";
    }
}
