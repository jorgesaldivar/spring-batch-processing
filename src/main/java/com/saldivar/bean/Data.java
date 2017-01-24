package com.saldivar.bean;

public class Data {

	private String name;
	private int id;

	public Data() {
		// Empty constructor Data object needs to be constructed without
		// constructor
	}

	public Data(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", id=" + id + "]";
	}

}
