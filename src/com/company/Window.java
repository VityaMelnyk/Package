package com.company;

public class Window extends Rectangle {
    private int fating;
    private String material;
    private int layers;
    private int glassFat;
    private String locked;

    public Window() {
    }

    public Window(int fating, String material, int layers, int glassFat, String locked) {
        this.fating = fating;
        this.material = material;
        this.layers = layers;
        this.glassFat = glassFat;
        this.locked = locked;
    }

    public Window(int length, int width, int fating, String material, int layers, int glassFat, String locked) {
        super(length, width);
        this.fating = fating;
        this.material = material;
        this.layers = layers;
        this.glassFat = glassFat;
        this.locked = locked;
    }

    public int getFating() {
        return fating;
    }

    public void setFating(int fating) {
        this.fating = fating;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public int getGlassFat() {
        return glassFat;
    }

    public void setGlassFat(int glassFat) {
        this.glassFat = glassFat;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "Window{" +
                "length="  + super.getLength() +
                ", width='" + super.getWidth() + '\'' +
                ", fating=" + this.getFating() +
                ", material=" + this.getMaterial() +
                ", locked='" + this.getLocked() + '\'' +
                '}';
    }
}
