package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entityclasses.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long>{

}
