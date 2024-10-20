package X;

import com.facebook.acra.constants.ActionId;
import java.util.Arrays;

/* loaded from: L0c.class */
public final class L0c {
    public Throwable A00;
    public final int A01;
    public final int A02;
    public final long A03 = System.nanoTime();
    public final String A04;
    public final int A05;

    public L0c(int i, int i2, String str, int i3) {
        this.A02 = i;
        this.A04 = str;
        this.A05 = i2;
        this.A01 = i3;
    }

    public static Throwable A00(L0c l0c) {
        Throwable th = l0c.A00;
        if (th == null) {
            RuntimeException A0T = AnonymousClass001.A0T(0Pz.A0F(l0c.A05, "Binder description: ", l0c.A04, " code: "));
            l0c.A00 = A0T;
            StackTraceElement[] stackTrace = A0T.getStackTrace();
            int i = 0;
            while (true) {
                int i2 = i;
                int length = stackTrace.length;
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (!stackTraceElement.getClassName().equals(AnonymousClass000.A00(ActionId.DISPLAYED_ON_SCREEN)) || !stackTraceElement.getMethodName().equals("transact")) {
                    i = i2 + 1;
                } else if (i2 != 0) {
                    l0c.A00.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2, length));
                }
            }
            th = l0c.A00;
        }
        return th;
    }
}
