package X;

/* renamed from: X.0ux, reason: invalid class name */
/* loaded from: 0ux.class */
public final class C0ux implements 0XB {
    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        if (r302 instanceof C0v5) {
            C0v5 c0v5 = (C0v5) r302;
            0Dj.A00();
            long[] jArr = 0Dj.A01;
            c0v5.A02 = jArr[23];
            c0v5.A01 = jArr[24];
            c0v5.A00 = jArr[14];
            long[] jArr2 = new long[8];
            C0dl.A02("/proc/self/status", jArr2, AnonymousClass027.A00);
            c0v5.A03 = jArr2[7];
        }
    }

    public void D6O() {
    }

    public String getName() {
        return "swap";
    }
}
