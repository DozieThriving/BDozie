public class FunctionTestAss {
   public static void displayPrimeNumbers() {
        int count = 0;
        int num = 2;



 System.out.println("The first 50 prime numbers are:");

        while (count < 50) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
             Function.displayPrimeNumbers();
      }
       }
            num++;
     }
    }
