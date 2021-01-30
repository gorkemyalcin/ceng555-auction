package com.kafka.models;

public class SeaProduct {
	private Integer fish_id;
	private String fish_type;
	private String quantity;
	private Fisherman fisherman;
	private Integer price;

	public SeaProduct() {
		super();
	}

	public SeaProduct(Integer fish_id, String fish_type, String quantity, Fisherman fisherman, Integer price) {
		super();
		this.fish_id = fish_id;
		this.fish_type = fish_type;
		this.quantity = quantity;
		this.fisherman = fisherman;
		this.price = price;
	}


	@Override
	public String toString() {
		return "SeaProduct [fish_id=" + fish_id + ", fish_type=" + fish_type + ", quantity=" + quantity + ", fisherman="
				+ fisherman + ", price=" + price + "]";
	}

	public Integer getFish_id() {
		return fish_id;
	}

	public void setFish_id(Integer fish_id) {
		this.fish_id = fish_id;
	}

	public String getFish_type() {
		return fish_type;
	}

	public void setFish_type(String fish_type) {
		this.fish_type = fish_type;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Fisherman getFisherman() {
		return fisherman;
	}

	public void setFisherman(Fisherman fisherman) {
		this.fisherman = fisherman;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
