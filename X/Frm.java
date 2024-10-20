package X;

import android.content.Context;

/* loaded from: Frm.class */
public final class Frm implements C0w6 {
    public final C00i A01 = AbH.A0D();
    public final C00i A00 = 1BQ.A01();

    public void A00(Context context, String str) {
        DKC.A0f(this.A01).A05().A0A(context, AbG.A05().setData(C0A2.A00(this, str.equalsIgnoreCase("p2p_send") ? "https://www.facebook.com/help/contact/1032538800469748" : "https://m.facebook.com/help/contact/1431129123688414?ref=payment_review")));
    }

    @Override // X.C0w6
    public void Cfz(String str) {
        1BK.A09(this.A00).D0v("DDFinalNoticeStepController_manual_resolution", str);
    }

    @Override // X.C0w6
    public void Cg0(String str, String str2, Throwable th) {
        C01s A09 = 1BK.A09(this.A00);
        if (th == null) {
            th = new Throwable();
        }
        A09.softReport("DDFinalNoticeStepController_manual_resolution", str2, th);
    }
}
