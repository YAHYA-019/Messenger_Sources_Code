package X;

import java.io.FilenameFilter;

/* renamed from: X.0d2, reason: invalid class name */
/* loaded from: 0d2.class */
public final class C0d2 implements FilenameFilter {
    public final /* synthetic */ C0d4 A00;
    public final /* synthetic */ String A01;

    public C0d2(C0d4 c0d4, String str) {
        this.A00 = c0d4;
        this.A01 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r303.equals(r301.A01) != false) goto L8;
     */
    @Override // java.io.FilenameFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean accept(java.io.File r302, java.lang.String r303) {
        /*
            r301 = this;
            java.lang.String r0 = "art_pgo_profile"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
            java.lang.String r0 = ".prof"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.endsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
            r0 = r301
            java.lang.String r0 = r0.A01
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L37
        L32:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L37:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0d2.accept(java.io.File, java.lang.String):boolean");
    }
}
