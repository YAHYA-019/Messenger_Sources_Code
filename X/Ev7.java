package X;

import com.facebook.inject.FbInjector;

/* loaded from: Ev7.class */
public final class Ev7 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1BP A04;
    public final 1De A05;

    public Ev7(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 85192);
        this.A04 = FbInjector.A00;
        this.A03 = 1Bu.A03(r0, 49243);
        this.A01 = 1Bq.A00(16617);
        this.A02 = AbG.A0M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        if (r0.length() == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A00() {
        /*
            r301 = this;
            android.content.Context r0 = X.7zL.A09()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)
            r302 = r0
            r0 = r301
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.A00
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)
            android.content.Context r0 = X.7zL.A09()
            r305 = r0
            r0 = r304
            r1 = r305
            int r0 = r0.A03(r1)
            boolean r0 = X.AnonymousClass001.A1O(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L52
            r0 = r301
            X.1Br r0 = r0.A02
            X.01s r0 = X.1Br.A04(r0)
            r303 = r0
            java.lang.String r0 = "attribution_sdk:AttributionDeviceProperties"
            r304 = r0
            java.lang.String r0 = "google play services not available"
            r305 = r0
        L47:
            r0 = r303
            r1 = r304
            r2 = r305
            r0.D0v(r1, r2)
            r0 = r302
            return r0
        L52:
            r0 = r303
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L98
            r305 = r0
            r0 = r305
            X.5DO r0 = (X.5DO) r0     // Catch: java.lang.Exception -> L98
            r305 = r0
            r0 = r305
            java.lang.String r0 = r0.A01()     // Catch: java.lang.Exception -> L98
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7c
            r0 = r303
            int r0 = r0.length()
            r307 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L7f
        L7c:
            r0 = 1
            r306 = r0
        L7f:
            r0 = r306
            if (r0 == 0) goto L96
            r0 = r301
            X.1Br r0 = r0.A02
            X.01s r0 = X.1Br.A04(r0)
            r303 = r0
            java.lang.String r0 = "attribution_sdk:AttributionDeviceProperties"
            r304 = r0
            java.lang.String r0 = "empty adid"
            r305 = r0
            goto L47
        L96:
            r0 = r303
            return r0
        L98:
            r308 = move-exception
            r0 = r301
            X.1Br r0 = r0.A02
            X.01s r0 = X.1Br.A04(r0)
            java.lang.String r1 = "attribution_sdk:AttributionDeviceProperties"
            java.lang.String r2 = "adid query error"
            r3 = r308
            r0.softReport(r1, r2, r3)
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ev7.A00():java.lang.String");
    }
}
