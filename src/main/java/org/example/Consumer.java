package org.example;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Consumer {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/weather/add";

        Random random = new Random();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> weatherObject = null;
        for (int i = 0; i < 10; i++) {
            weatherObject = new HashMap<>();
            weatherObject.put("temperature", random.nextInt(200) - 99);
            weatherObject.put("rain", random.nextInt(2) == 1);
            weatherObject.put("sensor", Map.of("name", "summerSensor"));
            restTemplate.postForObject(url, new HttpEntity<>(weatherObject, headers), String.class);
        }


    }
}
