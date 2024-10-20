package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: BtW.class */
public final class BtW {
    public final 1GU A00;
    public final 6E9 A01;
    public final AtomicLong A02 = new AtomicLong(-1);
    public final C15h A03;

    public BtW(FbUserSession fbUserSession) {
        DBe A00 = DBe.A00(this, ActionId.APPLY_OPTIMISTICS);
        1GU A0A = AbI.A0A();
        this.A01 = (6E9) 1Lo.A07(fbUserSession, 49998);
        this.A03 = A00;
        this.A00 = A0A;
    }
}
