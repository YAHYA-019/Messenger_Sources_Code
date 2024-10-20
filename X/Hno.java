package X;

import com.facebook.drawee.fbpipeline.FbDraweeView;
import java.util.concurrent.Executor;

/* loaded from: Hno.class */
public final class Hno {
    public final 1ED A00;
    public final Executor A01;

    public Hno() {
        Executor executor = (Executor) 1Bi.A03(16472);
        this.A00 = (1ED) 1Bi.A03(16431);
        this.A01 = executor;
    }

    public void A00(FbDraweeView fbDraweeView, String str, int i) {
        1Kd.A0F(Inf.A00(fbDraweeView, this, 36), this.A00.D3C(new C3iu(this, str, i, 1)), this.A01);
    }
}
