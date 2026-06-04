class Person {
    String name;

    void breath() {
        System.out.printf("%s is breathing\n", name);
    }

    void eat() {
        System.out.printf("%s is eating\n", name);
    }
}

class Doctor extends Person {
    public Doctor(String n) {
        this.name = n;
    }

    void treats() {
        System.out.printf("%s gives treatment to patients\n", name);
    }
}

class Engineer extends Person {
    public Engineer(String n) {
        this.name = n;
    }

    void make() {
        System.out.printf("%s makes softwares\n", name);
    }
}

class Teacher extends Person {
    public Teacher(String n) {
        this.name = n;
    }

    void teach() {
        System.out.printf("%s teaches students\n", name);
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Teacher tcr = new Teacher("Taki");
        Doctor dct = new Doctor("Mahmud");
        Engineer eng = new Engineer("Rafi");

        tcr.breath();
        tcr.eat();
        tcr.teach();

        dct.breath();
        dct.eat();
        dct.treats();

        eng.breath();
        eng.eat();
        eng.make();
    }
}