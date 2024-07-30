package design.patterns.creational.prototype;

public class Cell implements Cloneable {

    private String type;
    private long size;

    public Cell(String type, long size){
        this.type = type;
        this.size = size;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", hash=" + this.hashCode() +
                '}';
    }
}
