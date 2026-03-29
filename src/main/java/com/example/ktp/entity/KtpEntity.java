package com.example.ktp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "ktp")
@Data
public class KtpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nomor_ktp", unique = true, nullable = false)
    private String nomorKtp;

    @Column(name = "nama_lengkap")
    private String namaLengkap;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "tanggal_lahir")
    private LocalDate tanggalLahir;

    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
}