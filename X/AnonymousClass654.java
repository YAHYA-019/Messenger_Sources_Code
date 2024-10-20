package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.concurrent.TimeUnit;

/* renamed from: X.654, reason: invalid class name */
/* loaded from: 654.class */
public final class AnonymousClass654 {
    public final 1Br A02 = 1Bq.A00(16385);
    public final 1Br A00 = 1Bq.A00(99390);
    public final 1Br A01 = 1Bu.A00(83430);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0067, code lost:
    
        if (X.1BK.A0M(r0).AZr(r0, 36320859090468605L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A02
            r302 = r0
            r0 = r302
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36320859090927360(0x8109a1000d3f00, double:3.032795769238435E-306)
            r305 = r0
            X.1GD r0 = X.1GD.A07
            r307 = r0
            r0 = r304
            r1 = r307
            r2 = r305
            boolean r0 = r0.AZr(r1, r2)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L6a
            r0 = r303
            X.2yD r0 = X.1BK.A0M(r0)
            r304 = r0
            r0 = 36320859090861823(0x8109a1000c3eff, double:3.032795769196989E-306)
            r305 = r0
            r0 = r304
            r1 = r307
            r2 = r305
            boolean r0 = r0.AZr(r1, r2)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L6a
            r0 = r303
            X.2yD r0 = X.1BK.A0M(r0)
            r304 = r0
            r0 = 36320859090468605(0x8109a100063efd, double:3.0327957689483164E-306)
            r305 = r0
            r0 = r304
            r1 = r307
            r2 = r305
            boolean r0 = r0.AZr(r1, r2)
            r309 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r302 = r0
            r0 = r309
            if (r0 == 0) goto L6d
        L6a:
            r0 = 1
            r308 = r0
        L6d:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass654.A00():boolean");
    }

    public final boolean A01(Message message) {
        boolean z = false;
        if (((C0dp) this.A00.A00.get()).now() - message.A05 < TimeUnit.MINUTES.toMillis(((2yD) this.A02.A00.get()).Auy(36602334067496751L))) {
            z = true;
        }
        return z;
    }

    public final boolean A02(ThreadSummary threadSummary) {
        2yD A07;
        long j;
        boolean z = false;
        if (threadSummary != null) {
            ThreadKey threadKey = threadSummary.A0n;
            11T.A0A(threadKey);
            if (5yJ.A00(threadSummary) || threadKey.A1D() || 2oI.A03(threadSummary)) {
                A07 = 1Br.A07(this.A02);
                j = 36320859090927360L;
            } else if (threadKey.A1B()) {
                A07 = 1Br.A07(this.A02);
                j = 36320859090468605L;
            } else if (threadKey.A1L() || threadKey.A1I()) {
                A07 = (2yD) this.A02.A00.get();
                j = 36320859090861823L;
            }
            z = A07.AZk(j);
        }
        return z;
    }
}
