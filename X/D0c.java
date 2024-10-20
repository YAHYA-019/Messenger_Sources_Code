package X;

import android.os.Bundle;

/* loaded from: D0c.class */
public abstract class D0c implements DHp {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x0051
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public android.os.Bundle A00(X.C7a r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.BFR
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r301
            r304 = r0
            r0 = r301
            X.BFQ r0 = (X.BFQ) r0
            r304 = r0
            r0 = r304
            X.FcM r0 = r0.A00     // Catch: java.lang.Exception -> L51
            r305 = r0
            r0 = r305
            r0.A00()     // Catch: java.lang.Exception -> L51
            r0 = r304
            X.F7L r0 = r0.A01     // Catch: java.lang.Exception -> L51
            r306 = r0
            android.content.Intent r0 = X.AbF.A05()     // Catch: java.lang.Exception -> L51
            r304 = r0
            java.lang.String r0 = "com.facebook.messaging.payment.ACTION_PAYMENT_CARD_UPDATED"
            r305 = r0
            r0 = r304
            r1 = r305
            android.content.Intent r0 = r0.setAction(r1)     // Catch: java.lang.Exception -> L51
            r0 = r306
            X.1I7 r0 = r0.A00     // Catch: java.lang.Exception -> L51
            r305 = r0
            r0 = r305
            r1 = r304
            r0.CkS(r1)     // Catch: java.lang.Exception -> L51
        L41:
            android.os.Bundle r0 = X.1BK.A05()     // Catch: java.lang.Exception -> L51
            r306 = r0
            r0 = r306
            java.lang.String r1 = "newPaymentsResult"
            r2 = 0
            r0.putParcelable(r1, r2)
            r0 = r306
            return r0
        L51:
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D0c.A00(X.C7a):android.os.Bundle");
    }

    @Override // X.DHp
    public /* bridge */ /* synthetic */ void BLw(Bundle bundle, C7a c7a, Object obj) {
    }
}
