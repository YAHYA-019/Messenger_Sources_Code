package X;

import java.io.FileFilter;

/* renamed from: X.0op, reason: invalid class name */
/* loaded from: 0op.class */
public final class C0op implements FileFilter {
    public final int A00;

    public C0op(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    @Override // java.io.FileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean accept(java.io.File r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            switch(r0) {
                case 0: goto L95;
                case 1: goto L2a;
                case 2: goto L9d;
                case 3: goto L4e;
                case 4: goto L5e;
                default: goto L28;
            }
        L28:
            r0 = 0
            return r0
        L2a:
            java.util.List r0 = X.C0h9.A05
            r304 = r0
            r0 = r302
            X.C0k4.A00(r0)
            r0 = r302
            boolean r0 = r0.isDirectory()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L93
            r0 = r302
            java.lang.String r0 = r0.getName()
            r305 = r0
            java.lang.String r0 = "_attach.txt"
            r304 = r0
            r0 = r305
            r1 = r304
            boolean r0 = r0.endsWith(r1)
            r303 = r0
            goto L8f
        L4e:
            r0 = r302
            if (r0 == 0) goto L28
            r0 = r302
            java.lang.String r0 = r0.getName()
            r305 = r0
            java.lang.String r0 = "_attempt"
            r304 = r0
            goto L88
        L5e:
            r0 = r302
            if (r0 == 0) goto L28
            r0 = r302
            boolean r0 = r0.isDirectory()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r302
            java.lang.String r0 = r0.getName()
            r305 = r0
            java.lang.String r0 = "session_"
            r304 = r0
            r0 = r305
            r1 = r304
            boolean r0 = r0.startsWith(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L93
            r0 = r302
            java.lang.String r0 = r0.getName()
            r305 = r0
            java.lang.String r0 = "sess_"
            r304 = r0
        L88:
            r0 = r305
            r1 = r304
            boolean r0 = r0.startsWith(r1)
            r303 = r0
        L8f:
            r0 = r303
            if (r0 == 0) goto L28
        L93:
            r0 = 1
            return r0
        L95:
            java.util.List r0 = X.C0h9.A05
            r304 = r0
            r0 = r302
            X.C0k4.A00(r0)
        L9d:
            r0 = r302
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = ".dmp"
            boolean r0 = r0.endsWith(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0op.accept(java.io.File):boolean");
    }
}
