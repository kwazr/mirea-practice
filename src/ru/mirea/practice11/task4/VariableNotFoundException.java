package ru.mirea.practice11.task4;

public class VariableNotFoundException extends IllegalArgumentException{
    VariableNotFoundException(String msg){
        super(msg);
    }
}
