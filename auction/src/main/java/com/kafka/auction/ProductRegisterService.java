package com.kafka.auction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.models.RegisterSeaProductRequest;
import com.kafka.models.SeaProduct;
import com.kafka.simulation.Simulation;

@RestController
public class ProductRegisterService {

	@Autowired
	private KafkaTemplate<String, List<SeaProduct>> kafkaTemplate;

	private static final String TOPIC = "TestTopic";

	@PostMapping("/register")
	public String post(@RequestBody RegisterSeaProductRequest registerSeaProductRequest) {
		Simulation simulation = new Simulation();
		List<SeaProduct> registeredSeaProducts = simulation.registerSeaProducts(registerSeaProductRequest);
		kafkaTemplate.send(TOPIC, registeredSeaProducts);
		return "Published successfully";
	}

}