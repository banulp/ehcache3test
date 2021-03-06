package com.banulp.toy.ehcache3test;

public class Flower {

	private String isbn;
	private String title;

	public Flower(String isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Flower{" + "isbn='" + isbn + '\'' + ", title='" + title + '\'' + '}';
	}

}
