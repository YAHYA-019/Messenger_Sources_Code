package X;

import android.os.Build;
import android.os.Handler;

/* renamed from: X.4fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fp.class */
public final class C06044fp extends AnonymousClass013 {
    public static final boolean A02;
    public static final String[] A03;
    public final Handler A00;
    public final boolean A01;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        A02 = z;
        A03 = new String[]{"oppo", "realme", "oneplus"};
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0065, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642164874838L) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C06044fp(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            java.lang.String r0 = android.os.Build.BRAND
            r303 = r0
            java.util.Locale r0 = java.util.Locale.US
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.String r0 = r0.toLowerCase(r1)
            r303 = r0
            java.lang.String[] r0 = X.C06044fp.A03
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1 = r303
            boolean r0 = r0.contains(r1)
            r305 = r0
            java.lang.Class<X.1Dn> r0 = X.1Dn.class
            r304 = r0
            r0 = r301
            r1 = r304
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r303 = r0
            boolean r0 = X.C06044fp.A02
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L68
            r0 = r305
            if (r0 == 0) goto L68
            r0 = r303
            if (r0 == 0) goto L68
            r0 = r303
            X.00i r0 = r0.A02
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r307 = r0
            r0 = 36317642164874838(0x8106b400512e56, double:3.0307613722492985E-306)
            r308 = r0
            r0 = r307
            r1 = r308
            boolean r0 = r0.AZk(r1)
            r310 = r0
            r0 = 1
            r306 = r0
            r0 = r310
            if (r0 != 0) goto L6d
        L68:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L6d:
            r0 = r301
            r1 = r306
            r0.A01 = r1
            r0 = r302
            android.os.Handler r0 = r0.AYc()
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06044fp.<init>(X.010):void");
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "OplusActivityManagerHook";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A01) {
            this.A00.post(new Runnable() { // from class: X.3et
                public static final String __redex_internal_original_name = "OplusActivityManagerHook$$ExternalSyntheticLambda0";

                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x00bb
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                    */
                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r301 = this;
                        r0 = r301
                        X.4fp r0 = X.C06044fp.this
                        r302 = r0
                        com.facebook.common.hiddenapis2.ApiExemption.enableUnsafeExemption()
                        boolean r0 = com.facebook.common.hiddenapis2.ApiExemption.removeRestriction_DO_NOT_USE()
                        java.lang.String r0 = "OplusActivityManager"
                        r303 = r0
                        X.01a r0 = X.C01a.A00()
                        r304 = r0
                        java.lang.String r0 = "android.app.OplusActivityManager"
                        r305 = r0
                        r0 = r304
                        r1 = r305
                        java.lang.Class r0 = r0.A01(r1)     // Catch: java.lang.Throwable -> Lbb
                        r306 = r0
                        r0 = r306
                        if (r0 == 0) goto Laa
                        java.lang.String r0 = "IOplusActivityManagerSingleton"
                        r305 = r0
                        r0 = r304
                        r1 = r306
                        r2 = r305
                        java.lang.reflect.Field r0 = r0.A03(r1, r2)     // Catch: java.lang.Throwable -> Lbb
                        r306 = r0
                        r0 = 0
                        r305 = r0
                        r0 = r306
                        if (r0 == 0) goto Laa
                        r0 = r306
                        r1 = 0
                        java.lang.Object r0 = r0.get(r1)
                        r307 = r0
                        r0 = r307
                        if (r0 == 0) goto Laa
                        java.lang.String r0 = "android.util.Singleton"
                        r305 = r0
                        r0 = r304
                        r1 = r305
                        java.lang.Class r0 = r0.A01(r1)     // Catch: java.lang.Throwable -> Lbb
                        r306 = r0
                        r0 = r306
                        if (r0 == 0) goto Laa
                        java.lang.String r0 = "mInstance"
                        r305 = r0
                        r0 = r304
                        r1 = r306
                        r2 = r305
                        java.lang.reflect.Field r0 = r0.A03(r1, r2)     // Catch: java.lang.Throwable -> Lbb
                        r308 = r0
                        r0 = r308
                        if (r0 == 0) goto Laa
                        r0 = r308
                        r1 = r307
                        java.lang.Object r0 = r0.get(r1)
                        r309 = r0
                        r0 = r309
                        if (r0 == 0) goto Laa
                        java.lang.String r0 = "android.app.IOplusActivityManager"
                        r305 = r0
                        r0 = r304
                        r1 = r305
                        java.lang.Class r0 = r0.A01(r1)     // Catch: java.lang.Throwable -> Lbb
                        r306 = r0
                        r0 = r306
                        if (r0 == 0) goto Laa
                        X.01c r0 = new X.01c     // Catch: java.lang.Throwable -> Lbb
                        r305 = r0
                        r0 = r305
                        r1 = r306
                        r2 = r309
                        r3 = r303
                        r4 = 0
                        r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lbb
                        r0 = r305
                        java.lang.Object r0 = r0.A00     // Catch: java.lang.Throwable -> Lbb
                        r305 = r0
                        r0 = r308
                        r1 = r307
                        r2 = r305
                        r0.set(r1, r2)     // Catch: java.lang.Throwable -> Lbb
                    Laa:
                        X.31q r0 = new X.31q     // Catch: java.lang.Throwable -> Lbb
                        r305 = r0
                        r0 = r305
                        r1 = r302
                        r0.<init>()
                        r0 = r305
                        X.01Q.A01(r0)
                        return
                    Lbb:
                        goto Laa
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C3et.run():void");
                }
            });
            A07();
        }
    }
}
