package com.example.native_apps_activity_lab_sdplus;

import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Sofie on 4/10/2016.
 */
@RunWith(AndroidJUnit4.class)
public class BasicTest {

    @Test
    public void thisIsReallySilly(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void additionIsCorrect()throws Exception{
        Assert.assertEquals(8, 6 +2);
    }
}
