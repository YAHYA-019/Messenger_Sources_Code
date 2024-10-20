package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C92.class */
public final class C92 {
    public ThreadKey A00;
    public 6ND A01;
    public final 1Br A02;
    public final 1Br A03 = 1Bq.A00(65816);
    public final java.util.Map A04 = AnonymousClass001.A0u();
    public final 1De A05;

    public C92(1De r302) {
        this.A05 = r302;
        this.A02 = 7zM.A0h(r302, 82798);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r0.equals(r302.A0n) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L23
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L23
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L96
        L23:
            r0 = 1
            r306 = r0
            r0 = r302
            if (r0 != 0) goto L96
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L2f:
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r306
            if (r0 == 0) goto L44
            r0 = r301
            java.util.Map r0 = r0.A04
            r304 = r0
            r0 = r304
            r0.clear()
        L44:
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A00
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 == 0) goto L95
            r0 = r307
            boolean r0 = r0.A1F()
            r305 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L6e
            r0 = r307
            boolean r0 = r0.A1I()
            r305 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L95
        L6e:
            r0 = r301
            X.1De r0 = r0.A05
            X.1BY r0 = r0.A00
            com.facebook.auth.usersession.FbUserSession r0 = X.AbK.A0D(r0)
            r307 = r0
            r0 = r301
            X.1Br r0 = r0.A02
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.BBe r0 = (X.BBe) r0
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r307
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r303
            r1 = r302
            r0.A00 = r1
        L95:
            return
        L96:
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r304 = r0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92.A00(com.facebook.messaging.model.threads.ThreadSummary):void");
    }

    public final void A01(6ND r302) {
        this.A01 = r302;
        ((6NG) 1Br.A0B(this.A02)).A00 = r302 == null ? null : new Cvz(this, 6);
    }

    public final void A02(boolean z) {
        FbUserSession A0D = AbK.A0D(this.A05.A00);
        1Br.A0C(this.A02);
        11T.A0F(A0D, 0);
        if (z) {
            return;
        }
        this.A04.clear();
    }
}
