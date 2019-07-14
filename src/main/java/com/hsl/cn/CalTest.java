package com.hsl.cn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalTest {
    @Test
    public void testAdd1(){
        Assert.assertEquals(3,Cal.add(1,2));
    }
    @Test
    public void testAdd2(){
        Assert.assertEquals(127,Cal.add(127,1));
    }
    @Test
    public void testAdd3(){
        Assert.assertEquals(-1,Cal.add(0,-1));
    }

}
