package X;

import android.content.Context;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.zero.zerobalance.ping.ZeroBalancePingController;

/* renamed from: X.4jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4jh.class */
public final class C07304jh implements 2Bs {
    public final C00i A07 = new 1BQ(16966);
    public final C00i A08 = new 1BQ(16931);
    public final C00i A04 = new 1BQ(16385);
    public final C15h A09 = new G7G(this, 26);
    public final C00i A05 = new 1BV(16430);
    public final C00i A01 = new 1BQ(99939);
    public final C00i A03 = new 1BQ(16922);
    public final C00i A00 = new 1BQ(99390);
    public final C00i A06 = new 1BQ(98453);
    public final C00i A02 = new 1BQ(33013);

    public void onDetectionFinished(2C1 r302, String str, Context context) {
        String str2;
        boolean equals = r302.equals(2C1.A03);
        String A00 = DKB.A00(291);
        0fH.A0g(Boolean.valueOf(equals), A00, "onDetectionFinished: hasBalance: %s");
        String str3 = equals ? "paid_balance" : "free_balance";
        1Ql edit = ((FbSharedPreferences) this.A02.get()).edit();
        edit.CaL((1G2) ((1Ky) 1Bn.A0A(98565)).A0M.getValue(), str3);
        edit.commit();
        if (((Boolean) this.A09.get()).booleanValue()) {
            C00i c00i = this.A01;
            if (((1vL) c00i.get()).A08() != null && ((ZeroBalancePingController) this.A08.get()).A05()) {
                if (((1vL) c00i.get()).A0S()) {
                    str2 = "onDetectionFinished: already in free";
                    0fH.A0j(A00, str2);
                } else {
                    if (equals) {
                        return;
                    }
                    4YU.A0G(this.A05).post(new G1K(this));
                    return;
                }
            }
        }
        str2 = "onDetectionFinished: ZBD is disabled";
        0fH.A0j(A00, str2);
    }
}
