package com.example.studiobookingbe.repository;

import com.example.studiobookingbe.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    // Lấy danh sách dịch vụ của một thợ chụp cụ thể
    List<Service> findByPhotographerId(Long photographerId);
}