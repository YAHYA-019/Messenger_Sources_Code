package X;

import java.io.FilenameFilter;

/* loaded from: Inw.class */
public final class Inw implements FilenameFilter {
    public final int A00;
    public final Object A01;

    public Inw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0055, code lost:
    
        if (X.0CV.A0Z(r303, "_ready.png", false) != false) goto L8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.io.FilenameFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean accept(java.io.File r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r304
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L5e;
                default: goto L1c;
            }
        L1c:
            r0 = r303
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r301
            java.lang.Object r0 = r0.A01
            X.I96 r0 = (X.I96) r0
            r305 = r0
            java.util.Map r0 = X.I96.A05
            r306 = r0
            r0 = r305
            java.lang.String r0 = r0.A02
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r306
            r2 = 0
            boolean r0 = X.0CV.A0b(r0, r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5b
            java.lang.String r0 = "_ready.png"
            r306 = r0
            r0 = r303
            r1 = r306
            r2 = 0
            boolean r0 = X.0CV.A0Z(r0, r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5b
        L58:
            r0 = 1
            r307 = r0
        L5b:
            r0 = r307
            return r0
        L5e:
            r0 = r301
            java.lang.Object r0 = r0.A01
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L9a
            r0 = r306
            r1 = r303
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r306 = r0
            r0 = r306
            boolean r0 = r0.matches()
            r304 = r0
            goto L93
        L7c:
            r0 = r303
            if (r0 == 0) goto L9a
            r0 = r301
            java.lang.Object r0 = r0.A01
            X.IQX r0 = (X.IQX) r0
            java.lang.String r0 = r0.A0B
            r306 = r0
            r0 = r303
            r1 = r306
            boolean r0 = r0.matches(r1)
            r304 = r0
        L93:
            r0 = r304
            if (r0 == 0) goto L9a
            goto L58
        L9a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Inw.accept(java.io.File, java.lang.String):boolean");
    }
}
