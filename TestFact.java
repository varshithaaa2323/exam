
public class TestFact {

    public static void main(String[] args) {
        try {
            if (Fact.factorial(5) != 120) {
                throw new AssertionError("Test failed for input 5");
            }

            if (Fact.factorial(0) != 1) {
                throw new AssertionError("Test failed for input 0");
            }

            System.out.println("All tests passed.");

        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}

