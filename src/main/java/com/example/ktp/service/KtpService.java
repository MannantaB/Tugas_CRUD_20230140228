package com.example.ktp.service;

import com.example.ktp.dto.KtpDto;
import com.example.ktp.entity.KtpEntity;

import java.util.List;

public interface KtpService {
    KtpEntity create(KtpDto dto);
    List<KtpEntity> getAll();
    KtpEntity getById(Integer id);
    KtpEntity update(Integer id, KtpDto dto);
    void delete(Integer id);
}
