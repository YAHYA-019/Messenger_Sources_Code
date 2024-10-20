package X;

import android.net.Uri;
import com.facebook.bloks.messenger.implementations.plugins.core.foaopencamera.OpenCamera;
import com.facebook.quicklog.reliability.CancelReason;

/* loaded from: Faw.class */
public final class Faw implements GHY {
    public final /* synthetic */ OpenCamera A00;
    public final /* synthetic */ FyG A01;
    public final /* synthetic */ FHh A02;
    public final /* synthetic */ GJj A03;
    public final /* synthetic */ GJj A04;

    public Faw(OpenCamera openCamera, FyG fyG, FHh fHh, GJj gJj, GJj gJj2) {
        this.A04 = gJj;
        this.A00 = openCamera;
        this.A01 = fyG;
        this.A02 = fHh;
        this.A03 = gJj2;
    }

    public void Bxk(Integer num) {
        String str;
        11T.A0F(num, 0);
        GJj gJj = this.A03;
        if (gJj != null) {
            1Br.A0C(this.A00.A00);
            FyG fyG = this.A01;
            switch (num.intValue()) {
                case 0:
                    str = 4YT.A00(409);
                    break;
                case 1:
                    str = "no_permission";
                    break;
                case 2:
                    str = CancelReason.USER_CANCELLED;
                    break;
                default:
                    str = "internal_error";
                    break;
            }
            DKc dKc = new DKc(C0s8.A14(fyG, str));
            FHh fHh = this.A02;
            11T.A0F(dKc, 1);
            FEK.A00(fHh, dKc, gJj);
        }
    }

    public void COQ(Uri uri) {
        11T.A0F(uri, 0);
        GJj gJj = this.A04;
        if (gJj != null) {
            FGe fGe = FGe.A02;
            Uri A00 = F06.A00(uri);
            1Br.A0C(this.A00.A00);
            DKc dKc = new DKc(C0s8.A14(DKG.A1b(A00, this.A01)));
            FHh fHh = this.A02;
            11T.A0F(dKc, 1);
            FEK.A00(fHh, dKc, gJj);
        }
    }
}
