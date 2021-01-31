package com.util;

import java.util.ArrayList;
import java.util.List;

import com.kafka.models.SeaProduct;

public class ProductRegistrationUtil {

	public static List<SeaProduct> registerSeaProductsWithBoatAndFishermenName(List<SeaProduct> seaProductList) {
		List<SeaProduct> registeredSeaProducts = new ArrayList<>();
		if (seaProductList != null) {
			registeredSeaProducts.addAll(seaProductList);
		}
		return registeredSeaProducts;
	}

}
