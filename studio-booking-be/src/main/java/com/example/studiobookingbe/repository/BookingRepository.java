package com.example.studiobookingbe.repository;

import com.example.studiobookingbe.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Lịch đặt lịch của khách hàng
    List<Booking> findByCustomerId(Long customerId);

    // Lịch đặt mà thợ chụp cần tiếp nhận xử lý
    List<Booking> findByPhotographerId(Long photographerId);
}