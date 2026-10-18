package com.unpri.charactermanager.model;

import com.unpri.charactermanager.model.Character;
import java.util.ArrayList;
import java.util.List;

public class CharacterManager {
    private List<Character> characters = new ArrayList<>();

    public boolean addCharacter(Character character) {
        if (findByName(character.getName()) != null) {
            System.out.println("Gagal: Karakter sudah ada!");
            return false;
        }
        characters.add(character);
        System.out.println("Berhasil menambahkan: " + character.getName());
        return true;
    }

    public Character findByName(String name) {
        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(name)) return c;
        }
        return null;
    }

    public int getTotalCharacters() {
        return characters.size();
    }
}