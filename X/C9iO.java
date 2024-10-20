package X;

/* renamed from: X.9iO, reason: invalid class name */
/* loaded from: 9iO.class */
public final class C9iO {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r305 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A00(X.8Ke r301) {
        /*
            r0 = r301
            java.lang.Object r0 = r0.A0A
            r301 = r0
            r0 = r301
            boolean r0 = r0 instanceof com.facebook.messaging.highlightstab.model.HighlightsFeedContent
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L33
            r0 = r301
            com.facebook.messaging.highlightstab.model.HighlightsFeedContent r0 = (com.facebook.messaging.highlightstab.model.HighlightsFeedContent) r0
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L33
            r0 = r301
            java.lang.String r0 = r0.A0P
            r303 = r0
            java.lang.String r0 = "::"
            r304 = r0
            r0 = r301
            java.lang.String r0 = r0.A0Z
            r305 = r0
            r0 = r303
            r1 = r304
            r2 = r305
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L37
        L33:
            java.lang.String r0 = ""
            r305 = r0
        L37:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9iO.A00(X.8Ke):java.lang.String");
    }

    public static final String A01(8Ke r301, Integer num) {
        String str;
        StringBuilder A0u = 7zR.A0u();
        switch (num.intValue()) {
            case 0:
                str = "VISIBLE";
                break;
            case 1:
                str = "INVISIBLE";
                break;
            default:
                str = "FLUSH";
                break;
        }
        A0u.append(str);
        A0u.append("] ");
        A0u.append(A00(r301));
        A0u.append(" (ts: ");
        A0u.append(r301.A08);
        A0u.append(", duration: ");
        A0u.append(r301.A07);
        A0u.append(", current visibility % ");
        A0u.append(r301.A03);
        A0u.append(", max visibility % ");
        A0u.append(r301.A05);
        A0u.append(", current coverage % ");
        A0u.append(r301.A01);
        A0u.append(", max coverage % ");
        A0u.append(r301.A04);
        return 4YV.A0x(A0u);
    }
}
