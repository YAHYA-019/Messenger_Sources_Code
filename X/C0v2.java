package X;

import java.io.BufferedReader;

/* renamed from: X.0v2, reason: invalid class name */
/* loaded from: 0v2.class */
public final class C0v2 implements 0XB {
    public boolean A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r0.canRead() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0v2() {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            java.lang.String r0 = "/proc/pressure/memory"
            r302 = r0
            r0 = r302
            java.io.File r0 = X.AnonymousClass001.A0E(r0)
            r303 = r0
            r0 = r303
            boolean r0 = r0.exists()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L22
            r0 = r303
            boolean r0 = r0.canRead()
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L26
        L22:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L26:
            r0 = r301
            r1 = r304
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0v2.<init>():void");
    }

    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        if (this.A00 && (r302 instanceof C0v5)) {
            C0v5 c0v5 = (C0v5) r302;
            try {
                BufferedReader A0A = AnonymousClass001.A0A(AnonymousClass001.A0E("/proc/pressure/memory"));
                try {
                    c0v5.A0E = new String[]{A0A.readLine(), A0A.readLine(), A0A.readLine()};
                } finally {
                    A0A.close();
                }
            } catch (Throwable unused) {
                this.A00 = false;
            }
        }
    }

    public void D6O() {
    }

    public String getName() {
        return "memory_pressure";
    }
}
