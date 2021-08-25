package org.itbl.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.itbl.entity.Weather;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MainController {
	
	@GetMapping("/api/v1/weather")
	public ResponseEntity<?> getCity(@RequestParam String city) throws JsonMappingException, JsonProcessingException {
		
		System.out.println(city);
		
		final String uri = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=e035ca5c00b6f72b3e2447c49dd92c57";
		
		RestTemplate restTemplate = new RestTemplate();
		
		
		
		
		String result =  restTemplate.getForObject(uri, String.class);
		System.out.println(result);
		
//		ObjectMapper mapper = new ObjectMapper();
//		JsonNode jsonNode = mapper.readTree(result);
//		System.out.println(jsonNode);
		
		Weather weather =  restTemplate.getForObject(uri, Weather.class);
		System.out.println(weather);
		
		Map<String, Object> we = new HashMap();
		Map<String, Object> us = new HashMap();
		
		
		
		Map<String, Map<String, Object> > our = new HashMap();
		
		we.put("weather", weather.getMain());
		we.put("sys", weather.getSys());
		
		
		
		
		our.put(weather.getName(), we);
		
		return ResponseEntity.ok(our);
		
		
	}

}
