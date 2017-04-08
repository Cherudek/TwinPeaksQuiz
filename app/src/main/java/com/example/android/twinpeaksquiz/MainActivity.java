package com.example.android.twinpeaksquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This app displays the results of the Quiz Game about the TV Series "Twin Peaks"
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Correct Answers to the Quiz

    String correct = "Correct";
    String incorrect = "Incorrect";
    String message1;
    String message2;
    public int totalQuestions = 6;
    public int totalCorrectAnswered = 0;

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


        checkAnswer1(quest1Answer1, quest1Answer2, quest1Answer3);
        checkAnswer2(quest2Answer1, quest2Answer2, quest2Answer3);

        String message = "Total Score: " + totalCorrectAnswered + " out of " + totalQuestions + "\n";
        message += "\nQ1: " + message1;
        message += "\nQ2: " + message2;
        displayMessage(message);

    }

    /**
     *
     * This Method checks whether Question 1 Answers are correct or not
     *
     * @param quest1Answer1  Answer 1
     * @param quest1Answer2  Answer 2
     * @param quest1Answer3  Answer 3
     * @return
     */

    public String checkAnswer1 (boolean quest1Answer1, boolean quest1Answer2, boolean quest1Answer3) {

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
     *
     * This Method checks whether the Question 2 Answers are correct or not
     *
     * @param quest2Answer1  Answer 1
     * @param quest2Answer2  Answer 2
     * @param quest2Answer3  Answer 3
     * @return
     */
    public String checkAnswer2 (boolean quest2Answer1 , boolean quest2Answer2, boolean quest2Answer3) {

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
     * This Method Display the Result of The Quiz
     * @param message is the message of all the Answers
     */

    public void displayMessage(String message) {

        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.show();

//        TextView orderSummaryTextView = (TextView) findViewById(R.id.results);
//        orderSummaryTextView.setText(message);
    }

}
