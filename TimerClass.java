import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerClass extends TimerTask{
    int i = 0;

    public void run() {
        System.out.println("Timer ran" + ++i);
        if (i > 6)
            cancel();
    }

    public static void main(String args[]) throws InterruptedException 
    {
        TimerClass runner = new TimerClass();
        Timer timer = new Timer();
        Date date = new Date();
        timer.scheduleAtFixedRate(runner, date, 1000);
        System.out.println("Timer running, type an integer to stop....");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Got a number ..." + num);
        runner.cancel();
        timer.purge();
        scanner.close();
    }
}
