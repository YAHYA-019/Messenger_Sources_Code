package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.notify.permissions.AndroidTNotificationsPermissionDialogActivity;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.2dm, reason: invalid class name */
/* loaded from: 2dm.class */
public final class C2dm implements C2dn {
    public static final 1G2 A07;
    public static final 1G2 A08;
    public static final 1G2 A09;
    public static final 1G2 A0A;
    public static final 1G2 A0B;
    public static final 1G2 A0C;
    public static final 1G2 A0D;
    public static final 1G2 A0E;
    public final 1Br A00;
    public final 1Br A02;
    public final 1Br A03;
    public final Context A04;
    public final 1Br A06;
    public final 1BP A05 = FbInjector.A00;
    public final 1Br A01 = 1Bq.A00(16616);

    static {
        1G2 r0 = C2do.A02;
        1G2 A0D2 = r0.A0D("system_permission_requested");
        11T.A0A(A0D2);
        A0D = A0D2;
        1G2 A0D3 = r0.A0D("system_permission_requested_after_denial");
        11T.A0A(A0D3);
        A0E = A0D3;
        1G2 A0D4 = r0.A0D("system_permission_max_retry_reached");
        11T.A0A(A0D4);
        A0B = A0D4;
        1G2 A0D5 = r0.A0D("system_permission_granted");
        11T.A0A(A0D5);
        A0A = A0D5;
        1G2 A0D6 = r0.A0D("system_permission_denied");
        11T.A0A(A0D6);
        A09 = A0D6;
        1G2 A0D7 = r0.A0D("system_permission_canceled");
        11T.A0A(A0D7);
        A08 = A0D7;
        1G2 A0D8 = r0.A0D("nux_denied");
        11T.A0A(A0D8);
        A07 = A0D8;
        1G2 A0D9 = r0.A0D("system_permission_prompt_impression_count");
        11T.A0A(A0D9);
        A0C = A0D9;
    }

    public C2dm() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A04 = context;
        this.A02 = 1HG.A00(context, 100188);
        this.A06 = 1Bq.A00(33013);
        this.A03 = 1Bu.A00(66532);
        this.A00 = 1Bu.A00(66245);
    }

    private final FbSharedPreferences A00() {
        return (FbSharedPreferences) this.A06.A00.get();
    }

    @Override // X.C2dn
    public Integer B7N() {
        return ((1wT) ((C2dp) this.A03.A00.get()).A00.A00.get()).A00();
    }

    @Override // X.C2dn
    public boolean BNh() {
        boolean z = false;
        if (A00().AZn(A0A, false) || A00().AZn(A09, false) || A00().AZn(A08, false)) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (X.0Em.A00(r0, "android.permission.POST_NOTIFICATIONS") == 0) goto L6;
     */
    @Override // X.C2dn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BUX() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A02
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.areNotificationsEnabled()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L32
            android.content.Context r0 = com.facebook.inject.FbInjector.A03
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)
            r0 = r304
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            int r0 = X.0Em.A00(r0, r1)
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r305
            if (r0 != 0) goto L34
        L32:
            r0 = 1
            r303 = r0
        L34:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2dm.BUX():boolean");
    }

    @Override // X.C2dn
    public void C9g() {
        Context context = FbInjector.A03;
        11T.A0A(context);
        String str = (String) 1Bn.A0E(context, (1BY) null, 83439);
        FbSharedPreferences A00 = A00();
        1G2 r0 = A07;
        int ArU = A00.ArU(1G3.A01(r0, 0Pz.A0K(str, '/')), 0);
        1Ql edit = A00().edit();
        edit.CaE(1G3.A01(r0, 0Pz.A0K(str, '/')), ArU + 1);
        edit.commit();
    }

    @Override // X.C2dn
    public void Ch2(Fragment fragment) {
        if (fragment != null) {
            Intent intent = new Intent(fragment.getContext(), (Class<?>) AndroidTNotificationsPermissionDialogActivity.class);
            intent.putExtra("with_calling_fragment", true);
            0LS.A05(intent, fragment, 1);
        } else {
            Context context = FbInjector.A03;
            11T.A0A(context);
            Intent flags = new Intent(context, (Class<?>) AndroidTNotificationsPermissionDialogActivity.class).setFlags(276824064);
            11T.A0A(flags);
            flags.putExtra("with_calling_fragment", false);
            Context context2 = FbInjector.A03;
            11T.A0A(context2);
            0LS.A0A(context2, flags);
        }
        A00().edit().putBoolean(A0D, true).commit();
        if (A00().AZn(A09, false)) {
            1Ql.A01(A00().edit(), A0E, true);
        }
    }

    @Override // X.C2dn
    public boolean CyL() {
        boolean z;
        if (BUX()) {
            return false;
        }
        FbSharedPreferences A00 = A00();
        1G2 r0 = A0D;
        if (!A00.BNM(r0)) {
            if (((1Od) this.A01.A00.get()).A0o) {
                A00().edit().putBoolean(r0, false).commit();
                z = true;
                return z;
            }
            if (B7N() != 0S2.A0j) {
                return false;
            }
        }
        2yD r02 = (2yD) ((1wT) this.A00.A00.get()).A00.A00.get();
        1GD r03 = 1GD.A05;
        long Av9 = r02.Av9(r03, 36605228874996756L);
        11T.A0A(FbInjector.A03);
        if (A00().ArU((1G2) A07.A0D(0Pz.A0K((String) 1Bn.A0E(r0, (1BY) null, 83439), '/')), 0) > Av9) {
            return false;
        }
        z = true;
        if (A00().AZn(r0, false)) {
            1wT r04 = (1wT) ((C2dp) this.A03.A00.get()).A00.A00.get();
            if (r04.A01.A00.get() == C0et.A0P && ((2yD) r04.A00.A00.get()).AZr(r03, 36323753898101712L)) {
                return !A00().AZn(A0B, false);
            }
            return false;
        }
        return z;
    }
}
