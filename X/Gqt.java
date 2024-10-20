package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gqt.class */
public final class Gqt extends GS2 {
    public final JKy A00;
    public final HG5 A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final JLm A05;
    public final Context A06;
    public final FbUserSession A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqt(FbUserSession fbUserSession, Context context) {
        super("PickerListPresenter");
        1BL.A1F(fbUserSession, context);
        this.A07 = fbUserSession;
        this.A06 = context;
        this.A04 = 1Lm.A00(context, fbUserSession, 115513);
        this.A03 = 1Lm.A00(context, fbUserSession, 98491);
        this.A02 = GOn.A0Y(context, fbUserSession);
        this.A05 = GpZ.A00(this, 23);
        this.A00 = new IRU(this);
        this.A01 = new GgI(this, 13);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.HgJ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.HgJ] */
    public static final HgJ A00(Gqt gqt) {
        JDB jdb = ((GS2) gqt).A01;
        if (!AbM.A1a(jdb)) {
            return new Object();
        }
        IZT izt = (IZT) AbM.A0r(jdb);
        ?? obj = new Object();
        izt.getClass();
        ((HgJ) obj).A02 = izt.A02;
        ((HgJ) obj).A00 = izt.A00;
        ((HgJ) obj).A01 = izt.A01;
        ((HgJ) obj).A03 = izt.A03;
        return obj;
    }
}
