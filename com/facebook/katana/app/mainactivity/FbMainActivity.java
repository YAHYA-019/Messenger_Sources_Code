package com.facebook.katana.app.mainactivity;

import X.0Dq;
import X.0FI;
import X.0Fb;
import X.0Zi;
import X.0kQ;
import X.11T;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.messenger.app.MessengerApplication;
import com.facebook.perf.background.BackgroundStartupDetector;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: FbMainActivity.class */
public final class FbMainActivity extends Activity {
    public 0kQ A00;
    public Intent A01;
    public Bundle A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0c3] */
    static {
        0Dq.A00 = new Object() { // from class: X.0c3
        };
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = 0FI.A00(60648454);
        this.A01 = getIntent();
        if (bundle != null) {
            this.A02 = bundle;
        }
        0Fb.A00.add(new WeakReference(this));
        if (0Zi.A01(this).A3F) {
            getWindow().clearFlags(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
            Field declaredField = Window.class.getDeclaredField("mHardwareAccelerated");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.set(getWindow(), false);
            }
        }
        super.onCreate(null);
        Object application = getApplication();
        11T.A0I(application, "null cannot be cast to non-null type com.facebook.base.app.NonBlockingApplication");
        0kQ r0 = new 0kQ(this, (MessengerApplication) application);
        this.A00 = r0;
        r0.A04();
        BackgroundStartupDetector backgroundStartupDetector = BackgroundStartupDetector.A0H;
        if (backgroundStartupDetector != null) {
            backgroundStartupDetector.onActivityCreated(this, null);
        }
        0FI.A07(634873428, A00);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        if (this.A02 != null) {
            bundle.clear();
            bundle.putAll(this.A02);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(1964188591);
        super.onStart();
        0Fb.A01.incrementAndGet();
        0FI.A07(-1681412058, A00);
    }

    @Override // android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(1973764619);
        super.onStop();
        0Fb.A01.decrementAndGet();
        0FI.A07(-1920910454, A00);
    }
}
