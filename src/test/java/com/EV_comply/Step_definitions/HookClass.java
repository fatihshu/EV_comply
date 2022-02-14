package com.EV_comply.Step_definitions;

import com.EV_comply.Utilities.Driver;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class HookClass {
        @Before
        public void setUp(){
            Driver.get().manage().window().maximize();
            Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        @After

    public void teardown(){


        }

}
