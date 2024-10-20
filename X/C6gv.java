package X;

import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadParticipant;

/* renamed from: X.6gv, reason: invalid class name */
/* loaded from: 6gv.class */
public final class C6gv {
    public final 1Br A00 = 1Bq.A00(16387);
    public final 1Br A01 = 1Bq.A00(33013);

    public static final boolean A00(ThreadParticipant threadParticipant) {
        ParticipantInfo participantInfo;
        return (threadParticipant == null || (participantInfo = threadParticipant.A05) == null || !participantInfo.A0H.A00.get(64)) ? false : true;
    }

    public static final boolean A01(ThreadParticipant threadParticipant, C6gv c6gv) {
        boolean z = false;
        if (threadParticipant != null && ((2yD) c6gv.A00.A00.get()).AZr(1GD.A06, 72339915125098981L) && threadParticipant.A01() == 1M1.A02) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r0 != 13) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(com.facebook.messaging.model.threads.ThreadSummary r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            X.1yg r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L31
            r0 = r302
            int r0 = r0.ordinal()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            r1 = 0
            if (r0 == r1) goto L35
            r0 = 10
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L35
            r0 = 13
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L35
        L31:
            r0 = 0
            r304 = r0
            r0 = 0
            r301 = r0
        L35:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6gv.A02(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (r0.A01() != X.1M1.A09) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L5b
            r0 = r302
            boolean r0 = A02(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L5b
            r0 = r302
            com.facebook.messaging.model.threads.ThreadParticipant r0 = X.2Gt.A01(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5b
            r0 = r304
            boolean r0 = A00(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L5b
            r0 = r301
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r306 = r0
            r0 = 72339915125098981(0x10100c5001d09e5, double:7.74818695995381E-304)
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L5b
            r0 = r304
            X.1M1 r0 = r0.A01()
            r306 = r0
            X.1M1 r0 = X.1M1.A09
            r309 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            r1 = r309
            if (r0 == r1) goto L60
        L5b:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L60:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6gv.A03(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }
}
