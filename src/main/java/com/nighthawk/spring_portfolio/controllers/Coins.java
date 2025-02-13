package com.nighthawk.spring_portfolio.controllers;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Coins {
    private JSONObject body; //last run result
    private HttpStatus status; //last run status
    String last_run = null; //last run day of month

    @GetMapping("/coins")
    public ResponseEntity<JSONObject> getCoins() {

        //calls API once a day, sets body and status properties
        String today = new Date().toString().substring(0,10); 
        if (last_run == null || !today.equals(last_run))
        {
            try {  //APIs can fail (ie Internet or Service down)
                
                //RapidAPI header
                /* 
                HttpRequest request = HttpRequest.newBuilder()
		        .uri(URI.create("https://coinranking1.p.rapidapi.com/coins?referenceCurrencyUuid=yhjMzLPhuIDl&timePeriod=24h&tiers%5B0%5D=1&orderBy=marketCap&orderDirection=desc&limit=50&offset=0"))
		        .header("X-RapidAPI-Key", "3bef89a477msh7eecb5e7498cd51p1095f2jsn9b36f511d7ec")
		        .header("X-RapidAPI-Host", "coinranking1.p.rapidapi.com")
		        .method("GET", HttpRequest.BodyPublishers.noBody())
		        .build();
                
                
                HttpRequest request = HttpRequest.newBuilder()
		        .uri(URI.create("https://wft-geo-db.p.rapidapi.com/v1/geo/cities"))
		        .header("X-RapidAPI-Key", "3bef89a477msh7eecb5e7498cd51p1095f2jsn9b36f511d7ec")
		        .header("X-RapidAPI-Host", "wft-geo-db.p.rapidapi.com")
		        .method("GET", HttpRequest.BodyPublishers.noBody())
		        .build();
                */

                ///AirBnb get languages
                HttpRequest request = HttpRequest.newBuilder()
		        .uri(URI.create("https://airbnb19.p.rapidapi.com/api/v1/getLanguages"))
		        .header("X-RapidAPI-Key", "3bef89a477msh7eecb5e7498cd51p1095f2jsn9b36f511d7ec")
		        .header("X-RapidAPI-Host", "airbnb19.p.rapidapi.com")
		        .method("GET", HttpRequest.BodyPublishers.noBody())
		        .build();
               
                HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
                //System.out.println(response.body());

                //System.out.println(response.body());
                //JSONParser extracts text body and parses to JSONObject
                //this.body = (JSONObject) new JSONParser().parse(response.body());
                JSONParser parser = new JSONParser();  
                this.body = (JSONObject) parser.parse(response.body());   
                this.status = HttpStatus.OK;  //200 success
                this.last_run = today;
                
            }
            catch (Exception e) {  //capture failure info
                HashMap<String, String> status = new HashMap<>();
                status.put("status", "RapidApi failure: " + e);

                //Setup object for error
                this.body = new JSONObject(status);
                this.status = HttpStatus.INTERNAL_SERVER_ERROR; //500 error
                this.last_run = null;
            }
        }

        //return JSONObject in RESTful style
        return new ResponseEntity<>(body, status);
    }
}

