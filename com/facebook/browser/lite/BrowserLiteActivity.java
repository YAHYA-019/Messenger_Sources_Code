package com.facebook.browser.lite;

import X.0FI;
import X.0fH;
import X.11T;
import X.1BK;
import X.7zU;
import X.AbE;
import X.AbstractC3252Jnp;
import X.AnonymousClass001;
import X.C06c;
import X.DKB;
import X.DKD;
import X.FIb;
import X.JgX;
import X.KSB;
import X.KVg;
import X.KVn;
import X.KlQ;
import X.Kpb;
import X.L9d;
import X.LAK;
import X.LCd;
import X.LDF;
import X.MC8;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: BrowserLiteActivity.class */
public class BrowserLiteActivity extends FragmentActivity implements MC8 {
    public Resources A01;
    public JgX A02;
    public KVg A03;
    public LDF A04;
    public Kpb A05;
    public boolean A06;
    public boolean A07;
    public double A00 = 1.0d;
    public final LAK A08 = new LAK();

    private long A00() {
        long longExtra = getIntent().getLongExtra("BrowserLiteIntent.HANDLE_INTENT_START_TIME", 0L);
        if (longExtra > 0) {
            this.A08.A04("BLIH.Intent_Creation", longExtra);
        }
        return longExtra;
    }

    public static /* synthetic */ WindowInsets A01(View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsets.CONSUMED;
    }

    private void A02() {
        Locale locale = (Locale) getIntent().getSerializableExtra(DKB.A00(68));
        if (locale != null) {
            Configuration configuration = this.A01.getConfiguration();
            if (locale.equals(configuration.locale)) {
                return;
            }
            configuration.locale = locale;
            Resources resources = this.A01;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            Locale.setDefault(locale);
        }
    }

