package me.ipoondev.beatbox;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsAnything.anything;

/**
 * Created by iPoon on 8/10/2017 AD.
 */
@RunWith(AndroidJUnit4.class)
public class BeatBoxActivityTest {

    @Rule
    public ActivityTestRule<BeatBoxActivity> mActivityTestRule =
            new ActivityTestRule<>(BeatBoxActivity.class);

    @Test
    public void showsFirstFileName(){
        onView(withText("65_cjipie")).check(matches(anything()));
    }

}