package design.patterns.creational.prototype;

public class Laboratory {

    static public void main(String args[]){

        System.out.println("Base case");
        baseCase();

        System.out.println("Many copies case");


    }

    public static void baseCase(){
        AnimalCell animalCell1 = generateNewAnimalCell("Gato", 100l);
        VegetableCell vegetateCell1 = generateNewVegetableCell("Citronella", 300l);
        System.out.println(animalCell1);
        System.out.println(vegetateCell1);
        try {
            AnimalCell animalCell2 = cloneAnimalCell(animalCell1);
            animalCell2.setType("Perro");
            animalCell2.setSize(43l);
            VegetableCell vegetableCell2 = cloneVegetableCell(vegetateCell1);
            vegetableCell2.setType("Mandarina");
            vegetableCell2.setSize(25l);
            System.out.println(animalCell2);
            System.out.println(vegetableCell2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }




    public static AnimalCell generateNewAnimalCell(String type, Long size){
        return new AnimalCell(type, size);
    }

    public static VegetableCell generateNewVegetableCell(String type, Long size){
        return new VegetableCell(type, size);
    }

    public static AnimalCell cloneAnimalCell(AnimalCell animalCell) throws CloneNotSupportedException {
            return (AnimalCell) animalCell.clone();
    }

    public static VegetableCell cloneVegetableCell(VegetableCell vegetableCell)throws CloneNotSupportedException{
        return (VegetableCell) vegetableCell.clone();
    }


}
