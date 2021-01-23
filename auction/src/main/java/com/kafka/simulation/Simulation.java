package com.kafka.simulation;

import java.util.List;

import com.kafka.models.RegisterSeaProductRequest;
import com.kafka.models.SeaProduct;
import com.util.ProductRegistrationUtil;

public class Simulation {

	public List<SeaProduct> registerSeaProducts(RegisterSeaProductRequest registerSeaProductRequest) {
		return ProductRegistrationUtil
				.registerSeaProductsWithBoatAndFishermenName(registerSeaProductRequest.getSeaProducts());
	}
}
