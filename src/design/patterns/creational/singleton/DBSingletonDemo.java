package design.patterns.creational.singleton;

public class DBSingletonDemo {

    public static void main(String[] args) {
        DBSingleton dbSingleton = DBSingleton.getInstance();

        DBSingleton dbSingleton1 = DBSingleton.getInstance();

        System.out.println("DBSingleton"+dbSingleton.toString());
        System.out.println("DBSingleton1"+dbSingleton1.toString());
    }
}
