package X;

/* loaded from: K6g.class */
public final class K6g extends K6n {
    public static K6g A00;

    public static String A00(Object obj) {
        String str;
        String valueOf;
        if (obj == null) {
            valueOf = null;
        } else {
            if (obj instanceof Integer) {
                obj = 1BK.A0l(AnonymousClass001.A03(obj));
            }
            str = "-";
            if (!(obj instanceof Long)) {
                return obj instanceof Boolean ? String.valueOf(obj) : obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
            }
            long abs = Math.abs(AnonymousClass001.A05(obj));
            long j = 100;
            valueOf = String.valueOf(obj);
            if (abs >= j) {
                str = JQx.A00(valueOf) != '-' ? "" : "-";
                String valueOf2 = String.valueOf(abs);
                StringBuilder A0n = AnonymousClass001.A0n(str);
                int length = valueOf2.length();
                A0n.append(Math.round(Math.pow(10.0d, length - 1)));
                A0n.append("...");
                A0n.append(str);
                return AnonymousClass001.A0h(A0n, Math.round(Math.pow(10.0d, length) - 1.0d));
            }
        }
        return valueOf;
    }

    public final void A0J(L2Y l2y, String str) {
        A0F(1BL.A0s("Discarding hit. ", str), l2y != null ? l2y.toString() : "no hit data");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r0.equals(r313) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K(java.lang.Object r302, java.lang.Object r303, java.lang.Object r304, java.lang.String r305, int r306) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6g.A0K(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, int):void");
    }
}
