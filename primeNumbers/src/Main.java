public class Main {
    public static void main(String[] args) {

        int num = 89;
        boolean isPrime = true;

        for(int div = 2; div < num; div++ ) {
            if (49 % div == 0){
                System.out.println("Not prime");
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("is prime");
        } else {
            System.out.println("not prime");
        }
    }
}