package X;

import android.net.Uri;

/* loaded from: Fav.class */
public final class Fav implements GHY {
    public final /* synthetic */ FHh A00;
    public final /* synthetic */ DKc A01;

    public Fav(FHh fHh, DKc dKc) {
        this.A00 = fHh;
        this.A01 = dKc;
    }

    public void Bxk(Integer num) {
        11T.A0F(num, 0);
        if (0S2.A0C == num) {
            FHh fHh = this.A00;
            Object A10 = DKC.A10(this.A01, 1);
            if (A10 instanceof FGb) {
                GJj gJj = ((FGb) A10).A00;
                F3n.A00 = fHh;
                FEK.A00(fHh, DKM.A04(), gJj);
            }
        }
    }

    public void COQ(Uri uri) {
        11T.A0F(uri, 0);
        F3z.A01(uri, this.A00, this.A01);
    }
}
