package com.mendes.project_spring.repositories;

import com.mendes.project_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long>{
}
