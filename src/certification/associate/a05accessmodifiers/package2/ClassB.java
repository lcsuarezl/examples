package certification.associate.a05accessmodifiers.package2;

import certification.associate.a05accessmodifiers.package1.ClassC;

public class ClassB extends ClassC {

    public void print(){
        super.message = " World";
        super.print();
    }

}
