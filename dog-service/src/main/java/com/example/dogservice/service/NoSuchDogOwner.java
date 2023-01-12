package com.example.dogservice.service;

/**
 * Exception thrown when a dog owner cannot be found.
 */
public class NoSuchDogOwner extends RuntimeException {

	private final String name;

	NoSuchDogOwner(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
