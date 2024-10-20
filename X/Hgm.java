package X;

import android.net.Uri;
import com.facebook.video.scrubber.lite.LiteGLFrameRetriever;
import java.util.List;

/* loaded from: Hgm.class */
public final class Hgm {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final LiteGLFrameRetriever A03;

    public Hgm(Uri uri, 7Xn r303, List list) {
        11T.A0F(r303, 4);
        this.A01 = 7zM.A0P();
        this.A00 = 7zM.A0d();
        this.A02 = 1Bq.A00(115303);
        2DX r0 = (2DX) 1Bi.A03(65630);
        JL0 jl0 = (JL0) 1Bn.A0A(116360);
        C01s A0G = 4YV.A0G();
        this.A03 = new LiteGLFrameRetriever(uri, (C0dp) 1Br.A0B(this.A00), jl0, r0, new HLU(), new Ihh(A0G), new Ihi(this), list, GOp.A1G(this.A01));
    }
}
