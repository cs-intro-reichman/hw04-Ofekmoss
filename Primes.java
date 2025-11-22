public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);  
        int count = 0;  
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(String.format("There are %d primes between 2 and %d (%d%% are primes)", count, n, Math.round((double)count / n * 100)));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}