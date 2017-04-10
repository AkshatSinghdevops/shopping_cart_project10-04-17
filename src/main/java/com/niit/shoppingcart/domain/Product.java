package com.niit.shoppingcart.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Product")  //if the class name and table name is different
@Component
public class Product {
	
	
	public Product()
	{
		
		
	}
	
	
	
	@Id
	private String id;
	@Column(name="name")  //if the field name and property name is different
	private String name;
	
	private String   price;
	
	private String  description;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="supplier_id",insertable=false,nullable=false,updatable=false )
	private Supplier supplier;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="category_id",insertable=false,nullable=false,updatable=false )
	private Category category;
	
	private String  category_id;
	
	private String  supplier_id;
	
	@Transient
	private MultipartFile image;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="supplier_id",insertable=false,nullable=false,updatable=false )
	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="category_id",insertable=false,nullable=false,updatable=false )
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	

	
	
	
	
}
