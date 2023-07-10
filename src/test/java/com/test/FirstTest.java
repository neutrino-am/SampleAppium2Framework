package com.test;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {

    @Test
    public void androidLaunchTest() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("test-device");
        options.setApp(System.getProperty("user.dir")+"/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");

        new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        Thread.sleep(5000);
    }
}
