# Sistem Peminjaman Alat Laboratorium (BPMN & Spring Boot)

Repositori ini berisi tugas pemrograman J2EE/Spring Boot yang terintegrasi dengan Camunda BPM untuk mensimulasikan otomatisasi alur bisnis peminjaman alat laboratorium.

## 1. Teori Dasar (5W)
* **What:** Integrasi aplikasi Spring Boot dengan *engine* Camunda BPMN.
* **Why:** Memisahkan logika bisnis (BPMN) dari kode *hardcode*, sehingga alur mudah dimonitor dan diubah.
* **Who:** Sistem otomatis (Service Task) dan Manusia/Kepala Lab (User Task).
* **When:** Dieksekusi setiap kali ada *request* pengajuan alat masuk melalui REST API.
* **Where:** Berjalan pada *embedded server* Tomcat (localhost:8080).

## 2. Spesifikasi Teknologi
* **Bahasa:** Java 
* **Framework:** Spring Boot 3.1.5
* **BPMN Engine:** Camunda Platform 7.20.0
* **Database:** H2 In-Memory Database

## 3. Alur Proses (Use Case)
Sistem menerima pengajuan peminjaman alat. *Service Task* akan mengecek ketersediaan stok secara otomatis (simulasi probabilitas). 
* Jika **Stok Habis**, pengajuan langsung ditolak secara sistem (*End Event*).
* Jika **Stok Tersedia**, proses diteruskan ke *User Task* di mana Kepala Lab harus memberikan persetujuan melalui Camunda Tasklist.

## 4. Cara Menjalankan Aplikasi
1. Jalankan *class* utama `UtsrpllApplication.java`.
2. Buka *browser* dan akses *endpoint*: `http://localhost:8080/pinjam/{nama-alat}` (contoh: `/pinjam/Proyektor`).
3. Periksa log konsol pada IDE untuk melihat hasil eksekusi *Service Task* (pengecekan stok).
4. Jika stok tersedia, buka *dashboard* Camunda di `http://localhost:8080/camunda/app/tasklist/` lalu login untuk mengecek tugas *Persetujuan Kepala Lab* yang baru masuk.
