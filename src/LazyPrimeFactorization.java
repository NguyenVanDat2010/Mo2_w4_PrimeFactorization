public class LazyPrimeFactorization implements Runnable {
    private int amount;
    private String name;

    public LazyPrimeFactorization(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void run() {
        int count = 0;
        int num = 2;
        boolean check = true;
        long startTime = System.currentTimeMillis();

        while (count < amount) {
            try {
                for (int i = 2; i < (num); i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
                if (check) {
                    System.out.println(name + ": " + num);
                    count++;
                } else {
                    System.out.print("");
                }
                num++;
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
