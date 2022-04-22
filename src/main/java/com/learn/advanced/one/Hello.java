package com.learn.advanced.one;

/**
 * @author zhangyoubao
 * @version 2022/4/22
 */
public class Hello {

    private int count = 0;
    private double sum = 0.0;

    public void submit(double value) {
        this.count ++;
        this.sum += value;
    }

    public double getAvg() {
        if (this.count == 0) {
            return sum;
        }
        return this.sum / this.count;
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        int fir = 97;
        int sec = 24;
        hello.submit(fir);
        hello.submit(sec);
        double avg = hello.getAvg();
        System.out.println(avg);
    }
}
