package X;

import com.facebook.vesta.VestaClient;
import java.util.concurrent.Executor;

/* loaded from: L0S.class */
public final class L0S {
    public final C1x8 A03;
    public final Kpy A04;
    public boolean A01 = false;
    public boolean A02 = false;
    public int A00 = 10;

    public L0S(C1x8 c1x8, 1Ve r303, Integer num, Executor executor) {
        this.A04 = new Kpy(new LXq(r303, executor, VestaClient.getApiVersionNative()), num);
        this.A03 = c1x8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r0 != 13) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.KOL A00(com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException r301) {
        /*
            r0 = r301
            java.lang.Throwable r0 = r0.failureReason
            r302 = r0
            r0 = r302
            boolean r0 = r0 instanceof X.KQa
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L66
            r0 = r302
            X.KQa r0 = (X.KQa) r0
            r302 = r0
            r0 = r302
            java.lang.Integer r0 = r0.vestaErrorCode
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L66
            r0 = r304
            int r0 = r0.intValue()
            r305 = r0
            X.KO9 r0 = X.KO9.A02
            r304 = r0
            r0 = r304
            int r0 = r0.value
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L35
            X.KOL r0 = X.KOL.A09
            return r0
        L35:
            X.KO9 r0 = X.KO9.A06
            r304 = r0
            r0 = r304
            int r0 = r0.value
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto La0
            X.KO9 r0 = X.KO9.A0C
            r304 = r0
            r0 = r304
            int r0 = r0.value
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L98
            X.KO9 r0 = X.KO9.A0E
            r304 = r0
            r0 = r304
            int r0 = r0.value
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L94
            X.KOL r0 = X.KOL.A07
            return r0
        L66:
            r0 = r301
            com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException$BackupExceptionType r0 = r0.exceptionType
            r304 = r0
            r0 = r304
            int r0 = r0.ordinal()
            r305 = r0
            r0 = 4
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto La4
            r0 = 9
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto La0
            r0 = 8
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L9c
            r0 = 13
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L98
        L94:
            X.KOL r0 = X.KOL.A05
            return r0
        L98:
            X.KOL r0 = X.KOL.A03
            return r0
        L9c:
            X.KOL r0 = X.KOL.A0C
            return r0
        La0:
            X.KOL r0 = X.KOL.A06
            return r0
        La4:
            X.KOL r0 = X.KOL.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L0S.A00(com.facebook.privacy.e2ee.genericimpl.backup.common.BackupException):X.KOL");
    }
}
