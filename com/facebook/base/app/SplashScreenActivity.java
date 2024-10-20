package com.facebook.base.app;

import X.0FI;
import X.0HK;
import X.C04z;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: SplashScreenActivity.class */
public abstract class SplashScreenActivity extends Activity {
    public int A00;
    public long A01;
    public long A02;
    public Intent A03;
    public boolean A04;
    public boolean A05;

    public static void A00(ViewTreeObserver viewTreeObserver, SplashScreenActivity splashScreenActivity) {
        viewTreeObserver.addOnDrawListener(new 0HK(viewTreeObserver, splashScreenActivity));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext().getApplicationContext();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A00(getWindow().getDecorView().getViewTreeObserver(), this);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        setResult(1062849428);
        super.onBackPressed();
        C04z.A02().A0Q = true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = 0FI.A00(-1048628720);
        super.onCreate(null);
        Intent intent = getIntent();
        this.A03 = intent;
        this.A02 = intent.getLongExtra("com.facebook.base.app.splashId", 0L);
        this.A01 = this.A03.getLongExtra("com.facebook.base.app.rhaId", 0L);
        C04z A02 = C04z.A02();
        getApplication();
        boolean z = true;
        long j = this.A02;
        long j2 = this.A01;
        A02.A0T.remove(Long.valueOf(j));
        Iterator it = A02.A0V.iterator();
        while (true) {
            if (!it.hasNext()) {
                finish();
                overridePendingTransition(0, R.anim.fade_out);
                z = false;
                break;
            } else if (((RedirectHackActivity) it.next()).A00 == j2) {
                ArrayList arrayList = A02.A0U;
                synchronized (arrayList) {
                    arrayList.add(this);
                }
                break;
            }
        }
        if (!isFinishing()) {
            this.A00 = 1;
        }
        if (!z && !isFinishing() && this.A03 != null) {
            this.A03 = null;
        }
        0FI.A07(2009630515, A00);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        int A00 = 0FI.A00(-1340489811);
        this.A00 = 0;
        C04z A02 = C04z.A02();
        getApplication();
        ArrayList arrayList = A02.A0U;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
        super.onDestroy();
        0FI.A07(-147085439, A00);
    }

    @Override // android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(1688926624);
        this.A00 = 2;
        C04z A02 = C04z.A02();
        getApplication();
        A02.A0C++;
        super.onPause();
        0FI.A07(675034844, A00);
    }

    @Override // android.app.Activity
    public void onRestart() {
        int A00 = 0FI.A00(58502865);
        super.onRestart();
        C04z.A02().A0D++;
        0FI.A07(2142645999, A00);
    }

    @Override // android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1587993587);
        super.onResume();
        this.A00 = 3;
        C04z.A02();
        getApplication();
        0FI.A07(-1562040553, A00);
    }

    @Override // android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(472043040);
        super.onStart();
        this.A00 = 2;
        C04z.A02();
        getApplication();
        0FI.A07(-1758357729, A00);
    }

    @Override // android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(-1540660584);
        this.A00 = 1;
        this.A05 = true;
        super.onStop();
        C04z A02 = C04z.A02();
        getApplication();
        A02.A0F++;
        0FI.A07(-342889990, A00);
    }
}
