package X;

import java.util.Set;

/* loaded from: Kq8.class */
public final class Kq8 {
    public String A00;
    public Set A01;
    public final L9t A02;
    public volatile Boolean A03;

    public Kq8(L9t l9t) {
        this.A02 = l9t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r0.equals(r0) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Set A00() {
        /*
            r301 = this;
            X.L7V r0 = X.Kz3.A00
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r303 = r0
            r0 = r301
            java.util.Set r0 = r0.A01
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2a
            r0 = r301
            java.lang.String r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2a
            r0 = r302
            r1 = r303
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L6c
        L2a:
            java.lang.String r0 = ","
            r302 = r0
            r0 = r303
            r1 = r302
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r1)
            r306 = r0
            java.util.HashSet r0 = X.AnonymousClass001.A0v()
            r304 = r0
            r0 = r306
            int r0 = r0.length
            r307 = r0
            r0 = 0
            r308 = r0
        L40:
            r0 = r308
            r1 = r307
            if (r0 >= r1) goto L62
            r0 = r306
            r1 = r308
            r0 = r0[r1]
            r302 = r0
            r0 = r302
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L6e
            r305 = r0
            r0 = r304
            r1 = r305
            X.AnonymousClass001.A1J(r0, r1)     // Catch: java.lang.NumberFormatException -> L6e
        L59:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L40
        L62:
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r301
            r1 = r304
            r0.A01 = r1
        L6c:
            r0 = r304
            return r0
        L6e:
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kq8.A00():java.util.Set");
    }
}
