package com.parts;

/**
 * Производный класс Part.
 */
public class Part extends Component {
    private int id;

    public Part(int id, String shape, String material, double weight, double size) {
        super(shape, material, weight, size);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Part ID: %d, %s", id, super.toString());
    }
}
