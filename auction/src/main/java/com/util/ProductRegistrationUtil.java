package com.util;

import java.util.ArrayList;
import java.util.List;

import com.kafka.models.Fisherman;
import com.kafka.models.SeaProduct;

public class ProductRegistrationUtil {

	public static List<SeaProduct> registerSeaProductsWithBoatAndFishermenName(List<SeaProduct> seaProductList) {
		List<SeaProduct> registeredSeaProducts = new ArrayList<>();
		if (seaProductList != null) {
			registeredSeaProducts.addAll(seaProductList);
		}
		registeredSeaProducts
				.add(new SeaProduct(1, "name", "5kg", new Fisherman(1, "fisherman name", "fisherman surname"), 5));
		return registeredSeaProducts;
	}

}
