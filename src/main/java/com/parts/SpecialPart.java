package com.parts;

/**
 * Особый класс SpecialPart с уникальной характеристикой.
 */
public class SpecialPart extends Part {

    public SpecialPart(int id, String shape, String material, double weight, double size) {
        super(id, shape, material, weight, size);
    }

    /**
     * Уникальная характеристика детали.
     */
    public String uniqueFeature() {
        return "This is a special part with unique properties.";
    }

    @Override
    public String toString() {
        return String.format("%s, Feature: %s", super.toString(), uniqueFeature());
    }
}
