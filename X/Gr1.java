package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gr1.class */
public final class Gr1 extends GS2 {
    public boolean A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final HDW A0A;
    public final HFz A0B;
    public final JIf A0C;
    public final JFf A0D;
    public final 2Qn A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gr1(Context context, FbUserSession fbUserSession) {
        super("CoWatchPlaybackPresenter");
        11T.A0F(fbUserSession, 2);
        this.A01 = fbUserSession;
        this.A05 = 1Bq.A00(115792);
        this.A07 = 1Lm.A00(context, fbUserSession, 115519);
        this.A08 = 1Lm.A00(context, fbUserSession, 115520);
        this.A09 = GOn.A0V(context, fbUserSession);
        this.A04 = 1Bu.A01(context, 115390);
        this.A02 = 1Bq.A00(115528);
        this.A03 = 1Lm.A00(context, fbUserSession, 99500);
        this.A06 = 1Lm.A00(context, fbUserSession, 115396);
        this.A0B = new C2731Gmg(this);
        this.A0D = new IYf(this);
        this.A0A = new C2729Gme(this, 2);
        this.A0E = IYv.A00(this, 16);
        this.A0C = new Gpp(this, 4);
    }

    /* JADX WARN: Type inference failed for: r311v3, types: [X.RP2, java.lang.Object] */
    public static final void A00(Gr1 gr1, boolean z) {
        RP2 rp2;
        boolean A1S = GOq.A1S(gr1.A09);
        boolean z2 = false;
        boolean A1W = AnonymousClass001.A1W(((I2J) AbF.A0R(gr1.A02).get()).A00, 0S2.A01);
        C00i c00i = gr1.A05.A00;
        boolean A00 = R0a.A00(((Hdu) c00i.get()).A00);
        boolean z3 = !A1S && (((Hdu) c00i.get()).A01 || A1W || A00);
        if (z && !A1S && !A1W) {
            z2 = true;
        }
        JDB jdb = ((GS2) gr1).A01;
        if (AbM.A1a(jdb)) {
            RrL rrL = (RrL) AbM.A0r(jdb);
            ?? obj = new Object();
            rrL.getClass();
            ((RP2) obj).A03 = rrL.A03;
            ((RP2) obj).A00 = rrL.A00;
            ((RP2) obj).A01 = rrL.A01;
            ((RP2) obj).A04 = rrL.A04;
            ((RP2) obj).A05 = rrL.A05;
            ((RP2) obj).A06 = rrL.A06;
            ((RP2) obj).A07 = rrL.A07;
            ((RP2) obj).A08 = rrL.A08;
            ((RP2) obj).A09 = rrL.A09;
            ((RP2) obj).A02 = rrL.A02;
            rp2 = obj;
        } else {
            rp2 = new RP2();
        }
        rp2.A05 = A1W;
        rp2.A09 = z3;
        rp2.A03 = z2;
        1Br.A0B(gr1.A08);
        rp2.A02 = null;
        rp2.A06 = A00;
        rp2.A07 = A1S;
        C00i c00i2 = gr1.A03.A00;
        rp2.A04 = ((I99) c00i2.get()).A02;
        rp2.A00 = ((I99) c00i2.get()).A00;
        rp2.A01 = ((I99) c00i2.get()).A01;
        rp2.A08 = gr1.A00;
        gr1.A0Z(new RrL(rp2));
    }
}
