package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0v3, reason: invalid class name */
/* loaded from: 0v3.class */
public final class C0v3 implements 0XB {
    public static WeakReference A00;

    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        Thread thread;
        WeakReference weakReference = A00;
        if (weakReference == null || (thread = (Thread) weakReference.get()) == null) {
            return;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if ("runAndGet".equals(stackTraceElement.getMethodName())) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                C0v5 c0v5 = (C0v5) r302;
                int length = stackTrace.length;
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = stackTrace[i].toString();
                }
                c0v5.A07 = thread.getName();
                c0v5.A0D = strArr;
                return;
            }
        }
    }

    public void D6O() {
    }

    public String getName() {
        return "litho_layout_thread";
    }
}
