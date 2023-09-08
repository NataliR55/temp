import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       /* getException();
        IntWrapper int1 = new IntWrapper(5);
        IntWrapper int2 = new IntWrapper(5);

        System.out.println(int1 == int2);
        System.out.println(int1.equals(int2));
        System.out.println(int1.getValue() == int2.getValue());

        System.out.println(crazyDivide(4, 2));

        System.out.println(Season.valueOf("AUTUMN").name());
        //System.out.println(Season.valueOf("Осень"));

        System.out.println(Arrays.stream(Season.values())
                .filter((season) -> season.getTitle() == "Осень")
                .findFirst()
                .get());

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        System.out.println(Season.values()[2]);
        */

        Book a = new Book("title1", 40, 2000);
        Book b = new Book("title2", 30, 2000);
        Book c = new Book("title3", 10, 2000);


        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(a.compareTo(c));
        /*        List<Book> books = new ArrayList<Book>(List.of(a, b, c));
        Collections.sort(books);
        System.out.println(books);


        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book1));
        System.out.println(book3.equals(book1));
        System.out.println(book3.compareTo(book1));
        System.out.println(book3.compareTo(book2));



        MagicBox magicBox1 = new MagicBox(10);
        MagicBox magicBox2 = new MagicBox(20);
*/
    }


    public static int crazyDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Так нельзя!");
        } finally {
            return -1;
        }
    }

    public static void getException() {
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e2) {
            System.out.println("Arithmetic exception");
        } catch (RuntimeException e) {
            System.out.println("Runtime exception");

        } catch (Exception e3) {
            System.out.println("Some exception");
        }
    }

    static class IntWrapper {
        private Integer value;

        public IntWrapper(int value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IntWrapper that = (IntWrapper) o;
            return value == that.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }
}