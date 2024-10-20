package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.0ra, reason: invalid class name */
/* loaded from: 0ra.class */
public abstract class C0ra {
    public static final String A00(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return 11T.A02(stringWriter);
    }

    public static final void A01(Throwable th, Throwable th2) {
        11T.A0H(th, th2);
        if (th != th2) {
            12H.A00.A00(th, th2);
        }
    }
}
