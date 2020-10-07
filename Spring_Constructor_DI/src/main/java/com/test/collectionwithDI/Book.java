package com.test.collectionwithDI;

public class Book {
private int id;
private String bookname;
private String bookAuthor;

public Book(int id, String bookname, String bookAuthor) {
	this.id = id;
	this.bookname = bookname;
	this.bookAuthor = bookAuthor;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return id+" "+bookname+" "+bookAuthor;
}

}
