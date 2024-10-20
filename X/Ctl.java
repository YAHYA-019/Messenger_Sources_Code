package X;

import android.content.Context;
import android.view.MenuItem;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Ctl.class */
public final class Ctl implements DID {
    public C1o A00 = new C1o(this);
    public CFe A01;
    public String A02;
    public final 1Br A03;
    public final DJZ A04;
    public final C15h A05;
    public final 1De A06;
    public final Bhd A07;

    public Ctl(FbUserSession fbUserSession, 1De r303, Bhd bhd, DFu dFu, DJZ djz) {
        this.A06 = r303;
        1BY r0 = r303.A00;
        this.A03 = 1Lm.A03(fbUserSession, r0, 84148);
        Context A0I = 7zQ.A0I(r0);
        Context context = dFu.getContext();
        context = context == null ? A0I : context;
        11T.A0D(context);
        1Bn.A0E((Context) null, r0, 84260);
        this.A05 = new DBe(A0I, ActionId.CARD_DATA_LOADED);
        this.A04 = djz;
        this.A07 = bhd;
        this.A02 = null;
        this.A01 = new CFe(context, fbUserSession, djz.Ay1());
    }

    private final void A00(BOf bOf) {
        CNc cNc = this.A04.Ay1().A0G;
        CPV cpv = (CPV) 1Br.A0B(this.A03);
        C5k c5k = new C5k();
        c5k.A00 = bOf;
        c5k.A02 = BOd.A06;
        String str = cNc.A08;
        if (str == null) {
            throw 1BK.A0h();
        }
        CNc.A00(c5k, cpv, cNc, str);
    }

    public void A01() {
        if (this.A04.Ay1().A0G.A0E) {
            A00(BOf.A0B);
        }
        CFe cFe = this.A01;
        BLQ blq = BLQ.A01;
        CFe.A00(blq, cFe);
        C1o c1o = cFe.A01;
        if (c1o != null) {
            c1o.A00(blq, 1BK.A0b());
        }
        cFe.A01 = null;
        ((C5U) this.A05.get()).A01 = -1;
        this.A02 = null;
    }

    public void AQj() {
        if (this.A04.Ay1().A0G.A0E) {
            A00(BOf.A0A);
        }
        MenuItem menuItem = this.A07.A00.A04;
        if (menuItem != null) {
            menuItem.expandActionView();
        }
    }

    public void ART() {
        A01();
        MenuItem menuItem = this.A07.A00.A04;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0 == X.BLQ.A01) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVt() {
        /*
            r301 = this;
            r0 = r301
            X.CFe r0 = r0.A01
            X.BLQ r0 = r0.A00
            r302 = r0
            X.BLQ r0 = X.BLQ.A05
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1d
            X.BLQ r0 = X.BLQ.A01
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L22
        L1d:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L22:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ctl.BVt():boolean");
    }
}
