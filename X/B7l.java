package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.rsys.livevideo.gen.LiveVideoModel;
import com.google.common.collect.ImmutableList;

/* loaded from: B7l.class */
public final class B7l extends GS2 {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final CCF A0A;
    public final DFb A0B;
    public final 2QY A0C;
    public final Context A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7l(FbUserSession fbUserSession, Context context) {
        super("Rooms2LiveDrawerPluginPresenter");
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
        this.A0D = context;
        this.A0A = new CCF(this);
        this.A0B = new Cp5(this);
        this.A0C = new BHi(this, 0);
        this.A06 = 1Lm.A00(context, fbUserSession, 84219);
        this.A07 = 1Bu.A01(context, 85080);
        this.A03 = 1Lm.A00(context, fbUserSession, 85140);
        this.A01 = 1Lm.A00(context, fbUserSession, 99475);
        this.A02 = 7zM.A0Q();
        this.A04 = 1Lm.A00(context, fbUserSession, 84176);
        this.A09 = 1Lm.A00(context, fbUserSession, 99981);
        this.A05 = 1Lm.A00(context, fbUserSession, 114856);
        this.A08 = 1Lm.A00(context, fbUserSession, 33088);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r305v2, types: [java.lang.Object, X.RPE] */
    public static final void A00(B7l b7l) {
        Object obj;
        if (b7l.A0V().isPresent()) {
            RrH rrH = (RrH) b7l.A0V().get();
            ?? obj2 = new Object();
            rrH.getClass();
            ((RPE) obj2).A05 = rrH.A05;
            ((RPE) obj2).A00 = rrH.A00;
            ((RPE) obj2).A0A = rrH.A0A;
            ((RPE) obj2).A0B = rrH.A0B;
            ((RPE) obj2).A0C = rrH.A0C;
            ((RPE) obj2).A03 = rrH.A03;
            ((RPE) obj2).A06 = rrH.A06;
            ((RPE) obj2).A01 = rrH.A01;
            ((RPE) obj2).A02 = rrH.A02;
            ((RPE) obj2).A0D = rrH.A0D;
            ((RPE) obj2).A07 = rrH.A07;
            ((RPE) obj2).A09 = rrH.A09;
            ((RPE) obj2).A08 = rrH.A08;
            ((RPE) obj2).A04 = rrH.A04;
            obj = obj2;
        } else {
            obj = new Object();
        }
        obj.A01 = b7l.A0V().isPresent() ? ((RrH) b7l.A0V().get()).A02 : null;
        1Br r0 = b7l.A06;
        QqI qqI = (QqI) 0QD.A0G(((CJA) 1Br.A0B(r0)).A0G);
        if (qqI == null) {
            qqI = QqI.A0A;
        }
        obj.A02 = qqI;
        obj.A00 = ((CJA) 1Br.A0B(r0)).A00;
        obj.A0D = AnonymousClass001.A1Q(((JOS) 1Br.A0B(b7l.A01)).AVX(), 24);
        obj.A0C = ((CJA) 1Br.A0B(r0)).A0A;
        obj.A08 = ((CJA) 1Br.A0B(r0)).A07;
        obj.A04 = ((CJA) 1Br.A0B(r0)).A02;
        obj.A07 = ((CJA) 1Br.A0B(r0)).A06;
        obj.A09 = ((CJA) 1Br.A0B(r0)).A04;
        obj.A03 = ((CJA) 1Br.A0B(r0)).A01;
        obj.A05 = ((CJA) 1Br.A0B(r0)).A03;
        obj.A06 = ((JOM) 1Br.A0B(b7l.A05)).A09.isEmpty() ? ImmutableList.builder().build() : ((2QU) 1Br.A0B(b7l.A09)).Aar();
        obj.A0A = false;
        b7l.A0Z(new RrH(obj));
    }

    private final boolean A01() {
        2JS A01 = ((2JN) 1Br.A0B(this.A08)).A01();
        2JQ r0 = LiveVideoModel.CONVERTER;
        11T.A0B(r0);
        LiveVideoModel liveVideoModel = (LiveVideoModel) A01.A02(r0);
        C00i c00i = this.A04.A00;
        boolean z = false;
        if ((((I5k) c00i.get()).A09 != null || (liveVideoModel != null && liveVideoModel.liveStreamStatus == 1)) && !((I5k) c00i.get()).A0A) {
            z = true;
        }
        return z;
    }

    public void A0b() {
        ((CIm) 1Br.A0B(this.A03)).A03(this.A0B);
        1Br r0 = this.A06;
        ((CJA) 1Br.A0B(r0)).A05(false);
        CJA cja = (CJA) 1Br.A0B(r0);
        CCF ccf = this.A0A;
        11T.A0F(ccf, 0);
        cja.A0F.remove(ccf);
        ((2QT) 1Br.A0B(this.A09)).CeZ(this.A0C);
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        11T.A0F(jFq, 0);
        C00i c00i = this.A04.A00;
        if (!((I5k) c00i.get()).A0A && !A01()) {
            ((CJA) 1Br.A0B(this.A06)).A05(true);
        }
        1Br r0 = this.A06;
        CJA cja = (CJA) 1Br.A0B(r0);
        String str = ((I5k) c00i.get()).A08;
        if (cja.A05 == null) {
            cja.A05 = str;
        }
        ((CJA) 1Br.A0B(r0)).A08 = ((I5k) c00i.get()).A09;
        if (A01()) {
            ((CJA) 1Br.A0B(r0)).A02(QqI.A07);
            ((CJA) 1Br.A0B(r0)).A03(BLd.A07);
        }
        CJA cja2 = (CJA) 1Br.A0B(r0);
        CCF ccf = this.A0A;
        11T.A0F(ccf, 0);
        cja2.A0F.add(ccf);
        ((CIm) 1Br.A0B(this.A03)).A02(this.A0B);
        ((2QT) 1Br.A0B(this.A09)).A67(this.A0C);
        C00i c00i2 = this.A07.A00;
        C65 c65 = (C65) c00i2.get();
        1G1 r02 = this.A00;
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("input", r02.A05);
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "FetchPrivateSharingQuery", (String) null, "fbandroid", -955521014, 0, 1290535816L, 1290535816L, false, true));
        ((C3sb) A0L).A00 = 2;
        1BY r03 = c65.A00;
        1Vd A0I = AbK.A0I(r03);
        C00i c00i3 = c65.A02;
        1Kd.A0D(c00i3, D4p.A00(AbF.A0B(r02, r03, 84219), c65, 61), A0I.A0A(A0L, 1BK.A1E(c00i3)));
        C65 c652 = (C65) c00i2.get();
        1BY r04 = c652.A00;
        String A0A = ((2Qb) 1Lo.A04((Context) null, r02, r04, 17016)).A0A();
        if (A0A != null) {
            CJA cja3 = (CJA) 1Lo.A04((Context) null, r02, r04, 84219);
            cja3.A04(QwP.A01);
            GraphQlQueryParamSet A0M2 = 7zL.A0M();
            A0M2.A05("url", A0A);
            C3sa A0L2 = 7zM.A0L(A0M2, new 2Jf(2JX.class, (Class) null, "FetchEventForRoomsBroadcasts", (String) null, "fbandroid", 1994744136, 0, 583356929L, 583356929L, false, true));
            ((C3sb) A0L2).A00 = 2;
            1Vd A0I2 = AbK.A0I(r04);
            C00i c00i4 = c652.A02;
            1Kd.A0D(c00i4, D4p.A00(cja3, c652, 60), A0I2.A0A(A0L2, 1BK.A1E(c00i4)));
        }
        A00(this);
    }
}
