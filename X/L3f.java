package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: L3f.class */
public final class L3f {
    public static final JtC A00;
    public static final JtC A01;
    public static final L3f A02 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.L3f, java.lang.Object] */
    static {
        JtC jtC = JtC.A07;
        A00 = new JtC(56.0f, jtC.A02, jtC.A00, jtC.A06, jtC.A04, jtC.A05);
        A01 = jtC;
    }

    public final void A00(MLv mLv, MLj mLj, C1u3 c1u3, KMj kMj, int i, int i2, boolean z) {
        KMj kMj2 = kMj;
        boolean z2 = z;
        MLj mLj2 = mLj;
        11T.A0F(c1u3, 0);
        mLv.D2B(-511683359);
        int A0F = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0F(mLv, c1u3) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0F |= 48;
        } else if ((i & 48) == 0) {
            A0F |= JR1.A0G(mLv, mLj2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            A0F |= 384;
        } else if ((i & 384) == 0) {
            A0F |= JR1.A0L(mLv, z2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            A0F |= 3072;
        } else if ((i & 3072) == 0) {
            A0F |= JR1.A0I(mLv, kMj2);
        }
        if ((A0F & 1171) == 1170 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (i5 != 0) {
                kMj2 = KMj.A03;
            }
            C1u4 c1u4 = C1u4.SIZE_32;
            AbstractC2837Jau abstractC2837Jau = KaV.A00;
            LNS lns = (LNS) mLv;
            long j = LNS.A06(lns, abstractC2837Jau).A0M;
            if (!z2) {
                mLv.D2A(-1176737974);
                j = LNS.A06(lns, abstractC2837Jau).A0C;
            } else if (kMj2 == KMj.A02) {
                mLv.D2A(-1176735251);
                j = LNS.A06(lns, abstractC2837Jau).A09;
            } else {
                mLv.D2A(-1176734293);
            }
            LNS.A0P(lns, false);
            KWZ.A00(mLv, mLj2, (MLf) null, c1u3, c1u4, (String) null, (A0F & 14) | 3072 | (A0F & ActionId.MISSED_EVENT), 48, j);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M7H(kMj2, c1u3, this, mLj2, i, i2, 1, z2);
        }
    }

    public final void A01(MLv mLv, MLj mLj, KMj kMj, String str, int i, int i2, boolean z) {
        KMj kMj2 = kMj;
        boolean z2 = z;
        MLj mLj2 = mLj;
        mLv.D2B(-834240826);
        int A0F = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0F(mLv, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0F |= 48;
        } else if ((i & 48) == 0) {
            A0F |= JR1.A0G(mLv, mLj2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            A0F |= 384;
        } else if ((i & 384) == 0) {
            A0F |= JR1.A0L(mLv, z2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            A0F |= 3072;
        } else if ((i & 3072) == 0) {
            A0F |= JR1.A0I(mLv, kMj2);
        }
        if ((A0F & 1171) == 1170 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (i5 != 0) {
                kMj2 = KMj.A03;
            }
            LNS lns = (LNS) mLv;
            LDZ.A05(mLv, mLj2, ((KmQ) LNS.A08(lns, KaX.A00)).A02, str, 12582912 | (A0F & 14) | (A0F & ActionId.MISSED_EVENT), KWc.A00(mLv, kMj2, 0, LNS.A06(lns, KaV.A00).A0R, z2));
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M7I(this, mLj2, kMj2, str, i, i2, 1, z2);
        }
    }

    public final void A02(MLv mLv, MLj mLj, KMj kMj, String str, int i, int i2, boolean z) {
        KMj kMj2 = kMj;
        boolean z2 = z;
        MLj mLj2 = mLj;
        mLv.D2B(-1019757406);
        int A0F = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0F(mLv, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0F |= 48;
        } else if ((i & 48) == 0) {
            A0F |= JR1.A0G(mLv, mLj2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            A0F |= 384;
        } else if ((i & 384) == 0) {
            A0F |= JR1.A0L(mLv, z2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            A0F |= 3072;
        } else if ((i & 3072) == 0) {
            A0F |= JR1.A0I(mLv, kMj2);
        }
        if ((A0F & 1171) == 1170 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (i5 != 0) {
                kMj2 = KMj.A03;
            }
            LNS lns = (LNS) mLv;
            LDZ.A05(mLv, mLj2, ((KmQ) LNS.A08(lns, KaX.A00)).A07, str, 12582912 | (A0F & 14) | (A0F & ActionId.MISSED_EVENT), KWc.A00(mLv, kMj2, 0, LNS.A06(lns, KaV.A00).A0N, z2));
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M7I(this, mLj2, kMj2, str, i, i2, 2, z2);
        }
    }
}
