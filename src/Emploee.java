public class Emploee {
    String name;
    String position;
    String email;
    String phone;
    double salary;
    int age;

    public Emploee(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmploee(){
        System.out.println("name: " + name);
        System.out.println("position: " + position);
        System.out.println("e-mail: " + email);
        System.out.println("phone: " + phone);
        System.out.println("sailary: " + salary);
        System.out.println("age: " + age);
    }
}
