package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* renamed from: X.6l5, reason: invalid class name */
/* loaded from: 6l5.class */
public final class C6l5 {
    public UserKey A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;

    public C6l5(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A09 = 1Bu.A03(r0, 67333);
        this.A06 = 1Bq.A00(16385);
        this.A03 = 1Bq.A00(67347);
        this.A0C = 1Bu.A03(r0, 66297);
        this.A02 = 1Bq.A00(66227);
        this.A05 = 1Bu.A03(r0, 82615);
        this.A04 = 1Bu.A03(r0, 82617);
        this.A08 = 1Bu.A03(r0, 115474);
        this.A07 = 1Bu.A03(r0, 82518);
        this.A0A = 1Bu.A03(r0, 66510);
        this.A0B = 1Bu.A03(r0, 82526);
    }

    private final UserKey A00() {
        UserKey userKey = this.A00;
        if (userKey == null) {
            userKey = (UserKey) 1Bn.A0E((Context) null, this.A01.A00, 83436);
            this.A00 = userKey;
        }
        return userKey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r303.A03(r301, r302, null, r304) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.model.threads.ThreadSummary r302, X.C6l5 r303, boolean r304) {
        /*
            r0 = r303
            X.1Br r0 = r0.A09
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.5VX r0 = (X.5VX) r0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L6d
            r0 = r305
            X.15h r0 = r0.A01
            r305 = r0
        L1c:
            r0 = r305
            java.lang.Object r0 = r0.get()
            r305 = r0
            r0 = r305
            X.11T.A0A(r0)
            r0 = r305
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r305 = r0
            r0 = r305
            boolean r0 = r0.booleanValue()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L64
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r305 = r0
            r0 = r305
            boolean r0 = r0.A15()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L64
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r301
            r2 = r302
            r3 = 0
            r4 = r304
            boolean r0 = r0.A03(r1, r2, r3, r4)
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 == 0) goto L6a
        L64:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
        L6a:
            r0 = r306
            return r0
        L6d:
            r0 = r305
            X.15h r0 = r0.A00
            r305 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6l5.A01(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threads.ThreadSummary, X.6l5, boolean):boolean");
    }

    public final boolean A02(FbUserSession fbUserSession, ThreadKey threadKey) {
        User A00;
        11T.A0F(fbUserSession, 0);
        UserKey A0L = ThreadKey.A0L(threadKey);
        if (A0L == null || (A00 = ((23F) 1Lo.A04((Context) null, fbUserSession, this.A01.A00, 33102)).A00(A0L)) == null) {
            return false;
        }
        return A00.A1f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0336, code lost:
    
        if ((!X.CCi.A00((X.CCi) X.1Br.A0B(r301.A04), 36313110969390797L)) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03b9, code lost:
    
        if (r311 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03d8, code lost:
    
        if (X.C5yp.A00((X.C5yp) r0.get(), 36313110969259724L) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a0, code lost:
    
        if (X.1Br.A07(r301.A06).AZk(36313029365339621L) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ba, code lost:
    
        if (r321 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x022f, code lost:
    
        if (r0 != X.1F9.A0B) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x025e, code lost:
    
        if (((X.C3Q) X.1Br.A0B(r301.A07)).A00(r303, r304) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0350, code lost:
    
        if (r0 != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(com.facebook.auth.usersession.FbUserSession r302, com.facebook.messaging.model.threads.ThreadSummary r303, com.facebook.user.model.User r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6l5.A03(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.user.model.User, boolean):boolean");
    }
}
