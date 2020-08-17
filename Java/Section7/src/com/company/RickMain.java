package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RickMain {
    private List<RickList> rickLists;

    public RickMain() {
    }

    public RickMain(List<RickList> rickLists) {
        this.rickLists = rickLists;
    }

    public void addItem(RickList rickList){
        if (this.rickLists == null){
            this.rickLists.add(rickList);
        }else{
            int size = this.rickLists.size();
            int temp = 0;
            while(temp<size){
                int compare = this.rickLists.get(temp).compareto(rickList);
                if (compare ==0 ){
                    System.out.println("Duplicate element!!");
                    return;
                }else if (compare>0){
                    temp ++;
                }else{
                    rickLists.add(temp,rickList);
                    System.out.println("Element added to the position: " + (temp));
                    return;
                }

            }
            rickLists.add(size,rickList);
            System.out.println("Element added to the position " + size);
        }
    }
}
