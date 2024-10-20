package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.rollcall.model.RollCallArgs;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8gt, reason: invalid class name */
/* loaded from: 8gt.class */
public final class C8gt extends 1LH {
    public final int A00;
    public final int A01;
    public final 9Aj A02;
    public final MigColorScheme A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C8gt(9Aj r302, MigColorScheme migColorScheme, int i, int i2, boolean z, boolean z2, boolean z3) {
        11T.A0F(r302, 3);
        this.A03 = migColorScheme;
        this.A06 = z;
        this.A02 = r302;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z2;
        this.A05 = z3;
    }

    public static final void A01(C2iw c2iw, C2lh c2lh, C8gt c8gt) {
        CharSequence A0M = 6rU.A0M(c2iw);
        if (A0M != null) {
            String A13 = 4YU.A13(A0M.toString());
            if (!0CU.A0O(A13)) {
                if (c8gt.A05) {
                    C8ub c8ub = (C8ub) c8gt.A02;
                    11T.A0F(A13, 0);
                    9gY r0 = c8ub.A03.A0C;
                    C9kf c9kf = (C9kf) 1Lm.A05(r0.A00, r0.A02, 68527);
                    RollCallArgs rollCallArgs = r0.A07;
                    ThreadKey threadKey = rollCallArgs.A00;
                    String str = rollCallArgs.A01;
                    11T.A0F(threadKey, 0);
                    11T.A0F(str, 1);
                    String str2 = c9kf.A00.A02;
                    8yC r02 = (8yC) 1Br.A0B(c9kf.A02);
                    long j = threadKey.A04;
                    long parseLong = Long.parseLong(str2);
                    1Um A0O = 1BK.A0O(r02, 0);
                    MailboxFutureImpl A0P = 1BK.A0P(A0O);
                    1Um.A02(A0O, new A0d(A0P, r02, str, A13, j, parseLong), A0P, false);
                    if (c2lh != null) {
                        c2lh.A00();
                    }
                }
                c8gt.A02.A03(A13, "");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0315, code lost:
    
        if (X.7zP.A1V(r0) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0s(X.C2k5 r302) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8gt.A0s(X.2k5):X.1LI");
    }
}
