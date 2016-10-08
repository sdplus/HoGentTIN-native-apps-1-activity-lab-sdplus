package hogent.activitylab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity {



    // String voor LogCat documentatie
    private final static String TAG = "Activity_2";



    /**
     * TODO: Creëer counter variabelen voor onCreate(), onRestart(), onStart() and
     * onResume() etc.
     * Je moet deze variabelen incremeteren elke keer de overeenkomstige methode opgeroepen wordt
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


    // TODO: Creëer variabelen voor de verschillende textviews

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        // TODO: initialiseer de correcte TextViews
        // Hint: findViewById()
        // textView1 = (TextView) findViewById(R.id.textView1);
        mCreateView = (TextView) findViewById(R.id.create);
        mStartView = (TextView) findViewById(R.id.start);
        mResumeView = (TextView) findViewById(R.id.resume);
        mRestartView = (TextView) findViewById(R.id.restart);


        //TODO: voeg een Onclicklistener toe aan de button om de activity te stoppen
        Button btnClose = (Button) findViewById(R.id.bClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        // TODO: Check voor gesavede state
        if (savedInstanceState != null) {

            // TODO: Herstel waarde van de counters van de  saved state
            mCreate = savedInstanceState.getInt("mCreate");
            mStart = savedInstanceState.getInt("mStart");
            mResume = savedInstanceState.getInt("mResume");
            mRestart = savedInstanceState.getInt("mRestart");

        }

        // TODO: LogCat message
        Log.i(TAG, "Create has been called");

        // TODO:Update voor de variabelen
        mCreate++;


        // TODO: Update de user interface via de displayCounts() methode
        displayCounts();


    }

    // Lifecycle callback methods overrides

    @Override
    public void onStart() {
        super.onStart();

        // TODO: Emit LogCat message
        Log.i(TAG, "Start has been called");

        // TODO:
        // Update voor de variabelen
        // Update de user interface via de displayCounts() methode
        mStart++;
        displayCounts();

    }

    @Override
    public void onResume() {
        super.onResume();

        // TODO: LogCat message
        Log.i(TAG, "Resume has been called");

        // TODO: Update de  count variable
        mResume++;

        // TODO: Update the user interfac
        displayCounts();


    }

    @Override
    public void onPause() {
        super.onPause();

        // TODO: LogCat message
        Log.i(TAG, "Pause has been called");

        // TODO: Update de  count variable
        mPause++;

        // TODO: Update the user interfac
        displayCounts();


    }

    @Override
    public void onStop() {
        super.onStop();

        // TODO: LogCat message
        Log.i(TAG, "Stop has been called");

        // TODO: Update de  count variable
        mStop++;

        // TODO: Update the user interfac
        displayCounts();


    }

    @Override
    public void onRestart() {
        super.onRestart();

        // TODO: LogCat message
        Log.i(TAG, "Restart has been called");

        // TODO: Update de  count variable
        mRestart++;

        // TODO: Update the user interfac
        displayCounts();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // TODO: LogCat message
        Log.i(TAG, "Destroy has been called");

        // TODO: Update de  count variable
        mDestroy++;

        // TODO: Update the user interfac
        displayCounts();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // TODO:  Save de state  met key-value pairs in de Bundle

        savedInstanceState.putInt("mCreate", mCreate);
        savedInstanceState.putInt("mStart", mStart);
        savedInstanceState.putInt("mResume", mResume);
        savedInstanceState.putInt("mRestart", mRestart);



    }

    // Updates the displayed counters
    public void displayCounts() {

        // TODO: zet de countervariabelen correct in de activity
        mCreateView.setText(getResources().getString(R.string.onCreate) + " " + mCreate);
        mStartView.setText(getResources().getString(R.string.onStart) + " " + mStart);
        mResumeView.setText(getResources().getString(R.string.onResume) + " " + mResume);
        mRestartView.setText(getResources().getString(R.string.onRestart) + " " + mRestart);

    }
}
