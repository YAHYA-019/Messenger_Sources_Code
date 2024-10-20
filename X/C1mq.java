package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.1mq, reason: invalid class name */
/* loaded from: 1mq.class */
public final class C1mq {
    public final 1Br A02 = 1Bq.A00(16385);
    public final 1Br A03 = 1Bq.A00(83604);
    public final 1Br A01 = 1Bq.A00(83605);
    public final Context A00 = FbInjector.A00();

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (r302 != X.0S2.A00) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r302 = r0
            X.0et r0 = X.C0et.A0C
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L63
            r0 = r301
            X.1Br r0 = r0.A01
            java.lang.Object r0 = X.1Br.A0B(r0)
            r303 = r0
            r0 = r303
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r305 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L63
            r0 = r301
            X.1Br r0 = r0.A02
            r303 = r0
            r0 = r303
            X.00i r0 = r0.A00
            r306 = r0
            r0 = r306
            X.2yD r0 = X.1BK.A0M(r0)
            r302 = r0
            r0 = 36315748078986713(0x8104fb000025d9, double:3.0295635447067766E-306)
            r307 = r0
            r0 = r302
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L6b
            java.lang.Integer r0 = X.0S2.A01
            r302 = r0
        L55:
            java.lang.Integer r0 = X.0S2.A00
            r309 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r309
            if (r0 == r1) goto L68
        L63:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L68:
            r0 = r305
            return r0
        L6b:
            r0 = r306
            X.2yD r0 = X.1BK.A0M(r0)
            r302 = r0
            r0 = 36315748079642081(0x8104fb000a25e1, double:3.029563545121234E-306)
            r307 = r0
            r0 = r302
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb7
            r0 = r301
            android.content.Context r0 = r0.A00
            r309 = r0
            r0 = r309
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lb7
            r0 = r309
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r309 = r0
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r303 = r0
            r0 = r309
            r1 = r303
            boolean r0 = X.0Kh.A03(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb7
            java.lang.Integer r0 = X.0S2.A0C
            r302 = r0
            goto L55
        Lb7:
            java.lang.Integer r0 = X.0S2.A00
            r302 = r0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1mq.A00():boolean");
    }

    public final boolean A01() {
        if (!A00()) {
            return false;
        }
        C00i c00i = this.A02.A00;
        return 1BK.A0M(c00i).AZk(36315748079642081L) || 1BK.A0M(c00i).AZk(36315748079314396L);
    }
}
