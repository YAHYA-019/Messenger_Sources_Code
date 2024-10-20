package X;

import java.io.File;

/* renamed from: X.3Vw, reason: invalid class name */
/* loaded from: 3Vw.class */
public final class C3Vw implements 0LF {
    public boolean A00;
    public final /* synthetic */ 4tZ A01;

    public C3Vw(4tZ r302) {
        this.A01 = r302;
    }

    public void CY5(File file) {
        4tZ r0 = this.A01;
        if (!r0.A02.equals(file) && !this.A00) {
            file.delete();
        }
        if (this.A00 && file.equals(r0.A03)) {
            this.A00 = false;
        }
    }

    public void CYH(File file) {
        if (this.A00 || !file.equals(this.A01.A03)) {
            return;
        }
        this.A00 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        if (r309.equals(r0) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void DA4(java.io.File r302) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Vw.DA4(java.io.File):void");
    }
}
