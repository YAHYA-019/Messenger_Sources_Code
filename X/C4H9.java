package X;

import android.net.Uri;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4H9, reason: invalid class name */
/* loaded from: 4H9.class */
public abstract class C4H9 {
    public static final boolean A00(C4H8 c4h8, 4GK r302, Integer num, long j, long j2) {
        FbSharedPreferences fbSharedPreferences;
        String str;
        1G2 r315;
        boolean z = true;
        if (j2 != 0) {
            int intValue = num.intValue();
            if ((intValue != 0 ? 0S2.A01 : 0S2.A00).intValue() != 0) {
                fbSharedPreferences = 1Br.A09(r302.A02);
                str = r302.A04;
                r315 = 4GI.A05;
            } else {
                fbSharedPreferences = (FbSharedPreferences) r302.A02.A00.get();
                str = r302.A04;
                r315 = 4GI.A04;
            }
            1G3 A0D = r315.A0D(Uri.encode(str));
            11T.A0A(A0D);
            long Av1 = fbSharedPreferences.Av1((1G2) A0D, 0L);
            long j3 = j2 + Av1;
            if (c4h8 != null) {
                Long valueOf = Long.valueOf(Av1);
                if (intValue != 0) {
                    c4h8.A02 = valueOf;
                    c4h8.A03 = Long.valueOf(j3);
                } else {
                    c4h8.A01 = valueOf;
                    c4h8.A00 = Long.valueOf(j3);
                }
            }
            if (j < j3) {
                z = false;
            }
        }
        return z;
    }
}
