package com.cs321;

import java.util.ArrayList;

public class WFTable {
    private ArrayList<WFItem> contents;

    public WFTable() {
        contents = new ArrayList<>();
    }

    public boolean add(WFItem w) {
        return contents.add(w);
    }

    public boolean remove(WFItem w) {
        return contents.remove(w);
    }

    public int countWFItems(String step) {
        int sum = 0;
        for(WFItem i : contents) {
            if(step.equals(i.getStep())) {
                sum++;
            }
        }
        return sum;
    }

    public int countWFItems() {
        // if no step passed, just return the size of the arraylist
        return contents.size();
    }

    public WFItem getNextWFItem(String step) {
        // look for the next wf item with the given step
        for(WFItem i : contents) {
            if(step.equals(i.getStep())) {
                return i;
            }
        }
        // if not found, return null
        return null;
    }
}
