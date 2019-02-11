package com.customlistview;

public class Items {

	String title;
	Integer image;

	public Items(String title, Integer image) {

		// Setter
		this.image = image;
		this.title = title;

	}

	// Getter
	public String getTitle() {
		return title;

	}

	public Integer getImage() {
		return image;
	}

}
