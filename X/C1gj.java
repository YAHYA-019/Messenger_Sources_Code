package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.endtoend.EndToEnd;
import com.facebook.prefs.theme.ThemePreferences$State;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.1gj, reason: invalid class name */
/* loaded from: 1gj.class */
public final class C1gj {
    public ThemePreferences$State A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public 1BY A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final FbUserSession A08;
    public final C0et A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C1gt A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final Set A0L;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x02b3, code lost:
    
        if (r307.state == r318) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0365, code lost:
    
        if (A00() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x040a, code lost:
    
        if (((java.lang.Boolean) r301.A0E.get()).booleanValue() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x045e, code lost:
    
        if (1 != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1gj(X.1BO r302, com.facebook.auth.usersession.FbUserSession r303) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gj.<init>(X.1BO, com.facebook.auth.usersession.FbUserSession):void");
    }

    private boolean A00() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        boolean z2 = false;
        if (z && (((Context) this.A0C.get()).getResources().getConfiguration().uiMode & 48) == 32) {
            z2 = true;
        }
        return z2;
    }

    public static boolean A01(C1gj c1gj) {
        return ((2yD) c1gj.A0F.get()).AZk(36314833251082493L);
    }

    public String A02() {
        return Build.VERSION.SDK_INT >= 29 ? A00() ? "dark" : "light" : "unsupported";
    }

    public final void A03(Resources.Theme theme) {
        if (this.A06) {
            return;
        }
        this.A06 = true;
        theme.applyStyle(C1he.A00(C1hh.A00, false), true);
    }

    public final void A04(Resources.Theme theme, boolean z) {
        Object obj;
        if (this.A07) {
            ((Executor) this.A0B.get()).execute(new Runnable() { // from class: X.1hc
                public static final String __redex_internal_original_name = "ThemePreferences$1";

                @Override // java.lang.Runnable
                public void run() {
                    C00i c00i = C1gj.this.A0H;
                    if (c00i.get() != null) {
                        1iC r0 = (1iC) c00i.get();
                        C1gj c1gj = this;
                        1iC.A01(c1gj, r0, 1iC.A00(c1gj, r0, 0S2.A0Y));
                    }
                }
            });
            this.A07 = false;
        }
        theme.applyStyle(C1he.A00(C1hh.A00, z), true);
        Iterator it = this.A0L.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("applyTheme");
        }
        if (Build.VERSION.SDK_INT < 29 || this.A00 != ThemePreferences$State.SYSTEM || this.A05.equals(A02())) {
            return;
        }
        1iC r0 = (1iC) this.A0H.get();
        String str = this.A05;
        HashMap A00 = 1iC.A00(this, r0, 0S2.A0N);
        A00.put("current_os_theme", 1iE.A01(1iE.A00(str)));
        A00.put("event", "system_theme_change");
        switch (0S2.A0C.intValue()) {
            case 0:
                obj = "light";
                break;
            case 1:
                obj = "dark";
                break;
            default:
                obj = "system";
                break;
        }
        A00.put("new_fb_theme", obj);
        A00.put("new_os_theme", 1iE.A01(1iE.A00(A02())));
        1iC.A01(this, r0, A00);
        this.A05 = A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (A01(r301) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            boolean r0 = A01(r0)
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L16
        L14:
            r0 = 0
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1gj.A05():boolean");
    }

    public final boolean A06() {
        if (EndToEnd.isRunningEndToEndTest() && EndToEnd.A05("fb.e2e.enable_dark_mode")) {
            return true;
        }
        ThemePreferences$State themePreferences$State = this.A00;
        boolean z = false;
        if (themePreferences$State == ThemePreferences$State.ON) {
            z = true;
        }
        if (themePreferences$State == ThemePreferences$State.SYSTEM) {
            z = A00();
        }
        return !A01(this) && z && this.A01;
    }
}
