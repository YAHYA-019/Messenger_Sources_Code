package X;

import android.net.Uri;
import com.facebook.bloks.messenger.implementations.plugins.core.resizeimage.ResizeImage;

/* loaded from: Ex6.class */
public final class Ex6 {
    public final /* synthetic */ ResizeImage A00;
    public final /* synthetic */ FyG A01;
    public final /* synthetic */ FHh A02;
    public final /* synthetic */ GJj A03;
    public final /* synthetic */ GJj A04;

    public Ex6(ResizeImage resizeImage, FyG fyG, FHh fHh, GJj gJj, GJj gJj2) {
        this.A04 = gJj;
        this.A00 = resizeImage;
        this.A01 = fyG;
        this.A02 = fHh;
        this.A03 = gJj2;
    }

    public void A00(Uri uri) {
        11T.A0F(uri, 0);
        GJj gJj = this.A04;
        if (gJj != null) {
            1Br.A0C(this.A00.A00);
            FyG fyG = this.A01;
            FGe fGe = FGe.A02;
            DKc dKc = new DKc(C0s8.A14(DKG.A1b(F06.A00(uri), fyG)));
            FHh fHh = this.A02;
            11T.A0F(dKc, 1);
            FEK.A00(fHh, dKc, gJj);
        }
    }

    public void A01(Integer num) {
        Object obj;
        GJj gJj = this.A03;
        if (gJj != null) {
            1Br.A0C(this.A00.A00);
            FyG fyG = this.A01;
            switch (num.intValue()) {
                case 0:
                    obj = "file_not_found";
                    break;
                case 1:
                    obj = "invalid_parameter";
                    break;
                default:
                    obj = "internal_error";
                    break;
            }
            DKc dKc = new DKc(C0s8.A14(fyG, obj));
            FHh fHh = this.A02;
            11T.A0F(dKc, 1);
            FEK.A00(fHh, dKc, gJj);
        }
    }
}
