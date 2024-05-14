package org.example.springjsonschema2pojoschema.service;

import org.example.springjsonschema2pojoschema.model.GeneratedModel;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public GeneratedModel getData() {
        // Assume this data might be retrieved through an API call
        GeneratedModel model = new GeneratedModel();
        model.setId(1);
        model.setName("Example Name");
        return model;
    }
}
