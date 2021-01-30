package com.kafka.models;

public class Fisherman {

	private Integer fisherman_id;
	private String fisherman_name;
	private String fisherman_surname;

	public Fisherman() {
		super();
	}

	public Fisherman(Integer fisherman_id, String fisherman_name, String fisherman_surname) {
		super();
		this.fisherman_id = fisherman_id;
		this.fisherman_name = fisherman_name;
		this.fisherman_surname = fisherman_surname;
	}

	@Override
	public String toString() {
		return "Fisherman [fisherman_id=" + fisherman_id + ", fisherman_name=" + fisherman_name + ", fisherman_surname="
				+ fisherman_surname + "]";
	}

	public Integer getFisherman_id() {
		return fisherman_id;
	}

	public void setFisherman_id(Integer fisherman_id) {
		this.fisherman_id = fisherman_id;
	}

	public String getFisherman_name() {
		return fisherman_name;
	}

	public void setFisherman_name(String fisherman_name) {
		this.fisherman_name = fisherman_name;
	}

	public String getFisherman_surname() {
		return fisherman_surname;
	}

	public void setFisherman_surname(String fisherman_surname) {
		this.fisherman_surname = fisherman_surname;
	}

}
