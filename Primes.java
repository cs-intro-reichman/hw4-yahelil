import java.util.Arrays;

public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[N-1];
        Arrays.fill(arr,true);
        check_all_primes(arr);
        System.out.println("Prime numbers up to " + N + ":");
        int prime_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true){
                prime_count++;
                System.out.println(i+2);
            }
        }
        
        int prime_precentage = Math.round((100* prime_count) / N);
        System.out.println("There are " + prime_count + " primes between 2 and " + N+ " ("+ prime_precentage + "% are primes)");
        
    }

    public static void check_all_primes(boolean[] arr){
        for(int i = 0; i<Math.sqrt(arr.length+2); i++){
            for(int j = i+1; j<arr.length; j++){
                if ((j+2) % (i+2) == 0){
                    System.out.println((j+2));
                    System.out.println((i+2));

                    arr[j] = false;
                }
            }
        }
    }
}