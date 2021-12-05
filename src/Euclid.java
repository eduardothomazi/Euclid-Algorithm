

public class Euclid {
    public static void main(String[] args) {
        System.out.print("Recursive -> " + gcdRecursive(5,5));
        System.out.println();
        System.out.print("Non recursive -> " + gcdNonRecursive(5,5));


    }


    public static int gcdRecursive(int number, int divisor){
        int remaining = number % divisor;

        if (remaining != 0){
            return gcdRecursive(divisor, remaining);
        }
        else {
            return divisor;
        }
    }

    public static int gcdNonRecursive(int number, int divisor){
        int remaining = number % divisor;
        while (remaining != 0){
            int newNumber = divisor;
            divisor = remaining;
            remaining = newNumber % divisor;
        }
        return divisor;
    }

}
