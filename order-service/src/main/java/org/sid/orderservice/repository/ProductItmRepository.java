package org.sid.orderservice.repository;

import org.sid.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductItmRepository extends JpaRepository<ProductItem,Long> {
}
