package carnivalmobile.testbuildstackdefault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView textViewValue = (TextView) findViewById(R.id.second_on_new_intent);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            textViewValue.setText(extras.getString("show-messages"));
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        final TextView textViewValue = (TextView) findViewById(R.id.second_on_new_intent);

        Bundle extras = intent.getExtras();
        if (extras != null) {
            textViewValue.setText(extras.getString("show-messages"));
        }
    }

}
