package com.facebook.messenger.neue;

import X.03Y;
import X.06Z;
import X.0Cj;
import X.0FI;
import X.0Q8;
import X.0S2;
import X.0Zh;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Fv;
import X.1IG;
import X.1Lo;
import X.2LI;
import X.2LK;
import X.2LL;
import X.2LM;
import X.2LQ;
import X.2Od;
import X.2Q4;
import X.2Q7;
import X.AnonymousClass001;
import X.C00i;
import X.C06u;
import X.C1F6;
import X.C1kx;
import X.C1lM;
import X.C1xf;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.classmarkers.ClassMarkerLoader;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: MainActivity.class */
public class MainActivity extends FbFragmentActivity implements 2LI, C1lM, 2LK, C1xf, 0Cj, C1kx, CallerContextable, 2LL {
    public C06u A00;
    public C00i A01;
    public int A02;
    public 2LQ A03;
    public boolean A04;
    public boolean A05;
    public final C00i A06;

    public MainActivity() {
        C06u c06u = new C06u();
        this.A00 = c06u;
        c06u.A0Q(this, new 2LM(this));
        this.A05 = false;
        this.A06 = new 1BQ(85048);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2X() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CHt();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.Bjb(fragment);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public View A2c(int i) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        View BJx = c06u.BJx(i);
        11T.A0A(BJx);
        return BJx;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public Object A2i(Class cls) {
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.Ari(cls);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onActivityDestroy();
        ((MessagingPerformanceLogger) this.A06.get()).A0g = true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2m() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.Bhn();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2n() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.Bkf();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2o() {
        if (!this.A05) {
            this.A04 = true;
        }
        this.A05 = true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2p() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.A0P();
        super.A2p();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2w(Context context) {
        0fH.A0j("MainActivity", "onBaseContextAttached");
        ClassMarkerLoader.loadIsMessengerStartupBeginMarker();
        this.A01 = new 1BV(32821);
        FbUserSession A05 = ((1Fv) 1Bi.A03(66351)).A05(this);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(17163);
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.A00.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            2LQ r0 = new 2LQ(this, A05);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A00 = r0;
            r0.A0Q(this, new 2LM(this));
            this.A03 = r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        11T.A0F(intent, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.Bhl(intent);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.Bhh(bundle);
        this.A02 = ((2Q4) 1Lo.A04(this, ((1Fv) 1Bi.A03(66351)).A05(this), (1BY) null, 17015)).A00();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setAccessibilityDelegate(new 2Q7(this));
        }
        ((MessagingPerformanceLogger) this.A06.get()).A0e("MainActivity_onCreate_end");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.Bl1(bundle);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A30(Bundle bundle) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.Bl3(bundle);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.BlM(bundle);
        ((MessagingPerformanceLogger) this.A06.get()).A0e("MainActivity_onCreate_begin");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A37() {
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.D3g();
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A3A(03Y r302) {
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.CyH(r302);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    public boolean ADk() {
        return this.A03.ADk();
    }

    @Override // X.C1lM
    public Map AWe() {
        Map AWe = this.A03.AWe();
        if (AWe == null) {
            AWe = new HashMap();
        }
        AWe.put("badge_number", Integer.valueOf(this.A02));
        return AWe;
    }

    public String AWg() {
        return this.A03.AWg();
    }

    @Override // X.C1xf
    public Integer Ac6() {
        return 0S2.A00;
    }

    public ThreadKey Afy() {
        return this.A03.Afy();
    }

    public Map Agf() {
        Map Agf;
        HashMap A0u = AnonymousClass001.A0u();
        0fH.A0j("MainActivity", "getDebugInfo");
        for (2LK r0 : BDe().A0T.A0A()) {
            if ((r0 instanceof 2Od) && (Agf = r0.Agf()) != null) {
                A0u.putAll(Agf);
            }
        }
        0fH.A0g(A0u, "MainActivity", "getDebugInfo %s");
        return A0u;
    }

    public Long Am7() {
        return null;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.B5M(obj);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, X.C1em, X.C06v
    public 06Z BDe() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        06Z BDe = c06u.BDe();
        11T.A0A(BDe);
        return BDe;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, X.C1ep
    public boolean BMe(Throwable th) {
        11T.A0F(th, 0);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.BMe(th);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    public void Bl7(int i) {
        this.A03.Bl7(i);
    }

    public void CMO(int i, int i2, int i3, int i4, boolean z) {
        this.A03.CMO(i, i2, i3, i4, z);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void CcH(1IG r302) {
        11T.A0F(r302, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CcH(r302);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0F(obj, 0);
        11T.A0F(obj2, 1);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CtX(obj, obj2);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        11T.A0F(keyEvent, 0);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.dispatchKeyEvent(keyEvent);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.dispatchTouchEvent(motionEvent);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        11T.A0G(str, 0, printWriter);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finishFromChild(Activity activity) {
        11T.A0F(activity, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.AT5(activity);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public Intent getIntent() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        Intent intent = c06u.getIntent();
        11T.A0A(intent);
        return intent;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public LayoutInflater getLayoutInflater() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        LayoutInflater AtU = c06u.AtU();
        11T.A0A(AtU);
        return AtU;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public MenuInflater getMenuInflater() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        MenuInflater Awc = c06u.Awc();
        11T.A0A(Awc);
        return Awc;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        Resources B7l = c06u.B7l();
        11T.A0A(B7l);
        return B7l;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        11T.A0F(str, 0);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.BE6(str);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public Window getWindow() {
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.BKo();
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean hasWindowFocus() {
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.BNm();
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onActivityResult(i, i2, intent);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.ContextThemeWrapper
    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        11T.A0F(theme, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.BjK(theme, i, z);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onAttachedToWindow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onConfigurationChanged(configuration);
        if (!this.A04) {
            recreate();
        }
        this.A04 = false;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onContentChanged();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        11T.A0F(menuItem, 0);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.BrS(menuItem);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        11T.A0H(contextMenu, view);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public Dialog onCreateDialog(int i) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        Dialog Brp = c06u.Brp(i);
        11T.A0A(Brp);
        return Brp;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        11T.A0F(menu, 0);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.Brv(menu);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public View onCreatePanelView(int i) {
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.onCreatePanelView(i);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        11T.A0F(keyEvent, 1);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.onKeyDown(i, keyEvent);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        11T.A0F(keyEvent, 1);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.onKeyLongPress(i, keyEvent);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        11T.A0F(keyEvent, 1);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.onKeyUp(i, keyEvent);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onLowMemory();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.C82(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        11T.A0F(menuItem, 0);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.CAH(menuItem);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-40861928);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onPause();
        0FI.A07(-779747833, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        11T.A0F(configuration, 1);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CBj(z, configuration);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CCw(bundle);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CD1();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onPrepareDialog(int i, Dialog dialog) {
        11T.A0F(dialog, 1);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CDI(i, dialog);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        11T.A0F(menu, 0);
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.CDS(menu);
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        11T.A0F(strArr, 1);
        11T.A0F(iArr, 2);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CH2(i, strArr, iArr);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(279891343);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onResume();
        0FI.A07(538970676, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onSaveInstanceState(bundle);
        0Zh.A00(getApplicationContext());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        C06u c06u = this.A00;
        if (c06u != null) {
            return c06u.onSearchRequested();
        }
        1BK.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-531876491);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onStart();
        0FI.A07(-1137686555, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(-565756428);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onStop();
        0FI.A07(-680968360, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        11T.A0F(charSequence, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CQk(charSequence, i);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onTrimMemory(i);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onUserInteraction() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CTH();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onUserLeaveHint() {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CTK();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.onWindowFocusChanged(z);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CnO(i);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.CnP(view);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void setIntent(Intent intent) {
        11T.A0F(intent, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.Cq2(intent);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i) {
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.Cu1(i);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        11T.A0F(intent, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.D1P(intent);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        11T.A0F(intent, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.D1Q(intent, bundle);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        11T.A0F(intent, 0);
        C06u c06u = this.A00;
        if (c06u == null) {
            1BK.A1H();
            throw 0Q8.createAndThrow();
        }
        c06u.startActivityForResult(intent, i);
    }
}
