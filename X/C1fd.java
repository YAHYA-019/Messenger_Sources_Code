package X;

import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: X.1fd, reason: invalid class name */
/* loaded from: 1fd.class */
public abstract class C1fd {
    public 04J A00;
    public final String A03;
    public final Object A02 = new Object();
    public boolean A01 = false;

    public C1fd(String str) {
        this.A03 = str;
    }

    public static void A00(C1fd c1fd) {
        synchronized (c1fd.A02) {
            04J r0 = c1fd.A00;
            if (r0 != null && c1fd.A01) {
                1UG A08 = 1BK.A08(r0, "spurious_thread_wake_android");
                if (A08.isSampled()) {
                    try {
                        throw new RuntimeException(0Pz.A0j("SpuriousWakeup in latch ", c1fd.A03, " (No Timeout)"));
                    } catch (2LW e) {
                        A08.A7R(AnonymousClass000.A00(9), android.util.Log.getStackTraceString(e));
                        ArrayList A0s = AnonymousClass001.A0s();
                        A0s.add(e.getMessage());
                        for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                            1BK.A1N(stackTraceElement, A0s);
                        }
                        A08.A7h("parsed_stack_trace", A0s);
                        A08.BZL();
                    }
                }
            }
        }
    }

    public void A01() {
        Object obj = this.A02;
        synchronized (obj) {
            if (this.A01) {
                0fH.A0g(5000L, this.A03, "wait at most %d milliseconds until state is off");
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = 5000;
                do {
                    obj.wait(j);
                    j = (5000 - SystemClock.uptimeMillis()) + uptimeMillis;
                    if (0 >= j) {
                        break;
                    }
                } while (this.A01);
                A00(this);
            }
        }
    }
}
