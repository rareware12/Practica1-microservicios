package com.example.mcsvproduct.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RefreshScope
public class CategoryController {

    @Value("${app.testProp}")
    private String testProp;

    @GetMapping("/test-prop")
    public String getTestProp() {
        return this.testProp;
    }
}
