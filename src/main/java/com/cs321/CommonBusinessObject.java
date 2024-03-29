package com.cs321;

import java.util.ArrayList;

public class CommonBusinessObject {

    public class Field {
        public String getImmigrantAddress(String s){
            return s;
        }
        public String getImmigrantName(String s){
            return s;
        }
        public String getImmigrantDOB(String s){
            return s;
        }
        public String getSSN(int i){
            return String.valueOf(i);
        }
        public int getImmigrantID(int i) {
            return i;
        }
    }
    private ArrayList<Form> item;

    public CommonBusinessObject() {
        item = new ArrayList<>();
    }

    public boolean addField(Form f) {
        return item.add(f);
    }

    public boolean removeField(Form f) {
        return item.remove(f);
    }

    public Form getField(int i) {
        return item.get(i);
    }

    public int countFieldItems(String step) {
        int sum = 0;
        for(Form i : item) {
            if(step.equals(i.getStep())) {
                sum++;
            }
        }
        return sum;
    }

    public int countItems() {
        // if no step passed, just return the size of the arraylist
        return item.size();
    }

    public WFItem getNextField(String step) {
        // look for the next wf item with the given step
        for(Form i : item) {
            if(step.equals(i.getStep())) {
                return i;
            }
        }
        // if not found, return null
        return null;
    }
}
