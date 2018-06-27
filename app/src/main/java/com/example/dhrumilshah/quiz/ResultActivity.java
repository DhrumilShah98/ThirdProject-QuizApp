package com.example.dhrumilshah.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private String mDisplayScore;
    private int mFinalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mFinalScore = extras.getInt("finalScore");
        }
        displayResult();

    }

    /**
     *  "onBackPressed()" is called when the back button is pressed on the device.
     *  This method will create an Intent to "MainActivity" and will finish the current activity (i.e "ResultActivity")
     *  It is like restart.
     */
    @Override
    public void onBackPressed() {
        // Create a new intent to open the {@link ResultActivity}
        Intent intent = new Intent(ResultActivity.this, MainActivity.class);

        // Start the new activity
        startActivity(intent);
        finish();
    }

    /**
     *  "displayResult()" will be called from the "onCreate" method.
     *  This method will call the "displayFinalResult" depending on the value of "mFinalScore".
     *  This method is used to select the content for displaying the final result to the user depending on the value of "mFinalScore"
     */
    private void displayResult() {
        if (mFinalScore <= 35) {
            displayFinalResult(R.string.tv1_a, R.drawable.frowning, R.string.tv1_b);
            Toast.makeText(this, getString(R.string.tv1_a) +"  " + mFinalScore  +"  " +  getString(R.string.from_hundred)  + "  " +  getString(R.string.tv1_b), Toast.LENGTH_SHORT).show();
        } else if (mFinalScore > 35 && mFinalScore <= 50) {
            displayFinalResult(R.string.tv2_a, R.drawable.slightly_smiling, R.string.tv2_b);
            Toast.makeText(this, getString(R.string.tv2_a) +"  " + mFinalScore  +"  " +  getString(R.string.from_hundred)  + "  " +  getString(R.string.tv2_b), Toast.LENGTH_SHORT).show();
        } else if (mFinalScore > 50 && mFinalScore <= 75) {
            displayFinalResult(R.string.tv3_a, R.drawable.sunglasses, R.string.tv3_b);
            Toast.makeText(this, getString(R.string.tv3_a) +"  " + mFinalScore +"  " + getString(R.string.from_hundred)  + "  " +  getString(R.string.tv3_b), Toast.LENGTH_SHORT).show();
        } else {
            displayFinalResult(R.string.tv4_a, R.drawable.heart_shaped_eyes, R.string.tv4_b);
            Toast.makeText(this, getString(R.string.tv4_a) + "  " + mFinalScore +"  " + getString(R.string.from_hundred)  + "  " +   getString(R.string.tv4_b), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     *
     * @param tv_a First tag line of the result
     * @param imageView It will display emoji depeding on the value of "mFinalScore"
     * @param tv_b Third tag line of the result
     *             "displayFinalResult" will populate the "activity_result.xml" depending on the "mFinalScore"
     */
    private void displayFinalResult(int tv_a, int imageView, int tv_b) {
        TextView tv;
        ImageView iv;

        tv = findViewById(R.id.text_view_1);
        tv.setText(tv_a);

        tv = findViewById(R.id.text_view_2);
        mDisplayScore = mFinalScore + getString(R.string.from_hundred);
        tv.setText(mDisplayScore);

        iv = findViewById(R.id.image_view_1);
        iv.setImageResource(imageView);

        tv = findViewById(R.id.text_view_3);
        tv.setText(tv_b);
    }

    /**
     * "restart(View view) will be called when RESTART button is pressed from "activity_result.xml"
     * It will restart (create) "MainActivity" again and will destroy the "ResultActivity".
     * This is done using Intent.
     */
    public void restart(View view) {
        // Create a new intent to open the {@link ResultActivity}
        Intent intent = new Intent(ResultActivity.this, MainActivity.class);

        // Start the new activity
        startActivity(intent);
        finish();
    }

    /**
     * "exit(View view) will exit the application"
     */
    public void exit(View view) {
        finish();
        System.exit(0);
    }
}
