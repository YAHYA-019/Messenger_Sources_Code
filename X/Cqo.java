package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: Cqo.class */
public final class Cqo implements DHR {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r302.A00 != X.53M.A0F) goto L6;
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
            X.53M r0 = X.53M.A0F
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
        throw new UnsupportedOperationException("Method not decompiled: X.Cqo.ADX(X.C5n):boolean");
    }

    public C91 AJH(C5n c5n) {
        C83 c83 = new C83();
        ImmutableList A0e = 7zN.A0e(new CHu(ClientDataSourceIdentifier.A0E, (ImmutableList) null));
        ClientDataSourceIdentifier clientDataSourceIdentifier = ClientDataSourceIdentifier.A06;
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11012add((Object[]) new 53N[]{53N.A05, 53N.A0Q, 53N.A0E, 53N.A0F, 53N.A0G, 53N.A0H});
        c83.A00(ImmutableList.copyOf((Collection) 0QD.A0O(7zN.A0e(new CHu(clientDataSourceIdentifier, 1Fj.A01(builder))), A0e)));
        return new C91(c83);
    }
}
