package com.example.studiobookingbe.repository;

import com.example.studiobookingbe.model.Photographer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PhotographerRepository extends JpaRepository<Photographer, Long> {
    // Tìm kiếm thợ theo khu vực/địa điểm hoạt động (đúng yêu cầu cốt lõi của đề tài)
    List<Photographer> findByLocationContainingIgnoreCase(String location);
}