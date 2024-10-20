package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: B7j.class */
public final class B7j extends GS2 {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final Context A09;
    public final 1Br A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7j(FbUserSession fbUserSession, Context context) {
        super("IncomingCallPresenter");
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
        this.A09 = context;
        this.A03 = 1HG.A00(context, 84949);
        this.A01 = 1Bu.A01(context, 83913);
        this.A02 = 1Lm.A00(context, fbUserSession, 99977);
        this.A04 = 1Lm.A00(context, fbUserSession, 83902);
        this.A08 = 1Lm.A00(context, fbUserSession, 17016);
        this.A05 = 1Bu.A01(context, 114960);
        this.A07 = 1Lm.A00(context, fbUserSession, 67965);
        this.A06 = 1Bu.A01(context, 82174);
        this.A0A = 1Bu.A01(context, 114982);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.Bws, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.Bws, java.lang.Object] */
    private final Bws A00() {
        if (!A0V().isPresent()) {
            return new Object();
        }
        CpH cpH = (CpH) A0V().get();
        ?? obj = new Object();
        cpH.getClass();
        obj.A04 = cpH.A04;
        obj.A05 = cpH.A05;
        obj.A01 = cpH.A01;
        obj.A02 = cpH.A02;
        obj.A03 = cpH.A03;
        obj.A00 = cpH.A00;
        obj.A06 = cpH.A06;
        return obj;
    }

    public boolean A0a() {
        return true;
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        Bws A00;
        String str;
        String str2;
        11T.A0F(jFq, 0);
        IZI.A02((JOJ) 1Br.A0B(this.A04), "CALL_UI", "SHOW_INCOMING_CALL", (java.util.Map) null);
        C00i c00i = this.A08.A00;
        HsL hsL = AbG.A0m(c00i).A03;
        if (!AbG.A0m(c00i).A0R() || hsL == null || (str = hsL.A02) == null || str.length() == 0 || (str2 = hsL.A01) == null || str2.length() == 0) {
            A00 = A00();
        } else {
            C00i c00i2 = this.A07.A00;
            IFc iFc = (IFc) c00i2.get();
            HsL hsL2 = AbG.A0m(c00i).A03;
            iFc.A0E(hsL2 == null ? null : hsL2.A04);
            IFc.A06((IFc) c00i2.get(), "milestone_join_session_joinable");
            A00 = A00();
            A00.A03 = str2;
            A00.A02 = str;
            A00.A01 = AbH.A0v(hsL.A00);
            A00.A04 = AbJ.A0j(this.A02.A00).A0S;
            c00i.get();
            A00.A06 = false;
            1Br.A0C(this.A05);
            A00.A00 = 2131964844;
            A00.A05 = AbG.A0m(c00i).A0R();
        }
        A0Z(new CpH(A00));
    }
}
