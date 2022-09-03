package com.javadesl.myuitest

import android.app.LauncherActivity
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    @get : Rule
    var mActivityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun greeterSaysHello() {
        onView(withId(R.id.username)).perform(typeText("JavadEsl"))
        onView(withId(R.id.password)).perform(typeText("09393155090"))
        onView(withId(R.id.buttonLogin)).perform(click());
       // onView(withText("Hello Steve!")).check(matches(isDisplayed()));
    }
}