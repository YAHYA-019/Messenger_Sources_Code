package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.4jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4jm.class */
public final class C07354jm implements 2Bs {
    public static final String A0C = 0Pz.A0W(C07354jm.class.getName(), ".ZeroOptin");
    public final C00i A03 = new 1BQ(99939);
    public final C00i A05 = new 1BQ(16922);
    public final C00i A02 = new 1BQ(99390);
    public final C00i A08 = new 1BQ(98453);
    public final C00i A04 = new 1BQ(33013);
    public final C00i A09 = new 1BQ(98317);
    public final C00i A00 = new 1BQ(98462);
    public final C00i A01 = new 1BQ(98465);
    public final C00i A0A = new 1BV(33101);
    public final C00i A06 = new 1BQ(16385);
    public final C00i A07 = new 1BQ(16520);
    public final C15h A0B = new G7G(this, 27);

    public static void A00(C07354jm c07354jm) {
        1Ql A0V = 1BL.A0V(c07354jm.A04);
        A0V.CaH((1G2) ((1Ky) 1Bn.A0A(98565)).A0P.getValue(), 1BL.A08(c07354jm.A02) + 3600000);
        A0V.commit();
    }

    public void onDetectionFinished(2C1 r302, String str, Context context) {
        String str2;
        boolean equals = r302.equals(2C1.A03);
        String str3 = A0C;
        0fH.A0g(Boolean.valueOf(equals), str3, "onDetectionFinished: hasBalance: %s");
        Activity A08 = ((1vL) this.A03.get()).A08();
        if (A08 == null) {
            str2 = "onDetectionFinished: activity is null";
        } else {
            if (((2BQ) this.A05.get()).A05(1BJ.A00(434))) {
                A08.runOnUiThread(new G4h(A08, this, equals));
                return;
            }
            str2 = "onDetectionFinished: freemium models disabled";
        }
        0fH.A0j(str3, str2);
    }
}
