package hogent.activitylab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Activity1 extends Activity {


    // String for LogCat documentation
    private final static String TAG = "Activity_1";

    /**
    * TODO: Create counter variables for onCreate(), onRestart(), onStart() and onResume() etc which you increment with every method call
     */
    private int mCreate = 0;
    private int mRestart = 0;
    private int mStart = 0;
    private int mResume = 0;
    private int mPause = 0;
    private int mStop = 0;
    private int mDestroy = 0;

    /**
     * TODO: Creëer variabelen voor de verschillende textviews
     */
    private TextView mCreateView;
    private TextView mStartView;
    private TextView mResumeView;
    private TextView mRestartView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        // TODO: Initialize textviews
        // Hint: findViewById()
        mCreateView = (TextView) findViewById(R.id.create);
        mStartView = (TextView) findViewById(R.id.start);
        mResumeView = (TextView) findViewById(R.id.resume);
        mRestartView = (TextView) findViewById(R.id.restart);

        //TODO: Add a Onclicklistener to the button to start a new activity
        Button btn = (Button) findViewById(R.id.bLaunchActivityTwo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                startActivity(intent);
            }
        });


        // TODO: Check saved state
        if (savedInstanceState != null) {

            // TODO: Recover counter values from saved state
            mCreate = savedInstanceState.getInt("mCreate");
            mStart = savedInstanceState.getInt("mStart");
            mResume = savedInstanceState.getInt("mResume");
            mRestart = savedInstanceState.getInt("mRestart");

        }

        // TODO: LogCat message
        Log.i(TAG,"Create has been called" );

        mCreate++;


        // TODO: Update user interface using the displayCounts() method
        displayCounts();


    }

    @Override
    public void onStart() {
        super.onStart();

        // TODO: LogCat message
        Log.i(TAG, "Start has been called");

        // TODO: Update count variable
        mStart++;

        // TODO: Update the user interface
        displayCounts();


    }

    @Override
    public void onResume() {
        super.onResume();


        // TODO: LogCat message
        Log.i(TAG, "Resume has been called");

        // TODO: Update the  count variable
        mResume++;

        // TODO: Update the user interface
        displayCounts();


    }

    @Override
    public void onPause() {
        super.onPause();


        // TODO: LogCat message
        Log.i(TAG, "Pause has been called");

        // TODO: Update the  count variable
        mPause++;

        // TODO: Update the user interface
        displayCounts();


    }

    @Override
    public void onStop() {
        super.onStop();


        // TODO: LogCat message
        Log.i(TAG, "Stop has been called");

        // TODO: Update the  count variable
        mStop++;

        // TODO: Update the user interface
        displayCounts();


    }

    @Override
    public void onRestart() {
        super.onRestart();


        // TODO: LogCat message
        Log.i(TAG, "Restart has been called");

        // TODO: Update the  count variable
        mRestart++;

        // TODO: Update the user interface
        displayCounts();



    }

    @Override
    public void onDestroy() {
        super.onDestroy();


        // TODO: LogCat message
            Log.i(TAG, "Destroy has been called");

        // TODO: Update the  count variable
            mDestroy++;

        // TODO: Update the user interface
            displayCounts();



    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // TODO:  Save the state  using key-value pairs in the Bundle
        savedInstanceState.putInt("mCreate", mCreate);
        savedInstanceState.putInt("mStart", mStart);
        savedInstanceState.putInt("mResume", mResume);
        savedInstanceState.putInt("mRestart", mRestart);

    }

    // Updates de  counters
    public void displayCounts() {

        // TODO: show the countervariables in the interface
        mCreateView.setText(getResources().getString(R.string.onCreate) + " " + mCreate);
        mStartView.setText(getResources().getString(R.string.onStart) + " " + mStart);
        mResumeView.setText(getResources().getString(R.string.onResume) + " " + mResume);
        mRestartView.setText(getResources().getString(R.string.onRestart) + " " + mRestart);

    }
}
