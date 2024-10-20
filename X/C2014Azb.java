package X;

import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Azb, reason: case insensitive filesystem */
/* loaded from: Azb.class */
public final class C2014Azb extends C1rj {
    public CiO A00;
    public AnonymousClass553 A01;
    public MigColorScheme A02;

    public C2014Azb() {
        super("LandingPageCtaButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        B1H A0P = 4YU.A0P(r302);
        CiO ciO = this.A00;
        AnonymousClass553 anonymousClass553 = this.A01;
        MigColorScheme migColorScheme = this.A02;
        boolean z = A0P.A00;
        1BL.A1F(ciO, anonymousClass553);
        1Bn.A0A(114730);
        CallToAction callToAction = ciO.A00;
        String A00 = callToAction != null ? callToAction.A00() : r302.A0D(2131963400);
        CharSequence charSequence = ciO.A01;
        Cwn cwn = new Cwn(r302, anonymousClass553, 1);
        C1rq A002 = C1rg.A00(r302);
        if (migColorScheme == null || !0AT.A02(migColorScheme.BDl())) {
            A002.A0w(1.0f);
            A002.A1g(new 8CF(0));
        }
        8Ti A01 = 8oM.A01(r302);
        A01.A2a(A00);
        A01.A01.A04 = charSequence;
        A01.A2Z(migColorScheme);
        A01.A2b(z);
        A01.A2Y(cwn);
        A01.A2K("landing_page_cta_button_component");
        A002.A2f(A01.A2W());
        A002.A2K("landing_page_cta_button_row_component");
        return A002.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        Boolean valueOf;
        B1H b1h = (B1H) r303;
        CiO ciO = this.A00;
        boolean A1Z = 7zP.A1Z(ciO);
        CallToAction callToAction = ciO.A00;
        if (callToAction != null) {
            valueOf = 7zM.A17(callToAction.A0J);
            if (valueOf == null) {
                return;
            }
        } else {
            valueOf = Boolean.valueOf(A1Z);
        }
        b1h.A00 = valueOf.booleanValue();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
