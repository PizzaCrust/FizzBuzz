public class FizzBuzz {

    private boolean isNumberMultipleOf(int num, int isMultipleNum) {
        return num % isMultipleNum == 0;
    }

    public void fizzBuzz() {
        int index = 0;
        while (index != 100) {
            boolean fizz = isNumberMultipleOf(index, 5);
            boolean buzz = isNumberMultipleOf(index, 3);
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
            index++;
            if (!buzzed) System.out.println(index);
        }
    }

    public static void main(String... args) {
        new FizzBuzz().fizzBuzz();
    }

}