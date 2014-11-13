package org.leleuj;

public class Task implements Runnable {

    private String text;

    public Task(String s) {
        this.text = s;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Start = " + text);
        wait(TestThreadPool.TASK_DELAY);
        System.out.println(name + " End");
    }

    private void wait(int t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
