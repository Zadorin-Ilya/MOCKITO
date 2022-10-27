import org.junit.jupiter.api.Test;

public class AfishaTest {

 @Test

    public void test() {
     Afisha afisha = new Afisha();

     afisha.add("Movie 1");
     afisha.add("Movie 2");
     afisha.add("Movie 3");
     afisha.add("Movie 4");

    String[] actual = afisha.findAll();
    String[] expectual = {"Movie 1","Movie 2","Movie 3","Movie 4"};

    }
    @Test

    public void testLast() {
        Afisha afisha = new Afisha(3);

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");

        String[] actual = afisha.findLast();
        String[] expectual = {"Movie 3"};
    }
}
