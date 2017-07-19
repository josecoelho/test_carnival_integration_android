package carnivalmobile.testbuildstackdefault;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.carnival.sdk.Carnival;
import com.carnival.sdk.NotificationConfig;

public class MainActivity extends AppCompatActivity {

    private static String SDK_KEY = "CHANGE_THIS_TO_THE_SDK_KEY_HAVING_40CHAR";
    private static String USER_ID = "Change this to your user id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Carnival.startEngine(getApplicationContext(), SDK_KEY);
        Carnival.setUserId(USER_ID, null);

        // uncomment to setDefaultActivity
//        NotificationConfig config = new NotificationConfig();
//        config.setDefaultContentIntent(new Intent(getApplicationContext(), SecondActivity.class), PendingIntent.FLAG_UPDATE_CURRENT, Intent.FLAG_ACTIVITY_NEW_TASK);
//        Carnival.setNotificationConfig(config);

        setContentView(R.layout.activity_main);

        final TextView textViewValue = (TextView) findViewById(R.id.on_create_value);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            textViewValue.setText(extras.getString("show-messages"));
        }
    }

    public void goToSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        final TextView textViewValue = (TextView) findViewById(R.id.on_new_intent_value);

        Bundle extras = intent.getExtras();
        if (extras != null) {
            textViewValue.setText(extras.getString("show-messages"));
        }
    }
}
