package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bf.class */
public final class C04594bf implements 1Vf {
    public 2SP A00;
    public boolean A01;
    public final FbUserSession A02;

    public C04594bf(FbUserSession fbUserSession) {
        this.A02 = fbUserSession;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        String str2;
        boolean A1W = 1BL.A1W(r302, str);
        if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
            2SP r0 = (2SP) 1Lm.A06(this.A02, 68271);
            this.A00 = r0;
            str2 = "jewelDataProvider";
            if (!this.A01) {
                if (r0 != null) {
                    r0.A0C();
                    this.A01 = A1W;
                }
            }
            2SP r02 = this.A00;
            if (r02 != null) {
                if (((2RU) 1Br.A0B(r02.A0E)).A03()) {
                    2SU r03 = r02.A0M;
                    C21S.A00(r03.A07, r03.A06);
                    2SU.A00(r03);
                    return;
                }
                return;
            }
        } else {
            if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnDestroy")) {
                throw 4YV.A0f(str);
            }
            2SP r04 = this.A00;
            if (r04 != null) {
                if (((2RU) 1Br.A0B(r04.A0E)).A03()) {
                    2SU r05 = r04.A0M;
                    C21S.A01(r05.A07, r05.A06);
                    return;
                }
                return;
            }
            str2 = "jewelDataProvider";
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }
}
