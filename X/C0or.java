package X;

import java.io.FileFilter;

/* renamed from: X.0or, reason: invalid class name */
/* loaded from: 0or.class */
public final class C0or implements FileFilter {
    public final int A00;
    public final Object A01;

    public C0or(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r304.endsWith(r305) != false) goto L10;
     */
    @Override // java.io.FileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean accept(java.io.File r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r302
            java.lang.String r0 = r0.getName()
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L3c
            java.lang.String r0 = "large_"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.startsWith(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L35
            r0 = r302
            java.lang.String r0 = r0.getName()
            r304 = r0
            java.lang.String r0 = "_anr_prop.txt"
            r305 = r0
        L26:
            r0 = r304
            r1 = r305
            boolean r0 = r0.endsWith(r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L3a
        L35:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L3a:
            r0 = r303
            return r0
        L3c:
            java.lang.String r0 = "anr_report_"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.startsWith(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L35
            r0 = r302
            java.lang.String r0 = r0.getName()
            r304 = r0
            java.lang.String r0 = ".dmp"
            r305 = r0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0or.accept(java.io.File):boolean");
    }
}
