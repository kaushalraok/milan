package com.milan.billingsoftware.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;

	private String productName;
	
	private String productDescription;

	private int numberOfPiecePerCase;
	
	private double productPrice;
	
	private double pricePerPiece;
	
	private double productMRP;

	@CreationTimestamp
	private LocalDateTime createDateTime;

	private String createdUser;

	@UpdateTimestamp
	private LocalDateTime updateDateTime;

	private String lastModifiedUser;

	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductDescription() {
		return productDescription;
	}



	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}



	public int getNumberOfPiecePerCase() {
		return numberOfPiecePerCase;
	}



	public void setNumberOfPiecePerCase(int numberOfPiecePerCase) {
		this.numberOfPiecePerCase = numberOfPiecePerCase;
	}



	public double getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}



	public double getPricePerPiece() {
		return pricePerPiece;
	}



	public void setPricePerPiece(double pricePerPiece) {
		this.pricePerPiece = pricePerPiece;
	}



	public double getProductMRP() {
		return productMRP;
	}



	public void setProductMRP(double productMRP) {
		this.productMRP = productMRP;
	}



	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}



	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}



	public String getCreatedUser() {
		return createdUser;
	}



	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}



	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}



	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}



	public String getLastModifiedUser() {
		return lastModifiedUser;
	}



	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}



	public Product(int productId, String productName, String productDescription, int numberOfPiecePerCase,
			double productPrice, double pricePerPiece, double productMRP, LocalDateTime createDateTime,
			String createdUser, LocalDateTime updateDateTime, String lastModifiedUser) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.numberOfPiecePerCase = numberOfPiecePerCase;
		this.productPrice = productPrice;
		this.pricePerPiece = pricePerPiece;
		this.productMRP = productMRP;
		this.createDateTime = createDateTime;
		this.createdUser = createdUser;
		this.updateDateTime = updateDateTime;
		this.lastModifiedUser = lastModifiedUser;
	}



	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
