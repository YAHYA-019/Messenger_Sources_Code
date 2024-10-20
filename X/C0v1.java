package X;

import android.os.Process;
import com.facebook.backtrace.NativeBacktrace;

/* renamed from: X.0v1, reason: invalid class name */
/* loaded from: 0v1.class */
public final class C0v1 implements 0XB {
    public static final String[] A00 = {"android.", "java.", "dalvik.", "com.android.", "sun."};

    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        if (!(r302 instanceof C0v5) || stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return;
        }
        C0v5 c0v5 = (C0v5) r302;
        StackTraceElement stackTraceElement = stackTraceElementArr[0];
        if (stackTraceElement.isNativeMethod()) {
            String className = stackTraceElement.getClassName();
            String[] strArr = A00;
            int i = 0;
            while (!className.startsWith(strArr[i])) {
                i++;
                if (i >= 5) {
                    c0v5.A08 = NativeBacktrace.getBacktraceNative(Process.myPid(), 32, true, false);
                    return;
                }
            }
        }
    }

    public void D6O() {
    }

    public String getName() {
        return "native_stack";
    }
}
