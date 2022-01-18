package certification.associate.a01datasamples;

public class A3_Initialization {

    public Integer a;

    public A3_Initialization(){
        a=3;
        System.out.println("Constructor initialization:"+a);
    }

    {//static block
        a = 2;
        System.out.println("Static block initialization:"+a);
    }

    public static void main(String args[]){
        System.out.println(new A3_Initialization().a);
    }
}
