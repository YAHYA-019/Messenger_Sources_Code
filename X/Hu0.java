package X;

import android.content.Context;
import com.facebook.videolite.transcoder.resizer.DummySurface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: Hu0.class */
public final class Hu0 {
    public DummySurface A00;
    public final Context A01;
    public final I8v A02;
    public final HuZ A03;
    public final HLh A04;
    public final I9e A05;
    public final JJJ A06;
    public final java.util.Map A07;

    public Hu0(Context context, I8v i8v, HuZ huZ, HLh hLh, I9e i9e, JJJ jjj, Ik1 ik1) {
        this.A03 = huZ;
        this.A06 = jjj;
        this.A01 = context;
        this.A02 = i8v;
        this.A05 = i9e;
        this.A04 = hLh;
        LinkedHashMap A1C = 1BK.A1C();
        this.A07 = A1C;
        if (ik1 != null) {
            1BK.A1O(ik1, A1C, 0);
        }
    }

    public final void A00(long j) {
        Iterator A0y = AnonymousClass001.A0y(this.A07);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            ((Number) A0z.getKey()).intValue();
            Ik1 ik1 = (Ik1) A0z.getValue();
            this.A04.getClass();
            ik1.ANx(j);
        }
    }

    public final void A01(long j) {
        Iterator A0y = AnonymousClass001.A0y(this.A07);
        while (A0y.hasNext()) {
            ((Ik1) GOp.A15(A0y)).CfX(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r0.A0M == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(X.Hqj r302, X.I9d r303, X.I9e r304) {
        /*
            r301 = this;
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.I8v r0 = r0.A02
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L87
            r0 = r307
            r1 = 3
            r0.A09 = r1
            r0 = 1
            r308 = r0
            r0 = r307
            boolean r0 = r0.A0M
            r305 = r0
            r0 = r305
            r1 = r308
            if (r0 != r1) goto L87
        L2d:
            r0 = r308
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r306 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            r3 = r306
            java.util.ArrayList r0 = X.I9u.A00(r0, r1, r2, r3)
            r306 = r0
            r0 = r306
            java.util.Iterator r0 = r0.iterator()
            r309 = r0
        L45:
            r0 = r309
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L86
            r0 = r309
            java.lang.Object r0 = r0.next()
            X.I4o r0 = (X.I4o) r0
            r306 = r0
            r0 = r306
            boolean r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L45
            r0 = r304
            boolean r0 = r0.A0M()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L86
            r0 = r307
            if (r0 == 0) goto L86
            r0 = 7
            r305 = r0
            r0 = r307
            r1 = r305
            r0.A09 = r1
        L86:
            return
        L87:
            r0 = 0
            r308 = r0
            r0 = 0
            r309 = r0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hu0.A02(X.Hqj, X.I9d, X.I9e):void");
    }
}
