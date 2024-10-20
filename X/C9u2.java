package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9u2, reason: invalid class name */
/* loaded from: 9u2.class */
public final class C9u2 implements Aav {
    public static final String __redex_internal_original_name = "ContactsTabActiveNowLoaderCoordinator";
    public N4B A01;
    public final Context A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A08;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final AZF A0E;
    public final 1Br A07 = 1Bq.A00(65723);
    public final 1Br A0A = 1Bu.A00(66728);
    public final 1Br A06 = 1Bq.A00(68471);
    public final 1Br A09 = 1Bq.A00(66655);
    public final C90p A0F = new C90p(this, 0);
    public final 2Ti A0G = new A21(this, 0);
    public boolean A02 = true;
    public C9u3 A00 = new C9u3(new C9kj());
    public final C9w6 A0H = new C9w6(this, 0);

    public C9u2(Context context, FbUserSession fbUserSession, AZF azf) {
        this.A0E = azf;
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A05 = 1Bu.A01(context, 84478);
        this.A0D = 1Bu.A01(context, 33135);
        this.A0B = 1Bu.A01(context, 68671);
        this.A0C = 1Bu.A01(context, 68672);
        this.A08 = 1Lm.A00(context, fbUserSession, 68469);
    }

    public static final void A00(C9u2 c9u2) {
        if (((C2gx) 1Br.A0B(c9u2.A0A)).A00()) {
            AC8.A02(((2Tj) 1Lm.A05(c9u2.A03, c9u2.A04, 33122)).A03(), c9u2, 13);
        }
    }

    public static final void A01(C9u2 c9u2, C9u3 c9u3) {
        if (!((1XZ) 1Br.A0B(c9u2.A07)).BUJ()) {
            C9kj c9kj = new C9kj(c9u3);
            c9kj.A02 = 95Z.A04;
            C9kj.A00(c9kj, "activeNowLoaderState");
            c9kj.A06 = C9fj.A03;
            C9kj.A00(c9kj, "currentlyAndRecentlyActiveEntities");
            c9u3 = new C9u3(c9kj);
        }
        c9u2.A00 = c9u3;
        c9u2.A0E.CHn(c9u3);
    }

    @Override // X.Aav
    public void Bs2() {
    }

    @Override // X.Aav
    public void D1D(FbUserSession fbUserSession) {
        N4B n4b;
        C00i c00i = this.A07.A00;
        ((1XZ) c00i.get()).A5m(this);
        ((1XZ) c00i.get()).A77(this.A0F);
        ((2UV) 1Br.A0B(this.A05)).D1t(1BK.A0d());
        if (((C2gx) 1Br.A0B(this.A0A)).A00()) {
            ((2Tj) 1Lm.A05(this.A03, this.A04, 33122)).A05(this.A0G);
        }
        A00(this);
        if (C1ub.A00().AZk(2342164645699600982L)) {
            C00i c00i2 = this.A09.A00;
            boolean A04 = ((1fF) c00i2.get()).A04();
            if ((1fF.A00((1fF) c00i2.get()).AZk(36316671498922415L) || A04) && (n4b = this.A01) != null) {
                n4b.A05(2yD.A00(1fF.A00((1fF) c00i2.get()), A04 ? 36601333339657581L : 36598146475757471L) + 1, A04, 3);
            }
        }
        C1ua c1ua = C1ua.A01;
        boolean z = c1ua.A01() && (C1ub.A00().AZk(2342164645699469908L) || C1ub.A00().AZk(36321636489183845L));
        boolean z2 = c1ua.A02() && (C1ub.A00().AZk(2342164645699535445L) || C1ub.A00().AZk(36321636489183845L));
        if (z) {
            C9hk c9hk = (C9hk) 1Br.A0B(this.A0B);
            FbUserSession fbUserSession2 = this.A04;
            int A00 = ((int) c1ua.A00()) + 1;
            C00i c00i3 = C1ua.A00.A00;
            c9hk.A02(fbUserSession2, 1, A00, 2yD.A00(1BK.A0M(c00i3), 36602076369852101L), false, 1BK.A0M(c00i3).AZk(36320601392692809L), false);
        }
        if (z2) {
            ((C9hl) 1Br.A0B(this.A0C)).A02(this.A04, c1ua.A00() + 1, !this.A02);
            this.A02 = false;
        }
        if (1Br.A07(((9Oe) 1Br.A0B(this.A06)).A00).AZk(36323955761499489L) && C1ub.A03.A0O()) {
            ((9Zf) 1Br.A0B(this.A08)).A00();
        }
        ((C2dw) 1Br.A0B(this.A0D)).A01(this.A0H);
    }

    @Override // X.Aav
    public void D2b(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        C00i c00i = this.A07.A00;
        ((1XZ) c00i.get()).Cez(this.A0F);
        ((1XZ) c00i.get()).CeM(this);
        ((2UV) 1Br.A0B(this.A05)).AEC();
        if (((C2gx) 1Br.A0B(this.A0A)).A00()) {
            ((2Tj) 1Lm.A05(this.A03, fbUserSession, 33122)).A06(this.A0G);
        }
        N4B n4b = this.A01;
        if (n4b != null) {
            n4b.A04();
        }
        ((C9hk) 1Br.A0B(this.A0B)).A01(fbUserSession);
        ((C9hl) 1Br.A0B(this.A0C)).A01(fbUserSession);
        ((C2dw) 1Br.A0B(this.A0D)).A00();
    }

    @Override // X.Aav
    public void init() {
        ((2UV) 1Br.A0B(this.A05)).A01 = new 8HN(this, 0);
        1Bn.A0A(84354);
        N4B n4b = new N4B(this.A03, this.A04);
        this.A01 = n4b;
        n4b.A02 = new NAL() { // from class: X.9xh
            @Override // X.NAL
            public void C49(Throwable th) {
            }

            @Override // X.NAL
            public void C98(8Kl r302) {
                C9u2 c9u2 = C9u2.this;
                C9kj c9kj = new C9kj(c9u2.A00);
                c9kj.A0A = r302;
                C1pq.A08("lifeEventsResult", r302);
                C9kj.A00(c9kj, "lifeEventsResult");
                N4B n4b2 = c9u2.A01;
                c9kj.A09 = n4b2 != null ? n4b2.A03 : null;
                C9u3.A01(c9u2, c9kj, "lifeEventsLoaderState");
            }
        };
        ((C9hk) 1Br.A0B(this.A0B)).A00 = new 9tD(this, 3);
        ((C9hl) 1Br.A0B(this.A0C)).A00 = new 9tF(this);
        if (1Br.A07(((9Oe) 1Br.A0B(this.A06)).A00).AZk(36323955761499489L) && C1ub.A03.A0O()) {
            ((9Zf) 1Br.A0B(this.A08)).A02 = new AY5() { // from class: X.9x8
                @Override // X.AY5
                public void C97(8Kh r302) {
                    C9u2 c9u2 = C9u2.this;
                    C9kj c9kj = new C9kj(c9u2.A00);
                    c9kj.A08 = r302;
                    C1pq.A08("recommendedPublicChannelsResult", r302);
                    C9u3.A01(c9u2, c9kj, "recommendedPublicChannelsResult");
                }
            };
        }
    }
}
