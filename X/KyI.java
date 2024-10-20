package X;

/* loaded from: KyI.class */
public abstract class KyI {
    public static final C00m A00 = M2V.A00;
    public static final KXF A01 = JSi.A05;

    public static final String A00() {
        String A02;
        StringBuilder A0k = AnonymousClass001.A0k();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        11T.A0A(stackTrace);
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            int i3 = i2 + 1;
            if (i2 > 4) {
                if (i2 > 5) {
                    StringBuilder A0u = JR0.A0u(A0k);
                    A0u.append('|');
                    A02 = AnonymousClass001.A0Z(stackTraceElement, 0CV.A0V(" ", 12), A0u);
                } else {
                    A02 = 11T.A02(stackTraceElement);
                }
                A0k.append(A02);
            }
            i++;
            i2 = i3;
        }
        return 11T.A02(A0k);
    }
}
