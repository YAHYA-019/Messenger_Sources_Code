package X;

import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9a5, reason: invalid class name */
/* loaded from: 9a5.class */
public final class C9a5 {
    public final 2bX A00;
    public final 2bX A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1De A09;

    public C9a5(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A09 = r303;
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 16874);
        this.A06 = 7zM.A0Z();
        this.A08 = 7zM.A0M();
        this.A02 = 1Lm.A03(fbUserSession, r0, 68787);
        this.A07 = 1Bu.A03(r0, 100011);
        this.A03 = 1Bq.A00(68806);
        this.A05 = 7zM.A0W();
        this.A00 = new LiveData(1BK.A0d());
        this.A01 = new LiveData(8tX.A00);
    }

    public final void A00() {
        7zP.A0O(this.A06).A01(this.A01, 8tW.A00);
        C9rb.A00(7zQ.A0M(this.A04).A03(), this, 20);
    }
}
