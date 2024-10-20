package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.payments.currency.CurrencyAmount;

/* renamed from: X.6J4, reason: invalid class name */
/* loaded from: 6J4.class */
public final class C6J4 extends 6J5 {
    public 1BY A00;
    public final 6J6 A02 = (6J6) 1Bn.A0E((Context) null, (1BY) null, 99163);
    public final C00i A01 = new 1BV((1BY) null, 67860);

    public C6J4(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public int BGC() {
        return 2131959134;
    }

    public String BHd() {
        return "SEND_PAYMENT";
    }

    public void CX7(FbUserSession fbUserSession, Context context) {
        2JX r0 = ((6Ik) this).A00;
        if (((6J5) this).A00 == null || r0 == null) {
            return;
        }
        CurrencyAmount A00 = 6J5.A00(r0);
        this.A01.get();
        6J6 r02 = this.A02;
        DM3 dm3 = DM3.A0A;
        ThreadSummary threadSummary = ((6J5) this).A00;
        String A0r = r0.A0r(-923592624);
        if (A0r == null) {
            A0r = "";
        }
        6J6.A01(4YV.A0C(r02.A01), threadSummary, A00, dm3, DM4.A0Y, r02, "SEND", A0r);
    }
}
