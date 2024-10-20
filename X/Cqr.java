package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.google.common.collect.ImmutableList;

/* loaded from: Cqr.class */
public final class Cqr implements DHR {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r302.A00 != X.53M.A0P) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ADX(X.C5n r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            X.BLs r0 = r0.A01
            r304 = r0
            X.BLs r0 = X.BLs.A01
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L29
            r0 = r302
            X.53M r0 = r0.A00
            r306 = r0
            X.53M r0 = X.53M.A0P
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            r1 = r304
            if (r0 == r1) goto L2e
        L29:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L2e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cqr.ADX(X.C5n):boolean");
    }

    public C91 AJH(C5n c5n) {
        11T.A0F(c5n, 0);
        ImmutableList of = ImmutableList.of((Object) new CHu(ClientDataSourceIdentifier.A0E, (ImmutableList) null));
        C83 c83 = new C83();
        c83.A00(of);
        c83.A03 = c5n.A04;
        c83.A04 = c5n.A05;
        return new C91(c83);
    }
}
