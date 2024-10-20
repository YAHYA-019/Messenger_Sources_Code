package X;

import android.os.Message;
import android.os.Process;
import java.lang.reflect.Method;

/* renamed from: X.14j, reason: invalid class name */
/* loaded from: 14j.class */
public final class C14j extends 0vF {
    public static final String __redex_internal_original_name = "MessageQueueLooperRealme";
    public 0X9 A00;

    public String A03() {
        return "looperRealme";
    }

    public void A04() {
        0X9 r0;
        Method method;
        Object obj;
        Message message = ((0X5) this).A00;
        if (message != null && (method = (r0 = this.A00).A02) != null && (obj = r0.A00) != null) {
            try {
                method.invoke(obj, message, Integer.valueOf(Process.myPid()), true);
            } catch (Throwable unused) {
            }
        }
        super.A04();
    }
}
