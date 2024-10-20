package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ViewOutlineProvider;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8o2, reason: invalid class name */
/* loaded from: 8o2.class */
public final class C8o2 extends C1rj {
    public static final C9dM A05 = new Object();
    public int A00;
    public 1Im A01;
    public 6tM A02;
    public AnonymousClass690 A03;
    public C6xp A04;

    public C8o2() {
        super("ComposerReplacementComponent");
    }

    public static final 8Av A00(1Iw r301, MigColorScheme migColorScheme, String str, String str2, int i) {
        86K r307 = (i == 5 || i == 6) ? 86K.A02 : 86K.A03;
        8Au A00 = 8Av.A00(r301);
        A00.A2a(str2);
        A00.A2T(1LI.A0C(r301, C8o2.class, "ComposerReplacementComponent", new Object[]{str}, -1755229903));
        A00.A01.A03 = r307;
        A00.A0R();
        A00.A0h(0.0f);
        A00.A2Z(migColorScheme);
        boolean z = true;
        A00.A2Q(true);
        if (i == 4) {
            z = false;
        }
        A00.A2b(z);
        return A00.A2W();
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A04, Integer.valueOf(this.A00), this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2K3 r311;
        2K3 r3112;
        C85x A0V;
        6AJ r0;
        String str;
        int i = this.A00;
        AnonymousClass690 anonymousClass690 = this.A03;
        6tM r02 = this.A02;
        C6xp c6xp = this.A04;
        String A0C = r302.A0C();
        9bI r03 = new 9bI(this.A02, this.A03, A0C);
        CharSequence charSequence = (CharSequence) r302.A0B(r03, A0C, 0);
        if (charSequence == null) {
            AnonymousClass690 anonymousClass6902 = this.A03;
            6tM r04 = this.A02;
            1BL.A1F(anonymousClass6902, r04);
            String str2 = anonymousClass6902.A0M;
            charSequence = null;
            if (str2 != null) {
                6AJ r05 = anonymousClass6902.A09;
                if (!(r05 instanceof C5w3) || (r0 = (C5w3) r05) == null) {
                    charSequence = str2;
                } else {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(r04.A00.Atv());
                    8Bv r06 = new 8Bv(3, r302, anonymousClass6902, r0);
                    if (r0 instanceof C5w2) {
                        str = 4YU.A0E(r302).getString(((C5w2) r0).BEv());
                    } else if (r0 instanceof 6AJ) {
                        str = r0.BEp();
                    } else {
                        if (!(r0 instanceof 8NY)) {
                            throw 1BK.A1F();
                        }
                        str = null;
                    }
                    0Dc r07 = new 0Dc(4YU.A0E(r302), new SpannableStringBuilder());
                    if (str != null) {
                        charSequence = str2;
                    }
                    r07.A02(charSequence);
                    r07.A02(" ");
                    r07.A04(foregroundColorSpan, 17);
                    r07.A04(r06, 17);
                    if (str != null) {
                        str2 = str;
                    }
                    r07.A02(str2);
                    r07.A00();
                    r07.A00();
                    charSequence = 7zM.A0E(r07);
                }
            }
            r302.A0I(r03, charSequence, A0C, 0);
        }
        7zR.A1O(anonymousClass690, r02);
        11T.A0F(c6xp, 4);
        MigColorScheme migColorScheme = r02.A00;
        C1rj c1rj = null;
        2cM A0j = 7zM.A0j(r302, 0);
        Integer num = c6xp.A04;
        if (num == null) {
            num = Integer.valueOf(migColorScheme.BDl());
        }
        A0j.A1H(num.intValue());
        A0j.A0e();
        CharSequence A01 = anonymousClass690.A01();
        if (A01 == null || 0CU.A0O(A01)) {
            r311 = null;
        } else {
            2KD A012 = 2K3.A01(r302, 0);
            A012.A2X();
            A012.A32(false);
            A012.A2Q(true);
            A012.A2M(true);
            A012.A2z(A01);
            A012.A2y(i == 2 ? 2KE.A05 : 2KE.A03);
            A012.A2w((i == 2 || i == 10) ? C1u7.A0A : C1u7.A0C);
            A012.A2x(migColorScheme);
            A012.A1C(i == 10 ? 7zL.A03() : 0.0f);
            r311 = A012.A2W();
        }
        A0j.A2e(r311);
        String str3 = anonymousClass690.A0M;
        if (str3 == null || 0CU.A0O(str3)) {
            r3112 = null;
        } else {
            2KD A013 = 2K3.A01(r302, 0);
            A013.A2X();
            A013.A32(false);
            A013.A2Q(true);
            A013.A2z(charSequence);
            A013.A2y(i == 10 ? 2KE.A02 : 2KE.A04);
            A013.A2w(i == 10 ? C1u7.A0A : C1u7.A0C);
            A013.A2x(migColorScheme);
            A013.A2X();
            A013.A1C(i == 10 ? 7zL.A03() : 0.0f);
            A013.A1A((anonymousClass690.A09 == null || anonymousClass690.A01 != 4) ? 0.0f : 7zM.A01());
            A013.A30(true);
            r3112 = A013.A2W();
        }
        A0j.A2e(r3112);
        C26z c26z = C26z.HORIZONTAL;
        2RH r08 = 2RH.A05;
        4YU.A1O(A0j, r08, c26z);
        C26z c26z2 = C26z.VERTICAL;
        Long l = anonymousClass690.A0C;
        A0j.A25(c26z2, (l == null && anonymousClass690.A0D == null && i != 10) ? 7zL.A03() : r08.A00());
        2RH r09 = 2RH.A04;
        A0j.A0w(4YU.A00(r09));
        A0j.A1g(ViewOutlineProvider.BOUNDS);
        if (l == null || anonymousClass690.A0D == null || anonymousClass690.A0E == null) {
            2cM A014 = 2cK.A01(r302, (String) null, 0);
            C1rj c1rj2 = null;
            if (l != null) {
                String str4 = anonymousClass690.A0H;
                11T.A0A(str4);
                String str5 = anonymousClass690.A0G;
                11T.A0A(str5);
                c1rj = C9dM.A00(r302, migColorScheme, str4, str5, anonymousClass690.A02);
            }
            A014.A2e(c1rj);
            if (anonymousClass690.A0D != null) {
                String str6 = anonymousClass690.A0J;
                11T.A0A(str6);
                String str7 = anonymousClass690.A0I;
                11T.A0A(str7);
                c1rj2 = C9dM.A00(r302, migColorScheme, str6, str7, anonymousClass690.A03);
            }
            A0V = 7zL.A0V(A014, c1rj2);
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            String str8 = anonymousClass690.A0H;
            11T.A0A(str8);
            String str9 = anonymousClass690.A0G;
            11T.A0A(str9);
            builder.m11011add((Object) A00(r302, migColorScheme, str8, str9, anonymousClass690.A02));
            String str10 = anonymousClass690.A0J;
            11T.A0A(str10);
            String str11 = anonymousClass690.A0I;
            11T.A0A(str11);
            builder.m11011add((Object) A00(r302, migColorScheme, str10, str11, anonymousClass690.A03));
            String str12 = anonymousClass690.A0L;
            11T.A0A(str12);
            String str13 = anonymousClass690.A0K;
            11T.A0A(str13);
            builder.m11011add((Object) A00(r302, migColorScheme, str12, str13, anonymousClass690.A04));
            C85y A00 = C85x.A00(r302);
            A00.A2a(builder.build());
            A00.A2X(4YU.A00(r08));
            A00.A2Z(4YU.A00(r08));
            A00.A2B(c26z2, r09.sizeRes);
            A00.A2B(c26z, r08.sizeRes);
            A0V = A00.A2V();
        }
        A0j.A2e(A0V);
        A0j.A1n(1LI.A09(r302, C8o2.class, "ComposerReplacementComponent", 2032563062));
        return A0j.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1LI r0;
        1Im r02;
        1Im r03;
        int i = r302.A01;
        if (i == -1755229903) {
            1Iw r04 = r302.A00.A00;
            String str = (String) 7zN.A0o(r302);
            11T.A0H(r04, str);
            7D3 A00 = 7lG.A00(str);
            if (A00 == null || (r0 = r04.A02) == null || (r02 = ((C8o2) r0).A01) == null) {
                return null;
            }
            7zR.A1E(r02, A00);
            return null;
        }
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 2032563062) {
            return null;
        }
        1Iv r05 = r302.A00;
        1Is r06 = r05.A01;
        1Iw r07 = r05.A00;
        C8o2 c8o2 = (C8o2) r06;
        C8or c8or = (C8or) r07.A07(4YU.A0P(r07));
        int i2 = c8o2.A00;
        AnonymousClass690 anonymousClass690 = c8o2.A03;
        boolean z = c8or.A00;
        11T.A0F(anonymousClass690, 2);
        if (z) {
            return null;
        }
        8NP r08 = (AXC) anonymousClass690.A00().A00(8NP.A01);
        KPP kpp = r08 instanceof 8NP ? r08.A00 : null;
        1LI r09 = r07.A02;
        if (r09 == null || (r03 = ((C8o2) r09).A01) == null) {
            return null;
        }
        7zR.A1E(r03, new 7DA(kpp, anonymousClass690.A0F, anonymousClass690.A0T, i2));
        if (r07.A02 == null) {
            return null;
        }
        4YV.A1F(r07, true, (-1) << (-1));
        return null;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
