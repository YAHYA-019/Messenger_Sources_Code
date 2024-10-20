package X;

import com.facebook.backtrace.NativeBacktrace;

/* renamed from: X.0uy, reason: invalid class name */
/* loaded from: 0uy.class */
public final class C0uy implements 0XB {
    public int A00 = -1;

    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        if (!(r302 instanceof C0v5) || this.A00 == -1 || stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return;
        }
        C0v5 c0v5 = (C0v5) r302;
        StackTraceElement stackTraceElement = stackTraceElementArr[0];
        if (stackTraceElement.isNativeMethod() && "nSyncAndDrawFrame".equals(stackTraceElement.getMethodName())) {
            c0v5.A0A = NativeBacktrace.getBacktraceNative(this.A00, 32, true, false);
        }
    }

    public void D6O() {
        int A00;
        if (this.A00 != -1 || (A00 = 5J6.A00()) < 0) {
            return;
        }
        this.A00 = A00;
    }

    public String getName() {
        return "render_thread_stack";
    }
}
