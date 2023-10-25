package com.love2shop.springbootshop.entity;

import lombok.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "book")
@Data
@Builder
public class Book {
	
	
	public Book(Long id,String title,String author,String description,int copies,int copiesAvailable,String category,String img) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.title=title;
		this.author=author;
		this.description=description;
		this.copies=copies;
		this.copiesAvailable=copiesAvailable;
		this.category=category;
		this.img=img;
	} 
	public Book() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
     private Long id;
	@Column(name="title")
     private String title;
	@Column(name="author")
     private String author;
	@Column(name="description")
     private String description;
	@Column(name="copies")
     private int copies;
	@Column(name="copiesAvailable")
     private int copiesAvailable;
	@Column(name="category")
     private String category;
	@Column(name="img")
     private String img;
	
}
