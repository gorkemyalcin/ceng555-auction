package com.kafka.models;

import java.util.List;

public class RegisterSeaProductRequest {

	private List<SeaProduct> seaProducts;

	public RegisterSeaProductRequest(List<SeaProduct> seaProducts) {
		super();
		this.seaProducts = seaProducts;
	}

	public RegisterSeaProductRequest() {
		super();
	}

	@Override
	public String toString() {
		return "RegisterSeaProductRequest [seaProducts=" + seaProducts + "]";
	}

	public List<SeaProduct> getSeaProducts() {
		return seaProducts;
	}

	public void setSeaProducts(List<SeaProduct> seaProducts) {
		this.seaProducts = seaProducts;
	}

}
