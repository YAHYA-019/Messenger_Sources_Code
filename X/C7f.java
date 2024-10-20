package X;

import android.content.Context;
import android.net.Uri;

/* loaded from: C7f.class */
public final class C7f {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public C7f(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 83526);
        this.A01 = 1Bu.A03(r0, 49963);
        this.A00 = 1Bu.A03(r0, 82384);
    }

    public final void A00(Context context, String str) {
        Uri A0A = AbM.A0A(new Uri.Builder().scheme("fb-messenger").authority("community"), "community_id", str);
        11T.A0A(A0A);
        ((16Y) 1Br.A0B(this.A02)).BXk(context, A0A);
    }

    public final void A01(Context context, String str) {
        11T.A0F(str, 0);
        ((CNM) 1Br.A0B(this.A00)).A02(context, str);
    }
}
