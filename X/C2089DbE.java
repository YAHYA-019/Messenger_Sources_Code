package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.DbE, reason: case insensitive filesystem */
/* loaded from: DbE.class */
public final class C2089DbE extends 1Ni {
    public final FbUserSession A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2089DbE(com.facebook.auth.usersession.FbUserSession r302) {
        /*
            r301 = this;
            r0 = 0
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.02w r0 = (X.C02w) r0
            r303 = r0
            java.lang.Integer r0 = X.1Lo.A05
            r304 = r0
            X.1MV r0 = new X.1MV
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = 99668(0x18554, float:1.39665E-40)
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r304
            r2 = r303
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2089DbE.<init>(com.facebook.auth.usersession.FbUserSession):void");
    }

    public /* bridge */ /* synthetic */ void A02(Context context, Intent intent, Object obj) {
        String stringExtra;
        Integer num;
        Esl esl = (Esl) obj;
        1Od r0 = (1Od) 1Bi.A03(16616);
        Er9 er9 = (Er9) 1Bn.A0A(99967);
        if (intent == null || (stringExtra = intent.getStringExtra(AbstractC00603o4.A00(443))) == null) {
            return;
        }
        if (r0.A0E()) {
            num = 0S2.A00;
        } else if (!r0.A0F()) {
            num = 0S2.A01;
        } else {
            if (1Br.A07(((EcI) 1Bn.A0A(99670)).A00).AZk(36314154646707755L) || !((EcK) 1Lo.A06(this.A00, 99672)).A00) {
                11T.A0F(context, 0);
                C1xi c1xi = (C1xi) 1Bi.A03(33154);
                Intent A0A = 4YU.A0A(C1xj.A00);
                A0A.putExtra(C1xj.A0K, stringExtra);
                A0A.putExtra(C1xj.A0J, true);
                C1xi.A00(A0A, c1xi);
                R0h.A00(context, stringExtra);
                return;
            }
            num = 0S2.A0C;
        }
        esl.A00(false, num);
        er9.A00(stringExtra);
    }
}
