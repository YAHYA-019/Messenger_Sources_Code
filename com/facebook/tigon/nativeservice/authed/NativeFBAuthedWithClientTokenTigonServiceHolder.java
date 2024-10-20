package com.facebook.tigon.nativeservice.authed;

import X.0Pz;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.C00i;
import com.facebook.common.dextricks.LogcatReader;

/* loaded from: NativeFBAuthedWithClientTokenTigonServiceHolder.class */
public class NativeFBAuthedWithClientTokenTigonServiceHolder extends NativeAuthedTigonServiceHolder {
    public final C00i A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NativeFBAuthedWithClientTokenTigonServiceHolder() {
        /*
            r301 = this;
            r0 = 83607(0x14697, float:1.17158E-40)
            r302 = r0
            r0 = r302
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.0es r0 = (X.C0es) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L64
            r0 = r303
            java.lang.String r0 = r0.AXB()
            r0 = r303
            java.lang.String r0 = r0.AXF()
            r0 = r303
            java.lang.String r0 = r0.AXB()
            r304 = r0
            r0 = r303
            java.lang.String r0 = r0.AXF()
            r303 = r0
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r304
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r303
            r1[r2] = r3
            r304 = r0
            java.lang.String r0 = "|"
            r1 = r304
            java.lang.String r0 = X.1JF.A07(r0, r1)
            r305 = r0
            X.G6h r0 = new X.G6h
            r304 = r0
            r0 = r304
            r1 = 0
            r0.<init>(r1)
            X.G6h r0 = new X.G6h
            r303 = r0
            r0 = r303
            r1 = 1
            r0.<init>(r1)
            r0 = r301
            r1 = r305
            r2 = r304
            r3 = r303
            r0.<init>(r1, r2, r3)
            X.1BQ r0 = X.1BQ.A01()
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            return
        L64:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r303 = r0
            r0 = r303
            java.lang.String r1 = "Tigon native authed client token stack is initialized without appType information"
            r0.<init>(r1)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.tigon.nativeservice.authed.NativeFBAuthedWithClientTokenTigonServiceHolder.<init>():void");
    }

    @Override // com.facebook.tigon.nativeservice.authed.NativeAuthedTigonServiceHolder
    public void broadcastInvalidToken(String str, String str2) {
        String A0W = 0Pz.A0W(1BJ.A00(250), str);
        0fH.A0n("NativeFBAuthedWithClientTokenTigonServiceHolder", A0W);
        1BK.A09(this.A00).D0w("NativeFBAuthedWithClientTokenTigonServiceHolder", A0W, LogcatReader.DEFAULT_WAIT_TIME);
    }
}
