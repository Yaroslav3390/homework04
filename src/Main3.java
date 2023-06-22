public class Main3 {
    public static void main(String[] args) {

        NumberManipulator manipulator = new NumberManipulator();

        int number = 5;
        System.out.println("Initial number: " + number);
        int incrementedNumber = manipulator.incrementByOne(number);
        System.out.println("Number after increment: " + incrementedNumber);

        int number1 = 7;
        System.out.println("Initial number: " + number);
        int decrementNumber = manipulator.decrementByOne(number);
        System.out.println("Number after decrement: " + decrementNumber);

    }
}
