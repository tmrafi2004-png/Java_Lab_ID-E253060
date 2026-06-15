class Student {
    private String name;
    private String id;
    private double cgpa;

    public void setName(String n) {
        name = n;
    }

    public void setId(String i) {
        id = i;
    }

    public void setCgpa(double c) {
        cgpa = c;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class IdCard {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Taki Mahmud Rafi");
        s1.setId("E253060");
        s1.setCgpa(0.00);

        System.out.println("Student Info:");
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("CGPA: " + s1.getCgpa());
    }
}