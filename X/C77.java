package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C77.class */
public final class C77 {
    public final 1Br A00 = 1Bq.A00(66270);
    public final 1Br A01 = AbG.A0V();

    public final void A00(Context context, ThreadKey threadKey, boolean z) {
        1G9 A01;
        if (A01(threadKey)) {
            C00i c00i = this.A00.A00;
            boolean A07 = ((1uZ) c00i.get()).A07(threadKey);
            1uZ r0 = (1uZ) c00i.get();
            boolean z2 = !A07;
            if (r0.A06() && (A01 = 1uZ.A01(threadKey, r0)) != null) {
                1Ql.A03(A01, 1Br.A0B(r0.A00), z2);
            }
            int i = 2131963413;
            if (A07) {
                i = 2131963411;
            }
            F8q.A00(new FEd(new Object[]{threadKey.A1Q() ? "Self" : threadKey.A1K() ? "One-to-one" : threadKey.A06 == C1yg.SOCIAL_CHANNEL ? "Discoverable Social Channel" : threadKey.A1D() ? "Discoverable Broadcast Channel" : threadKey.A1P() ? "Pending Group" : threadKey.A1O() ? "Optimistic" : threadKey.A1G() ? "Group" : threadKey.A1A() ? "CC Channel" : "Unknown"}, i), (F8q) 1Hv.A02(context, 99435), false);
            if (z) {
                ((6HS) 1Hv.A02(context, 50024)).A07(threadKey, "internal only platypus toggle");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (((X.1uZ) r0.get()).A06() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01(com.facebook.messaging.model.threadkey.ThreadKey r302) {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A00
            r303 = r0
            r0 = r303
            X.00i r0 = X.AbF.A0R(r0)
            r304 = r0
            r0 = r302
            boolean r0 = r0.A1M()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2d
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.1uZ r0 = (X.1uZ) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A06()
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L32
        L2d:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L32:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77.A01(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }
}
