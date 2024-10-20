package X;

/* renamed from: X.0uz, reason: invalid class name */
/* loaded from: 0uz.class */
public final class C0uz implements 0XB {
    public 0vY A00;
    public C0vW A01;

    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        if (r302 instanceof C0v5) {
            C0v5 c0v5 = (C0v5) r302;
            0vY r0 = this.A00;
            if (r0 != null) {
                c0v5.A09 = r0.A03();
            }
            if (stackTraceElementArr.length != 0) {
                StackTraceElement stackTraceElement = stackTraceElementArr[0];
                if (this.A01 != null) {
                    if ("android.graphics.HardwareRenderer".equals(stackTraceElement.getClassName()) || "android.view.ThreadedRenderer".equals(stackTraceElement.getClassName())) {
                        c0v5.A0B = this.A01.A03();
                    }
                }
            }
        }
    }

    public void D6O() {
        int A00;
        if (this.A01 == null && (A00 = 5J6.A00()) >= 0) {
            this.A01 = new C0vW(A00);
            this.A00 = new 0vY(A00);
        }
        C0vW c0vW = this.A01;
        if (c0vW != null) {
            c0vW.A04();
        }
        0vY r0 = this.A00;
        if (r0 != null) {
            r0.A04();
        }
    }

    public String getName() {
        return "render_thread";
    }
}
