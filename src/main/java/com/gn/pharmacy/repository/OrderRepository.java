package com.gn.pharmacy.repository;

import com.gn.pharmacy.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    // === ADD TO OrderRepository.java ===
    Page<OrderEntity> findByUser_UserId(Long userId, Pageable pageable);
}