package X;

import android.text.Layout;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dfo, reason: case insensitive filesystem */
/* loaded from: Dfo.class */
public final class C2160Dfo extends AbstractC2178Dg6 {
    public ELb A00;
    public EKv A01;
    public Ehs A02;
    public Ehs A03;
    public Ehs A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;
    public Integer A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public final FAa A0C;
    public final 2cM A0D;
    public final FAa A0E;
    public final FAa A0F;

    public C2160Dfo(1Iw r302) {
        super(r302);
        this.A0D = 2cK.A01(r302, "FDSTextPairing", 0);
        FAa A00 = FAa.A00();
        A00.A06(2MR.A1j);
        this.A0F = A00;
        Ehs ehs = new Ehs();
        ehs.A01 = C1rp.SPACE_BETWEEN;
        this.A03 = ehs;
        this.A08 = 0S2.A00;
        this.A0E = FAa.A00();
        this.A02 = new Ehs();
        FAa A002 = FAa.A00();
        A002.A02();
        this.A0C = A002;
        this.A04 = new Ehs();
        this.A01 = EKv.A02;
        this.A0B = true;
    }

    public static final float A00(ELb eLb, 1Iw r302) {
        EPJ epj;
        FAL A01 = FAL.A05.A01(r302);
        int ordinal = eLb.ordinal();
        if (ordinal == 0) {
            epj = EPJ.A1O;
        } else if (ordinal == 1) {
            epj = EPJ.A1P;
        } else if (ordinal == 2) {
            epj = EPJ.A1Q;
        } else {
            if (ordinal != 3) {
                throw 1BK.A1F();
            }
            epj = EPJ.A1R;
        }
        return A01.A01(epj);
    }

