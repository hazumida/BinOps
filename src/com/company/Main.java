package com.company;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();

        System.out.println(bins.sum("1110", "10000"));
        System.out.println(bins.mult("1110", "10000"));
        System.out.println(bins.sum("111011", "100001"));
        System.out.println(bins.mult("111011", "100001"));
    }
}
