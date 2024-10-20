package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.54x, reason: invalid class name */
/* loaded from: 54x.class */
public final class C54x {
    public final 1Br A00;
    public final C01i A01;

    public C54x(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = 1Bu.A01(context, 68199);
        this.A01 = C01g.A01(new 83A(context, fbUserSession, 26));
    }

    public final boolean A00() {
        boolean z;
        1CO A00;
        long j;
        7YF A002 = ((7YE) this.A01.getValue()).A00();
        if (A002 == null) {
            return false;
        }
        int ordinal = A002.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                A00 = 2Zl.A00((2Zl) 1Br.A0B(this.A00));
                j = 36318453909828195L;
            } else {
                if (ordinal != 2) {
                    throw 1BK.A1F();
                }
                A00 = 2Zl.A00((2Zl) 1Br.A0B(this.A00));
                j = 36318453909697122L;
            }
            z = A00.AZk(j);
        } else {
            2Zl r0 = (2Zl) 1Br.A0B(this.A00);
            if (!2Zl.A00(r0).AZk(36318453909107296L)) {
                return false;
            }
            z = true;
            if (2Zl.A00(r0).AZk(36322598552225489L)) {
                return false;
            }
        }
        return z;
    }
}
