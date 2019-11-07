
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Братя Карамазовы", "Достоевский Ф.М.", 90, "роман");
        Book b2 = new Book("Собачье сердце", "Булгаков М.A.", 180, "роман");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}
