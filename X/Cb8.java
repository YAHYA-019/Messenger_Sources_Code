package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;

/* loaded from: Cb8.class */
public final class Cb8 implements CallerContextable {
    public static final String __redex_internal_original_name = "ContactsOmnistoreIndexChangedTracker";
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 33031);
    public final C00i A01 = 1BV.A01((1BY) null, 17026);
    public final C00i A03 = 1BQ.A02(16476);

    public Cb8(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00() {
        0fH.A0A(Cb8.class, "Starting contacts reindex");
        1IB A0M = 4YU.A0M(1BK.A05(), CallerContext.A06(Cb8.class), 4YU.A0L(this.A02), 1BJ.A00(ActionId.RTMP_CONNECTION_RELEASE), true);
        1Kd.A0D(this.A03, new ApD(this, 0), A0M);
    }
}
