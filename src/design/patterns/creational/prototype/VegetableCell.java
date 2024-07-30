package design.patterns.creational.prototype;

public class VegetableCell extends Cell{

    public VegetableCell(String type, long size) {
        super(type, size);
        System.out.println("Called Vegetable Cell constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
