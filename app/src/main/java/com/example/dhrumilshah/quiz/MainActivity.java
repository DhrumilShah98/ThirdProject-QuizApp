package com.example.dhrumilshah.quiz;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int finalScore = 0;
    private final String answer1 = "7251634";

    private EditText mEditText;
    private String mUserQue1Ans;

    private RadioGroup mRadioGroup;
    private RadioButton mQuestion2State, mQuestion3State, mQuestion5State, mQuestion6State, mQuestion8State, mQuestion9State, mQuestion10State;
    private int mUserQue2Ans, mUserQue3Ans, mUserQue5Ans, mUserQue6Ans, mUserQue8Ans, mUserQue9Ans, mUserQue10Ans;

    private CheckBox mQuestion4StateAns1, mQuestion4StateAns2, mQuestion4StateAns3, mQuestion4StateAns4;
    private CheckBox mQuestion7StateAns1, mQuestion7StateAns2, mQuestion7StateAns3, mQuestion7StateAns4;
    private int mUserQue4Ans1, mUserQue4Ans2, mUserQue4Ans3, mUserQue4Ans4;
    private int mUserQue7Ans1, mUserQue7Ans2, mUserQue7Ans3, mUserQue7Ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        mEditText = findViewById(R.id.question_1);
        mUserQue1Ans = mEditText.getText().toString();
        if (mUserQue1Ans.isEmpty()) {
            mUserQue1Ans = "";
        }
        outState.putString("mUserQue1Ans", mUserQue1Ans);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_2_group);
        mUserQue2Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue2Ans", mUserQue2Ans);
        mRadioGroup = (RadioGroup) findViewById(R.id.question_3_group);
        mUserQue3Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue3Ans", mUserQue3Ans);

        mQuestion4StateAns1 = findViewById(R.id.question_4_option_1);
        if (mQuestion4StateAns1.isChecked()) {
            mUserQue4Ans1 = R.id.question_4_option_1;
        } else {
            mUserQue4Ans1 = -1;
        }
        outState.putInt("mUserQue4Ans1", mUserQue4Ans1);
        mQuestion4StateAns2 = findViewById(R.id.question_4_option_2);
        if (mQuestion4StateAns2.isChecked()) {
            mUserQue4Ans2 = R.id.question_4_option_2;
        } else {
            mUserQue4Ans2 = -1;
        }
        outState.putInt("mUserQue4Ans2", mUserQue4Ans2);
        mQuestion4StateAns3 = findViewById(R.id.question_4_option_3);
        if (mQuestion4StateAns3.isChecked()) {
            mUserQue4Ans3 = R.id.question_4_option_3;
        } else {
            mUserQue4Ans3 = -1;
        }
        outState.putInt("mUserQue4Ans3", mUserQue4Ans3);
        mQuestion4StateAns4 = findViewById(R.id.question_4_option_4);
        if (mQuestion4StateAns4.isChecked()) {
            mUserQue4Ans4 = R.id.question_4_option_4;
        } else {
            mUserQue4Ans4 = -1;
        }
        outState.putInt("mUserQue4Ans4", mUserQue4Ans4);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_5_group);
        mUserQue5Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue5Ans", mUserQue5Ans);
        mRadioGroup = (RadioGroup) findViewById(R.id.question_6_group);
        mUserQue6Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue6Ans", mUserQue6Ans);

        mQuestion7StateAns1 = findViewById(R.id.question_7_option_1);
        if (mQuestion7StateAns1.isChecked()) {
            mUserQue7Ans1 = R.id.question_7_option_1;
        } else {
            mUserQue7Ans1 = -1;
        }
        outState.putInt("mUserQue7Ans1", mUserQue7Ans1);
        mQuestion7StateAns2 = findViewById(R.id.question_7_option_2);
        if (mQuestion7StateAns2.isChecked()) {
            mUserQue7Ans2 = R.id.question_7_option_2;
        } else {
            mUserQue7Ans2 = -1;
        }
        outState.putInt("mUserQue7Ans2", mUserQue7Ans2);
        mQuestion7StateAns3 = findViewById(R.id.question_7_option_3);
        if (mQuestion7StateAns3.isChecked()) {
            mUserQue7Ans3 = R.id.question_7_option_3;
        } else {
            mUserQue7Ans3 = -1;
        }
        outState.putInt("mUserQue7Ans3", mUserQue7Ans3);
        mQuestion7StateAns4 = findViewById(R.id.question_7_option_4);
        if (mQuestion7StateAns4.isChecked()) {
            mUserQue7Ans4 = R.id.question_7_option_4;
        } else {
            mUserQue7Ans4 = -1;
        }
        outState.putInt("mUserQue7Ans4", mUserQue7Ans4);

        mRadioGroup = (RadioGroup) findViewById(R.id.question_8_group);
        mUserQue8Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue8Ans", mUserQue8Ans);
        mRadioGroup = (RadioGroup) findViewById(R.id.question_9_group);
        mUserQue9Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue9Ans", mUserQue9Ans);
        mRadioGroup = (RadioGroup) findViewById(R.id.question_10_group);
        mUserQue10Ans = mRadioGroup.getCheckedRadioButtonId();
        outState.putInt("mUserQue10Ans", mUserQue10Ans);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mEditText = findViewById(R.id.question_1);
        mUserQue1Ans = savedInstanceState.getString("mUserQue1Ans");
        mEditText.setText(mUserQue1Ans);

        mUserQue2Ans = savedInstanceState.getInt("mUserQue2Ans");
        if (mUserQue2Ans != -1) {
            mQuestion2State = findViewById(mUserQue2Ans);
            mQuestion2State.setChecked(true);
        }
        mUserQue3Ans = savedInstanceState.getInt("mUserQue3Ans");
        if (mUserQue3Ans != -1) {
            mQuestion3State = findViewById(mUserQue3Ans);
            mQuestion3State.setChecked(true);
        }

        mUserQue4Ans1 = savedInstanceState.getInt("mUserQue4Ans1");
        if (mUserQue4Ans1 != -1) {
            mQuestion4StateAns1 = findViewById(mUserQue4Ans1);
            mQuestion4StateAns1.setChecked(true);
        }
        mUserQue4Ans2 = savedInstanceState.getInt("mUserQue4Ans2");
        if (mUserQue4Ans2 != -1) {
            mQuestion4StateAns2 = findViewById(mUserQue4Ans2);
            mQuestion4StateAns2.setChecked(true);
        }
        mUserQue4Ans3 = savedInstanceState.getInt("mUserQue4Ans3");
        if (mUserQue4Ans3 != -1) {
            mQuestion4StateAns3 = findViewById(mUserQue4Ans3);
            mQuestion4StateAns3.setChecked(true);
        }
        mUserQue4Ans4 = savedInstanceState.getInt("mUserQue4Ans4");
        if (mUserQue4Ans4 != -1) {
            mQuestion4StateAns4 = findViewById(mUserQue4Ans4);
            mQuestion4StateAns4.setChecked(true);
        }

        mUserQue5Ans = savedInstanceState.getInt("mUserQue5Ans");
        if (mUserQue5Ans != -1) {
            mQuestion5State = findViewById(mUserQue5Ans);
            mQuestion5State.setChecked(true);
        }
        mUserQue6Ans = savedInstanceState.getInt("mUserQue6Ans");
        if (mUserQue6Ans != -1) {
            mQuestion6State = findViewById(mUserQue6Ans);
            mQuestion6State.setChecked(true);
        }

        mUserQue7Ans1 = savedInstanceState.getInt("mUserQue7Ans1");
        if (mUserQue7Ans1 != -1) {
            mQuestion7StateAns1 = findViewById(mUserQue7Ans1);
            mQuestion7StateAns1.setChecked(true);
        }
        mUserQue7Ans2 = savedInstanceState.getInt("mUserQue7Ans2");
        if (mUserQue7Ans2 != -1) {
            mQuestion7StateAns2 = findViewById(mUserQue7Ans2);
            mQuestion7StateAns2.setChecked(true);
        }
        mUserQue7Ans3 = savedInstanceState.getInt("mUserQue7Ans3");
        if (mUserQue7Ans3 != -1) {
            mQuestion7StateAns3 = findViewById(mUserQue7Ans3);
            mQuestion7StateAns3.setChecked(true);
        }
        mUserQue7Ans4 = savedInstanceState.getInt("mUserQue7Ans4");
        if (mUserQue7Ans4 != -1) {
            mQuestion7StateAns4 = findViewById(mUserQue7Ans4);
            mQuestion7StateAns4.setChecked(true);
        }

        mUserQue8Ans = savedInstanceState.getInt("mUserQue8Ans");
        if (mUserQue8Ans != -1) {
            mQuestion8State = findViewById(mUserQue8Ans);
            mQuestion8State.setChecked(true);
        }
        mUserQue9Ans = savedInstanceState.getInt("mUserQue9Ans");
        if (mUserQue9Ans != -1) {
            mQuestion9State = findViewById(mUserQue9Ans);
            mQuestion9State.setChecked(true);
        }
        mUserQue10Ans = savedInstanceState.getInt("mUserQue10Ans");
        if (mUserQue10Ans != -1) {
            mQuestion10State = findViewById(mUserQue10Ans);
            mQuestion10State.setChecked(true);
        }
    }

    /**
     *
     * "submit(View view)" is called when the user will click the submit button which is in "activity_main.xml"
     * Then method will check whether all the questions are attempted or not.
     * If any question is left to be attended, it will call "setToastForSelectAll()" method which will display Toast to user for selecting all.
     * If all the questions are attended, it will calculate "finalScore".
     * After "finalScore" is calculated, it will call displayFinalMessage()"
     */
    public void submit(View view) {
        int temp = 0;
        finalScore = 0;
        temp = question1();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question2();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question3();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question4();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question5();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question6();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question7();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question8();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question9();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }

        temp = question10();
        if (temp == -1) {
            setToastForSelectAll();
            return;
        } else {
            finalScore = finalScore + temp;
        }
        displayFinalMessage();
    }

    private int question1() {
        EditText editText = findViewById(R.id.question_1);
        String userAnswer1 = editText.getText().toString();
        if (userAnswer1.matches("")) {
            return -1;
        } else {
            if (userAnswer1.equals(answer1)) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question2() {
        RadioGroup radioGroup = findViewById(R.id.question_2_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_2_option_4);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question3() {
        RadioGroup radioGroup = findViewById(R.id.question_3_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_3_option_3);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question4() {
        boolean check = false;
        int tempScore = 0;
        CheckBox checkBox1 = findViewById(R.id.question_4_option_1);
        CheckBox checkBox2 = findViewById(R.id.question_4_option_2);
        CheckBox checkBox3 = findViewById(R.id.question_4_option_3);
        CheckBox checkBox4 = findViewById(R.id.question_4_option_4);

        if (checkBox1.isChecked()) {
            check = true;
            tempScore = tempScore + 5;
        }
        if (checkBox2.isChecked()) {
            check = true;
            tempScore = tempScore - 5;
        }
        if (checkBox3.isChecked()) {
            check = true;
            tempScore = tempScore + 5;
        }
        if (checkBox4.isChecked()) {
            check = true;
            tempScore = tempScore - 5;
        }
        if (!check) {
            return -1;
        } else {
            if (tempScore < 0) {
                tempScore = 0;
                return tempScore;
            }
            return tempScore;
        }
    }

    private int question5() {
        RadioGroup radioGroup = findViewById(R.id.question_5_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_5_option_3);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question6() {
        RadioGroup radioGroup = findViewById(R.id.question_6_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_6_option_1);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question7() {
        boolean check = false;
        int tempScore = 0;
        CheckBox checkBox1 = findViewById(R.id.question_7_option_1);
        CheckBox checkBox2 = findViewById(R.id.question_7_option_2);
        CheckBox checkBox3 = findViewById(R.id.question_7_option_3);
        CheckBox checkBox4 = findViewById(R.id.question_7_option_4);
        if (checkBox1.isChecked()) {
            check = true;
            tempScore = tempScore - 5;
        }
        if (checkBox2.isChecked()) {
            check = true;
            tempScore = tempScore + 5;
        }
        if (checkBox3.isChecked()) {
            check = true;
            tempScore = tempScore - 5;
        }
        if (checkBox4.isChecked()) {
            check = true;
            tempScore = tempScore + 5;
        }
        if (!check) {
            return -1;
        } else {
            if (tempScore < 0) {
                tempScore = 0;
                return tempScore;
            }
            return tempScore;
        }
    }

    private int question8() {
        RadioGroup radioGroup = findViewById(R.id.question_8_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_8_option_1);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question9() {
        RadioGroup radioGroup = findViewById(R.id.question_9_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_9_option_3);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    private int question10() {
        RadioGroup radioGroup = findViewById(R.id.question_10_group);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return -1;
        } else {
            RadioButton radioButton = findViewById(R.id.question_10_option_1);
            if (radioButton.isChecked()) {
                return 10;
            } else {
                return 0;
            }
        }
    }

    /**
     *  "displayFinalMessage()" is called from the "submit(View view)"  method.
     *  This method will create Intent and will open "ResultActivity" from the current activity( i.e "MainActivity")
     *  It will also pass the "finalScore" to the ResultActivity using "putExtra()" method.
     */
    private void displayFinalMessage() {
        // Create a new intent to open the {@link ResultActivity}
        Intent numbersIntent = new Intent(MainActivity.this, ResultActivity.class);

        // Start the new activity
        numbersIntent.putExtra("finalScore", finalScore);
        startActivity(numbersIntent);
        finish();
    }

    /**
     *  "setToastForSelectAll()" will be called when any question is not attempted by the user.
     *   It will display Toast message that "YOU MUST ATTEMPT ALL THE QUESTIONS"
     */
    private void setToastForSelectAll() {
        Toast.makeText(this, getString(R.string.attempt_all_ques), Toast.LENGTH_SHORT).show();
    }
}
