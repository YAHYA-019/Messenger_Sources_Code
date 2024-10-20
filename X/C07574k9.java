package X;

import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4k9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4k9.class */
public final class C07574k9 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final ThreadKey A05;
    public final 4kB A06;

    public C07574k9(ThreadKey threadKey) {
        this.A05 = threadKey;
        1Br A00 = 1Bu.A00(362);
        this.A03 = A00;
        this.A01 = 1Bq.A00(85048);
        this.A04 = 1Bu.A00(66979);
        this.A06 = ((82O) A00.A00.get()).A0c(threadKey);
        this.A02 = 1Bq.A00(85050);
        this.A00 = 1Bq.A00(49223);
    }

    public static final List A00(4lD r301) {
        Integer valueOf;
        1qX r0 = (1qX) r301;
        07F r02 = new 07F(r0.mResultSet.getCount() - 1, 0, -1);
        ArrayList arrayList = new ArrayList();
        07I it = r02.iterator();
        while (it.hasNext()) {
            String string = r0.mResultSet.getString(it.A00(), 31);
            if (string != null && string.length() != 0 && (valueOf = Integer.valueOf(string.hashCode())) != null) {
                arrayList.add(valueOf);
            }
        }
        return arrayList;
    }

    public static final void A01(C07574k9 c07574k9, String str, int i, int i2) {
        MessagingPerformanceLogger.A03((MessagingPerformanceLogger) c07574k9.A01.A00.get()).A04(i, str);
        ((4kI) c07574k9.A04.A00.get()).A01(i2, i, str);
        synchronized (c07574k9.A02.A00.get()) {
        }
    }
}
