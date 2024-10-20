package X;

import android.net.Uri;
import java.util.Set;

/* loaded from: Bnb.class */
public final class Bnb {
    public final Uri.Builder A00;
    public final Set A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r302.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Bnb(java.lang.String r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            if (r0 == 0) goto L17
            r0 = r302
            int r0 = r0.length()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            if (r0 != 0) goto L1a
        L17:
            r0 = 1
            r305 = r0
        L1a:
            r0 = r305
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
            java.lang.String r0 = "Check failed."
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L83
            r0 = r303
            int r0 = r0.length()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L3a
            r0 = r307
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        L3a:
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r307 = r0
            r0 = r307
            r0.<init>()
            r0 = r307
            java.lang.String r1 = "fb"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "page"
            android.net.Uri$Builder r0 = r0.authority(r1)
            r1 = r302
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            r306 = r0
            java.lang.String r0 = "referrer"
            r307 = r0
            r0 = r306
            r1 = r307
            r2 = r303
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
            r306 = r0
            r0 = r306
            X.11T.A0A(r0)
            r0 = r301
            r1 = r306
            r0.A00 = r1
            X.0WH r0 = X.AbI.A07()
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A01 = r1
            r0 = r306
            r1 = r307
            boolean r0 = r0.add(r1)
            return
        L83:
            r0 = r307
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bnb.<init>(java.lang.String, java.lang.String):void");
    }
}
