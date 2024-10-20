package X;

import com.facebook.ui.emoji.model.EmojiSet;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.EnumSet;

/* renamed from: X.8n0, reason: invalid class name */
/* loaded from: 8n0.class */
public final class C8n0 extends C1rj {
    public static final EnumSet A0B = EnumSet.allOf(3E2.class);
    public int A00;
    public int A01;
    public int A02;
    public 1Im A03;
    public C22a A04;
    public C77z A05;
    public Integer A06;
    public EnumSet A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public C8n0() {
        super("ComposerEmojiViewPagerComponent");
        this.A07 = A0B;
        this.A00 = -16776961;
        this.A01 = 0;
        this.A02 = -1;
    }

    public final Object[] A0k() {
        return new Object[]{null, -3355444, this.A05, this.A07, this.A04, Integer.valueOf(this.A00), this.A06, Integer.valueOf(this.A01), Boolean.valueOf(this.A08), Boolean.valueOf(this.A09), null, null, Boolean.valueOf(this.A0A), Integer.valueOf(this.A02)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C77z c77z = this.A05;
        EnumSet enumSet = this.A07;
        boolean z = this.A0A;
        int i = this.A01;
        int i2 = this.A00;
        Integer num = this.A06;
        final String A0C = r302.A0C();
        final boolean z2 = this.A09;
        Object obj = new Object(A0C, z2) { // from class: X.9ap
            public final String A00;
            public final boolean A01;

            {
                this.A00 = A0C;
                this.A01 = z2;
            }

            public boolean equals(Object obj2) {
                if (this != obj2) {
                    if (obj2 == null || !(obj2 instanceof C9ap)) {
                        return false;
                    }
                    C9ap c9ap = (C9ap) obj2;
                    if (!11T.A0O(this.A00, c9ap.A00) || this.A01 != c9ap.A01) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A04(this, this.A00, Boolean.valueOf(this.A01));
            }
        };
        C2kf c2kf = (C2kf) r302.A0B(obj, A0C, 1);
        if (c2kf == null) {
            if (this.A09) {
                final C2kb c2kb = 2kW.A0A;
                final 2kZ r0 = new 2kZ(new 2XL((C02A) null, (C2kk) null, (2XO) null, (Boolean) null, 1, 0.0f, 0, 0, false, false, false, false, false, false), (1cU) null, (Integer) null, false, false);
                final JiG jiG = new JiG();
                final int i3 = (-1) >>> 1;
                final int i4 = 0;
                final boolean z3 = false;
                final boolean z4 = false;
                c2kf = new C2kf(jiG, c2kb, r0, i4, i3, z3, z4) { // from class: X.2ke
                    public final int A00;
                    public final int A01;
                    public final 3wX A02;
                    public final C2kb A03;
                    public final 2kZ A04;
                    public final boolean A05;
                    public final boolean A06;

                    {
                        if (i4 == 1 && i3 != ((-1) << (-1)) && i3 != -1 && i3 != ((-1) >>> 1)) {
                            throw AnonymousClass001.A0q("Only snap to start is implemented for vertical lists");
                        }
                        this.A00 = i4;
                        this.A05 = z3;
                        this.A06 = z4;
                        this.A01 = i3;
                        this.A02 = jiG;
                        this.A04 = r0 == null ? 2kW.A0B : r0;
                        this.A03 = c2kb == null ? 2kW.A0A : c2kb;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.2kX, X.2kW, java.lang.Object] */
                    @Override // X.C2kf
                    public /* bridge */ /* synthetic */ 2kX A3t() {
                        ?? obj2 = new Object();
                        ((2kW) obj2).A01 = 1;
                        ((2kW) obj2).A08 = false;
                        ((2kW) obj2).A09 = false;
                        ((2kW) obj2).A02 = (-1) << (-1);
                        ((2kW) obj2).A07 = 2kW.A0B;
                        ((2kW) obj2).A06 = 2kW.A0A;
                        ((2kW) obj2).A00 = (-1) >>> 1;
                        ((2kW) obj2).A03 = 1;
                        ((2kW) obj2).A04 = 0;
                        ((2kW) obj2).A01 = this.A00;
                        ((2kW) obj2).A08 = this.A05;
                        ((2kW) obj2).A09 = this.A06;
                        ((2kW) obj2).A02 = this.A01;
                        ((2kW) obj2).A07 = this.A04;
                        ((2kW) obj2).A06 = this.A03;
                        ((2kW) obj2).A05 = this.A02;
                        return obj2;
                    }

                    @Override // X.C2kf
                    public C2X7 AtV(1Iw r3022) {
                        return this.A03.AK6(r3022.A0D, this.A00, this.A05, this.A06);
                    }

                    @Override // X.C2kf
                    public int B0Y() {
                        return this.A00;
                    }

                    @Override // X.C2kf
                    public 2kZ B6R() {
                        return this.A04;
                    }

                    @Override // X.C2kf
                    public 3wX BBJ() {
                        return this.A02;
                    }

                    @Override // X.C2kf
                    public int BBK() {
                        return this.A01;
                    }
                };
            } else {
                c2kf = null;
            }
            r302.A0I(obj, c2kf, A0C, 1);
        }
        int A05 = 7zP.A05(c77z, enumSet, 1);
        8RX r02 = new 8RX(r302, new C8l5());
        String A0D = r302.A0D(2131953179);
        C8l5 c8l5 = r02.A01;
        c8l5.A08 = A0D;
        1LI r03 = r302.A02;
        c8l5.A04 = r03 == null ? null : ((C8n0) r03).A03;
        ImmutableList immutableList = c77z.A01;
        c8l5.A06 = immutableList;
        BitSet bitSet = r02.A02;
        bitSet.set(0);
        c8l5.A09 = enumSet;
        bitSet.set(1);
        c8l5.A01 = i;
        c8l5.A02 = i2;
        c8l5.A00 = -3355444;
        c8l5.A07 = num;
        int i5 = c77z.A00;
        c8l5.A03 = i5;
        bitSet.set(A05);
        c8l5.A05 = 1LI.A09(r302, C8n0.class, "ComposerEmojiViewPagerComponent", 1979419168);
        c8l5.A0A = z;
        bitSet.set(3);
        r02.A0S();
        r02.A0e();
        C1rs.A02(bitSet, r02.A03);
        r02.A0J();
        8Sj r04 = new 8Sj(r302, new C8nd());
        C8nd c8nd = r04.A01;
        c8nd.A00 = i5;
        c8nd.A08 = immutableList;
        r04.A02.set(0);
        C8l5 c8l52 = null;
        if (z) {
            c8l52 = c8l5;
        }
        c8nd.A01 = 7zQ.A0T(c8l52);
        if (z) {
            c8l5 = null;
        }
        c8nd.A02 = 7zQ.A0T(c8l5);
        r04.A2J("view_pager_key");
        if (c2kf != null) {
            c8nd.A07 = c2kf;
        }
        c8nd.A04 = 1LI.A0A(r302, C8n0.class, "ComposerEmojiViewPagerComponent", 239582340);
        c8nd.A05 = 1LI.A09(r302, C8n0.class, "ComposerEmojiViewPagerComponent", -1120053461);
        r04.A0R();
        return r04.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r0;
        1Im r02;
        1Im r03;
        switch (r302.A01) {
            case -1120053461:
                1Iw r04 = r302.A00.A00;
                int i = ((9MV) obj).A00;
                11T.A0F(r04, 0);
                1LI r05 = r04.A02;
                if (r05 == null || (r03 = ((C8n0) r05).A03) == null) {
                    return null;
                }
                7zR.A1E(r03, new 7BM(i));
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 239582340:
                1Iv r06 = r302.A00;
                1Is r07 = r06.A01;
                1Iw r08 = r06.A00;
                EmojiSet emojiSet = (EmojiSet) ((9MU) obj).A00;
                C8n0 c8n0 = (C8n0) r07;
                C22a c22a = c8n0.A04;
                boolean z = c8n0.A08;
                int i2 = c8n0.A02;
                Integer num = c8n0.A06;
                final String A0C = r08.A0C();
                final boolean z2 = c8n0.A09;
                Object obj2 = new Object(A0C, z2) { // from class: X.9ao
                    public final String A00;
                    public final boolean A01;

                    {
                        this.A00 = A0C;
                        this.A01 = z2;
                    }

                    public boolean equals(Object obj3) {
                        if (this != obj3) {
                            if (obj3 == null || !(obj3 instanceof C9ao)) {
                                return false;
                            }
                            C9ao c9ao = (C9ao) obj3;
                            if (!11T.A0O(this.A00, c9ao.A00) || this.A01 != c9ao.A01) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public int hashCode() {
                        return 7zR.A06(this, this.A00, (Object) null, Boolean.valueOf(this.A01));
                    }
                };
                3wW r304 = (C2kf) r08.A0B(obj2, A0C, 0);
                if (r304 == null) {
                    boolean z3 = c8n0.A09;
                    3wU r09 = new 3wU();
                    int i3 = 7;
                    if (4YU.A0B(r08.A0D).orientation == 2) {
                        i3 = 15;
                    }
                    r09.A01 = i3;
                    if (z3) {
                        r09.A08 = new 2kZ(new 2XL((C02A) null, (C2kk) null, (2XO) null, (Boolean) null, (Integer) null, 0.0f, 0, 0, false, false, false, false, false, false), (1cU) null, (Integer) null, false, false);
                    }
                    r304 = r09.A00();
                    r08.A0I(obj2, r304, A0C, 0);
                }
                4YV.A1M(c22a, 1, emojiSet);
                8SP r010 = new 8SP(r08, new 8nM());
                r010.A1H(0);
                8nM r011 = r010.A01;
                r011.A04 = r304;
                3yF A0L = 2KZ.A0L(r08, 0);
                A0L.A0L();
                A0L.A2f();
                A0L.A30(2131968243);
                A0L.A2x(7zM.A02(r08.A0D, 2MR.A0o));
                A0L.A32(2132279352);
                A0L.A0e();
                A0L.A39(2K4.A03);
                r011.A02 = A0L.A2W().A0l();
                7zL.A1K(r08);
                E0o e0o = new E0o();
                e0o.A02 = c22a;
                e0o.A04 = emojiSet.A03.A01;
                e0o.A05 = z;
                e0o.A00 = i2;
                e0o.A03 = num;
                1LI r012 = r08.A02;
                if (r012 == null || (r02 = ((C8n0) r012).A03) == null) {
                    throw 1BK.A0h();
                }
                e0o.A01 = r02;
                r011.A03 = e0o;
                BitSet bitSet = r010.A02;
                bitSet.set(0);
                C1rs.A01(bitSet, r010.A03);
                r010.A0J();
                return r011;
            case 1979419168:
                1Iw r013 = r302.A00.A00;
                int i4 = ((9MV) obj).A00;
                11T.A0F(r013, 0);
                1LI r014 = r013.A02;
                if (r014 != null && (r0 = ((C8n0) r014).A03) != null) {
                    7zR.A1E(r0, new 7BM(i4));
                }
                7zT.A1I(r013, -892020616, i4);
                return null;
            default:
                return null;
        }
    }
}
