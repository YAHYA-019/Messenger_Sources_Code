package X;

import java.util.HashMap;

/* loaded from: Hyh.class */
public final class Hyh {
    public final JIC A00;
    public final java.util.Map A01;
    public final java.util.Map A02;

    public Hyh(JIC jic, java.util.Map map) {
        HashMap A0u = AnonymousClass001.A0u();
        this.A02 = A0u;
        if (map != null) {
            A0u.putAll(map);
        }
        this.A00 = jic;
        this.A01 = AnonymousClass001.A0u();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.Rb8 r301, X.Hyh r302, java.lang.Exception r303, java.lang.String r304, org.json.JSONObject r305, long r306) {
        /*
            java.util.HashMap r0 = X.AnonymousClass001.A0u()
            r308 = r0
            r0 = r302
            java.util.Map r0 = r0.A02
            r309 = r0
            r0 = r308
            r1 = r309
            r0.putAll(r1)
            r0 = r301
            X.Qq3 r0 = r0.A04
            java.lang.String r0 = r0.name()
            r310 = r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            r309 = r0
            r0 = r309
            X.11T.A0A(r0)
            r0 = r309
            r1 = r310
            java.lang.String r0 = X.4YU.A18(r0, r1)
            r310 = r0
            r0 = r308
            java.lang.String r1 = "segment_type"
            r2 = r310
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r301
            int r0 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r310 = r0
            java.lang.String r0 = "segment_id"
            r309 = r0
            r0 = r308
            r1 = r309
            r2 = r310
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r301
            long r0 = r0.A02
            r311 = r0
            r0 = -1
            long r0 = (long) r0
            r313 = r0
            r0 = r311
            r1 = r313
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r315 = r0
            r0 = r315
            if (r0 == 0) goto La2
            r0 = r311
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r310 = r0
            java.lang.String r0 = "chunk_size"
            r309 = r0
        L70:
            r0 = r308
            r1 = r309
            r2 = r310
            java.lang.Object r0 = r0.put(r1, r2)
        L7a:
            r0 = r305
            if (r0 == 0) goto L94
            r0 = r305
            java.lang.String r0 = X.11T.A02(r0)
            r310 = r0
            java.lang.String r0 = "debug"
            r309 = r0
            r0 = r308
            r1 = r309
            r2 = r310
            java.lang.Object r0 = r0.put(r1, r2)
        L94:
            r0 = r302
            X.JIC r0 = r0.A00
            r1 = r303
            r2 = r304
            r3 = r308
            r4 = r306
            X.HLd.A00(r0, r1, r2, r3, r4)
            return
        La2:
            r0 = r301
            long r0 = r0.A01
            r311 = r0
            r0 = r311
            r1 = r313
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r315 = r0
            r0 = r315
            if (r0 == 0) goto L7a
            r0 = r311
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r310 = r0
            java.lang.String r0 = "estimated_chunk_size"
            r309 = r0
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hyh.A00(X.Rb8, X.Hyh, java.lang.Exception, java.lang.String, org.json.JSONObject, long):void");
    }
}
