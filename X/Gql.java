package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mediastats.gen.MediaStatsListener;

/* loaded from: Gql.class */
public final class Gql extends GS2 {
    public 8Lr A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final MediaStatsListener A04;
    public final C15h A05;
    public final FbUserSession A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gql(FbUserSession fbUserSession, Context context) {
        super("StatsOverlayRsysPresenter");
        1BL.A1F(fbUserSession, context);
        this.A06 = fbUserSession;
        this.A01 = context;
        this.A05 = J5u.A03(this, 59);
        this.A03 = 7zM.A0O();
        this.A02 = GOn.A0W(context, fbUserSession);
        this.A04 = new QSu(this);
    }

    public void A0b() {
        C15h c15h = this.A05;
        if (c15h.get() != null) {
            ((MediaStatsApi) c15h.get()).unregisterListener(this.A04);
        }
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        11T.A0F(jFq, 0);
        C15h c15h = this.A05;
        if (c15h.get() != null) {
            ((MediaStatsApi) c15h.get()).registerListener(this.A04);
        }
        IZI A0c = GOq.A0c(this.A02);
        GOn.A1R(A0c.A01, AbN.A0X(A0c), "STATS_OVERLAY_SHOWN");
    }
}
