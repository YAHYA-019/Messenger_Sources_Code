package com.facebook.messenger.splashscreen;

import X.0FI;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.facebook.base.app.SplashScreenActivity;

/* loaded from: MessengerSplashScreenActivity.class */
public class MessengerSplashScreenActivity extends SplashScreenActivity {
    @Override // com.facebook.base.app.SplashScreenActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int A00 = 0FI.A00(-1948617271);
        super.onCreate(bundle);
        if (isFinishing()) {
            i = 928768493;
        } else {
            View view = new View(this);
            int i2 = 2132411515;
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                i2 = 2132411516;
            }
            view.setBackground(getDrawable(i2));
            setContentView(view);
            int i3 = -1;
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                i3 = -16777216;
            }
            Window window = getWindow();
            if (window != null) {
                window.setStatusBarColor(i3);
                window.setNavigationBarColor(i3);
                int i4 = 1280;
                if ((getResources().getConfiguration().uiMode & 48) != 32) {
                    i4 = 1296;
                }
                window.getDecorView().setSystemUiVisibility(i4);
            }
            i = -80908058;
        }
        0FI.A07(i, A00);
    }
}
