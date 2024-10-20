package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.9af, reason: invalid class name */
/* loaded from: 9af.class */
public final class C9af {
    public final long A00;
    public final UserFlowLogger A01;

    public C9af(UserFlowLogger userFlowLogger, long j) {
        this.A01 = userFlowLogger;
        this.A00 = j;
    }

    public final void A00(String str) {
        this.A01.flowMarkPoint(this.A00, str);
    }

    public final void A01(String str, String str2) {
        11T.A0F(str2, 1);
        this.A01.flowAnnotate(this.A00, str, str2);
    }
}
