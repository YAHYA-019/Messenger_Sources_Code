package X;

import android.content.pm.PackageManager;
import java.util.Set;

/* renamed from: X.Ac0, reason: case insensitive filesystem */
/* loaded from: Ac0.class */
public final class C1258Ac0 implements 1Xc {
    public final PackageManager A00 = (PackageManager) 1Bi.A03(100169);
    public final String A01 = (String) 1Bi.A03(100173);
    public final Set A02 = 1Bn.A0I(440);
    public final Set A03 = 1Bn.A0I(441);
    public final Set A04 = 1Bn.A0I(259);

    public String BB2() {
        return "WearListenerInit";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r301.A04.isEmpty() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init() {
        /*
            r301 = this;
            r0 = -908423328(0xffffffffc9da8f60, float:-1790444.0)
            r302 = r0
            r0 = r302
            int r0 = X.0FI.A03(r0)
            r303 = r0
            r0 = r301
            java.util.Set r0 = r0.A02     // Catch: java.lang.IllegalArgumentException -> L6f
            r304 = r0
            r0 = r304
            boolean r0 = r0.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L6f
            r302 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L3e
            r0 = r301
            java.util.Set r0 = r0.A03     // Catch: java.lang.IllegalArgumentException -> L6f
            r304 = r0
            r0 = r304
            boolean r0 = r0.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L6f
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3e
            r0 = r301
            java.util.Set r0 = r0.A04     // Catch: java.lang.IllegalArgumentException -> L6f
            r304 = r0
            r0 = r304
            boolean r0 = r0.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L6f
            r302 = r0
            r0 = 2
            r306 = r0
            r0 = r302
            if (r0 != 0) goto L41
        L3e:
            r0 = 1
            r306 = r0
        L41:
            r0 = r301
            android.content.pm.PackageManager r0 = r0.A00     // Catch: java.lang.IllegalArgumentException -> L6f
            r307 = r0
            r0 = r301
            java.lang.String r0 = r0.A01     // Catch: java.lang.IllegalArgumentException -> L6f
            r308 = r0
            java.lang.Class<com.facebook.wearlistener.DataLayerListenerService> r0 = com.facebook.wearlistener.DataLayerListenerService.class
            r304 = r0
            r0 = r304
            java.lang.String r0 = r0.getName()     // Catch: java.lang.IllegalArgumentException -> L6f
            r309 = r0
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.IllegalArgumentException -> L6f
            r304 = r0
            r0 = r304
            r1 = r308
            r2 = r309
            r0.<init>(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L6f
            r0 = r307
            r1 = r304
            r2 = r306
            r3 = r305
            r0.setComponentEnabledSetting(r1, r2, r3)     // Catch: java.lang.IllegalArgumentException -> L6f
            goto L83
        L6f:
            r308 = move-exception
            r0 = r308
            java.lang.String r0 = r0.getMessage()
            r309 = r0
            java.lang.String r0 = "WearListenerInit"
            r304 = r0
            r0 = r304
            r1 = r309
            r2 = r308
            X.0fH.A0u(r0, r1, r2)
        L83:
            r0 = -1405584494(0xffffffffac387b92, float:-2.6216568E-12)
            r1 = r303
            X.0FI.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1258Ac0.init():void");
    }
}
