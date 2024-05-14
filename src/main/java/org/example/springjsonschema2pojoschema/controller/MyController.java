package org.example.springjsonschema2pojoschema.controller;

import org.example.springjsonschema2pojoschema.model.GeneratedModel;
import org.example.springjsonschema2pojoschema.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/data")
    public GeneratedModel getData() {
        return apiService.getData();
    }
}
