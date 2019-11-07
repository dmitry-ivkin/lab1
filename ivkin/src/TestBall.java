public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(20.5, "red", "football", 1500);
        Ball b2 = new Ball(25.5, "yellow", "football", 500);
        Ball b3 = new Ball(21.5, "black", "football", 700);

        b3.setColor("white");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}