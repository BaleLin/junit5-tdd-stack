package com.thoughtworks.tdd;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FizzBuzz {

    public String sayNumber(int number) {
         String str ="";
        String str_a = String.valueOf(number);
        if(str_a .indexOf('3')!=-1){
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
