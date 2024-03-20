package com.cs321;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CountWFItemsTest {

    @Test
    void TestWFCount() {
        WFItem wfobj = new WFItem();
        int count = wfobj.countWFItems("null");

        assertEquals(0, count);
    }

}

