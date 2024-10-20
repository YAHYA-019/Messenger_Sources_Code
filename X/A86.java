package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import java.util.concurrent.TimeUnit;

/* loaded from: A86.class */
public final class A86 implements 5VY {
    public SessionedNotificationCenter A00;
    public final 1Uc A01;
    public final C1ko A02;

    public A86() {
        C1k8 c1k8 = new C1k8();
        c1k8.A05(5, TimeUnit.MINUTES);
        this.A02 = c1k8.A02();
        this.A01 = new A1l(this);
    }

    public static final 0Xs A00(A86 a86, long j) {
        0Ro r305;
        C1ko c1ko = a86.A02;
        Long valueOf = Long.valueOf(j);
        0Xs r0 = (0Xs) c1ko.Apt(valueOf);
        if (r0 != null) {
            return r0;
        }
        synchronized (c1ko) {
            r305 = (0Xs) c1ko.Apt(valueOf);
            if (r305 == null) {
                r305 = 7zL.A1A(new 8Ng(j));
                c1ko.CZv(valueOf, r305);
            }
        }
        return r305;
    }
}
