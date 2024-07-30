package design.patterns.creational.prototype;

public class AnimalCell extends Cell{

    public AnimalCell(String type, long size) {
        super(type, size);
        System.out.println("Called Animal Cell constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
