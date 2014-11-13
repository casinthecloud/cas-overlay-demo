package org.leleuj;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {

    private final static int SIZE = 4;
    
    private final static int NB_SUBMIT = (int) ((int) (SIZE * 1.2) * 1.2);
    
    public final static int TASK_DELAY = 2000;
    private final static int DELAY = 3000;

    public static void main(String[] args) throws Exception {

        final ExecutorService executor = new ThreadPoolExecutor(SIZE, SIZE, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(SIZE)); //Executors.newFixedThreadPool(size);

        submit(executor, 0, NB_SUBMIT);
        
        for (int i = 1; i < 4; i++) {
            wait(DELAY);
            
            submit(executor, i, NB_SUBMIT);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
    }
    
    private static void submit(final ExecutorService executor, final int n, final int nb) {
        System.out.println("Send tasks");
        for (int i = 1; i <= nb; i++) {

            final Runnable task = new Task("test " + (i + n * nb));
            try {
                executor.execute(task);
            } catch (RejectedExecutionException e) {
                e.printStackTrace();
            }
        }
    }
    
    private static void wait(int t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
