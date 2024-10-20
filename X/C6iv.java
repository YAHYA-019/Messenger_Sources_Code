package X;

import android.os.Looper;
import android.os.MessageQueue;

/* renamed from: X.6iv, reason: invalid class name */
/* loaded from: 6iv.class */
public final class C6iv {
    public static final 1Br A07 = 1Bq.A00(16385);
    public Runnable A00;
    public boolean A01;
    public final 1Br A05 = 1Bq.A00(16616);
    public final 1Br A04 = 1Bq.A00(67765);
    public final 1Br A03 = 1Bq.A00(16458);
    public final MessageQueue.IdleHandler A02 = new MessageQueue.IdleHandler() { // from class: X.6iw
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
        
            if (((X.1FP) r0.get()).BWt() != false) goto L8;
         */
        @Override // android.os.MessageQueue.IdleHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean queueIdle() {
            /*
                r301 = this;
                r0 = r301
                X.6iv r0 = X.C6iv.this
                r302 = r0
                r0 = r302
                X.1Br r0 = r0.A04
                X.00i r0 = r0.A00
                r303 = r0
                r0 = r303
                java.lang.Object r0 = r0.get()
                X.1FP r0 = (X.1FP) r0
                r304 = r0
                r0 = r304
                boolean r0 = r0.BTU()
                r305 = r0
                r0 = r305
                if (r0 == 0) goto L55
                r0 = r303
                java.lang.Object r0 = r0.get()
                X.1FP r0 = (X.1FP) r0
                r304 = r0
                r0 = r304
                boolean r0 = r0.BQj()
                r305 = r0
                r0 = r305
                if (r0 == 0) goto L55
                r0 = r303
                java.lang.Object r0 = r0.get()
                X.1FP r0 = (X.1FP) r0
                r304 = r0
                r0 = r304
                boolean r0 = r0.BWt()
                r306 = r0
                r0 = 1
                r305 = r0
                r0 = r306
                if (r0 == 0) goto L5a
            L55:
                r0 = 0
                r305 = r0
                r0 = 0
                r304 = r0
            L5a:
                r0 = 1
                r307 = r0
                r0 = r305
                if (r0 == 0) goto Ldb
                r0 = r302
                X.1Br r0 = r0.A05
                X.00i r0 = r0.A00
                java.lang.Object r0 = r0.get()
                X.1Od r0 = (X.1Od) r0
                com.facebook.common.util.TriState r0 = r0.A0A()
                r303 = r0
                com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.UNSET
                r304 = r0
                r0 = r303
                r1 = r304
                if (r0 == r1) goto Ldb
                X.6pI r0 = new X.6pI
                r304 = r0
                r0 = r304
                r1 = r302
                r0.<init>(r1)
                r0 = r302
                r1 = r304
                r0.A00 = r1
                r0 = r302
                X.1Br r0 = r0.A03
                X.00i r0 = r0.A00
                java.lang.Object r0 = r0.get()
                X.1GU r0 = (X.1GU) r0
                r308 = r0
                r0 = r302
                java.lang.Runnable r0 = r0.A00
                r309 = r0
                X.1Br r0 = X.C6iv.A07
                X.00i r0 = r0.A00
                r304 = r0
                r0 = r304
                java.lang.Object r0 = r0.get()
                X.2yD r0 = (X.2yD) r0
                r310 = r0
                r0 = 36599868759544590(0x820763003d130e, double:3.2092426071537295E-306)
                r311 = r0
                r0 = r310
                r1 = r311
                r2 = 5000(0x1388, double:2.4703E-320)
                long r0 = r0.Auz(r1, r2)
                r313 = r0
                r0 = r308
                r1 = r309
                r2 = r313
                r0.CY4(r1, r2)
                r0 = 0
                r307 = r0
                r0 = r302
                r1 = 0
                r0.A01 = r1
            Ldb:
                r0 = r307
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C6iw.queueIdle():boolean");
        }
    };
    public final Runnable A06 = new Runnable() { // from class: X.6ix
        public static final String __redex_internal_original_name = "CancelIncompleteMarkersIdleScheduler$ScheduleRunnable";

        @Override // java.lang.Runnable
        public void run() {
            C6iv c6iv = C6iv.this;
            C00i c00i = c6iv.A03.A00;
            ((1GU) c00i.get()).AAs();
            if (c6iv.A00 != null) {
                ((1GU) c00i.get()).CeL(c6iv.A00);
            }
            Looper.myQueue().addIdleHandler(c6iv.A02);
            c6iv.A01 = true;
        }
    };

    public final void A00() {
        if (this.A01) {
            return;
        }
        ((1GU) this.A03.A00.get()).Ciz(this.A06);
    }
}
