package X;

import android.os.Bundle;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.stickers.model.Sticker;

/* loaded from: Hpb.class */
public final class Hpb {
    public 2eS A00;
    public 1BY A01;
    public final C00i A04 = 1BQ.A02(16470);
    public final C00i A02 = 7zN.A0D(33031);
    public final C00i A03 = 1BQ.A01();

    public Hpb(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    public void A00(Sticker sticker, JGb jGb) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("sticker", sticker);
        1IB A00 = 1Ho.A00(((BlueServiceOperationFactory) this.A02.get()).newInstance_DEPRECATED(1BJ.A00(59), A05), true);
        C2487Gei c2487Gei = new C2487Gei(jGb, this, 12);
        this.A00 = new 2eS(c2487Gei, A00);
        1Kd.A0D(this.A04, c2487Gei, A00);
    }
}
