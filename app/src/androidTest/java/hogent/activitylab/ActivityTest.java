package com.example.native_apps_activity_lab_sdplus;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import android.app.Activity;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collection;

import hogent.activitylab.Activity1;
import hogent.activitylab.Activity2;
import hogent.activitylab.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withInputType;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.runner.lifecycle.Stage.RESUMED;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Sofie on 4/10/2016.
 */


@RunWith(AndroidJUnit4.class)
public class ActivityTest {

    @Rule
    public ActivityTestRule<Activity1> mActivityRule = new ActivityTestRule<>(Activity1.class);

    @Test
    public void ensurePressingButtonOpensActivity2(){
        onView(withId(R.id.bLaunchActivityTwo)).perform(click());
        Activity activity2 = getActivityInstance();
        assertTrue(Activity2.class.isInstance(activity2));
    }

    @Test
    public void ensureIncrementStartCounter(){
        onView(withId(R.id.start)).check(matches(withText("onStart() calls: 1")));
        onView(withId(R.id.bLaunchActivityTwo)).perform(click());
        onView(withId(R.id.start)).check(matches(withText("onStart() calls: 1")));
        onView(withId(R.id.bClose)).perform(click());
        onView(withId(R.id.start)).check(matches(withText("onStart() calls: 2")));
    }

    @Test
    public void ensureIncrementOnResumeCounter(){
        onView(withId(R.id.resume)).check(matches(withText("onResume() calls: 1")));
        onView(withId(R.id.bLaunchActivityTwo)).perform(click());
        onView(withId(R.id.resume)).check(matches(withText("onResume() calls: 1")));
        onView(withId(R.id.bClose)).perform(click());
        onView(withId(R.id.resume)).check(matches(withText("onResume() calls: 2")));
    }

    public Activity getActivityInstance() {
        final Activity[] activity = new Activity[1];
        InstrumentationRegistry.getInstrumentation().runOnMainSync(new Runnable( ) {
            public void run() {
                Activity currentActivity = null;
                Collection resumedActivities = ActivityLifecycleMonitorRegistry.getInstance().getActivitiesInStage(RESUMED);
                if (resumedActivities.iterator().hasNext()){
                    currentActivity = (Activity) resumedActivities.iterator().next();
                    activity[0] = currentActivity;
                }
            }
        });

        return activity[0];
    }

}
