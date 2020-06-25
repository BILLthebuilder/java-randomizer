package com.arraysort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayProcessing {
    ArrayList<Integer> numbers;
    int increment;
    int capacity;

    ArrayProcessing(){
        numbers = new ArrayList<Integer>();
        capacity = 10;
        increment = 10;
    }

    public String addGetElements(String input) throws ElementExistInArrayException{
        int num = Integer.parseInt(input);
        if(numbers.contains(num)){
            throw new ElementExistInArrayException("GIVE ANOTHER INPUT");
        }
        String output= "";
        if(numbers.size() == capacity){
            numbers.ensureCapacity(increment);
            capacity += increment;
        }
        numbers.add(num);
        this.sortAscending();
        for(int i=0; i < numbers.size(); i++){
            output += String.valueOf(numbers.get(i));
            output += ", ";
        }
        return output;
    }

    public ArrayList<Integer> sortAscending() {
        Collections.sort(this.numbers);
        return this.numbers;
    }
}
