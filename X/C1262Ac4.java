package X;

import com.facebook.gk.store.GatekeeperWriter;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.Ac4, reason: case insensitive filesystem */
/* loaded from: Ac4.class */
public final class C1262Ac4 implements InterfaceC09484qQ {
    public final GatekeeperWriter A00;
    public final FbSharedPreferences A01;

    public C1262Ac4() {
        FbSharedPreferences A0i = AbJ.A0i();
        1CQ r0 = (1CQ) 1Bi.A03(131250);
        this.A01 = A0i;
        this.A00 = r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Throwable, com.facebook.common.util.TriState[]] */
    @Override // X.InterfaceC09484qQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C0D(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L95
            r0 = r301
            com.facebook.prefs.shared.FbSharedPreferences r0 = r0.A01
            X.1Ql r0 = r0.edit()
            r303 = r0
            X.1G2 r0 = X.AbstractC1256Aby.A04
            r304 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r305 = r0
            r0 = r303
            r1 = r304
            r2 = r305
            X.1Qk r0 = r0.CaH(r1, r2)
            r0 = r303
            r0.commit()
            r0 = r302
            java.lang.String r1 = "gatekeepers"
            boolean[] r0 = r0.getBooleanArray(r1)
            r307 = r0
            r0 = r301
            com.facebook.gk.store.GatekeeperWriter r0 = r0.A00
            X.1CQ r0 = (X.1CQ) r0
            r308 = r0
            r0 = r308
            X.1Bx r0 = r0.A07
            r309 = r0
            r0 = r309
            int r0 = r0.Azl()
            r310 = r0
            r0 = r310
            com.facebook.common.util.TriState[] r0 = new com.facebook.common.util.TriState[r0]
            r303 = r0
            r0 = r310
            com.facebook.common.util.TriState[] r0 = new com.facebook.common.util.TriState[r0]
            r304 = r0
            r0 = r307
            int r0 = r0.length     // Catch: java.lang.Throwable -> L94
            r311 = r0
            r0 = r311
            r1 = r310
            if (r0 != r1) goto L87
            r0 = 0
            r312 = r0
        L63:
            r0 = r312
            r1 = r310
            if (r0 >= r1) goto L87
            r0 = r307
            r1 = r312
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L94
            r311 = r0
            r0 = r311
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.valueOf(r0)     // Catch: java.lang.Throwable -> L94
            r309 = r0
            r0 = r303
            r1 = r312
            r2 = r309
            r0[r1] = r2     // Catch: java.lang.Throwable -> L94
            r0 = r312
            r1 = 1
            int r0 = r0 + r1
            r312 = r0
            goto L63
        L87:
            r0 = 1
            r311 = r0
            r0 = r308
            r1 = r303
            r2 = r304
            r3 = r311
            X.1CQ.A04(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L94
            return
        L94:
            throw r0
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1262Ac4.C0D(android.os.Bundle):void");
    }
}
