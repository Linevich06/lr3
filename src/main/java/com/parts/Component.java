package com.parts;

/**
 * Базовый абстрактный класс Component.
 */
public abstract class Component {
    private String shape;
    private String material;
    private double weight;
    private double size;

    /**
     * Конструктор для Component.
     * 
     * @param shape    форма детали.
     * @param material материал детали.
     * @param weight   вес детали.
     * @param size     размер детали.
     */
    public Component(String shape, String material, double weight, double size) {
        this.shape = shape;
        this.material = material;
        this.weight = weight;
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("Shape: %s, Material: %s, Weight: %.2f, Size: %.2f",
                shape, material, weight, size);
    }
}
