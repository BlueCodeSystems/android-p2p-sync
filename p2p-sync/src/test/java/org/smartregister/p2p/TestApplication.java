package org.smartregister.p2p;

import android.app.Application;
import io.github.bluecodesystems.p2p.R;

/**
 * Created by Ephraim Kigamba - ekigamba@ona.io on 13/03/2019
 */

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        setTheme(R.style.Theme_AppCompat);
    }
}
