package X;

import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: I7p.class */
public final class I7p {
    public Hlu A03;
    public final C00i A05;
    public final C00i A07;
    public final Long A08;
    public final boolean A0D;
    public final List A0C = AnonymousClass001.A0s();
    public final Runnable A09 = new Iq7(this);
    public long A02 = 0;
    public long A00 = 0;
    public long A01 = 0;
    public boolean A04 = false;
    public final C00i A06 = AbH.A0a();
    public final Runnable A0B = new Iq8(this);
    public final Runnable A0A = new Iq9(this);

    public I7p(Context context, Hlu hlu) {
        this.A05 = 7zL.A0R(context, 115945);
        this.A07 = 7zL.A0R(context, 16430);
        this.A08 = (Long) 1Bn.A0E(context, (1BY) null, 65857);
        this.A0D = ((C6kf) 1Bn.A0E(context, (1BY) null, 66478)).A00();
        this.A03 = hlu;
    }

    public static void A00(I7p i7p) {
        C00i c00i = i7p.A07;
        ((Handler) c00i.get()).removeCallbacks(i7p.A0B);
        ((Handler) c00i.get()).removeCallbacks(i7p.A0A);
    }

    public static void A01(I7p i7p) {
        i7p.A04 = false;
        ((7Fa) i7p.A05.get()).A08();
        A00(i7p);
        i7p.A03.A00(0.0d);
    }
}