    public static final C2152Dfg A01(ELb eLb, EP4 ep4, F6u f6u, 1Iw r304, CharSequence charSequence, Integer num, boolean z, boolean z2, boolean z3) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean z4 = true;
        if (charSequence.length() == 0) {
            return null;
        }
        C2152Dfg A04 = AbstractC2178Dg6.A04(r304, 0);
        A04.A05 = charSequence;
        A04.A03 = ep4;
        A04.A04 = f6u;
        switch (num.intValue()) {
            case 0:
                str = "HEADLINE";
                break;
            case 1:
                str = "BODY";
                break;
            default:
                str = "META";
                break;
        }
        AbstractC2178Dg6.A06(A04).A2J(str);
        A04.A0e(z2);
        if (!z3 || !AnonymousClass524.A00(r304.A0D)) {
            z4 = false;
        }
        AbstractC2178Dg6.A06(A04).A2Q(z4);
        A04.A0L(null);
        A04.A0d(str);
        A04.A0X(C26z.TOP, z ? 0.0f : A00(eLb, r304));
        return A04;
    }

    public static EP4 A02(ELb eLb) {
        int ordinal = eLb.ordinal();
        if (ordinal == 0) {
            return EP4.A0M;
        }
        if (ordinal == 1) {
            return EP4.A0N;
        }
        if (ordinal == 2) {
            return EP4.A0O;
        }
        if (ordinal == 3) {
            return EP4.A0Q;
        }
        throw AnonymousClass002.A0C(eLb, "Invalid FDSHierarchyLevel Level: ", AnonymousClass001.A0k());
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        11T.A0F(ezJ, 0);
        ELb eLb = this.A00;
        2cM r307 = null;
        if (eLb != null) {
            boolean z = false;
            if (this.A01 == EKv.A03) {
                1Iw r0 = super.A04;
                Integer num = 0S2.A0C;
                CharSequence charSequence = this.A07;
                F6u A01 = this.A0C.A01();
                new Object();
                EP4 A02 = A02(eLb);
                11T.A0A(A02);
                C2152Dfg A012 = A01(eLb, A02, A01, r0, charSequence, num, true, false, !this.A0B);
                if (A012 != null) {
                    this.A0D.A2d(A012.ACp(ezJ));
                    z = true;
                }
            }
            1Iw r02 = super.A04;
            Integer num2 = 0S2.A00;
            CharSequence charSequence2 = this.A06;
            F6u A013 = this.A0F.A01();
            new Object();
            EP4 A022 = FAl.A02(eLb, this.A08);
            11T.A0A(A022);
            C2152Dfg A014 = A01(eLb, A022, A013, r02, charSequence2, num2, !z, this.A0A, !this.A0B);
            if (A014 != null) {
                this.A0D.A2d(A014.ACp(ezJ));
                if (AnonymousClass524.A01(r02.A0D, true)) {
                    A014.D94("fds_headline_text_component");
                }
                z = true;
            }
            r307 = this.A0D;
            boolean z2 = !z;
            Integer num3 = 0S2.A01;
            CharSequence charSequence3 = this.A05;
            FAa fAa = this.A0E;
            CharSequence charSequence4 = this.A07;
            if (fAa.A01().A07 == null) {
                fAa.A06(charSequence4 != null ? 2MR.A1j : 2MR.A2B);
            }
            F6u A015 = fAa.A01();
            new Object();
            EP4 A016 = FAl.A01(eLb);
            11T.A0A(A016);
            C2152Dfg A017 = A01(eLb, A016, A015, r02, charSequence3, num3, z2, false, !this.A0B);
            if (A017 != null) {
                r307.A2d(A017.ACp(ezJ));
                z = true;
            }
            if (this.A01 == EKv.A02) {
                Integer num4 = 0S2.A0C;
                CharSequence charSequence5 = this.A07;
                F6u A018 = this.A0C.A01();
                new Object();
                EP4 A023 = A02(eLb);
                11T.A0A(A023);
                C2152Dfg A019 = A01(eLb, A023, A018, r02, charSequence5, num4, !z, false, !this.A0B);
                if (A019 != null) {
                    r307.A2d(A019.ACp(ezJ));
                }
            }
            List list = this.A09;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r307.A2d((C1rs) it.next());
                }
            }
            if (AnonymousClass524.A01(r02.A0D, true)) {
                r307.A1r(7zO.A0U(GB1.A00));
            }
        }
        return r307;
    }

    public final void A0f(Layout.Alignment alignment) {
        11T.A0F(alignment, 0);
        int i = EZs.A00[alignment.ordinal()];
        EMl eMl = i != 1 ? i != 2 ? EMl.A03 : EMl.A04 : EMl.A02;
        this.A0F.A07(eMl);
        this.A0E.A07(eMl);
        this.A0C.A07(eMl);
    }

    public final void A0g(DgA dgA) {
        if (dgA != null) {
            this.A05 = dgA.A02;
            dgA.A00(this.A0E);
        }
    }

    public final void A0h(DgB dgB) {
        if (dgB != null) {
            this.A06 = dgB.A02;
            this.A08 = dgB.A00;
            dgB.A00(this.A0F);
        }
    }

    public final void A0i(DgC dgC) {
        if (dgC != null) {
            this.A07 = dgC.A02;
            dgC.A00(this.A0C);
            this.A01 = dgC.A00;
        }
    }

    public final void A0j(FAa fAa) {
        this.A0E.A08(fAa.A01());
    }

    public final void A0k(FAa fAa) {
        if (fAa != null) {
            this.A0F.A08(fAa.A01());
        }
    }

    @Override // X.AbstractC2178Dg6
    public int AZ1(EzJ ezJ) {
        11T.A0F(ezJ, 0);
        ELb eLb = this.A00;
        if (eLb == null) {
            throw AnonymousClass001.A0q("hierarchyLevel not set");
        }
        1Iw r0 = super.A04;
        FAL fal = ezJ.A04;
        EP4 A02 = FAl.A02(eLb, this.A08);
        11T.A0A(A02);
        int A00 = Qzg.A00(fal, A02, r0);
        if (this.A01 == EKv.A03) {
            if (this.A0C.A01 != 1) {
                throw AnonymousClass001.A0q("maxLines > 1 is not supported");
            }
            EP4 A022 = A02(eLb);
            11T.A0A(A022);
            A00 = A00 + Qzg.A00(fal, A022, r0) + super.A05.A02(A00(eLb, r0));
        }
        return A00;
    }
}
