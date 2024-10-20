package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ji.class */
public final class C07314ji implements 2Bs {
    public Context A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;

    public C07314ji() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A03 = new 1HH(A00, 65728);
        this.A05 = new 1BV(16430);
        this.A02 = new 1BQ(16922);
        this.A04 = new 1BV(98565);
        this.A01 = new 1BQ(33013);
    }

    public void onDetectionFinished(2C1 r302, String str, Context context) {
        String obj = r302.toString();
        0fH.A0V(obj, C07314ji.class, "ZBD: Entered onDetectionFinished (%s, %s).", str);
        if (!((2BQ) this.A02.get()).A04(1BJ.A00(1269))) {
            0fH.A0A(C07314ji.class, "ZBD: onDetectionFinished - exit as EXTERNAL_ZBD is disabled.");
            return;
        }
        String str2 = r302.balanceUpgrade;
        C00i c00i = this.A01;
        FbSharedPreferences A0R = 1BK.A0R(c00i);
        C00i c00i2 = this.A04;
        String A3a = A0R.A3a((1G2) ((1Ky) c00i2.get()).A0K.getValue(), "unknown");
        0fH.A07(C07314ji.class, str2, "ZBD: updateUserZbdState, state = %s.");
        1Ql A0V = 1BL.A0V(c00i);
        A0V.CaL((1G2) ((1Ky) c00i2.get()).A0K.getValue(), str2);
        A0V.commit();
        if (!str2.equals(A3a)) {
            0fH.A07(C07314ji.class, obj, "ZBD: onDetectionFinished - state changed to: (%s).");
            4YU.A0G(this.A05).post(new G1L(this));
        }
    }
}
