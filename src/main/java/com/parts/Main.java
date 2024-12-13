package com.parts;

import java.util.ArrayList;
import java.util.List;

/**
 * Основной класс для запуска приложения.
 */
public class Main {

    public static void main(String[] args) {
        List<Component> components = new ArrayList<>();

        components.add(new Part(1, "Circle", "Steel", 5.0, 12.5));
        components.add(new Part(2, "Square", "Plastic", 2.0, 10.0));
        components.add(new Part(3, "Triangle", "Aluminum", 3.5, 15.0));
        components.add(new SpecialPart(4, "Hexagon", "Copper", 4.5, 8.0));
        components.add(new Part(5, "Circle", "Wood", 1.0, 5.0));
        components.add(new SpecialPart(6, "Star", "Gold", 7.5, 20.0));
        components.add(new Part(7, "Circle", "Steel", 6.5, 11.0));
        components.add(new SpecialPart(8, "Circle", "Brass", 3.2, 14.0));
        components.add(new Part(9, "Square", "Plastic", 4.0, 18.0));
        components.add(new Part(10, "Triangle", "Iron", 8.0, 25.0));

        // 1. Подсчет общего веса деталей одинаковой формы
        String targetShape = "Circle";
        double totalWeight = components.stream()
                .filter(c -> c.getShape().equalsIgnoreCase(targetShape))
                .mapToDouble(Component::getWeight)
                .sum();
        System.out.printf("Total weight of %s-shaped parts: %.2f%n", targetShape, totalWeight);

        // 2. Вывод количества деталей
        System.out.printf("Total number of parts: %d%n", components.size());

        // 3. Вывод деталей с уникальной формой
        components.stream()
                .filter(c -> c instanceof SpecialPart)
                .forEach(c -> System.out.println("Unique part: " + c));
    }
}
