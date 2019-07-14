package com.evgendev.colorlines;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.evgendev.colorlines", appContext.getPackageName());
    }

    @Test
    public void write(){
        Context appContext = InstrumentationRegistry.getTargetContext();
        Integer a = 4;
        AppUtils.objToFile("test",a,appContext);
        Integer b = (Integer) AppUtils.FileToObj("test",appContext);
        assertEquals(new Integer(4),b);
    }
}
