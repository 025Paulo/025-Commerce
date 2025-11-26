package com.paulo.jgcommerce.repositories;

import com.paulo.jgcommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
