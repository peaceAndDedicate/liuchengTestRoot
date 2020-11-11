package com.example.demo;

import org.junit.Test;

class ServiceRstdiApplicationTests {

    @Test
    void contextLoads() {
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    if((i*i + j*j == k*k ) && ( i + j + k ==1000)){
                        System.out.println("i:"+i+",j:{}"+j+",k:{}"+k);
                    }
                }
            }
        }
    }
}
