public class FizzBuzz {

    private boolean isNumberMultipleOf(int num, int isMultipleNum) {
        return num % isMultipleNum == 0;
    }

    public void fizzBuzz() {
        for (int x = 0; x <= 100; x++) {
            boolean fizz = isNumberMultipleOf(x, 5);
            boolean buzz = isNumberMultipleOf(x, 3);
            boolean buzzed = false;
            if (fizz && buzz) {
                System.out.println("FizzBuzz");
                buzzed = true;
            } else {
                if (fizz) {
                    System.out.println("Fizz");
                    buzzed = true;
                } else if (buzz) {
                    System.out.println("Buzz");
                    buzzed = true;
                }
            }
            x++;
            if (!buzzed) System.out.println(x);
        }
    }

    public static void main(String... args) {
        new FizzBuzz().fizzBuzz();
    }

}