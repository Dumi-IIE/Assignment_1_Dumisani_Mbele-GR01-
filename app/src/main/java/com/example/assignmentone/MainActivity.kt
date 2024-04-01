package com.example.assignmentone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // the buttons and textViews are assigned to variables so they will be manipulated with code further below

        val ageInput: EditText = findViewById(R.id.AgeInput)
        val generateButton: Button = findViewById(R.id.generate)
        val clearButton: Button = findViewById(R.id.clear)
        val resultText: TextView = findViewById(R.id.Result)

        // the generate button is called and wil; be assigned an action when clicked in the code below using if statements
        generateButton.setOnClickListener {

            // displayMessage and userAge are declared to be used in the if statement below

            var displayMessage : String
            var userAge : Int

            // userAge is linked to the entered age of the user
            // userAge is converted to a string then to an int or null so that if the user enters a value other than a number it changes to a null

            userAge = ageInput.text.toString().toInt()

            // an if statement is used to evaluate the value entered by the user below

            if (userAge <20 || userAge >100){
                displayMessage = "Enter a number within the range of 20-100."
            } else if (userAge == 39){
                displayMessage = "You are matched with Martin Luther King aged 39, an american civil rights leader and activist."
            } else if (userAge == 52){
                displayMessage = "You are matched with William Shakespeare aged 52, a renowned english poet and actor."
            } else if (userAge == 55){
                displayMessage = "You are matched with Julius Caesar aged 55, a prolific roman dictator."
            } else if (userAge == 56){
                displayMessage = "You are matched with Abraham Lincoln aged 56, a famous ex-president of the United States of America."
            } else if (userAge == 60){
                displayMessage = "You are matched with Diego Maradona aged 60, an Argentinian football icon."
            } else if (userAge == 74){
                displayMessage = "You are matched with Muhammad Ali aged 74, a renowned heavyweight-boxing champion."
            } else if (userAge == 76){
                displayMessage = "You are matched with Albert Einstein aged 76, a famous physician and scientist."
            } else if (userAge == 81){
                displayMessage = "You are matched with Queen Victoria aged 81, a Queen from the United Kingdom."
            } else if(userAge == 82) {
                displayMessage = "You are matched with Pele aged 82, a brazillian football legend."
            } else{
                displayMessage = "There is no historical person at the age of " + userAge
            }
            // the resultText textView displays the result to the user
            // the result displayed depends on the value entered by the user, displaying the matched age or an error message
            resultText.text = displayMessage
        }

        // an action is being assigned to the clearButton
        // once the button is clicked the code below executes, making the resultText textView and ageInput editText null
        // this clears the result and the input, allowing the user to have numerous attempts to enter in different ages
        clearButton.setOnClickListener{

            resultText.text = null
            ageInput.text = null
        }

    }

}
