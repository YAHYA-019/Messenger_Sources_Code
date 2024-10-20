package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Dxt.class */
public final class Dxt extends C1rj {
    public View.OnClickListener A00;
    public 06Z A01;
    public FbUserSession A02;
    public 2JX A03;
    public E1Q A04;
    public GF3 A05;
    public C5ww A06;
    public AnonymousClass553 A07;
    public MigColorScheme A08;
    public ImmutableList A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public Dxt() {
        super("FxImSyncFlowLayout");
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A0B), this.A05, this.A06, this.A08, this.A07, this.A00, this.A02, this.A01, Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0E), Boolean.valueOf(this.A0F), this.A04, this.A09, this.A03, this.A0A};
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        int i3;
        2AW A2W;
        Dzu dzu = (Dzu) 4YU.A0P(r302);
        FbUserSession fbUserSession = this.A02;
        MigColorScheme migColorScheme = this.A08;
        C5ww c5ww = this.A06;
        E1Q e1q = this.A04;
        AnonymousClass553 anonymousClass553 = this.A07;
        View.OnClickListener onClickListener = this.A00;
        boolean z = this.A0C;
        boolean z2 = this.A0B;
        boolean z3 = this.A0E;
        GF3 gf3 = this.A05;
        06Z r0 = this.A01;
        2JX r02 = this.A03;
        ImmutableList immutableList = this.A09;
        String str = this.A0A;
        boolean z4 = this.A0D;
        boolean z5 = this.A0F;
        EiN eiN = dzu.A00;
        1Bn.A0A(84948);
        if (r02 == null || immutableList.isEmpty()) {
            return 7zL.A0Y();
        }
        int size = View.MeasureSpec.getSize(i2);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1S(size);
        7zM.A1O(A01, migColorScheme);
        C2ki A00 = C2kV.A00(r302);
        7zL.A1K(r302);
        E0p e0p = new E0p();
        e0p.A01 = fbUserSession;
        e0p.A06 = migColorScheme;
        e0p.A08 = str;
        e0p.A02 = r02;
        e0p.A07 = immutableList;
        e0p.A0B = z4;
        e0p.A0A = z;
        e0p.A09 = z2;
        e0p.A0D = z3;
        e0p.A0C = z5;
        e0p.A05 = c5ww;
        e0p.A03 = e1q;
        e0p.A04 = gf3;
        e0p.A00 = r0;
        A00.A01.A0L = e0p;
        A00.A02.set(0);
        A00.A2j(true);
        A00.A0R();
        A01.A2e(A00.A2W());
        boolean A1Y = DKC.A1Y(str);
        DOI doi = new DOI(4, r302, r02, migColorScheme, eiN);
        0Dc A0P = 7zP.A0P(r302.A0D);
        String A0r = r02.A0r(-559548376);
        if (A0r == null) {
            A0r = "";
        }
        A0P.A02(A0r);
        7zR.A16(A0P, doi);
        A0P.A02(DKG.A19(r02, "", -546384996));
        A0P.A00();
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        float f = 0.0f;
        A012.A0k(0.0f);
        8Ti A013 = 8oM.A01(r302);
        A013.A2Z(migColorScheme);
        if (z4) {
            i3 = -1420407166;
        } else {
            i3 = -636216569;
            if (A1Y) {
                i3 = -2001948108;
            }
        }
        A013.A2a(r02.A0r(i3));
        if (z4) {
            f = 4YU.A00(2RH.A05);
        }
        A013.A18(f);
        A013.A2Y(anonymousClass553);
        A012.A2e(A013.A2W());
        if (z4) {
            A2W = 7zL.A0Y();
        } else {
            8TU A002 = C8nm.A00(r302);
            A002.A2Y(migColorScheme);
            A002.A2Z(r02.A0r(-1673934014));
            A002.A01.A00 = onClickListener;
            4YU.A1M(A002, 2RH.A05);
            7zO.A1K(A002, 2RH.A03);
            A2W = A002.A2W();
        }
        7zO.A1C(A012, A01, A2W);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        Dzu dzu = (Dzu) r303;
        Object A0E = 1Bn.A0E(r302.A0D, (1BY) null, 99814);
        if (A0E != null) {
            dzu.A00 = (EiN) A0E;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
