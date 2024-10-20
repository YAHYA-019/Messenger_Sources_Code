package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: Hty.class */
public abstract class Hty {
    public 2JX A00;
    public boolean A01;
    public final Context A02;
    public final 1Br A07;
    public final 1Br A04 = 1Bu.A00(98417);
    public final 1Br A03 = 1Bq.A00(115592);
    public final 1Br A05 = 1Bu.A00(115406);
    public final 1Br A06 = 1Bq.A00(99721);

    public Hty(Context context) {
        this.A02 = context;
        this.A07 = 1Bu.A01(context, 115285);
    }

    private int A00() {
        IMJ imj;
        HCR hcr;
        if (this instanceof GgF) {
            GgF ggF = (GgF) this;
            imj = (IMJ) 4YU.A0n(4YV.A0F(ggF.A02), ggF.A00, 98491);
            hcr = ggF.A02;
        } else if (this instanceof GgH) {
            GgH ggH = (GgH) this;
            imj = (IMJ) 4YU.A0n(4YV.A0F(ggH.A02), ggH.A01, 98491);
            hcr = ggH.A04;
        } else {
            if (this instanceof C2526GgG) {
                C2526GgG c2526GgG = (C2526GgG) this;
                return ((F8a) 4YU.A0n(4YV.A0F(((Hty) c2526GgG).A02), c2526GgG.A02, 99828)).A05.size();
            }
            if (this instanceof GgE) {
                GgE ggE = (GgE) this;
                imj = (IMJ) 4YU.A0n(1Br.A03(ggE.A02), ggE.A00, 98491);
                hcr = ggE.A03;
            } else if (this instanceof GgD) {
                GgD ggD = (GgD) this;
                imj = (IMJ) 4YU.A0n(1Br.A03(ggD.A02), ggD.A00, 98491);
                hcr = ggD.A03;
            } else {
                GgC ggC = (GgC) this;
                imj = (IMJ) 4YU.A0n(1Fw.A04(ggC.A00), ggC.A01, 98491);
                hcr = ggC.A03;
            }
        }
        return imj.A02(hcr);
    }

    public HCR A01() {
        return this instanceof GgD ? ((GgD) this).A03 : this instanceof GgH ? ((GgH) this).A04 : this instanceof C2526GgG ? ((C2526GgG) this).A04 : this instanceof GgE ? ((GgE) this).A03 : this instanceof GgF ? ((GgF) this).A02 : ((GgC) this).A03;
    }

    public final void A02(FbUserSession fbUserSession, HAl hAl, GKc gKc, Long l, Function1 function1, Function1 function12) {
        1BK.A1K(gKc, 2, function1);
        11T.A0F(function12, 5);
        if (A01() == HCR.A0L && !C0ft.A09() && FEO.A01((FEO) 1Br.A0B(this.A06))) {
            return;
        }
        long longValue = l != null ? l.longValue() : 1BK.A1T(1Br.A09(((HPy) 1Br.A0B(this.A05)).A00), 51K.A07) ? 0L : I8A.A01(this.A07.A00).Av9(1GD.A07, 36597351904972351L);
        int A00 = A00();
        if (this.A01) {
            return;
        }
        2JX r0 = this.A00;
        if (r0 == null || r0.getBooleanValue(-1575811850)) {
            int A002 = A00();
            boolean z = this instanceof GgF;
            int i = z ? 1 : this instanceof GgH ? ((GgH) this).A00 : this instanceof C2526GgG ? ((C2526GgG) this).A00 : 100;
            if (A002 < i) {
                if (hAl == HAl.A0D || this.A00 == null || A00 < 10) {
                    int min = Math.min(z ? 1 : this instanceof GgH ? 30 : this instanceof C2526GgG ? ((C2526GgG) this).A01 : 100, i - A00);
                    java.util.Map A003 = FGY.A00(this.A02, gKc);
                    11T.A0A(A003);
                    GraphQlCallInput A004 = F24.A00(A003);
                    ISt iSt = new ISt();
                    Integer valueOf = Integer.valueOf(min);
                    GraphQlQueryParamSet graphQlQueryParamSet = iSt.A01;
                    graphQlQueryParamSet.A04("first", valueOf);
                    iSt.A03 = AnonymousClass001.A1T(valueOf);
                    graphQlQueryParamSet.A01(A004, DKB.A00(92));
                    iSt.A02 = true;
                    iSt.A04 = DKE.A1W(graphQlQueryParamSet, "surface", z ? "MESSENGER__RTC__TOUCH_UP" : this instanceof GgH ? "MESSENGER__RTC__3P" : this instanceof C2526GgG ? "MESSENGER__RTC__GROUP_EFFECTS" : this instanceof GgE ? "MESSENGER__RTC__LIGHTING" : this instanceof GgD ? "MESSENGER__RTC__BACKGROUNDS" : "MESSENGER__RTC__AVATAR_SDK_PRESETS");
                    graphQlQueryParamSet.A05(DKB.A00(549), "SQUARE");
                    2JX r02 = this.A00;
                    graphQlQueryParamSet.A05("after", r02 != null ? r02.A0r(-77796550) : null);
                    if (this instanceof GgC) {
                        11T.A0F(iSt, 0);
                        iSt.A01.A03("includeAvatarTransparentThumbnail", AnonymousClass001.A0K());
                    } else {
                        11T.A0F(iSt, 0);
                    }
                    C3sa c3sa = (C3sa) iSt.ACe();
                    c3sa.A0A(longValue);
                    c3sa.A09(longValue);
                    if (hAl == HAl.A02) {
                        c3sa.A08(0);
                    }
                    C00i c00i = this.A04.A00;
                    Hyp hyp = (Hyp) c00i.get();
                    Hyp.A00(hyp);
                    1ED r03 = hyp.A00;
                    if (r03 == null) {
                        throw 1BK.A0h();
                    }
                    2eH A005 = 2FP.A00(InB.A00, J5R.A00(r03, fbUserSession, c3sa, this, 0), 1JU.A01);
                    this.A01 = true;
                    Imb imb = new Imb(this, 4);
                    Hyp hyp2 = (Hyp) c00i.get();
                    Hyp.A00(hyp2);
                    Executor executor = hyp2.A02;
                    if (executor == null) {
                        throw 1BK.A0h();
                    }
                    2FT A02 = 2FP.A02(imb, A005, executor);
                    Inh inh = new Inh(0, function1, this, function12);
                    Hyp hyp3 = (Hyp) c00i.get();
                    Hyp.A00(hyp3);
                    Executor executor2 = hyp3.A01;
                    if (executor2 == null) {
                        throw 1BK.A0h();
                    }
                    1Kd.A0F(inh, A02, executor2);
                }
            }
        }
    }
}
