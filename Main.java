package com.unpri.charactermanager.model;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EKSTENSI FITUR MANDIRI (BAGIAN B) ===");
        
        // Poin 5: Buat 1 karakter baru
        Character hero = new Character("Valir", Charactertype.MAGE, 2, 120, 80);

        // Menampilkan informasi awal karakter (termasuk mana)
        System.out.println(hero);

        // Poin 5: Panggil isAlive(), cetak hasilnya ke console
        boolean statusHidup = hero.isAlive();
        System.out.println("Apakah " + hero.getName() + " masih hidup? " + statusHidup);

        // Pengujian validasi exception setMana (opsional untuk memastikan error handling berfungsi)
        try {
            hero.setMana(-10); // Akan memicu IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi Error tertangkap: " + e.getMessage());
        }
    }
}