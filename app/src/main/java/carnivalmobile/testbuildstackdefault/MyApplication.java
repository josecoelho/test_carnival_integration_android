package carnivalmobile.testbuildstackdefault;

import android.app.Application;

import com.carnival.sdk.Carnival;

/**
 * Created by josecoelho on 07/08/17.
 */

public class MyApplication extends Application {

    private static String SDK_KEY = "CHANGE_THIS_TO_THE_SDK_KEY_HAVING_40CHAR";
    private static String USER_ID = "Change this to your user id";

    @Override
    public void onCreate() {
        super.onCreate();

        Carnival.startEngine(getApplicationContext(), SDK_KEY);
        Carnival.setUserId(USER_ID, null);

        // uncomment to setDefaultActivity
//        NotificationConfig config = new NotificationConfig();
//        config.setDefaultContentIntent(new Intent(getApplicationContext(), SecondActivity.class), PendingIntent.FLAG_UPDATE_CURRENT, Intent.FLAG_ACTIVITY_NEW_TASK);
//        Carnival.setNotificationConfig(config);
    }

}
