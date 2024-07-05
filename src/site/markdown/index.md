# Dokumentasi Proyek Capstone Pemrograman Berbasis Objek
Dokumentasi ini menggunakan konvensi dokumentasi *maven* (atau *site*).

Dokumentasi ini juga menggunakan plugin maven pihak pertama `maven-javadoc-plugin`, untuk menggenerasikan dokumentasi dari komentar dalam source kode.

## Biodata Mahasiswa
- **Nama**: Lie, Steven Staria Nugraha
- **NIM**: A11.2022.14433
- **Kelompok Kelas**: A11.4112

## Konfigurasi Database
Proyek ini menggunakan database mariadb dengan:
- Nama `pbo`
- Tabel-tabel sesuai instruksi
- User `root`
- Password kosong

Berikut merupakan langkah-langkah konfigurasi database:
1. Buatlah database mariadb bernama `pbo`.
2. Unduh script sql berikut: [db.sql](db.sql).
3. (Opsional) cek isi `db.sql`.
4. Jalankan perintah `mariadb < db.sql` pada terminal.

## Konfigurasi Pengguna
Dua user yang dapat digunakan pada **frame login**:

| username | role | password |
| --- | --- | --- |
| steven | admin | 123 |
| stnDinus | user | 123 |

## Dokumentasi Lebih Lanjut
Dokumentasi rinci interaktif (auto-generated menggunakan *javadoc*) dapat diakses melalui:
- [Link ini](apidocs/index.html).
- Atau pada sidebar kiri `Project Documentation` > `Project Reports` > `Javadoc`
