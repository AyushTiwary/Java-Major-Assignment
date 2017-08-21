package com.knoldus.services;

import java.util.function.*;

class Pfi {

    Boolean predicateTest(int x){
        Predicate<Integer> predicate = (y)-> y%2 == 0;
        return predicate.test(x);
    }

    void consumerTest(int x){
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(x);
    }

    Integer supplierTest(){
        Supplier<Integer> supplier = ()-> 5;
        return supplier.get();
    }

    Integer unaryOperratorTest(int x){
        UnaryOperator<Integer> unaryOperator = (y)->y*2;
        return unaryOperator.apply(x);
    }

    Integer binaryOperratorTest(int x,int v){
        BinaryOperator<Integer> binaryOperator = (z, y)->y*z;
        return binaryOperator.apply(x,v);
    }

    Boolean biFunction(int x, int y){
        BiFunction<Integer,Integer,Boolean> biFunctionOperator = (a,b)->a>b;
        return  biFunctionOperator.apply(x,y);
    }
}