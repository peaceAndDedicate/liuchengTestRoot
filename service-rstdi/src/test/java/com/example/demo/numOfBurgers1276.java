package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class numOfBurgers1276 {

    @Test
    public void solution() {
        List<Integer> result = numOfBurgers(16,7);
        System.out.println(JSONObject.toJSONString(result));
    }

    /*
       1276. 不浪费原料的汉堡制作方案
       执行用时：1786 ms, 在所有 Java 提交中击败了5.19%的用户
       内存消耗：38.1 MB, 在所有 Java 提交中击败了96.14%的用户
    */
    private List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> result = new ArrayList<>();
        if(tomatoSlices%2==1){
        }
        if(tomatoSlices<cheeseSlices){
        }else if(tomatoSlices==cheeseSlices){
            if(0==tomatoSlices){
                result.add(0);
                result.add(0);
            }else{
            }
        }else{
            if(tomatoSlices>(cheeseSlices<<2)){
            }else if(tomatoSlices==(cheeseSlices<<2)){
                result.add(tomatoSlices>>1);
                result.add(0);
            }else{
                if(tomatoSlices==(cheeseSlices<<1)){
                    result.add(0);
                    result.add(tomatoSlices>>1);
                }else if(tomatoSlices<(cheeseSlices<<1)){
                }else{
                    if(tomatoSlices==3*cheeseSlices){
                        result.add(cheeseSlices>>1);
                        result.add(tomatoSlices>>1);
                    }else if(tomatoSlices>3*cheeseSlices){
                        for(int y=0;y<=cheeseSlices>>1;y++){
                            if((((cheeseSlices-y)<<2)+(y<<1)==tomatoSlices)&&(cheeseSlices>=y)){
                                result.add(cheeseSlices-y);
                                result.add(y);
                            }
                        }
                    }else{
                        for(int y=cheeseSlices>>1;y<=cheeseSlices;y++){
                            if((((cheeseSlices-y)<<2)+(y<<1)==tomatoSlices)&&(cheeseSlices>=y)){
                                result.add(cheeseSlices-y);
                                result.add(y);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    private List<Integer> numOfBurgers2(int tomatoSlices, int cheeseSlices) {
        List<Integer> result = new ArrayList<>();
        if(
                (tomatoSlices>>1==1)||
                (tomatoSlices<cheeseSlices)||
                (tomatoSlices>(cheeseSlices*4))||
                (tomatoSlices<(cheeseSlices*2))
        ){
        }else if(tomatoSlices==cheeseSlices){
            if(0==tomatoSlices){
                result.add(0);
                result.add(0);
            }else{
            }
        }else{
            result.add((tomatoSlices-2*cheeseSlices)/2);
            result.add(cheeseSlices-result.get(0));
        }
        return result;
    }
}