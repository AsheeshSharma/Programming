package com.company;

public class SeieveOfErastothenes {
    public static void main(String[] args) {

    }
    private static void calculatePrime(int n) {
        boolean prime[] = new boolean[n + 1];

        for(int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        for(int p = 2; p*p <= n; p++) {
            if(prime[p]) {
                for(int i = p*2; i <= n; i=i+p) {
                    prime[i] = false;
                }
            }
        }
    }
}
