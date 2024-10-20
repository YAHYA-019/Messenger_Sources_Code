package com.facebook.base.activity;

import X.06Z;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1IG;
import X.1IM;
import X.1Lm;
import X.1gG;
import X.1gM;
import X.2CP;
import X.33D;
import X.AnonymousClass001;
import X.AnonymousClass025;
import X.AnonymousClass074;
import X.C00i;
import X.C06q;
import X.C07l;
import X.C1en;
import X.C1ep;
import X.C1gj;
import X.DKO;
import X.FIb;
import X.L2N;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.secure.intentswitchoff.ActivityIntentSwitchOffDI;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: FbPreferenceActivity.class */
public abstract class FbPreferenceActivity extends PreferenceActivity implements C1en, AnonymousClass025, C1ep, 1IM {
    public boolean A00;
    public C06q A01;
    public C00i A02;
    public C00i A03;
    public final AnonymousClass074 A09 = new Object();
    public final 1Br A05 = 1Bq.A00(99365);
    public final 1Br A07 = 1Bq.A00(83603);
    public final 1Br A04 = 1Bq.A00(9);
    public final 1Br A08 = 1Bq.A00(67196);
    public final 1Br A06 = 1Bu.A00(66371);

    public static void A00() {
        11T.A0L("listenerDispatcher");
        throw null;
    }

    public final 06Z A05() {
        C06q c06q = this.A01;
        if (c06q == null) {
            11T.A0L("fragments");
            throw 0Q8.createAndThrow();
        }
        06Z r0 = c06q.A00.A03;
        11T.A0A(r0);
        return r0;
    }

    public void A06() {
        DKO.A00(this, true);
    }

    public void A07(Intent intent) {
        this.A00 = true;
    }

    public void A08(Bundle bundle) {
    }

    public void A09(Bundle bundle) {
    }

    public void A0A(Bundle bundle) {
    }

    @Override // X.C1en
    public void A5D(1gM r302) {
        11T.A0F(r302, 0);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0X(r302);
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        return this.A09.A00(obj);
    }

