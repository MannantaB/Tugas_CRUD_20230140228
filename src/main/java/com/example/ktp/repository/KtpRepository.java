package com.example.ktp.repository;

import com.example.ktp.entity.KtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KtpRepository extends JpaRepository<KtpEntity, Integer> {
    boolean existsByNomorKtp(String nomorKtp);
}
