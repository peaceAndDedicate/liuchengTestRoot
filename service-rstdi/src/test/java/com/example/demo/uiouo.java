package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

class uiouo {

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

    @Test
    void solution() {
        List<Integer> result = numOfBurgers(17,4);
        System.out.println(JSONObject.toJSONString(result));
    }

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<=tomatoSlices;i++){
            for(int j=0;j<=cheeseSlices;j++){
                if((4*i+2*j==tomatoSlices)&&(i+j==cheeseSlices)){
                    result.add(i);
                    result.add(j);
                }
            }
        }
        return result;
    }
}