package X;

import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5ws, reason: invalid class name */
/* loaded from: 5ws.class */
public final class C5ws {
    public static final C5ws A00 = new Object();

    public static final boolean A00(User user) {
        Capabilities capabilities;
        if (user == null || (capabilities = user.A0o) == null) {
            return false;
        }
        return capabilities.A00.get(66);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (((X.C3Q) r0.get()).A00(r302, r303) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01(com.facebook.messaging.model.threads.ThreadSummary r302, com.facebook.user.model.User r303) {
        /*
            r301 = this;
            X.1BV r0 = new X.1BV
            r304 = r0
            r0 = r304
            r1 = 82518(0x14256, float:1.15632E-40)
            r0.<init>(r1)
            r0 = r303
            boolean r0 = A00(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2f
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.C3Q r0 = (X.C3Q) r0
            r306 = r0
            r0 = r306
            r1 = r302
            r2 = r303
            boolean r0 = r0.A00(r1, r2)
            r307 = r0
            r0 = 1
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L35
        L2f:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L35:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ws.A01(com.facebook.messaging.model.threads.ThreadSummary, com.facebook.user.model.User):boolean");
    }
}
