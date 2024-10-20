package com.facebook.base.activity;

import X.03Y;
import X.06Z;
import X.0FI;
import X.0S2;
import X.11T;
import X.1IG;
import X.1IM;
import X.1gM;
import X.1iF;
import X.6QM;
import X.AnonymousClass025;
import X.C06t;
import X.C06u;
import X.C06v;
import X.C0k4;
import X.C1em;
import X.C1en;
import X.C1eo;
import X.C1ep;
import X.C1eq;
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
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.FbFragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: FbFragmentActivity.class */
public class FbFragmentActivity extends FragmentActivity implements C1em, C1en, AnonymousClass025, C1eo, C1ep, 1IM, C1eq {
    public 6QM appCompatDelegateInternal;
    public C06u cachedDelegate;
    public final AtomicInteger fullscreenOverlayStackCounter = new AtomicInteger(0);
    public boolean isDarkMode;
    public 03Y lastWindowSizeClass;
    public boolean launchedWithSavedInstanceState;
    public boolean suppressLifecycleSuperCalls;

    public FbFragmentActivity() {
        super.setIntent(new Intent());
    }

    public static final void A0Q(FbFragmentActivity fbFragmentActivity) {
        fbFragmentActivity.appCompatDelegateInternal = 6QM.A00(fbFragmentActivity);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void A2X() {
        A2e().CHt();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        11T.A0F(fragment, 0);
        A2e().Bjb(fragment);
    }

    public View A2c(int i) {
        View BJx = A2e().BJx(i);
        11T.A0A(BJx);
        return BJx;
    }

    public final 6QM A2d() {
        return this.appCompatDelegateInternal;
    }

    public final C06u A2e() {
        C06u c06u = this.cachedDelegate;
        if (c06u == null) {
            c06u = new C06t(this);
            this.cachedDelegate = c06u;
            c06u.A0Q(this, new C06v() { // from class: X.075
                @Override // X.C1en
                public void A5D(1gM r302) {
                }

                @Override // X.C06v
                public void AAx(Context context) {
                }

                @Override // X.C06v
                public void AGS() {
                    super/*android.app.Activity*/.closeOptionsMenu();
                }

                @Override // X.C06v
                public void AT5(Activity activity) {
                    super/*android.app.Activity*/.finishFromChild(activity);
                }

                @Override // X.C06v
                public Object Ari(Class cls) {
                    throw AnonymousClass001.A0N("getInterface() is not supported in FbFragmentActivity");
                }

                @Override // X.C06v
                public LayoutInflater AtU() {
                    LayoutInflater layoutInflater;
                    layoutInflater = super/*android.app.Activity*/.getLayoutInflater();
                    11T.A0A(layoutInflater);
                    return layoutInflater;
                }

                @Override // X.C06v
                public MenuInflater Awc() {
                    MenuInflater menuInflater;
                    menuInflater = super/*android.app.Activity*/.getMenuInflater();
                    11T.A0A(menuInflater);
                    return menuInflater;
                }

                @Override // X.C06v
                public View B0T(int i) {
                    throw AnonymousClass001.A0N("getOptionalView() is not supported in FbFragmentActivity");
                }

                @Override // X.C06v
                public Resources B7l() {
                    Resources resources;
                    resources = super/*android.view.ContextThemeWrapper*/.getResources();
                    11T.A0A(resources);
                    return resources;
                }

                @Override // X.C06v
                public 06Z BDe() {
                    06Z BDe;
                    BDe = super/*androidx.fragment.app.FragmentActivity*/.BDe();
                    11T.A0A(BDe);
                    return BDe;
                }

                @Override // X.C06v
                public Object BE6(String str) {
                    Object systemService;
                    systemService = super/*android.app.Activity*/.getSystemService(str);
                    return systemService;
                }

                @Override // X.C06v
                public View BJx(int i) {
                    throw AnonymousClass001.A0N("getView() is not supported in FbFragmentActivity");
                }

                @Override // X.C06v
                public Window BKo() {
                    Window window;
                    window = super/*android.app.Activity*/.getWindow();
                    return window;
                }

                @Override // X.C06v
                public boolean BMe(Throwable th) {
                    return false;
                }

                @Override // X.C06v
                public boolean BNm() {
                    boolean hasWindowFocus;
                    hasWindowFocus = super/*android.app.Activity*/.hasWindowFocus();
                    return hasWindowFocus;
                }

                @Override // X.C06v
                public boolean Bee(boolean z) {
                    boolean moveTaskToBack;
                    moveTaskToBack = super/*android.app.Activity*/.moveTaskToBack(z);
                    return moveTaskToBack;
                }

                @Override // X.C06v
                public void Bhh(Bundle bundle) {
                }

                @Override // X.C06v
                public void Bhl(Intent intent) {
                }

                @Override // X.C06v
                public void Bhn() {
                }

                @Override // X.C06v
                public void BjK(Resources.Theme theme, int i, boolean z) {
                    boolean z2;
                    FbFragmentActivity fbFragmentActivity = FbFragmentActivity.this;
                    z2 = fbFragmentActivity.suppressLifecycleSuperCalls;
                    if (z2) {
                        return;
                    }
                    super/*android.app.Activity*/.onApplyThemeResource(theme, i, z);
                }

                @Override // X.C06v
                public void Bjb(Fragment fragment) {
                }

                @Override // X.C06v
                public void Bkf() {
                }

                @Override // X.C06v
                public void Bl1(Bundle bundle) {
                }

                @Override // X.C06v
                public void Bl3(Bundle bundle) {
                }

                @Override // X.C06v
                public void BlM(Bundle bundle) {
                }

                @Override // X.C06v
                public boolean BrS(MenuItem menuItem) {
                    boolean onContextItemSelected;
                    onContextItemSelected = super/*android.app.Activity*/.onContextItemSelected(menuItem);
                    return onContextItemSelected;
                }

                @Override // X.C06v
                public Dialog Brp(int i) {
                    Dialog onCreateDialog;
                    onCreateDialog = super/*android.app.Activity*/.onCreateDialog(i);
                    11T.A0A(onCreateDialog);
                    return onCreateDialog;
                }

                @Override // X.C06v
                public boolean Brv(Menu menu) {
                    boolean onCreateOptionsMenu;
                    onCreateOptionsMenu = super/*android.app.Activity*/.onCreateOptionsMenu(menu);
                    return onCreateOptionsMenu;
                }

                @Override // X.C06v
                public void C82(boolean z) {
                    super/*androidx.activity.ComponentActivity*/.onMultiWindowModeChanged(z);
                }

                @Override // X.C06v
                public void C8v(Intent intent) {
                    super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
                }

                @Override // X.C06v
                public boolean CAH(MenuItem menuItem) {
                    boolean onOptionsItemSelected;
                    onOptionsItemSelected = super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
                    return onOptionsItemSelected;
                }

                @Override // X.C06v
                public void CBj(boolean z, Configuration configuration) {
                    super/*androidx.activity.ComponentActivity*/.onPictureInPictureModeChanged(z, configuration);
                }

                @Override // X.C06v
                public void CCw(Bundle bundle) {
                    super/*android.app.Activity*/.onPostCreate(bundle);
                }

                @Override // X.C06v
                public void CD1() {
                    super/*androidx.fragment.app.FragmentActivity*/.onPostResume();
                }

                @Override // X.C06v
                public void CDI(int i, Dialog dialog) {
                    super/*android.app.Activity*/.onPrepareDialog(i, dialog);
                }

                @Override // X.C06v
                public boolean CDS(Menu menu) {
                    boolean onPrepareOptionsMenu;
                    onPrepareOptionsMenu = super/*android.app.Activity*/.onPrepareOptionsMenu(menu);
                    return onPrepareOptionsMenu;
                }

                @Override // X.C06v
                public void CH2(int i, String[] strArr, int[] iArr) {
                    super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
                }

                @Override // X.C06v
                public void CHt() {
                    super/*androidx.fragment.app.FragmentActivity*/.A2X();
                }

                @Override // X.C06v
                public void CQk(CharSequence charSequence, int i) {
                    super/*android.app.Activity*/.onTitleChanged(charSequence, i);
                }

                @Override // X.C06v
                public void CTH() {
                    super/*android.app.Activity*/.onUserInteraction();
                }

                @Override // X.C06v
                public void CTK() {
                    super/*androidx.activity.ComponentActivity*/.onUserLeaveHint();
                }

                @Override // X.C06v
                public void Cbh() {
                    super/*android.app.Activity*/.recreate();
                }

                @Override // X.C06v
                public void CcH(1IG r302) {
                }

                @Override // X.C1en
                public void Cdt(1gM r302) {
                }

                @Override // X.C06v
                public void CnO(int i) {
                    super/*androidx.activity.ComponentActivity*/.setContentView(i);
                }

                @Override // X.C06v
                public void CnP(View view) {
                    super/*androidx.activity.ComponentActivity*/.setContentView(view);
                }

                @Override // X.C06v
                public void Cq2(Intent intent) {
                    super/*android.app.Activity*/.setIntent(intent);
                }

                @Override // X.C06v
                public void Cu1(int i) {
                    super/*android.app.Activity*/.setRequestedOrientation(i);
                }

                @Override // X.C06v
                public boolean CyH(03Y r302) {
                    return true;
                }

                @Override // X.C06v
                public void D1P(Intent intent) {
                    super/*android.app.Activity*/.startActivity(intent);
                }

                @Override // X.C06v
                public void D1Q(Intent intent, Bundle bundle) {
                    super/*android.app.Activity*/.startActivity(intent, bundle);
                }

                @Override // X.C06v
                public void D1R(Intent intent, int i, Bundle bundle) {
                    super/*androidx.activity.ComponentActivity*/.startActivityForResult(intent, i, bundle);
                }

                @Override // X.C06v
                public void D3U() {
                    FbFragmentActivity.this.invalidateOptionsMenu();
                }

                @Override // X.C06v
                public boolean D3g() {
                    return true;
                }

                @Override // X.C06v
                public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                    boolean dispatchGenericMotionEvent;
                    dispatchGenericMotionEvent = super/*android.app.Activity*/.dispatchGenericMotionEvent(motionEvent);
                    return dispatchGenericMotionEvent;
                }

                @Override // X.C06v
                public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    boolean dispatchKeyEvent;
                    dispatchKeyEvent = super/*androidx.core.app.ComponentActivity*/.dispatchKeyEvent(keyEvent);
                    return dispatchKeyEvent;
                }

                @Override // X.C06v
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    boolean dispatchTouchEvent;
                    dispatchTouchEvent = super/*android.app.Activity*/.dispatchTouchEvent(motionEvent);
                    return dispatchTouchEvent;
                }

                @Override // X.C06v
                public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
                    super/*androidx.fragment.app.FragmentActivity*/.dump(str, fileDescriptor, printWriter, strArr);
                }

                @Override // X.C06v
                public void finish() {
                    super/*android.app.Activity*/.finish();
                }

                @Override // X.C06v
                public Intent getIntent() {
                    Intent intent;
                    intent = super/*android.app.Activity*/.getIntent();
                    11T.A0A(intent);
                    return intent;
                }

                @Override // X.C06v
                public void onActivityDestroy() {
                }

                @Override // X.C06v
                public void onActivityResult(int i, int i2, Intent intent) {
                    super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
                }

                @Override // X.C06v
                public void onAttachedToWindow() {
                    super/*android.app.Activity*/.onAttachedToWindow();
                }

                @Override // X.C06v
                public void onBackPressed() {
                    super/*androidx.activity.ComponentActivity*/.onBackPressed();
                }

                @Override // X.C06v
                public void onConfigurationChanged(Configuration configuration) {
                    super/*androidx.activity.ComponentActivity*/.onConfigurationChanged(configuration);
                }

                @Override // X.C06v
                public void onContentChanged() {
                    super/*android.app.Activity*/.onContentChanged();
                }

                @Override // X.C06v
                public void onCreate(Bundle bundle) {
                    super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
                }

                @Override // X.C06v
                public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                    super/*android.app.Activity*/.onCreateContextMenu(contextMenu, view, contextMenuInfo);
                }

