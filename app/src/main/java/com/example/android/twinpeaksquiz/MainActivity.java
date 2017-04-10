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
    String message5;
    String message6;
    String message7;
    String message8;
    String message9;
    String message10;

    String population = "51.201";
    public int totalQuestions = 10;
    public int totalCorrectAnswered = 0;

    /**
     * This Method Saves Data from Vertical to Landscape
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
        //Quiz 5 Answer 1
        RadioButton Q5RadioButton1 = (RadioButton) findViewById(R.id.Q5_R1);
        Boolean quest5Answer1 = Q5RadioButton1.isChecked();
        //Quiz 5 Answer 2
        RadioButton Q5RadioButton2 = (RadioButton) findViewById(R.id.Q5_R2);
        Boolean quest5Answer2 = Q5RadioButton2.isChecked();
        //Quiz 5 Answer 3
        RadioButton Q5RadioButton3 = (RadioButton) findViewById(R.id.Q5_R3);
        Boolean quest5Answer3 = Q5RadioButton3.isChecked();
        //Quiz 6 Answer 1
        RadioButton Q6RadioButton1 = (RadioButton) findViewById(R.id.Q6_R1);
        Boolean quest6Answer1 = Q6RadioButton1.isChecked();
        //Quiz 6 Answer 2
        RadioButton Q6RadioButton2 = (RadioButton) findViewById(R.id.Q6_R2);
        Boolean quest6Answer2 = Q6RadioButton2.isChecked();
        //Quiz 6 Answer 3
        RadioButton Q6RadioButton3 = (RadioButton) findViewById(R.id.Q6_R3);
        Boolean quest6Answer3 = Q6RadioButton3.isChecked();
        //Quiz 7 Answer 1
        RadioButton Q7RadioButton1 = (RadioButton) findViewById(R.id.Q7_R1);
        Boolean quest7Answer1 = Q7RadioButton1.isChecked();
        //Quiz 7 Answer 2
        RadioButton Q7RadioButton2 = (RadioButton) findViewById(R.id.Q7_R2);
        Boolean quest7Answer2 = Q7RadioButton2.isChecked();
        //Quiz 7 Answer 3
        RadioButton Q7RadioButton3 = (RadioButton) findViewById(R.id.Q7_R3);
        Boolean quest7Answer3 = Q7RadioButton3.isChecked();
        //Quiz 8 Answer 1
        RadioButton Q8RadioButton1 = (RadioButton) findViewById(R.id.Q8_R1);
        Boolean quest8Answer1 = Q8RadioButton1.isChecked();
        //Quiz 8 Answer 2
        RadioButton Q8RadioButton2 = (RadioButton) findViewById(R.id.Q8_R2);
        Boolean quest8Answer2 = Q8RadioButton2.isChecked();
        //Quiz 8 Answer 3
        RadioButton Q8RadioButton3 = (RadioButton) findViewById(R.id.Q8_R3);
        Boolean quest8Answer3 = Q8RadioButton3.isChecked();
        //Quiz 9 Answer 1
        RadioButton Q9RadioButton1 = (RadioButton) findViewById(R.id.Q9_R1);
        Boolean quest9Answer1 = Q9RadioButton1.isChecked();
        //Quiz 9 Answer 2
        RadioButton Q9RadioButton2 = (RadioButton) findViewById(R.id.Q9_R2);
        Boolean quest9Answer2 = Q9RadioButton2.isChecked();
        //Quiz 9 Answer 3
        RadioButton Q9RadioButton3 = (RadioButton) findViewById(R.id.Q9_R3);
        Boolean quest9Answer3 = Q9RadioButton3.isChecked();
        //Quiz 10 Answer 1
        RadioButton Q10RadioButton1 = (RadioButton) findViewById(R.id.Q10_R1);
        Boolean quest10Answer1 = Q10RadioButton1.isChecked();
        //Quiz 10 Answer 2
        RadioButton Q10RadioButton2 = (RadioButton) findViewById(R.id.Q10_R2);
        Boolean quest10Answer2 = Q10RadioButton2.isChecked();
        //Quiz 10 Answer 3
        RadioButton Q10RadioButton3 = (RadioButton) findViewById(R.id.Q10_R3);
        Boolean quest10Answer3 = Q10RadioButton3.isChecked();

        //Calling the the 10 methods for Checking the Answers
        checkAnswer1(quest1Answer1, quest1Answer2, quest1Answer3);
        checkAnswer2(quest2Answer1, quest2Answer2, quest2Answer3);
        checkAnswer3(isGuilty1, isGuilty2, isGuilty3, isGuilty4, isGuilty5, isGuilty6, isGuilty7, isGuilty8);
        checkAnswer4(populationNumber);
        checkAnswer5(quest5Answer1, quest5Answer2, quest5Answer3);
        checkAnswer6(quest6Answer1, quest6Answer2, quest6Answer3);
        checkAnswer7(quest7Answer1, quest7Answer2, quest7Answer3);
        checkAnswer8(quest8Answer1, quest8Answer2, quest8Answer3);
        checkAnswer9(quest9Answer1, quest9Answer2, quest9Answer3);
        checkAnswer10(quest10Answer1, quest10Answer2, quest10Answer3);

        //Creating the Display Message for 0 to 4 correct answers

        String message0to4correct = "\nPete Martell: She's dead... Wrapped in plastic. \nWatch again the series and try again!";
        String message5to7correct = "\nSheriff Truman: I hear that you're real good at what you do.";
        String message8to9correct = "\nDale Cooper: A little habit can provide a strong foundation.";
        String messageAllcorrect = "Laura Palmer: Fire Walk with me!";

        String message = "You Scored: " + totalCorrectAnswered + " out of " + totalQuestions + "\n";
        message += "\nWatch again the series and try again!";
        message += "\nQ1: " + message1;
        message += "\nQ2: " + message2;
        message += "\nQ3: " + message3;
        message += "\nQ4: " + message4;
        message += "\nQ5: " + message5;
        message += "\nQ6: " + message6;
        message += "\nQ7: " + message7;
        message += "\nQ8: " + message8;
        message += "\nQ9: " + message9;
        message += "\nQ10 " + message10;
        displayMessage(message);


    }

    /**
     * This Method checks whether Question 1 Answer is correct or not
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
     * This Method checks whether Question 2 Answer correct or not
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
     * This Method checks whether Question 5 is correct or not
     *
     * @param quest5Answer1 Answer 1
     * @param quest5Answer2 Answer 2
     * @param quest5Answer3 Answer 3
     */
    public String checkAnswer5(boolean quest5Answer1, boolean quest5Answer2, boolean quest5Answer3) {

        if (quest5Answer1) {
            message5 = incorrect;
        } else if (quest5Answer2) {
            message5 = correct;
            totalCorrectAnswered++;
        } else if (quest5Answer3) {
            message5 = incorrect;
        }
        return message5;
    }

    /**
     * This Method checks whether Question 1 Answer is correct or not
     *
     * @param quest6Answer1 Answer 1
     * @param quest6Answer2 Answer 2
     * @param quest6Answer3 Answer 3
     * @return message6 Answer selected
     */

    public String checkAnswer6(boolean quest6Answer1, boolean quest6Answer2, boolean quest6Answer3) {

        if (quest6Answer1) {
            message6 = correct;
            totalCorrectAnswered++;
        } else if (quest6Answer2) {
            message6 = incorrect;
        } else if (quest6Answer3) {
            message6 = incorrect;
        }
        return message6;
    }

    /**
     * This Method checks whether Question 7 Answer is correct or not
     *
     * @param quest7Answer1 Answer 1
     * @param quest7Answer2 Answer 2
     * @param quest7Answer3 Answer 3
     * @return
     */
    public String checkAnswer7(boolean quest7Answer1, boolean quest7Answer2, boolean quest7Answer3) {

        if (quest7Answer1) {
            message7 = incorrect;
        } else if (quest7Answer2) {
            message7 = incorrect;
        } else if (quest7Answer3) {
            message7 = correct;
            totalCorrectAnswered++;
        }
        return message7;
    }

    /**
     * This Method checks whether Question 8 Answer is correct or not
     *
     * @param quest8Answer1 Answer 1
     * @param quest8Answer2 Answer 2
     * @param quest8Answer3 Answer 3
     * @return
     */

    public String checkAnswer8(boolean quest8Answer1, boolean quest8Answer2, boolean quest8Answer3) {

        if (quest8Answer1) {
            message8 = correct;
            totalCorrectAnswered++;
        } else if (quest8Answer2) {
            message8 = incorrect;
        } else if (quest8Answer3) {
            message8 = incorrect;
        }
        return message8;
    }

    /**
     * This Method checks whether Question 9 Answer is correct or not
     *
     * @param quest9Answer1 Answer 1
     * @param quest9Answer2 Answer 2
     * @param quest9Answer3 Answer 3
     * @return
     */
    public String checkAnswer9(boolean quest9Answer1, boolean quest9Answer2, boolean quest9Answer3) {

        if (quest9Answer1) {
            message9 = correct;
            totalCorrectAnswered++;
        } else if (quest9Answer2) {
            message9 = incorrect;
        } else if (quest9Answer3) {
            message9 = incorrect;
        }
        return message9;
    }

    /**
     * This Method checks whether Question 10 Answer is correct or not
     *
     * @param quest10Answer1 Answer 1
     * @param quest10Answer2 Answer 2
     * @param quest10Answer3 Answer 3
     * @return
     */
    public String checkAnswer10(boolean quest10Answer1, boolean quest10Answer2, boolean quest10Answer3) {

        if (quest10Answer1) {
            message10 = correct;
            totalCorrectAnswered++;
        } else if (quest10Answer2) {
            message10 = incorrect;
        } else if (quest10Answer3) {
            message10 = incorrect;
        }
        return message10;
    }

    /**
     * This Method Displays the Result message of The Quiz for 0 to 4 right answers
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
        message5 = "";
        message6 = "";
        message7 = "";
        message8 = "";
        message9 = "";
        message10 = "";


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
        //Quiz 5 Reset
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.Answers5);
        radioGroup5.clearCheck();
        //Quiz 6 Reset
        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.Answers6);
        radioGroup6.clearCheck();
        //Quiz 7 Reset
        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.Answers7);
        radioGroup7.clearCheck();
        //Quiz 8 Reset
        RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.Answers8);
        radioGroup8.clearCheck();
        //Quiz 9 Reset
        RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.Answers9);
        radioGroup9.clearCheck();
        //Quiz 10 Reset
        RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.Answers10);
        radioGroup10.clearCheck();
    }

}