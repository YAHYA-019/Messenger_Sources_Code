package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: I9H.class */
public final class I9H {
    public static final AtomicInteger A08 = new AtomicInteger();
    public final long A00;
    public final HAy A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public I9H(HAy hAy) {
        this(hAy, "", 0L);
    }

    public I9H(HAy hAy, String str, long j) {
        this.A01 = hAy;
        this.A04 = AnonymousClass001.A0s();
        this.A06 = AnonymousClass001.A0s();
        this.A07 = AnonymousClass001.A0s();
        this.A00 = j;
        this.A02 = TextUtils.isEmpty(str) ? Integer.toString(A08.getAndIncrement()) : str;
        this.A05 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0u();
    }

    public void A00(float f) {
        long j = -1;
        this.A07.add(new Rau(new I9V(TimeUnit.SECONDS, j, j), f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r302.A02(r0) < 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(X.I9V r302, float r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 > 0) goto L49
            r0 = r303
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 >= 0) goto L6e
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r307 = r0
            r0 = r302
            r1 = r307
            long r0 = r0.A03(r1)
            r308 = r0
            r0 = 0
            r310 = r0
            r0 = r308
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 > 0) goto L6e
            r0 = r302
            r1 = r307
            long r0 = r0.A02(r1)
            r308 = r0
            r0 = r308
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 >= 0) goto L6e
        L49:
            r0 = 1
            r304 = r0
        L4b:
            r0 = r304
            java.lang.String r1 = "Not supported"
            X.IFX.A07(r0, r1)
            r0 = r301
            java.util.List r0 = r0.A07
            r305 = r0
            X.Rau r0 = new X.Rau
            r312 = r0
            r0 = r312
            r1 = r302
            r2 = r303
            r0.<init>(r1, r2)
            r0 = r305
            r1 = r312
            boolean r0 = r0.add(r1)
            return
        L6e:
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9H.A01(X.I9V, float):void");
    }

    public void A02(HuY huY) {
        this.A04.add(huY);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, boolean] */
    public void A03(RSc rSc) {
        ?? add;
        try {
            add = this.A05.add(rSc);
        } catch (IllegalArgumentException unused) {
            throw AnonymousClass001.A0U(add);
        }
    }
}
