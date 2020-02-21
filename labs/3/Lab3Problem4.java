
/** Jake Schinasi
 * Lab3Problem4
 */
public class Lab3Problem4 {

    public static void main(String[] args) {
        int topPrime = 150000; // largest number n can be
        int count = 0; // counts n
        int current = 2; // current position
        int lastPrime = 2; // lowest prime number 

        while (count < topPrime) {

            boolean prime = true; 

            int top = (int)Math.sqrt(current) + 1;

            for (int i = 2; i < top; i++) {
                if (current % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) { // checks if number is prime
                count++;
                lastPrime = current; 
            }
            if (current == 2) {
             current++;
            } else {
                current = current + 2;
            }
        }

        System.out.println("largest n prime = " + lastPrime); // prints the output
    






    }
}