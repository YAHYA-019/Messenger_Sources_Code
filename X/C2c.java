package X;

import android.net.Uri;

/* loaded from: C2c.class */
public final class C2c {
    public final 1Br A00 = 1Bq.A00(83603);
    public final 1Br A01 = AbG.A0L();

    public final Uri A00() {
        Uri.Builder A08 = AbM.A08("http://portal.fb.com/mobile/redirect/");
        1Br.A0B(this.A00);
        A08.appendQueryParameter("cid", "256002347743983");
        A08.appendQueryParameter("locale", ((1GS) 1Br.A0B(this.A01)).A01());
        Uri build = A08.build();
        11T.A0A(build);
        return build;
    }
}