    @Override // X.C1ep
    public boolean BMe(Throwable th) {
        11T.A0F(th, 0);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj != null) {
            return ((1gG) obj).A0g(th);
        }
        throw 1BK.A0h();
    }

    public void CcH(1IG r302) {
        11T.A0F(r302, 0);
        2CP r0 = (2CP) 1Br.A0B(this.A06);
        if (r0 == null) {
            throw 1BK.A0h();
        }
        r0.A01(r302);
    }

    @Override // X.C1en
    public void Cdt(1gM r302) {
        11T.A0F(r302, 0);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0Y(r302);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0H(obj, obj2);
        this.A09.A01(obj, obj2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        11T.A0F(context, 0);
        super.attachBaseContext(context);
        this.A02 = 1Bu.A01(this, 65790);
        this.A03 = 1Lm.A00(this, 1BL.A0E(), 16757);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        11T.A0G(str, 0, printWriter);
        if (FIb.A04(printWriter, str, strArr)) {
            return;
        }
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A07();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = (Resources) 1Br.A0B(this.A08);
        if (resources != null) {
            return resources;
        }
        throw 1BK.A0h();
    }

    @Override // android.preference.PreferenceActivity
    public boolean isValidFragment(String str) {
        return true;
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0L(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper
    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        11T.A0F(theme, 0);
        super.onApplyThemeResource(theme, i, z);
        C00i c00i = this.A03;
        if (c00i != null) {
            Object obj = c00i.get();
            if (obj == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            C1gj c1gj = (C1gj) obj;
            Resources[] resourcesArr = {super.getResources(), getResources()};
            c1gj.A04(theme, c1gj.A06());
            C00i c00i2 = this.A03;
            if (c00i2 != null) {
                Object obj2 = c00i2.get();
                if (obj2 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                ((C1gj) obj2).A03(getApplicationContext().getTheme());
                C00i c00i3 = this.A03;
                if (c00i3 != null) {
                    Object obj3 = c00i3.get();
                    if (obj3 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    ((C1gj) obj3).A06();
                    return;
                }
            }
        }
        11T.A0L("themePreferences");
        throw 0Q8.createAndThrow();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onBackPressed() {
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        if (((1gG) obj).A0c()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0Q(configuration);
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A09();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int i2;
        int A00 = 0FI.A00(689103318);
        Intent intent = getIntent();
        intent.putExtra(":android:show_fragment", (String) null);
        setIntent(intent);
        C00i c00i = this.A02;
        if (c00i != null) {
            Object obj = c00i.get();
            if (obj != null) {
                ((1gG) obj).A00 = this;
                C06q c06q = new C06q(new 33D(this) { // from class: X.34u
                    public final Activity A00;

                    {
                        super(new ContextWrapper(this));
                        this.A00 = this;
                    }

                    public View A01(int i3) {
                        return this.A00.findViewById(i3);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
                    
                        if (r0.peekDecorView() == null) goto L6;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean A02() {
                        /*
                            r301 = this;
                            r0 = r301
                            android.app.Activity r0 = r0.A00
                            android.view.Window r0 = r0.getWindow()
                            r302 = r0
                            r0 = r302
                            if (r0 == 0) goto L17
                            r0 = r302
                            android.view.View r0 = r0.peekDecorView()
                            r303 = r0
                            r0 = 1
                            r304 = r0
                            r0 = r303
                            if (r0 != 0) goto L1b
                        L17:
                            r0 = 0
                            r304 = r0
                            r0 = 0
                            r302 = r0
                        L1b:
                            r0 = r304
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C34u.A02():boolean");
                    }

                    public /* bridge */ /* synthetic */ Object A04() {
                        return this.A00;
                    }
                });
                this.A01 = c06q;
                c06q.A01();
                A09(bundle);
                if (isFinishing()) {
                    super.onCreate(bundle);
                    i2 = -1905956429;
                } else {
                    C00i c00i2 = this.A02;
                    if (c00i2 != null) {
                        Object obj2 = c00i2.get();
                        if (obj2 != null) {
                            ((1gG) obj2).A0e(bundle);
                            boolean isFinishing = isFinishing();
                            super.onCreate(bundle);
                            if (!isFinishing) {
                                if (bundle != null) {
                                    Parcelable parcelable = bundle.getParcelable("android:support:fragments");
                                    C06q c06q2 = this.A01;
                                    if (c06q2 != null) {
                                        06Z r0 = c06q2.A00.A03;
                                        if (r0.A05 instanceof ViewModelStoreOwner) {
                                            06Z.A0J(r0, AnonymousClass001.A0N("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
                                            throw 0Q8.createAndThrow();
                                        }
                                        C07l c07l = r0.A06;
                                        c07l.A03.clear();
                                        c07l.A02.clear();
                                        c07l.A04.clear();
                                        r0.A12(parcelable);
                                    }
                                    11T.A0L("fragments");
                                    throw 0Q8.createAndThrow();
                                }
                                C06q c06q3 = this.A01;
                                if (c06q3 != null) {
                                    c06q3.A00.A03.A0m();
                                    A08(bundle);
                                    C00i c00i3 = this.A02;
                                    if (c00i3 != null) {
                                        Object obj3 = c00i3.get();
                                        if (obj3 != null) {
                                            ((1gG) obj3).A0d(bundle);
                                            if (isFinishing()) {
                                                i2 = -1833150891;
                                            } else {
                                                A0A(bundle);
                                                C00i c00i4 = this.A02;
                                                if (c00i4 != null) {
                                                    Object obj4 = c00i4.get();
                                                    if (obj4 != null) {
                                                        ((1gG) obj4).A08();
                                                        C06q c06q4 = this.A01;
                                                        if (c06q4 != null) {
                                                            c06q4.A00.A03.A0k();
                                                            1Bn.A0A(65791);
                                                            if (1Br.A0B(this.A07) != null) {
                                                                A06();
                                                                i2 = 1957517098;
                                                            } else {
                                                                A0N = AnonymousClass001.A0N("Required value was null.");
                                                                i = -389290499;
                                                            }
                                                        }
                                                    } else {
                                                        A0N = AnonymousClass001.A0N("Required value was null.");
                                                        i = 1695045051;
                                                    }
                                                }
                                            }
                                        } else {
                                            A0N = AnonymousClass001.A0N("Required value was null.");
                                            i = 1288817031;
                                        }
                                    }
                                }
                                11T.A0L("fragments");
                                throw 0Q8.createAndThrow();
                            }
                            i2 = 216010201;
                        } else {
                            A0N = AnonymousClass001.A0N("Required value was null.");
                            i = -1002313036;
                        }
                    }
                }
                0FI.A07(i2, A00);
                return;
            }
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 753717706;
            0FI.A07(i, A00);
            throw A0N;
        }
        11T.A0L("listenerDispatcher");
        throw 0Q8.createAndThrow();
    }

    @Override // android.app.Activity
    public Dialog onCreateDialog(int i) {
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0J(i);
        Dialog onCreateDialog = super.onCreateDialog(i);
        11T.A0A(onCreateDialog);
        return onCreateDialog;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        11T.A0F(menu, 0);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0U(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        0Q8 A0N;
        int i;
        int A00 = 0FI.A00(1726503207);
        try {
            2CP r0 = (2CP) 1Br.A0B(this.A06);
            if (r0 != null) {
                r0.A00();
                C06q c06q = this.A01;
                if (c06q == null) {
                    11T.A0L("fragments");
                } else {
                    c06q.A00.A03.A0n();
                    C00i c00i = this.A02;
                    if (c00i == null) {
                        A00();
                    } else {
                        Object obj = c00i.get();
                        if (obj != null) {
                            ((1gG) obj).A0A();
                            super.onDestroy();
                            0FI.A07(-866255619, A00);
                            return;
                        }
                        A0N = AnonymousClass001.A0N("Required value was null.");
                        i = 774290948;
                    }
                }
                A0N = 0Q8.createAndThrow();
                throw A0N;
            }
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 195450378;
            0FI.A07(i, A00);
            throw A0N;
        } catch (Throwable th) {
            super.onDestroy();
            0FI.A07(1915473327, A00);
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        11T.A0F(keyEvent, 1);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        Boolean A05 = ((1gG) obj).A05(keyEvent, i);
        return A05 != null ? A05.booleanValue() : super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        11T.A0F(keyEvent, 1);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        Boolean A06 = ((1gG) obj).A06(keyEvent, i);
        return A06 != null ? A06.booleanValue() : super.onKeyUp(i, keyEvent);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        11T.A0F(intent, 0);
        ActivityIntentSwitchOffDI activityIntentSwitchOffDI = (ActivityIntentSwitchOffDI) 1Br.A0B(this.A04);
        ActivityIntentSwitchOffDI.A02(this, intent, activityIntentSwitchOffDI);
        activityIntentSwitchOffDI.A03(this, intent, null, this);
        super.onNewIntent(intent);
        if (isFinishing()) {
            L2N l2n = (L2N) 1Br.A0B(this.A05);
            if (l2n == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            if (!l2n.A00(getClass())) {
                return;
            }
        }
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ((1gG) obj).A0P(intent);
        this.A00 = false;
        A07(intent);
        if (!this.A00) {
            throw AnonymousClass001.A0N("onActivityNewIntent didn't call super.onActivityNewIntent()");
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        11T.A0F(menuItem, 0);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        if (((1gG) obj).A0f(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onPause() {
        String str;
        int A00 = 0FI.A00(-2049975918);
        super.onPause();
        C06q c06q = this.A01;
        if (c06q == null) {
            str = "fragments";
        } else {
            06Z.A0I(c06q.A00.A03, 5);
            C00i c00i = this.A02;
            if (c00i != null) {
                Object obj = c00i.get();
                if (obj != null) {
                    ((1gG) obj).A0B();
                    0FI.A07(-253616198, A00);
                    return;
                } else {
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A07(1415052601, A00);
                    throw A0h;
                }
            }
            str = "listenerDispatcher";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        11T.A0F(configuration, 1);
        super.onPictureInPictureModeChanged(z, configuration);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0b(z, configuration);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0R(bundle);
    }

    @Override // android.app.Activity
    public void onPrepareDialog(int i, Dialog dialog) {
        11T.A0F(dialog, 1);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0M(i, dialog);
        super.onPrepareDialog(i, dialog);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        11T.A0F(menu, 0);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0V(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public void onResume() {
        String str;
        int A00 = 0FI.A00(-816112255);
        super.onResume();
        C06q c06q = this.A01;
        if (c06q == null) {
            str = "fragments";
        } else {
            c06q.A00.A03.A0q();
            C00i c00i = this.A02;
            if (c00i != null) {
                Object obj = c00i.get();
                if (obj != null) {
                    ((1gG) obj).A0C();
                    0FI.A07(-1984206465, A00);
                    return;
                } else {
                    IllegalStateException A0N = AnonymousClass001.A0N("Required value was null.");
                    0FI.A07(2010115180, A00);
                    throw A0N;
                }
            }
            str = "listenerDispatcher";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        return null;
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        C06q c06q = this.A01;
        if (c06q == null) {
            11T.A0L("fragments");
            throw 0Q8.createAndThrow();
        }
        Bundle A00 = c06q.A00();
        if (A00 != null) {
            bundle.putParcelable("android:support:fragments", A00);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0E();
        return super.onSearchRequested();
    }

    @Override // android.app.Activity
    public void onStart() {
        String str;
        int A00 = 0FI.A00(-1690842579);
        super.onStart();
        C06q c06q = this.A01;
        if (c06q == null) {
            str = "fragments";
        } else {
            c06q.A00.A03.A0r();
            C00i c00i = this.A02;
            if (c00i != null) {
                Object obj = c00i.get();
                if (obj != null) {
                    ((1gG) obj).A0F();
                    0FI.A07(611255703, A00);
                    return;
                } else {
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A07(353587423, A00);
                    throw A0h;
                }
            }
            str = "listenerDispatcher";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onStop() {
        String str;
        int A00 = 0FI.A00(1258402420);
        super.onStop();
        C06q c06q = this.A01;
        if (c06q == null) {
            str = "fragments";
        } else {
            c06q.A00.A03.A0s();
            C00i c00i = this.A02;
            if (c00i != null) {
                Object obj = c00i.get();
                if (obj != null) {
                    ((1gG) obj).A0G();
                    0FI.A07(-1505585212, A00);
                    return;
                } else {
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A07(-544256611, A00);
                    throw A0h;
                }
            }
            str = "listenerDispatcher";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        11T.A0F(charSequence, 0);
        super.onTitleChanged(charSequence, i);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0Z(charSequence, i);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0H();
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0I();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C00i c00i = this.A02;
        if (c00i == null) {
            A00();
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        if (obj == null) {
            throw 1BK.A0h();
        }
        ((1gG) obj).A0a(z);
    }
}
