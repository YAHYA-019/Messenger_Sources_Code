package X;

import java.io.File;
import java.util.Arrays;

/* renamed from: X.2qx, reason: invalid class name */
/* loaded from: 2qx.class */
public final class C2qx {
    public final File A00;
    public final boolean A01;
    public final String A02;
    public final String A03;

    public C2qx(File file, String str, String str2, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = z;
        this.A00 = file;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        if (r301.A01 != r0.A01) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.C2qx
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6c
            r0 = r302
            X.2qx r0 = (X.C2qx) r0
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.A03
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A03
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L65
            r0 = r301
            java.lang.String r0 = r0.A02
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A02
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L65
            r0 = r301
            java.io.File r0 = r0.A00
            r304 = r0
            r0 = r302
            java.io.File r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L65
            r0 = r301
            boolean r0 = r0.A01
            r306 = r0
            r0 = r302
            boolean r0 = r0.A01
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L6a
        L65:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L6a:
            r0 = r303
            return r0
        L6c:
            r0 = r301
            r1 = r302
            boolean r0 = super.equals(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2qx.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, this.A00, Boolean.valueOf(this.A01)});
    }
}