                @Override // X.C06v
                public View onCreatePanelView(int i) {
                    View onCreatePanelView;
                    onCreatePanelView = super/*android.app.Activity*/.onCreatePanelView(i);
                    return onCreatePanelView;
                }

                @Override // X.C06v
                public void onDestroy() {
                    super/*androidx.fragment.app.FragmentActivity*/.onDestroy();
                }

                @Override // X.C06v
                public boolean onKeyDown(int i, KeyEvent keyEvent) {
                    boolean onKeyDown;
                    onKeyDown = super/*android.app.Activity*/.onKeyDown(i, keyEvent);
                    return onKeyDown;
                }

                @Override // X.C06v
                public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
                    return false;
                }

                @Override // X.C06v
                public boolean onKeyUp(int i, KeyEvent keyEvent) {
                    boolean onKeyUp;
                    onKeyUp = super/*android.app.Activity*/.onKeyUp(i, keyEvent);
                    return onKeyUp;
                }

                @Override // X.C06v
                public void onLowMemory() {
                    super/*android.app.Activity*/.onLowMemory();
                }

                @Override // X.C06v
                public void onPause() {
                    super/*androidx.fragment.app.FragmentActivity*/.onPause();
                }

                @Override // X.C06v
                public void onResume() {
                    super/*androidx.fragment.app.FragmentActivity*/.onResume();
                }

                @Override // X.C06v
                public void onSaveInstanceState(Bundle bundle) {
                    super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
                }

                @Override // X.C06v
                public boolean onSearchRequested() {
                    boolean onSearchRequested;
                    onSearchRequested = super/*android.app.Activity*/.onSearchRequested();
                    return onSearchRequested;
                }

                @Override // X.C06v
                public void onStart() {
                    super/*androidx.fragment.app.FragmentActivity*/.onStart();
                }

                @Override // X.C06v
                public void onStop() {
                    super/*androidx.fragment.app.FragmentActivity*/.onStop();
                }

                @Override // X.C06v
                public void onTrimMemory(int i) {
                    super/*androidx.activity.ComponentActivity*/.onTrimMemory(i);
                }

                @Override // X.C06v
                public void onWindowFocusChanged(boolean z) {
                    super/*android.app.Activity*/.onWindowFocusChanged(z);
                }

                @Override // X.C06v
                public void startActivityForResult(Intent intent, int i) {
                    super/*androidx.activity.ComponentActivity*/.startActivityForResult(intent, i);
                }
            });
        }
        return c06u;
    }

    public final C06t A2f() {
        C06u A2e = A2e();
        11T.A0I(A2e, "null cannot be cast to non-null type com.facebook.base.activity.FbFragmentActivityImpl");
        C0k4.A00(A2e);
        11T.A0A(A2e);
        return (C06t) A2e;
    }

    public 1iF A2g() {
        return null;
    }

    public Integer A2h() {
        return 0S2.A00;
    }

    public Object A2i(Class cls) {
        return cls.isInstance(this) ? this : A2e().Ari(cls);
    }

    public final AtomicInteger A2j() {
        return this.fullscreenOverlayStackCounter;
    }

    public final 03Y A2k() {
        return this.lastWindowSizeClass;
    }

    public void A2l() {
        A2e().onActivityDestroy();
    }

    public void A2m() {
        A2e().Bhn();
    }

    public void A2n() {
        A2e().Bkf();
    }

    public void A2o() {
    }

    public void A2p() {
        A2e().A0P();
    }

    public final void A2q() {
        if (this.suppressLifecycleSuperCalls) {
            return;
        }
        super.onDestroy();
    }

    public final void A2r() {
        if (this.suppressLifecycleSuperCalls) {
            return;
        }
        super.onPause();
    }

    public final void A2s() {
        if (this.suppressLifecycleSuperCalls) {
            return;
        }
        super.onResume();
    }

    public final void A2t() {
        if (this.suppressLifecycleSuperCalls) {
            return;
        }
        super.onStart();
    }

    public final void A2u() {
        if (this.suppressLifecycleSuperCalls) {
            return;
        }
        super.onStop();
    }

    public final void A2v() {
        this.appCompatDelegateInternal = null;
    }

    public void A2w(Context context) {
    }

    public void A2x(Intent intent) {
        11T.A0F(intent, 0);
        A2e().Bhl(intent);
    }

    public void A2y(Bundle bundle) {
        A2e().Bhh(bundle);
    }

    public void A2z(Bundle bundle) {
        A2e().Bl1(bundle);
    }

    public void A30(Bundle bundle) {
        A2e().Bl3(bundle);
    }

    public void A31(Bundle bundle) {
        A2e().BlM(bundle);
    }

    public final void A32(Bundle bundle) {
        if (this.suppressLifecycleSuperCalls) {
            return;
        }
        C06t A2f = A2f();
        C0k4.A00(A2f);
        if (A2f.A0e(bundle)) {
            bundle = null;
        }
        super.onCreate(bundle);
    }

    public final void A33(Bundle bundle) {
        if (this.suppressLifecycleSuperCalls) {
            return;
        }
        super.onPostCreate(bundle);
    }

    public final void A34(03Y r302) {
        this.lastWindowSizeClass = r302;
    }

    public final void A35(boolean z) {
        this.isDarkMode = z;
    }

    public boolean A36() {
        return false;
    }

    public boolean A37() {
        return A2e().D3g();
    }

    public final boolean A38() {
        return this.isDarkMode;
    }

    public boolean A39(Bundle bundle) {
        C06t A2f = A2f();
        C0k4.A00(A2f);
        return A2f.A0f(bundle);
    }

    public boolean A3A(03Y r302) {
        return A2e().CyH(r302);
    }

    @Override // X.C1en
    public void A5D(1gM r302) {
        11T.A0F(r302, 0);
        A2e().A5D(r302);
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        return A2e().B5M(obj);
    }

    @Override // androidx.fragment.app.FragmentActivity, X.C1em, X.C06v
    public 06Z BDe() {
        06Z BDe = A2e().BDe();
        11T.A0A(BDe);
        return BDe;
    }

    @Override // X.C1ep
    public boolean BMe(Throwable th) {
        11T.A0F(th, 0);
        return A2e().BMe(th);
    }

    @Override // X.C1eo
    public Object CaT(Class cls) {
        return A2i(cls);
    }

    public void CcH(1IG r302) {
        11T.A0F(r302, 0);
        A2e().CcH(r302);
    }

    @Override // X.C1en
    public void Cdt(1gM r302) {
        11T.A0F(r302, 0);
        A2e().Cdt(r302);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0F(obj, 0);
        11T.A0F(obj2, 1);
        A2e().CtX(obj, obj2);
    }

    @Override // X.C1em
    public void D3U() {
        A2e().D3U();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        11T.A0F(context, 0);
        super.attachBaseContext(context);
        A2e().AAx(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        A2e().AGS();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        return A2e().dispatchGenericMotionEvent(motionEvent);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        11T.A0F(keyEvent, 0);
        return A2e().dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        return A2e().dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        11T.A0G(str, 0, printWriter);
        A2e().dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void finish() {
        A2e().finish();
    }

    @Override // android.app.Activity
    public void finishFromChild(Activity activity) {
        11T.A0F(activity, 0);
        A2e().AT5(activity);
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        Intent intent = A2e().getIntent();
        11T.A0A(intent);
        return intent;
    }

    @Override // android.app.Activity
    public LayoutInflater getLayoutInflater() {
        LayoutInflater AtU = A2e().AtU();
        11T.A0A(AtU);
        return AtU;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        MenuInflater Awc = A2e().Awc();
        11T.A0A(Awc);
        return Awc;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources B7l = A2e().B7l();
        11T.A0A(B7l);
        return B7l;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        11T.A0F(str, 0);
        return A2e().BE6(str);
    }

    @Override // android.app.Activity
    public Window getWindow() {
        return A2e().BKo();
    }

    @Override // android.app.Activity
    public boolean hasWindowFocus() {
        return A2e().BNm();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        6QM r0 = this.appCompatDelegateInternal;
        if (r0 != null) {
            r0.A0J();
        } else {
            super.invalidateOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z) {
        return A2e().Bee(z);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        A2e().onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper
    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        11T.A0F(theme, 0);
        A2e().BjK(theme, i, z);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        A2e().onAttachedToWindow();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        A2e().onBackPressed();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        A2e().onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        A2e().onContentChanged();
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        11T.A0F(menuItem, 0);
        return A2e().BrS(menuItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r302.isEmpty() != false) goto L6;
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = -185146432(0xfffffffff4f6e3c0, float:-1.5648491E32)
            r303 = r0
            r0 = r303
            int r0 = X.0FI.A00(r0)
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L1a
            r0 = r302
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r301
            r1 = r303
            r0.launchedWithSavedInstanceState = r1
            r0 = r301
            X.06u r0 = r0.A2e()
            r1 = r302
            r0.onCreate(r1)
            r0 = 165356469(0x9db23b5, float:5.275591E-33)
            r1 = r304
            X.0FI.A07(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.base.activity.FbFragmentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        11T.A0H(contextMenu, view);
        A2e().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog Brp = A2e().Brp(i);
        11T.A0A(Brp);
        return Brp;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        11T.A0F(menu, 0);
        return A2e().Brv(menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return A2e().onCreatePanelView(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int A00 = 0FI.A00(1836282813);
        A2e().onDestroy();
        0FI.A07(1874763330, A00);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        11T.A0F(keyEvent, 1);
        return A2e().onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        11T.A0F(keyEvent, 1);
        return A2e().onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        11T.A0F(keyEvent, 1);
        return A2e().onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        A2e().onLowMemory();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        A2e().C82(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        11T.A0F(intent, 0);
        A2e().C8v(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        11T.A0F(menuItem, 0);
        return A2e().CAH(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(980943167);
        A2e().onPause();
        0FI.A07(-1867768974, A00);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        11T.A0F(configuration, 1);
        A2e().CBj(z, configuration);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        A2e().CCw(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        A2e().CD1();
    }

    @Override // android.app.Activity
    public void onPrepareDialog(int i, Dialog dialog) {
        11T.A0F(dialog, 1);
        A2e().CDI(i, dialog);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        11T.A0F(menu, 0);
        return A2e().CDS(menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        11T.A0F(strArr, 1);
        11T.A0F(iArr, 2);
        A2e().CH2(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-579160485);
        A2e().onResume();
        0FI.A07(-465304790, A00);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        A2e().onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return A2e().onSearchRequested();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(993614065);
        A2e().onStart();
        0FI.A07(-1000182798, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(-1768347970);
        A2e().onStop();
        0FI.A07(-240090656, A00);
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        11T.A0F(charSequence, 0);
        A2e().CQk(charSequence, i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        A2e().onTrimMemory(i);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        A2e().CTH();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onUserLeaveHint() {
        A2e().CTK();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        A2e().onWindowFocusChanged(z);
    }

    @Override // android.app.Activity
    public void recreate() {
        A2e().Cbh();
        super.recreate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        A2e().CnO(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        A2e().CnP(view);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        11T.A0F(intent, 0);
        A2e().Cq2(intent);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        C06t A2f = A2f();
        C0k4.A00(A2f);
        A2f.A0b(i);
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        11T.A0F(charSequence, 0);
        super.setTitle(charSequence);
        6QM r0 = this.appCompatDelegateInternal;
        if (r0 != null) {
            r0.A0V(charSequence);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        11T.A0F(intent, 0);
        A2e().D1P(intent);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        11T.A0F(intent, 0);
        A2e().D1Q(intent, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        11T.A0F(intent, 0);
        A2e().D1R(intent, i, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        11T.A0F(intent, 0);
        A2e().D1R(intent, i, bundle);
    }
}
