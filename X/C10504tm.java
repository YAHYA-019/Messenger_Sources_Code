package X;

import android.content.Context;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4tm.class */
public final class C10504tm {
    public final 1OX A00 = (1OX) 1Bi.A03(16614);
    public final 45J A01 = (45J) 1Bi.A03(32901);

    public String A00() {
        1OZ r305;
        1OX r0 = this.A00;
        45J r02 = this.A01;
        if (45J.A01()) {
            r305 = 1OZ.A01;
        } else if (45J.A02()) {
            r305 = 1OZ.A07;
        } else {
            r305 = r02.A09;
            r305.getClass();
        }
        C1Oc A00 = r0.A00(r305);
        1G1 A04 = 1Fw.A04((1EZ) 1Bn.A0E((Context) null, A00.A00, 16428));
        String str = A04.A02;
        if (A04.A07) {
            str = ((FbSharedPreferences) A00.A02.get()).A3a(A00.A03.A0D, "");
        }
        return str;
    }
}
