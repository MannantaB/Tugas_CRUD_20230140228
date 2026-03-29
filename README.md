# Tugas: Sistem Manajemen Data KTP (CRUD)

**NIM:** 20230140228

**Framework:** Spring Boot & MySQL

**Frontend:** HTML, CSS, JavaScript (jQuery Ajax)

---

## 1. Deskripsi Proyek

Proyek ini merupakan aplikasi full-stack sederhana untuk mengelola data KTP. Aplikasi ini memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) seperti menambah, melihat, memperbarui, dan menghapus data KTP tanpa perlu refresh halaman menggunakan teknologi Ajax.

---

## 2. Struktur Package (Backend)

Proyek ini menggunakan struktur package yang terorganisir dengan baik:

* **controller** : Menangani request REST API
* **entity** : Representasi tabel database MySQL
* **dto** : Objek transfer data antara client dan server
* **repository** : Interface akses database menggunakan Spring Data JPA
* **service** : Interface logika bisnis
* **service.impl** : Implementasi dari service
* **mapper** : Konversi antara DTO dan Entity
* **util** : Helper atau validasi tambahan

---

## 3. Dokumentasi REST API (Endpoint)

### A. POST - Tambah Data KTP

**Endpoint:** `/ktp`
**Method:** POST

**Request Body:**

```json
{
  "nomorKtp": "1234567890",
  "namaLengkap": "Alfan",
  "alamat": "Yogyakarta",
  "tanggalLahir": "2000-01-01",
  "jenisKelamin": "Laki-laki"
}
```
<img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/4ae4fa45-a7bf-4ef9-ab38-ce634420f977" />


---

### B. GET - Ambil Semua Data

**Endpoint:** `/ktp`
**Method:** GET

<img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/b6e5a0a4-7029-4567-acc5-549327856f80" />

---

### C. GET - Ambil Data Berdasarkan ID

**Endpoint:** `/ktp/2`
**Method:** GET

<img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/56fd6e9c-ee91-49f1-91c7-5e017fb5817f" />


---

### D. PUT - Perbarui Data KTP

**Endpoint:** `/ktp/1`
**Method:** PUT

<img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/aa022a44-4ac5-4681-9f48-e39650c04de4" />


---

### E. DELETE - Hapus Data

**Endpoint:** `/ktp/1`
**Method:** DELETE

<img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/8aa26659-bf12-4b04-b875-08543791f19c" />


---

## 4. Tampilan Client-side (Frontend)

Fitur frontend:

* Form input data KTP

  <img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/c60690c0-5924-434d-9baa-aa0874ae28ec" />

* Fitur tambah data (Create)

  <img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/dcead87e-8961-48c9-83e4-c51866b95b0d" />

* Fitur Update

  <img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/529c5380-effa-4b9b-b426-5680fe8812a8" />

* Fitur Delete

    <img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/e3e253dd-30ff-4251-a49d-112932f4e550" />

* Kondisi Akhir

  <img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/810bbe87-0348-4a37-8015-951ae50b31cf" />




---

## 5. Konfigurasi Database

```sql
CREATE DATABASE spring;

CREATE TABLE ktp (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomor_ktp VARCHAR(50) UNIQUE,
    nama_lengkap VARCHAR(100),
    alamat VARCHAR(255),
    tanggal_lahir DATE,
    jenis_kelamin VARCHAR(20)
);
```
<img width="2880" height="1704" alt="image" src="https://github.com/user-attachments/assets/19d554ac-4f30-4445-a806-df3dc6a58b09" />

