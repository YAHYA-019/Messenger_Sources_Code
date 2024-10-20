package com.facebook.base.app;

import X.0FI;
import X.AnonymousClass001;
import X.C04z;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.common.dextricks.Constants;
import com.facebook.messenger.splashscreen.MessengerSplashScreenActivity;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: RedirectHackActivity.class */
public final class RedirectHackActivity extends Activity {
    public long A00;
    public Bundle A01;
    public ArrayList A02;
    public Random A03;
    public boolean A04;
    public boolean A05;

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 773972459 && i2 == 1062849428) {
            onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        long nextLong;
        long nextLong2;
        Intent intent;
        int A00 = 0FI.A00(-1005546775);
        super.onCreate(null);
        getApplication();
        if (!isTaskRoot() && (intent = getIntent()) != null && intent.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction())) {
            Log.i("RedirectHackActivity", "finishing falsely relaunched activity");
            finish();
        }
        Random random = this.A03;
        if (random == null) {
            random = new Random();
            this.A03 = random;
        }
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        this.A00 = nextLong;
        C04z A02 = C04z.A02();
        A02.A0V.add(this);
        setVisible(false);
        Random random2 = this.A03;
        if (random2 == null) {
            random2 = new Random();
            this.A03 = random2;
        }
        do {
            nextLong2 = random2.nextLong();
        } while (nextLong2 == 0);
        ComponentName component = getIntent().getComponent();
        if (component != null) {
            component.getClassName();
        }
        getApplication();
        Intent intent2 = new Intent(this, (Class<?>) MessengerSplashScreenActivity.class);
        intent2.setAction("com.facebook.showSplashScreen");
        intent2.setFlags(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        intent2.putExtra("com.facebook.base.app.originalIntent", getIntent());
        intent2.putExtra("com.facebook.base.app.rhaId", this.A00);
        intent2.putExtra("com.facebook.base.app.splashId", nextLong2);
        A02.A0T.add(Long.valueOf(nextLong2));
        startActivityForResult(intent2, 773972459);
        this.A05 = true;
        0FI.A07(413550012, A00);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        int A00 = 0FI.A00(367146704);
        getApplication();
        this.A04 = true;
        C04z.A02().A0V.remove(this);
        super.onDestroy();
        0FI.A07(278752514, A00);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ArrayList arrayList = this.A02;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            this.A02 = arrayList;
        }
        arrayList.add(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-239484482);
        getApplication();
        super.onPause();
        0FI.A07(-157782030, A00);
    }

    @Override // android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(511167703);
        super.onResume();
        getApplication();
        0FI.A07(-1983298760, A00);
    }

    @Override // android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(738071358);
        super.onStart();
        getApplication();
        this.A05 = false;
        0FI.A07(1172710205, A00);
    }

    @Override // android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(-451427131);
        getApplication();
        this.A05 = true;
        super.onStop();
        0FI.A07(1315835858, A00);
    }
}
