package com.Filip92.ecommerce.dao;

import com.Filip92.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface ICountryRepository extends JpaRepository<Country, Integer> {
}
