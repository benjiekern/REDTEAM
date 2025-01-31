package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entityclasses.OrderDetails;

@Repository
public interface OrderDetailsRepository extends JpaRepository <OrderDetails, String>{

}