    public static void A03(Bundle bundle, BrowserLiteActivity browserLiteActivity, String str, int i) {
        JgX jgX = browserLiteActivity.A02;
        if (jgX != null) {
            jgX.A0X(i);
            if (browserLiteActivity.getCallingActivity() != null) {
                browserLiteActivity.setResult(browserLiteActivity.A02.A00, new Intent(browserLiteActivity.getIntent()).putExtra("KEY_URL", str).putExtra("last_tap_point", i).putExtra(AbE.A00(523), browserLiteActivity.A02.A0i).putExtras(bundle));
            }
        }
        browserLiteActivity.finish();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        11T.A0F(context, 0);
        Resources resources = context.getResources();
        11T.A0A(resources);
        this.A01 = resources;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (FIb.A04(printWriter, str, strArr)) {
            return;
        }
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        int i = KSB.A00 - 1;
        KSB.A00 = i;
        if (i < 0) {
            LCd.A05("ActivityCounter", "sCounter = %d < 0! This should not happen!", AnonymousClass001.A1a(i));
        }
        boolean booleanExtra = getIntent().getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_SHOULD_FORCE_SOFT_KEYBOARD_CLOSE_ON_BROWSER_EXIT", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_DISMISS_SOFT_KEYBOARD_ON_FINISH", false);
        if (booleanExtra || booleanExtra2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
            View currentFocus = getCurrentFocus();
            if (inputMethodManager != null && currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        if (KSB.A00 == 0 && !this.A07) {
            try {
                Pattern pattern = L9d.A01;
                KVn.A00().Ce0((KlQ) null);
            } catch (PackageManager.NameNotFoundException | Exception unused) {
            }
        }
        int[] intArrayExtra = getIntent().getIntArrayExtra("BrowserLiteIntent.EXTRA_ANIMATION");
        if (intArrayExtra == null || intArrayExtra.length != 4) {
            return;
        }
        overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.A01;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        JgX jgX = this.A02;
        List list = jgX.A0n;
        if (list != null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            LAK A00 = LAK.A00(jgX, "onActionModeFinished", A0k);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            LAK.A02(A00, A0k);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        JgX jgX = this.A02;
        List list = jgX.A0n;
        if (list != null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            LAK A00 = LAK.A00(jgX, "onActionModeStarted", A0k);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            LAK.A02(A00, A0k);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        JgX jgX = this.A02;
        if (jgX != null) {
            jgX.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        JgX jgX = this.A02;
        if (jgX == null) {
            A03(1BK.A05(), this, null, 2);
        } else {
            if (jgX.A0h(true)) {
                return;
            }
            this.A02.A0Z(2, (String) null);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a2, code lost:
    
        if (r312.isEmpty() == false) goto L44;
     */
    /* JADX WARN: Type inference failed for: r0v216, types: [X.KSk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [X.KVg, java.lang.Object] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int A00 = 0FI.A00(1494063891);
        super.onDestroy();
        isFinishing();
        0FI.A07(106872659, A00);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C06c A0D;
        int i = 4;
        if (AnonymousClass001.A1T(intent.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_HISTORY_ITEM_ID"))) {
            JgX jgX = this.A02;
            JgX.A0I(jgX, "NEW_INTENT_FROM_LINK_HISTORY");
            jgX.A0X(4);
            Bundle A05 = 1BK.A05();
            this.A02.A0T().putExtra("BrowserLiteIntent.EXTRA_ON_SAVED_INSTANCE_STATE_ENABLED", true);
            this.A02.onSaveInstanceState(A05);
            A0D = 7zU.A0D(this);
            A0D.A0I(this.A02);
            setIntent(intent);
            A00();
            this.A02 = new JgX();
            A05.putParcelable("BrowserLiteIntent.ACTIVITY_INTENT", intent);
            this.A02.setArguments(A05);
        } else {
            if (intent.getData().equals(getIntent().getData())) {
                return;
            }
            if ("browser_tab_selection".equals(intent.getStringExtra("iab_click_source"))) {
                i = 13;
            }
            JgX jgX2 = this.A02;
            if (i == 4) {
                JgX.A0I(jgX2, "NEW_INTENT");
            }
            jgX2.A0X(i);
            A0D = 7zU.A0D(this);
            A0D.A0I(this.A02);
            setIntent(intent);
            A00();
            if (i == 13 && intent.getBooleanExtra("BrowserLiteIntent.PERFORMANCE_LOGGER_SKIP_LOGGING", false)) {
                this.A08.A03("BLA.onNewIntent.skipLog");
            }
            JgX jgX3 = new JgX();
            this.A02 = jgX3;
            Bundle A052 = 1BK.A05();
            A052.putParcelable("BrowserLiteIntent.ACTIVITY_INTENT", intent);
            jgX3.setArguments(A052);
        }
        A0D.A0P(this.A02, "BROWSER_LITE_FRAGMENT_TAG", 2131362655);
        A0D.A05();
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        0fH.A0o("BrowserLiteActivity", "Try to commit fragment when activity is not created");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Fragment A0b;
        int A00 = 0FI.A00(118453648);
        super.onPause();
        if (this.A03 != null && (A0b = BDe().A0b("rageshake_listener_fragment")) != null) {
            A0b.onPause();
        }
        0FI.A07(-1056468934, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        BrowserLiteWebChromeClient A05;
        super.onRequestPermissionsResult(i, strArr, iArr);
        AbstractC3252Jnp A0U = this.A02.A0U();
        if (A0U == null || (A05 = A0U.A05()) == null) {
            return;
        }
        A05.A06(i, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Fragment A0b;
        int A00 = 0FI.A00(-1240128304);
        super.onResume();
        if (this.A03 != null && (A0b = BDe().A0b("rageshake_listener_fragment")) != null) {
            A0b.onResume();
        }
        if (this.A06) {
            Window window = getWindow();
            View A0B = DKD.A0B(this);
            A0B.setSystemUiVisibility(A0B.getSystemUiVisibility() | 4);
            window.setFlags(1024, 1024);
        }
        0FI.A07(-259344038, A00);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        if (this.A02 != null) {
            this.A04.A0B(this.A02.A09, Collections.singletonMap("action", "ig_browser_touch_interaction"));
        }
        Kpb kpb = this.A05;
        JgX jgX = this.A02;
        kpb.A00(jgX == null ? null : jgX.A09);
        super.onUserInteraction();
    }
}
