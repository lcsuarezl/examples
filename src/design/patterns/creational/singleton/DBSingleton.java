package design.patterns.creational.singleton;

public class DBSingleton {

    private static volatile DBSingleton instance = null;

    private DBSingleton(){
        if(instance != null){
            throw new RuntimeException("use getInstance() to create");
        }

    }

    public static DBSingleton getInstance(){
        if(instance == null){
            synchronized (DBSingleton.class) {
                if(instance == null){
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
    }
}
