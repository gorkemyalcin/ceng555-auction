package com.kafka.models;

public class SeaProduct {
	private Integer id;
	private String name;
	private String quantity;
	private Fisherman fisherman;
	private Integer price;

	public SeaProduct() {
		super();
	}

	public SeaProduct(Integer id, String name, String quantity, Fisherman fisherman, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.fisherman = fisherman;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SeaProduct [id=" + id + ", name=" + name + ", quantity=" + quantity + ", fisherman="
				+ fisherman + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
