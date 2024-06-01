package com.example.ecommerce.Controller;

import com.example.ecommerce.Service.DataBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/batchdata")
public class BatchDataController {

@Autowired
    private DataBatchService scheduledTask;

    @GetMapping()
    public ResponseEntity<String> fetchDataManually() {
   String fatchedData= scheduledTask.pushDatatoMainServer();
        return ResponseEntity.ok(fatchedData);
    }
}
