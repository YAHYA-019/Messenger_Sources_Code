package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.1ot, reason: invalid class name */
/* loaded from: 1ot.class */
public final class C1ot {
    public final 1Br A00;
    public final 1Br A01;
    public final String A02;

    public C1ot(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = 1Bq.A00(33013);
        this.A00 = 1Lm.A01(fbUserSession, 66148);
        this.A02 = ((1G1) fbUserSession).A02;
    }

    public static final Integer A00(C1ot c1ot, boolean z) {
        Integer A00;
        Integer A002;
        if (z) {
            C00i c00i = c1ot.A01.A00;
            String BD0 = ((FbSharedPreferences) c00i.get()).BD0(1G9.A05(C1ou.A02, c1ot.A02));
            if (BD0 == null) {
                BD0 = "MDS_SHARED_PREFERENCES_DEFAULT_VALUE";
            }
            if (!(!BD0.equals("MDS_SHARED_PREFERENCES_DEFAULT_VALUE"))) {
                Integer[] numArr = C1ov.A00;
                int i = 0;
                int length = numArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Integer num = numArr[i];
                    String A003 = C1ov.A00(num);
                    String BD02 = ((FbSharedPreferences) c00i.get()).BD0(C1ou.A00);
                    if (BD02 == null) {
                        BD02 = "MDS_SHARED_PREFERENCES_DEFAULT_VALUE";
                    }
                    if (!11T.A0O(A003, BD02)) {
                        i++;
                    } else if (num.intValue() == 1) {
                        A002 = 0S2.A01;
                    }
                }
                A002 = ((C1ow) c1ot.A00.A00.get()).A00();
                c1ot.A01(A002);
            }
        }
        Integer[] numArr2 = C1ov.A00;
        int i2 = 0;
        int length2 = numArr2.length;
        while (true) {
            if (i2 >= length2) {
                A00 = ((C1ow) c1ot.A00.A00.get()).A00();
                break;
            }
            A00 = numArr2[i2];
            String A004 = C1ov.A00(A00);
            String BD03 = ((FbSharedPreferences) c1ot.A01.A00.get()).BD0(1G9.A05(C1ou.A02, c1ot.A02));
            if (BD03 == null) {
                BD03 = "MDS_SHARED_PREFERENCES_DEFAULT_VALUE";
            }
            if (11T.A0O(A004, BD03)) {
                break;
            }
            i2++;
        }
        return A00;
    }

    public final void A01(Integer num) {
        11T.A0F(num, 0);
        if (A00(this, false) != num) {
            1Ql edit = ((FbSharedPreferences) this.A01.A00.get()).edit();
            edit.CaL(1G9.A05(C1ou.A02, this.A02), C1ov.A00(num));
            edit.commit();
        }
    }
}
