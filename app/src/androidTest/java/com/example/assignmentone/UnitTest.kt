package com.example.assignmentone

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4


    @RunWith(AndroidJUnit4::class)
    class UnitTest {

        @Before
        fun setUp() {
            ActivityScenario.launch(MainActivity::class.java)
        }

        @Test
        fun testGenerateButton() {
            // Enter age into EditText
            onView(withId(R.id.AgeInput)).perform(typeText("39"))

            // Click the generate button
            onView(withId(R.id.generate)).perform(click())

            // Check if the result text matches the expected message
            onView(withId(R.id.Result)).check(matches(withText("You are matched with Martin Luther King aged 39, an american civil rights leader and activist.")))
        }
    }

