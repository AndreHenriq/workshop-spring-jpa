package com.nelio.workshopspringjpa.repositories;

import com.nelio.workshopspringjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
