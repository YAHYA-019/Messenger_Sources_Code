package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TransportAgnosticLogging;
import java.util.List;

/* renamed from: X.9fr, reason: invalid class name */
/* loaded from: 9fr.class */
public final class C9fr {
    public final long A00;
    public final long A01;
    public final long A02;
    public final PrivacyContext A03;

    public C9fr(long j, long j2, long j3) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = j3;
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", "210592065166328");
        11T.A0A(newPrivacyContextNative);
        this.A03 = newPrivacyContextNative;
    }

    public static final void A00(C9fr c9fr, Long l, Long l2, List list) {
        long j = 10;
        long j2 = 22;
        long j3 = c9fr.A02;
        if (j3 != 0) {
            PrivacyContext privacyContext = c9fr.A03;
            Long valueOf = Long.valueOf(c9fr.A00);
            long j4 = c9fr.A01;
            Object[] objArr = new Object[32];
            boolean A1W = 1BK.A1W(new Object[]{22, 0L, (byte) 0, valueOf, 0, 0L, (byte) 1, Long.valueOf(j), 8, 0L, (byte) 0, list, 22, 0L, (byte) 0, l, 22, 0L, (byte) 0, l2, 0, 0L, (byte) 1, Long.valueOf(j2), 0, 0L, (byte) 1}, objArr);
            System.arraycopy(new Object[]{Long.valueOf(j4), 0, 0L, (byte) 1, Long.valueOf(j3)}, A1W ? 1 : 0, objArr, 27, 5);
            TransportAgnosticLogging.logTalEventToPipe(privacyContext, A1W ? 1 : 0, A1W, 8, objArr, 9Fd.A00);
        }
    }
}
