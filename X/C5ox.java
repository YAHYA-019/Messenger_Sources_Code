package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.5ox, reason: invalid class name */
/* loaded from: 5ox.class */
public final class C5ox {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C5ox(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A01 = 1Bq.A00(32906);
        this.A00 = 1Lm.A03(fbUserSession, r303.A00, 16958);
    }

    public final void A00(C5ow c5ow, String str) {
        11T.A0F(str, 1);
        Long l = c5ow.A05;
        String str2 = c5ow.A0B;
        C45o.A02((C45o) 1Br.A0B(this.A01), null, 0S2.A0L, Long.valueOf(((2In) 1Br.A0B(this.A00)).A00()), 4YV.A0u(l), str2, null, str, c5ow.A0D);
    }

    public final void A01(BEV bev, int i) {
        C45o c45o;
        long A00;
        Integer num;
        11T.A0F(bev, 0);
        int integer = ((1qX) bev).mResultSet.getInteger(i, 0);
        String string = ((1qX) bev).mResultSet.getString(i, 2);
        11T.A0A(string);
        if (integer == 15) {
            c45o = (C45o) this.A01.A00.get();
            A00 = ((2In) this.A00.A00.get()).A00();
            num = 0S2.A0B;
        } else {
            if (integer != 16) {
                return;
            }
            c45o = (C45o) 1Br.A0B(this.A01);
            A00 = ((2In) 1Br.A0B(this.A00)).A00();
            num = 0S2.A0D;
        }
        C45o.A02(c45o, null, num, Long.valueOf(A00), string, null, null, null, null);
    }
}
