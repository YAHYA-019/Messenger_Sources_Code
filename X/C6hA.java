package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.6hA, reason: invalid class name */
/* loaded from: 6hA.class */
public final class C6hA {
    public final 1Br A00;
    public final 1Br A01;
    public final FbUserSession A02;
    public final 1De A03;

    public C6hA(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        this.A02 = fbUserSession;
        this.A00 = 1Lm.A03(fbUserSession, r303.A00, 33174);
        this.A01 = 1Bq.A00(82302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0077, code lost:
    
        if (((X.22F) r0.get()).A00(1, r302) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00(long r302) {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A00
            r304 = r0
            r0 = r304
            X.00i r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.22F r0 = (X.22F) r0
            r306 = r0
            r0 = r306
            r1 = 52
            r2 = r302
            boolean r0 = r0.A00(r1, r2)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L7a
            r0 = r301
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.Acq r0 = (X.C1286Acq) r0
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r308 = r0
            r0 = 36315340064629523(0x81049c00732313, double:3.0293055147843477E-306)
            r309 = r0
            r0 = r308
            r1 = r309
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L7a
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.22F r0 = (X.22F) r0
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            r1 = r307
            r2 = r302
            boolean r0 = r0.A00(r1, r2)
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L7f
        L7a:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
        L7f:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6hA.A00(long):boolean");
    }

    public final boolean A01(ThreadSummary threadSummary) {
        ThreadKey threadKey;
        boolean z = false;
        if (threadSummary != null && threadSummary.A0n.A1A() && threadSummary.A1T.contains(EnumC00893pQ.A07) && (threadKey = threadSummary.A0l) != null) {
            z = A00(threadKey.A0r());
        }
        return z;
    }
}
