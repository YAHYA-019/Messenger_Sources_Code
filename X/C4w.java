package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: C4w.class */
public final class C4w {
    public final Context A00;
    public final C00i A04;
    public final C00i A02 = 1BV.A00(49829);
    public final C00i A01 = 1BQ.A01();
    public final C00i A03 = 1BQ.A02(82545);

    public C4w(Context context) {
        this.A00 = context;
        this.A04 = 7zL.A0R(context, 16428);
    }

    public void A00(FbUserSession fbUserSession, String str, String str2, String str3, String str4, int i, boolean z) {
        BkK bkK = (BkK) this.A03.get();
        C00i c00i = bkK.A01.A00;
        bkK.A00 = 7zN.A0c(c00i).generateNewFlowId(619057579);
        AbI.A1U(7zN.A0c(c00i), "messenger_inbox", bkK.A00, false);
        ((5iG) this.A02.get()).A08(new C1606Amn(this, 2), 0Pz.A0j(str, ".", str2), new DBD(fbUserSession, this, str2, str, str3, str4, i, z));
    }
}
