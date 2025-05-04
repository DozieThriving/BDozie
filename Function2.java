public class Function2 {

  public static void displayPrimeNumbers() {
        int count = 0;
        int num = 2;

   System.out.println("First 50 numbers:");

    while (count < 50) {
     if ((num % 2 == 1) && (num % 3 == 1 || num % 3 == 2) {
       System.out.print(num + " ");
        count++;
      if (count % 10 == 0) {
       System.out.println();
                }
            }
            num++;
        }
    }
}
