package X;

/* renamed from: X.25k, reason: invalid class name */
/* loaded from: 25k.class */
public enum C25k {
    ANY,
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED_AND_PUBLIC,
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED_AND_PUBLIC,
    PUBLIC_ONLY,
    NONE,
    DEFAULT;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (java.lang.reflect.Modifier.isProtected(r302.getModifiers()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00(java.lang.reflect.Member r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.ordinal()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = 0
            if (r0 == r1) goto L44
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L28
            r0 = 2
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L34
            r0 = 3
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L46
            r0 = 0
            return r0
        L28:
            r0 = r302
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPrivate(r0)
            r1 = 1
            r0 = r0 ^ r1
            return r0
        L34:
            r0 = r302
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isProtected(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L46
        L44:
            r0 = r304
            return r0
        L46:
            r0 = r302
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25k.A00(java.lang.reflect.Member):boolean");
    }
}
