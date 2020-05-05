package com.milan.billingsoftware.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.milan.billingsoftware.entity.Product;

/**
 * The Interface ProductRepository.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
