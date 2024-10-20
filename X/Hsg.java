package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Hsg.class */
public final class Hsg {
    public final 5He A06 = (5He) 1Bn.A0A(49648);
    public final C00i A03 = AbH.A0I();
    public final C00i A01 = 1BQ.A01();
    public final C00i A02 = AbH.A0E();
    public final 9XD A05 = (9XD) 1Bn.A0A(68630);
    public final Hsb A04 = (Hsb) 1Bn.A0A(116149);
    public final C00i A00 = 1BQ.A02(66266);
    public final C00i A07 = 1BQ.A00();

    public void A00(JIP jip, MediaResource mediaResource) {
        ListenableFuture A01 = J5V.A01(AbF.A13(this.A02), mediaResource, this, 6);
        1Kd.A0D(this.A03, Inf.A00(jip, this, 8), A01);
    }

    public void A01(JIQ jiq, MediaResource mediaResource) {
        if (!1BK.A0N(this.A07).AZk(36323040934840507L)) {
            A00(new IVZ(jiq, this, mediaResource), mediaResource);
            return;
        }
        C00i c00i = this.A02;
        ListenableFuture A01 = J5V.A01(AbF.A13(c00i), mediaResource, this, 6);
        ListenableFuture A012 = J5V.A01(AbF.A13(c00i), mediaResource, this, 5);
        1hP A05 = 1Kd.A05(new ListenableFuture[]{A01, J5V.A01(AbF.A13(c00i), mediaResource, this, 5)});
        J5V j5v = new J5V(A012, A01, 4);
        C00i c00i2 = this.A03;
        1Kd.A0D(c00i2, Inf.A00(jiq, this, 9), A05.A01(j5v, 1BK.A1E(c00i2)));
    }
}
