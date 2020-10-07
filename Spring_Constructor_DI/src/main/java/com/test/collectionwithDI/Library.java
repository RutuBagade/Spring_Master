package com.test.collectionwithDI;

import java.util.Iterator;
import java.util.List;

public class Library 
{
 private int id;
 private String name;
// private List<String> books;
 
 private List<Book> books;
 
public Library(int id, String name, List<Book> books) {
	this.id = id;
	this.name = name;
	this.books = books;
}
public String toString() {
    return "Books Dtails " + books + "Id is: " + id + " Library Name: "
            + name;
}
public void display()
{ System.out.println("person ID :"+ id);
System.out.println("Books Taken BY :"+name);
System.out.println("Books Issued Details : ");
Iterator<Book> it=books.iterator();
while(it.hasNext())
{
	System.out.println(it.next());}
	
	}
}
