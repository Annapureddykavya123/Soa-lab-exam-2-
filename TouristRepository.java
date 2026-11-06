package com.example.tourist.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tourist.model.Tourist;
public interface TouristRepository extends JpaRepository<Tourist, Long> {}