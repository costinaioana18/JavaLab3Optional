package com.company;

public interface Item extends Comparable<Item>{
    String getName();
    int getWeight();
    int getValue();

    default float profitFactor(){
        float result=(float)getValue()/(float)getWeight();
        return result;
    }

    @Override
    default int compareTo(Item o){
        if(getValue()< o.getValue())
            return 1;
        else
        {
            if(getValue()> o.getValue())
                return -1;
            else
                return 0;
        }
    }

}
