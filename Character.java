package com.unpri.charactermanager.model;

public class Character {
    private String name;
    private Charactertype type;
    private int level;
    private int healthPoints;
    private int mana; // Poin 1: Atribut private baru mana (tipe int)

    // Constructor 1: Default level = 1, healthPoints = 100, mana = 50 (Contoh default)
    public Character(String name, Charactertype type) {
        this.name = name;
        this.type = type;
        this.level = 1;
        this.healthPoints = 100;
        this.mana = 50;
    }

    // Constructor 2: Menerima semua parameter termasuk mana
    public Character(String name, Charactertype type, int level, int healthPoints, int mana) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.healthPoints = healthPoints;
        setMana(mana); // Menggunakan setter agar tervalidasi
    }

    // Getter dan Setter untuk atribut lainnya...
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Charactertype getType() { return type; }
    public void setType(Charactertype type) { this.type = type; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getHealthPoints() { return healthPoints; }
    public void setHealthPoints(int healthPoints) { this.healthPoints = healthPoints; }

    // Poin 2: Getter getMana() dan setter setMana(int mana) dengan validasi
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh bernilai negatif!");
        }
        this.mana = mana;
    }

    // Poin 3: Method baru isAlive() -> true jika hitPoints > 0
    public boolean isAlive() {
        return this.healthPoints > 0;
    }

    public void levelUp() {
        this.level++;
        this.healthPoints += 20;
        this.mana += 10;
        System.out.println(name + " berhasil naik ke Level " + level + "!");
    }

    // Poin 4: toString() diperbarui untuk menampilkan mana
    @Override
    public String toString() {
        return "Character [Nama: " + name + ", Tipe: " + type + ", Level: " + level + 
               ", HP: " + healthPoints + ", Mana: " + mana + "]";
    }
}