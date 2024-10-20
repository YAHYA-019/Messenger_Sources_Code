package X;

import android.graphics.Bitmap;

/* renamed from: X.Gfi, reason: case insensitive filesystem */
/* loaded from: Gfi.class */
public final class C2502Gfi extends 2rI {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ JJQ A01;
    public final /* synthetic */ String A02;

    public C2502Gfi(Bitmap bitmap, JJQ jjq, String str) {
        this.A01 = jjq;
        this.A00 = bitmap;
        this.A02 = str;
    }

    public void A02(1OW r302) {
        11T.A0F(r302, 0);
        0fH.A0r("ImageFetcher", " Fail to fetch image.", r302.AlY());
        this.A01.BM3(r302.AlY());
    }

    public void A03(1OW r302) {
        if (GOp.A1V(r302)) {
            2EU A0J = GOn.A0J(r302);
            if (A0J != null) {
                this.A01.BMj(this.A00, A0J, this.A02);
                r302.AGD();
            } else {
                0fH.A0k("ImageFetcher", " Fail to fetch image, empty result.");
                this.A01.BM3(r302.AlY());
            }
        }
    }
}
