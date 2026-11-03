package com.example.studiobookingbe.repository;

import com.example.studiobookingbe.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    // Lấy danh sách ảnh portfolio của một thợ cụ thể
    List<Portfolio> findByPhotographerId(Long photographerId);
}