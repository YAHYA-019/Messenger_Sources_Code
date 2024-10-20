package X;

import com.facebook.common.util.TriState;

/* renamed from: X.4DB, reason: invalid class name */
/* loaded from: 4DB.class */
public final class C4DB {
    public TriState A00;
    public TriState A01;

    public C4DB() {
        TriState triState = TriState.UNSET;
        this.A00 = triState;
        this.A01 = triState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r302.asBoolean() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.common.util.TriState r0 = r0.A00
            r302 = r0
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.UNSET
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L38
            java.lang.String r0 = "true"
            r302 = r0
            java.lang.String r0 = "fb.running_sapienz"
            r304 = r0
            r0 = r304
            java.lang.String r0 = X.0WL.A02(r0)     // Catch: java.lang.Throwable -> L2e
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2e
            r305 = r0
            r0 = r305
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.valueOf(r0)     // Catch: java.lang.Throwable -> L2e
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A00 = r1     // Catch: java.lang.Throwable -> L2e
            goto L38
        L2e:
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.NO
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A00 = r1
        L38:
            r0 = r302
            boolean r0 = r0.isSet()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L51
            r0 = r302
            boolean r0 = r0.asBoolean()
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L56
        L51:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L56:
            r0 = 0
            r307 = r0
            r0 = r305
            if (r0 == 0) goto Lab
            r0 = r301
            com.facebook.common.util.TriState r0 = r0.A01
            r302 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L92
            java.lang.String r0 = "true"
            r302 = r0
            java.lang.String r0 = "fb.running_leak_detection"
            r304 = r0
            r0 = r304
            java.lang.String r0 = X.0WL.A02(r0)     // Catch: java.lang.Throwable -> L88
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L88
            r305 = r0
            r0 = r305
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.valueOf(r0)     // Catch: java.lang.Throwable -> L88
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A01 = r1     // Catch: java.lang.Throwable -> L88
            goto L92
        L88:
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.NO
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A01 = r1
        L92:
            r0 = r302
            boolean r0 = r0.isSet()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lab
            r0 = r302
            boolean r0 = r0.asBoolean()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lab
            r0 = 1
            r307 = r0
        Lab:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4DB.A00():boolean");
    }
}
