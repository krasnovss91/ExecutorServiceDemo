import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService;
        executorService = Executors.newFixedThreadPool(3);

        Thread.sleep(1000);

        executorService.execute(new Demo());
        executorService.execute(new Demo());
        executorService.execute(new Demo());

        executorService.shutdown();
    }
}