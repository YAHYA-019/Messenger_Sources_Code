package X;

import android.content.Context;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: Hzu.class */
public final class Hzu {
    public C02353ux A00;
    public JEz A01;
    public MediaResource A02;
    public final Context A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 6wC A08;

    public Hzu(Context context) {
        11T.A0F(context, 1);
        this.A03 = context;
        this.A06 = 1Bq.A00(49642);
        this.A07 = 7zM.A0P();
        this.A04 = 1Bq.A00(16431);
        1Br A01 = 1Bu.A01(context, 50174);
        this.A05 = A01;
        this.A08 = ((C6qn) 1Br.A0B(A01)).A00(context.getResources().getDimensionPixelSize(2132279527));
    }

    public static final void A00(Hzu hzu) {
        MediaResource mediaResource = hzu.A02;
        if (mediaResource != null) {
            if (hzu.A00 == null) {
                int dimensionPixelSize = hzu.A03.getResources().getDimensionPixelSize(2132279492);
                hzu.A00 = new C02353ux(dimensionPixelSize, dimensionPixelSize, 2048.0f, 0.6666667f);
            }
            2IA A01 = 2IA.A01(mediaResource.A0E);
            A01.A0H = true;
            A01.A0I = true;
            A01.A06 = hzu.A00;
            6wC.A00(hzu.A03, (InterfaceC06384gn) null, A01.A04(), hzu.A08);
            JEz jEz = hzu.A01;
            if (jEz != null) {
                jEz.CDm(true);
            }
        }
    }
}
