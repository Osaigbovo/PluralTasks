package com.example.pluraltasks;

import android.content.Context;
import android.content.Intent;

import androidx.test.InstrumentationRegistry;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.test.uiautomator.UiDevice;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class UIAutomatorTest {

    @Rule
    public IntentsTestRule<CreateTaskActivity> intentsTestRule = new IntentsTestRule<>(CreateTaskActivity.class);

    @Test
    public void validHomeButtonPressPqostLogin() {
        UiDevice uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        uiDevice.pressHome();

        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        Intent i = new Intent();
        i.setClassName("com.example.pluraltasks", "com.example.pluraltasks.TaskListActivity");
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
