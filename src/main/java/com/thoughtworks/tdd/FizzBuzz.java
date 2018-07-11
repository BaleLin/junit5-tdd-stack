package com.thoughtworks.tdd;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author Dylan Wei
 * @date 2018-07-11 10:58
 */
public class FizzBuzz {

    public String sayNumber(int number) {
         String str ="";
        String str_a = String.valueOf(number);
        if(str_a .indexOf('3')!=-1){
            System.out.print(str_a .indexOf("3"));
           return "Fizz";
        }
        if(number%3==0){
            str+="Fizz";

        }
         if(number%5==0){
            str+="Buzz";

        }
         if(number%7==0){
            str+="Whizz";

        }


        return str==""?number + "":str;
    }
}
