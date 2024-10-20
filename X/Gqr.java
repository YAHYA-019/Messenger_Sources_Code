package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqr.class */
public final class Gqr extends GS2 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final HFZ A03;
    public final Context A04;
    public final FbUserSession A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqr(FbUserSession fbUserSession, Context context) {
        super("ExpressionListPresenter");
        1BL.A1F(fbUserSession, context);
        this.A05 = fbUserSession;
        this.A04 = context;
        this.A02 = GOn.A0d(context, fbUserSession);
        this.A01 = GOn.A0c(context, fbUserSession);
        this.A00 = 1Lm.A00(context, fbUserSession, 114931);
        this.A03 = new Gpt(this, 4);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.HeR, java.lang.Object] */
    public static final HeR A00(Gqr gqr) {
        JDB jdb = ((GS2) gqr).A01;
        if (!AbM.A1a(jdb)) {
            return new HeR();
        }
        IZn iZn = (IZn) AbM.A0r(jdb);
        ?? obj = new Object();
        ((HeR) obj).A02 = AnonymousClass001.A0v();
        iZn.getClass();
        ((HeR) obj).A01 = iZn.A01;
        ((HeR) obj).A00 = iZn.A00;
        ((HeR) obj).A02 = AbF.A1E(iZn.A02);
        return obj;
    }
}
