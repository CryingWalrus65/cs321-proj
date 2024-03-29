package com.cs321;

public class WFItem {
    private int wfid;
    private String step;
    private int objid;

    public WFItem(int wfid, int objid, String step) {
        this.wfid = wfid;
        this.objid = objid;
        if(!(step.equals("entry") || step.equals("review") || step.equals("approval"))) {
            throw new IllegalArgumentException("Invalid step!");
        } else {
            this.step = step;
        }
    }

    public WFItem(int wfid, int objid) {
        this.wfid = wfid;
        this.objid = objid;
        this.step = "entry";
    }

    public int getWFID() {
        return wfid;
    }

    public String getStep() {
        return step;
    }

    public int getObjID() {
        return objid;
    }

    public void setWFID(int wf) {
        wfid = wf;
    }

    public void setStep(String st) {
        if(!(st.equals("entry") || st.equals("review") || st.equals("approval"))) {
            throw new IllegalArgumentException("Invalid step!");
        } else {
            step = st;
        }
    }

    public void setObjID(int oid) {
        objid = oid;
    }

    
}
