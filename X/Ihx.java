package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: Ihx.class */
public final class Ihx implements JGj {
    public final /* synthetic */ Fcc A00;

    public Ihx(Fcc fcc) {
        this.A00 = fcc;
    }

    @Override // X.JGj
    public final void BoU(String str, String str2) {
        String str3;
        String str4 = "off";
        String str5 = str2;
        boolean A0O = 11T.A0O(str2, str4);
        Fcc fcc = this.A00;
        CallerContext callerContext = Fcc.A0B;
        GP5 A0K = GOp.A0K(fcc.A03);
        if (A0O) {
            str3 = "closed_caption_selected";
            str5 = str;
        } else {
            str4 = "on";
            str3 = "closed_caption_selected";
        }
        GP5.A02(A0K, str3, str4, str5, null, null);
    }
}
