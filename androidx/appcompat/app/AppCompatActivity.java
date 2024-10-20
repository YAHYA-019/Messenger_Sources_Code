package androidx.appcompat.app;

import X.0FI;
import X.11T;
import X.6BN;
import X.6QM;
import X.6QN;
import X.C1ol;
import X.DKD;
import X.JXV;
import X.LLN;
import X.LLe;
import X.LRS;
import X.MBp;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

/* loaded from: AppCompatActivity.class */
public abstract class AppCompatActivity extends FragmentActivity implements 6BN, MBp {
    public 6QM A00;

    public AppCompatActivity() {
        this.savedStateRegistryController.A01.A02(new LRS(this, 0), "androidx:appcompat");
        A2U(new LLN(this));
    }

    private void A00() {
        ViewTreeLifecycleOwner.set(DKD.A0B(this), this);
        ViewTreeViewModelStoreOwner.set(DKD.A0B(this), this);
        C1ol.A01(DKD.A0B(this), this);
        View A0B = DKD.A0B(this);
        11T.A0F(A0B, 0);
        A0B.setTag(2131368401, this);
    }

    public 6QM A2c() {
        6QN r302 = this.A00;
        if (r302 == null) {
            boolean z = 6QM.A04;
            r302 = new 6QN(this, (Window) null, this, this);
            this.A00 = r302;
        }
        return r302;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00();
        A2c().A0T(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(A2c().A0W(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        6QN A2c = A2c();
        6QN.A0E(A2c);
        LLe lLe = A2c.A0K;
        if (getWindow().hasFeature(0)) {
            if (lLe != null) {
                Interpolator interpolator = LLe.A0S;
            }
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        6QN A2c = A2c();
        6QN.A0E(A2c);
        LLe lLe = A2c.A0K;
        if (keyCode == 82 && lLe != null) {
            Interpolator interpolator = LLe.A0S;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        6QN A2c = A2c();
        6QN.A0C(A2c);
        return A2c.A0A.findViewById(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        6QN A2c = A2c();
        JXV jxv = A2c.A07;
        if (jxv == null) {
            6QN.A0E(A2c);
            LLe lLe = A2c.A0K;
            jxv = new JXV(lLe != null ? lLe.A02() : A2c.A0j);
            A2c.A07 = jxv;
        }
        return jxv;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        A2c().A0J();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A2c().A0K();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int A00 = 0FI.A00(-112121549);
        super.onDestroy();
        A2c().A0M();
        0FI.A07(160187004, A00);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (r306 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        r305 = r306.getComponent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (r305 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        r305 = r306.resolveActivity(getPackageManager());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        r0 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
    
        r0 = X.L9E.A01(r305, r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
    
        r305 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
    
        if (r305 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        r0.add(r0, r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r0 = X.L9E.A01(r305.getComponent(), r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
    
        r0.add(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0102, code lost:
    
        X.Liy.A00(r301, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010b, code lost:
    
        finishAffinity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        r306 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        throw new java.lang.IllegalArgumentException(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
    
        if (r306 != null) goto L20;
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onMenuItemSelected(int r302, android.view.MenuItem r303) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.onMenuItemSelected(int, android.view.MenuItem):boolean");
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        6QN.A0C(A2c());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        A2c().A0O();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-1109923859);
        super.onStart();
        A2c().A0P();
        0FI.A07(476223630, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(-200454610);
        super.onStop();
        A2c().A0Q();
        0FI.A07(-1510167227, A00);
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A2c().A0V(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        6QN A2c = A2c();
        6QN.A0E(A2c);
        LLe lLe = A2c.A0K;
        if (getWindow().hasFeature(0)) {
            if (lLe != null) {
                Interpolator interpolator = LLe.A0S;
            }
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        A00();
        A2c().A0R(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        A00();
        A2c().A0S(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00();
        A2c().A0U(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        A2c().A03 = i;
    }
}
