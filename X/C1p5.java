package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.1p5, reason: invalid class name */
/* loaded from: 1p5.class */
public final class C1p5 {
    public final 1Br A00;
    public final 1G9 A01;

    public C1p5(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = 1Bq.A00(33013);
        this.A01 = 1G9.A05(C1ou.A01, ((1G1) fbUserSession).A02);
    }

    public final Integer A00() {
        Integer num;
        String BD0 = ((FbSharedPreferences) this.A00.A00.get()).BD0(this.A01);
        if (BD0 == null) {
            BD0 = "MDS_SHARED_PREFERENCES_DEFAULT_VALUE";
        }
        Integer[] numArr = C1p6.A00;
        int length = numArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                num = 0S2.A0N;
                break;
            }
            num = numArr[i2];
            if (11T.A0O(C1p6.A00(num), BD0)) {
                break;
            }
            i = i2 + 1;
        }
        return num;
    }
}
