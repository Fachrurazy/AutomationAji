Feature: Registrasi Anggota
  Scenario: Melakukan Registrasi Anggota Kirim via Website
    Given Membuka Browser
    And Masuk kedalam menu Login
    When Masukan Username "1234"
    When Masukan Password "123456"
    Then Navigate ke menu Home Page
    And Masuk kedalam menu Registrasi Anggota
    And Memilih Form
    And Memilih Mitra
    When Masukan Username Anggota "Aji_auto01"
    When Masukan Email Anggota "aji_auto01@gmail.com"
    When Masukan Password Anggota "Qwerty1234"
    When Masukan Verified Password Anggota "Qwerty1234"
    Then Melakukan Kirim
