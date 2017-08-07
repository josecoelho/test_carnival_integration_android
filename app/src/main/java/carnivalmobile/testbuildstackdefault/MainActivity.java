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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
