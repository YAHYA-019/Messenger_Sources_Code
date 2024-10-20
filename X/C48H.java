package X;

import java.util.Locale;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.48H, reason: invalid class name */
/* loaded from: 48H.class */
public final class C48H {
    public static final C48H A00;
    public static final C48H A01 = new C48H("BIRTHDAY", 0);
    public static final C48H A02;
    public static final C48H A03;
    public static final C48H A04;
    public static final C48H A05;

    static {
        new C48H("MULTI_AUTHOR", 1);
        new C48H("EVENT", 2);
        new C48H("GOODWILL", 3);
        new C48H("GROUP", 4);
        new C48H("HIGHLIGHT", 5);
        A03 = new C48H("NEWSFEED", 6);
        A04 = new C48H("PAGE", 7);
        A05 = new C48H("USER", 8);
        A00 = new C48H("ARCHIVED", 9);
        A02 = new C48H("INSTAGRAM", 10);
    }

    public C48H(String str, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r301.equalsIgnoreCase("INSTAGRAM") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(java.lang.String r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L13
            java.lang.String r0 = "INSTAGRAM"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equalsIgnoreCase(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L17
        L13:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L17:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48H.A00(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r301.equalsIgnoreCase("ARCHIVED") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(java.lang.String r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L2d
            java.lang.String r0 = "USER"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equalsIgnoreCase(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2d
            java.lang.String r0 = "NEWSFEED"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equalsIgnoreCase(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2d
            r0 = r301
            java.lang.String r1 = "ARCHIVED"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L2f
        L2d:
            r0 = 1
            r303 = r0
        L2f:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48H.A01(java.lang.String):boolean");
    }

    @Override // java.lang.Enum
    public String toString() {
        return super.toString().toLowerCase(Locale.US);
    }
}
