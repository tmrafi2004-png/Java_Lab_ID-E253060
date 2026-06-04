class GrandFather {
    String name = "Mokter Ahmed";

    void company() {
        System.out.println(name + " Owns a company");
    }
}

class Father extends GrandFather {
    public Father() {
        this.name = "Abul Kashem";
    }

    void car() {
        System.out.println(name + " Owns a car");
    }
}

class Son  extends Father {
    public Son(String n ) {
        this.name = n;
    }

    void doesNothing() {
        System.out.println("Eat sleep Drive Car, Repeat");
    }
}

public class FamilyDetails {
    public static void main(String[] args) {
        Son son = new Son("Taki Mahmud Rafi");

        son.company();
        son.car();
        son.doesNothing();
    }
}