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


    /**
     * TODO: Creëer variabelen voor de verschillende textviews
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        // TODO: Initialize textviews
        // Hint: findViewById()

        //TODO: Add a Onclicklistener to the button to start a new activity



        // TODO: Check saved state
        if () {

            // TODO: Recover counter values from saved state

        }

        // TODO: LogCat message



        // TODO: Update user interface using the displayCounts() method


    }

    @Override
    public void onStart() {
        super.onStart();

        // TODO: LogCat message

        // TODO: Update count variable

        // TODO: Update the user interface


    }

    @Override
    public void onResume() {
        super.onResume();


        // TODO: LogCat message

        // TODO: Update the  count variable

        // TODO: Update the user interface


    }

    @Override
    public void onPause() {
        super.onPause();


        // TODO: LogCat message

        // TODO: Update the  count variable

        // TODO: Update the user interface


    }

    @Override
    public void onStop() {
        super.onStop();


        // TODO: LogCat message

        // TODO: Update the  count variable

        // TODO: Update the user interface


    }

    @Override
    public void onRestart() {
        super.onRestart();


        // TODO: LogCat message

        // TODO: Update the  count variable

        // TODO: Update the user interface



    }

    @Override
    public void onDestroy() {
        super.onDestroy();


        // TODO: LogCat message

        // TODO: Update the  count variable

        // TODO: Update the user interface



    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // TODO:  Save the state  using key-value pairs in the Bundle

    }

    // Updates de  counters
    public void displayCounts() {

        // TODO: show the countervariables in the interface

    }
}
