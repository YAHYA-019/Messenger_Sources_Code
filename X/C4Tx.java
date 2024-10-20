package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4Tx, reason: invalid class name */
/* loaded from: 4Tx.class */
public final class C4Tx {
    public final FbUserSession A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C15h A06;
    public final C15h A07;

    public C4Tx(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A01 = r303;
        this.A00 = fbUserSession;
        this.A07 = new DBe(this, ActionId.ASYNC_ACTION_SUCCESS);
        this.A06 = new DBe(this, ActionId.DISPLAYED_ON_SCREEN);
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 115765);
        this.A03 = 1BK.A0C();
        this.A02 = 1Lm.A03(fbUserSession, r0, 83858);
        this.A05 = 1Bq.A00(16461);
    }
}
