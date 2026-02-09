package com.example.onlinebookstore.repository;

import com.example.onlinebookstore.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, String>{

    OrderDetails findByOrderNumber(String orderNumber);
    List<OrderDetails> findByUsername(String username);
}
