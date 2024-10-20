package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.6ns, reason: invalid class name */
/* loaded from: 6ns.class */
public abstract class C6ns {
    public long A00;
    public final UserFlowLogger A01;

    public C6ns(UserFlowLogger userFlowLogger) {
        11T.A0F(userFlowLogger, 1);
        this.A01 = userFlowLogger;
    }

    public static final void A00(C6ns c6ns, C00m c00m) {
        if (c6ns.A00 != 0) {
            c00m.invoke();
        }
    }

    public final void A01(String str) {
        A00(this, new C83L(str, this, 2));
    }

    public final void A02(String str, String str2) {
        11T.A0F(str2, 1);
        A00(this, new 83N(this, str, str2, 0));
    }

    public final void A03(String str, String str2) {
        A00(this, new 83N(this, str, str2, 1));
    }
}
