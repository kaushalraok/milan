package com.milan.billingsoftware.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.milan.billingsoftware.entity.Product;
import com.milan.billingsoftware.service.ProductService;

/**
 * The Class ProductController.
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductController {

	/** The product service. */
	@Autowired
	private ProductService productService;

	/**
	 * List product.
	 *
	 * @return the response entity
	 */
	@RequestMapping("")
	public ResponseEntity<Object> listProduct() {
		Iterable<Product> productList = productService.findAll();
		return ResponseEntity.ok(productList);

	}

	/**
	 * Save.
	 *
	 * @param product the product
	 * @return the response entity
	 */
	@RequestMapping(method = RequestMethod.POST, value = "")
	public ResponseEntity<String> save(@RequestBody Product product) {
		productService.insert(product);
		return new ResponseEntity<String>("product inserted sucsessfully !", HttpStatus.OK);

	}

	/**
	 * Update.
	 *
	 * @param product the product
	 * @return the response entity
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public int update(@RequestBody Product product) {
		productService.updateProduct(product);
		return 1;

	}

	/**
	 * Delete.
	 *
	 * @param product the product
	 * @return the response entity
	 */
	@RequestMapping(method = RequestMethod.POST,value="/delete")
	public int delete(@RequestBody Product product) {
		System.out.println("inside delete product");
		productService.deleteProduct(product);
		return 1;

	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@RequestMapping("/{id}")
	public ResponseEntity<Optional<Product>> findById(@PathVariable int id) {
		Optional<Product> product = productService.findById(id);
		return ResponseEntity.ok(product);

	}

}
