package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gr2.class */
public final class Gr2 extends GS2 {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final JFY A09;
    public final HGB A0A;
    public final 1HN A0B;
    public final C15h A0C;
    public final Context A0D;
    public final FbUserSession A0E;
    public final C00i A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gr2(FbUserSession fbUserSession, Context context) {
        super("ActiveCallPresenter");
        11T.A0F(fbUserSession, 1);
        this.A0E = fbUserSession;
        this.A0D = context;
        this.A06 = 1Bq.A00(83598);
        this.A05 = 1Bu.A01(context, 115463);
        this.A08 = 1BK.A0E();
        this.A07 = 1Bu.A01(context, 115685);
        this.A04 = GOn.A0a(context, fbUserSession);
        Context context2 = (Context) 1Bn.A0E(context, (1BY) null, 83719);
        this.A00 = GOn.A0X(context, fbUserSession);
        this.A0C = new J5u(context2, 44);
        this.A02 = GOn.A0W(context, fbUserSession);
        this.A01 = GOn.A0Z(context, fbUserSession);
        this.A03 = 1Lm.A00(context, fbUserSession, 82190);
        this.A0F = 1Lm.A00(context, fbUserSession, 115000);
        this.A09 = new IYI(this);
        this.A0A = new Gpl(this, 2);
        this.A0B = new Iel(this, 1);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.HbK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.HbK, java.lang.Object] */
    public static final HbK A00(Gr2 gr2) {
        JDB jdb = ((GS2) gr2).A01;
        if (AbM.A1a(jdb)) {
            IZa iZa = (IZa) AbM.A0r(jdb);
            ?? obj = new Object();
            iZa.getClass();
            ((HbK) obj).A00 = iZa.A00;
            ((HbK) obj).A01 = iZa.A01;
            return obj;
        }
        ?? obj2 = new Object();
        boolean z = false;
        if (AbL.A1H(gr2.A06) && 1Br.A09(gr2.A08).AZn(HNy.A00, false)) {
            z = true;
        }
        ((HbK) obj2).A00 = z;
        return obj2;
    }
}
