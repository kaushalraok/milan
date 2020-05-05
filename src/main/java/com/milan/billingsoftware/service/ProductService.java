package com.milan.billingsoftware.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milan.billingsoftware.entity.Product;
import com.milan.billingsoftware.repository.ProductRepository;

/**
 * The Class ProductService.
 */
@Service
@Transactional
public class ProductService {

	/** The product repository. */
	@Autowired
	private ProductRepository productRepository;

	/**
	 * Insert.
	 *
	 * @param product the product
	 */
	public void insert(Product product) {
		product.setPricePerPiece(product.getProductPrice() / product.getNumberOfPiecePerCase());
		productRepository.save(product);
	}

	/**
	 * Find all.
	 *
	 * @return the iterable
	 */
	public Iterable<Product> findAll() {
		Iterable<Product> productList = productRepository.findAll();
		return productList;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the optional
	 */
	public Optional<Product> findById(int id) {
		Optional<Product> product = productRepository.findById(id);
		return product;
	}

	/**
	 * Update product.
	 *
	 * @param product the product
	 */
	public void updateProduct(Product product) {
		product.setPricePerPiece(product.getProductPrice() / product.getNumberOfPiecePerCase());
		productRepository.save(product);
	}

	/**
	 * Delete product.
	 *
	 * @param product the product
	 */
	public void deleteProduct(Product product) {
		productRepository.delete(product);
	}

}
