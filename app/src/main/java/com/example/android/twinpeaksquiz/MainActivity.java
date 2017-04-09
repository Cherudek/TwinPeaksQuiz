package com.example.android.twinpeaksquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * This app displays the results of the Quiz Game about the TV Series "Twin Peaks"
 */

public class MainActivity extends AppCompatActivity {

    // Global Variables and Correct Answers to the Quiz

    String correct = "Correct";
    String incorrect = "Incorrect";
    String message;
    String message1;
    String message2;
    String message3;
    String message4;
    String population = "51.201";
    public int totalQuestions = 4;
    public int totalCorrectAnswered = 0;



    /**
     * This Method Saves Data from Vertical to Landscape
     *
     */

    // Override the onSaveInstanceState method, this will write the variables values to the Bundle

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("totalCorrectAnsweredState", totalCorrectAnswered);
        savedInstanceState.putString("messageState", message);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        /* Restores  */

        totalCorrectAnswered = savedInstanceState.getInt("totalCorrectAnsweredState");
        message = savedInstanceState.getString("messageState");


        /* Display values after restoring */

        displayMessage(message);




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * This Method Submits the Results of the Quiz
     *
     * @param view
     */

    public void submitQuiz(View view) {

        //Quiz 1 Answer 1
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.Q1_R1);
        boolean quest1Answer1 = radioButton1.isChecked();

        //Quiz 1 Answer 2
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.Q1_R2);
        boolean quest1Answer2 = radioButton2.isChecked();

        //Quiz 1 Answer 3
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.Q1_R3);
        boolean quest1Answer3 = radioButton3.isChecked();


        //Quiz 2 Answer 1
        RadioButton Q2radioButton1 = (RadioButton) findViewById(R.id.Q2_R1);
        boolean quest2Answer1 = Q2radioButton1.isChecked();

        //Quiz 2 Answer 2
        RadioButton Q2radioButton2 = (RadioButton) findViewById(R.id.Q2_R2);
        boolean quest2Answer2 = Q2radioButton2.isChecked();

        //Quiz 2 Answer 3
        RadioButton Q2radioButton3 = (RadioButton) findViewById(R.id.Q2_R3);
        boolean quest2Answer3 = Q2radioButton3.isChecked();


        //Quiz 3 Answer 1
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        boolean isGuilty1 = checkBox1.isChecked();

        //Quiz 3 Answer 2
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        boolean isGuilty2 = checkBox2.isChecked();

        //Quiz 3 Answer 3
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        boolean isGuilty3 = checkBox3.isChecked();

        //Quiz 3 Answer 4
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        boolean isGuilty4 = checkBox4.isChecked();

        //Quiz 3 Answer 5
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkbox5);
        boolean isGuilty5 = checkBox5.isChecked();

        //Quiz 3 Answer 6
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkbox6);
        boolean isGuilty6 = checkBox6.isChecked();

        //Quiz 3 Answer 7
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.checkbox7);
        boolean isGuilty7 = checkBox7.isChecked();

        //Quiz 3 Answer 8
        CheckBox checkBox8 = (CheckBox) findViewById(R.id.checkbox8);
        boolean isGuilty8 = checkBox8.isChecked();


        //Quiz 4 One Answer Only
        EditText population = (EditText) findViewById(R.id.population);
        String populationNumber = population.getText().toString();


        checkAnswer1(quest1Answer1, quest1Answer2, quest1Answer3);
        checkAnswer2(quest2Answer1, quest2Answer2, quest2Answer3);
        checkAnswer3(isGuilty1, isGuilty2, isGuilty3, isGuilty4, isGuilty5, isGuilty6, isGuilty7, isGuilty8);
        checkAnswer4(populationNumber);

        String message = "Total Score: " + totalCorrectAnswered + " out of " + totalQuestions + "\n";
        message += "\nQ1: " + message1;
        message += "\nQ2: " + message2;
        message += "\nQ3: " + message3;
        message += "\nQ4: " + message4;
        displayMessage(message);

    }

    /**
     * This Method checks whether Question 1 Answers are correct or not
     *
     * @param quest1Answer1 Answer 1
     * @param quest1Answer2 Answer 2
     * @param quest1Answer3 Answer 3
     * @return
     */

    public String checkAnswer1(boolean quest1Answer1, boolean quest1Answer2, boolean quest1Answer3) {

        if (quest1Answer1) {
            message1 = incorrect;
        } else if (quest1Answer2) {
            message1 = correct;
            totalCorrectAnswered++;
        } else if (quest1Answer3) {
            message1 = incorrect;
        }

        return message1;
    }

    /**
     * This Method checks whether Question 2 Answers are correct or not
     *
     * @param quest2Answer1 Answer 1
     * @param quest2Answer2 Answer 2
     * @param quest2Answer3 Answer 3
     * @return
     */
    public String checkAnswer2(boolean quest2Answer1, boolean quest2Answer2, boolean quest2Answer3) {

        if (quest2Answer1) {
            message2 = incorrect;
        } else if (quest2Answer2) {
            message2 = correct;
            totalCorrectAnswered++;
        } else if (quest2Answer3) {
            message2 = incorrect;
        }
        return message2;
    }

    /**
     * This method checks whether Question 3 is correct
     */

    public String checkAnswer3(boolean isGuilty1, boolean isGuilty2, boolean isGuilty3, boolean isGuilty4,
                               boolean isGuilty5, boolean isGuilty6, boolean isGuilty7, boolean isGuilty8) {
        if (isGuilty2 || isGuilty5 || isGuilty8) {
            message3 = incorrect;
        } else if (isGuilty1 && isGuilty3 && isGuilty4 && isGuilty6 && isGuilty7) {
            message3 = correct;
            totalCorrectAnswered++;
        } else {
            message3 = incorrect;
        }
        return message3;
    }


    /**
     * This method checks whether Question 4 is correct
     */

    public String checkAnswer4(String populationNumber) {

        if (populationNumber.equals(population)) {
            message4 = correct;
            totalCorrectAnswered++;
        } else {
            message4 = incorrect;
        }
        return message4;
    }


    /**
     * This Method Displays the Result of The Quiz
     *
     * @param message is the message of all the Answers
     */

    public void displayMessage(String message) {

        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.show();

    }

    /**
     * This Method Resets all the Answers
     */

    public void resetQuiz(View view) {

        //Reset the Score
        totalCorrectAnswered = 0;

        //Reset Messages

        message1 = "";
        message2 = "";
        message3 = "";
        message4 = "";


        //Quiz 1 Reset
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.Answers1);
        radioGroup1.clearCheck();

        //Quiz 2 Reset
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.Answers2);
        radioGroup2.clearCheck();

        //Quiz 3 Answer 1 Reset
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox1.setChecked(false);

        //Quiz 3 Answer 2 Reset
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox2.setChecked(false);

        //Quiz 3 Answer 3 Reset
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkBox3.setChecked(false);

        //Quiz 3 Answer 4 Reset
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkBox4.setChecked(false);

        //Quiz 3 Answer 5 Reset
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkbox5);
        checkBox5.setChecked(false);

        //Quiz 3 Answer 6 Reset
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkbox6);
        checkBox6.setChecked(false);

        //Quiz 3 Answer 7 Reset
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.checkbox7);
        checkBox7.setChecked(false);

        //Quiz 3 Answer 8 Reset
        CheckBox checkBox8 = (CheckBox) findViewById(R.id.checkbox8);
        checkBox8.setChecked(false);

        //Quiz 4 Reset
        EditText editText = (EditText) findViewById(R.id.population);
        editText.setText(null);
    }

}