package week6;

public class Prime {
    /*
    [IQ] Prime in range [nested loop, methods, conditional]

	create a method that will accept a number. Print out all the prime numbers in the range between 2 and the given number

	a number is a prime number when it is only divisible by 1 and itself

	ex:
		Input:
			50
		Output:
			2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

     */

    public static void main(String[] args) {
        int range=100;
        for (int j= 2; j < range; j++) {
            boolean isPrime=true;
            for (int i = 2; i < j; i++) {
                //System.out.println(j+"%"+i+"   "+(j%i));
                if (j%i==0){
                    isPrime=false;
                    break;
                }
            }

           if(isPrime){
               System.out.print(j+ ", ");
           }
        }

    }
public static boolean isPrime(int n){
    boolean isPrime=true;
    for (int i = 2; i < n; i++) {
        //System.out.println(j+"%"+i+"   "+(j%i));
        if (n%i==0){
            return false;

        }

    }
    return true;
}
public static String primeInRange(int range){
        String prime="";
        for (int i = 2; i < range; i++) {
        if (isPrime(i)){
            prime+=i+", ";
        }
    }
        return prime.substring(0,prime.length()-2);//this one to remove comma when we print statement
}

}
