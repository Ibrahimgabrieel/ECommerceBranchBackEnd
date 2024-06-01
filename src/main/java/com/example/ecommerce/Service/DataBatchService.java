package com.example.ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataBatchService {
    @Autowired
    private RestTemplate restTemplate;

    //@Scheduled(cron = "0 7 2 * * ?")
    public String  pushDatatoMainServer() {
        String url = "http://localhost:8080/api/chunk"; // URL of Server B

        return restTemplate.getForObject(url, String.class);
    }


}




