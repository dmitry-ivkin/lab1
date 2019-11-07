public class Dog {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Dog(String n, int a, double w, String c) {
        this.name = n;
        this.age = a;
        this.weight = w;
        this.color = c;
    }

    public Dog(String n, int a) {
        this.name = n;
        this.age = 0;
        this.weight = 0.0D;
        this.color = "grey";
    }

    public Dog(String n) {
        this.name = n;
        this.age = 0;
        this.weight = 0.0D;
        this.color = "black";
    }

    public Dog() {
        this.name = "Pup";
        this.age = 0;
        this.weight = 0.0D;
        this.color = "white";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName(String name) {
        return name;
    }

    public String getColor() {
        return this.color;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + ", age " + this.age + ", color " + this.color + ", weight " + this.weight;
    }

    public void intoHumanAge() {
        System.out.println(this.name + "'s age in human years is " + this.age * 7 + " years");
    }
}
