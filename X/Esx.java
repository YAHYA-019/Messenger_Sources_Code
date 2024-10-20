package X;

import android.content.Context;

/* loaded from: Esx.class */
public final class Esx {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DZC A01;

    public Esx(Context context, DZC dzc) {
        this.A01 = dzc;
        this.A00 = context;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.Dee, android.app.Dialog] */
    public void A00() {
        DZC dzc = this.A01;
        Context context = this.A00;
        DZC.A06(dzc);
        ?? c2125Dee = new C2125Dee(context);
        dzc.A00 = c2125Dee;
        c2125Dee.setCancelable(false);
        C2125Dee c2125Dee2 = dzc.A00;
        if (c2125Dee2 != null) {
            c2125Dee2.A05(true);
        }
        C2125Dee c2125Dee3 = dzc.A00;
        if (c2125Dee3 != null) {
            c2125Dee3.A04(7zO.A0D(dzc).getString(2131957324));
        }
        DMV dmv = dzc.A00;
        if (dmv != null) {
            dmv.show();
        }
    }
}
