package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqs.class */
public final class Gqs extends GS2 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final JLm A03;
    public final HG1 A04;
    public final Context A05;
    public final FbUserSession A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqs(FbUserSession fbUserSession, Context context) {
        super("LiveVideoStatusPresenter");
        int A05 = 7zP.A05(fbUserSession, context, 1);
        this.A06 = fbUserSession;
        this.A05 = context;
        this.A00 = GOn.A0Y(context, fbUserSession);
        this.A01 = 1Lm.A00(context, fbUserSession, 84176);
        this.A02 = 1Bq.A00(68474);
        this.A03 = GpZ.A00(this, 25);
        this.A04 = new Gpv(this, A05);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.HiO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.HiO, java.lang.Object] */
    public static final HiO A00(Gqs gqs) {
        JDB jdb = ((GS2) gqs).A01;
        if (!AbM.A1a(jdb)) {
            return new Object();
        }
        IZU izu = (IZU) AbM.A0r(jdb);
        ?? obj = new Object();
        izu.getClass();
        ((HiO) obj).A05 = izu.A05;
        ((HiO) obj).A03 = izu.A03;
        ((HiO) obj).A04 = izu.A04;
        ((HiO) obj).A02 = izu.A02;
        ((HiO) obj).A01 = izu.A01;
        ((HiO) obj).A00 = izu.A00;
        return obj;
    }
}
