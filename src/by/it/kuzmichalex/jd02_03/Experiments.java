package by.it.kuzmichalex.jd02_03;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Experiments {

    public static void main(String[] args) {

        Semaphore aa = new Semaphore(3);
        ExecutorService executorService = Executors.newWorkStealingPool();

        Logger.addToLog("aaa\nbbb\nccc\nddd\neee\nfff\n", 0);
        Logger.addToLog("111\n222\n333\n444\n555\n666\n", 1);
        Logger.addToLog("log2", 0);
        Logger.addToLog("sss", 0);
        Logger.addToLog("sss1", 0);
        Logger.addToLog("sss2", 0);
        Logger.addToLog("sss3", 1);
    }
}
