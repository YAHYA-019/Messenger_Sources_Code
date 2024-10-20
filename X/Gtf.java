package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gtf.class */
public final class Gtf extends GuG implements JPv {
    public final C01i A00;
    public final C01i A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gtf(Context context, FbUserSession fbUserSession, IOd iOd, JOW jow) {
        super(jow);
        String A00 = 4YT.A00(24);
        11T.A0F(iOd, 5);
        C03i c03i = C03i.A02;
        this.A01 = C01g.A00(c03i, new JR6(fbUserSession, context, 25));
        this.A00 = C01g.A00(c03i, new G9N(context, this, iOd, A00, 1));
    }

    @Override // X.JPv
    public JEA AXQ() {
        return (IOL) this.A00.getValue();
    }

    @Override // X.JPv
    public JJb AlW() {
        return (JJb) this.A01.getValue();
    }

    @Override // X.JQC
    public GuJ Ase() {
        GuJ guJ = JPv.A00;
        11T.A0B(guJ);
        return guJ;
    }
}
