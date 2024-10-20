package X;

import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.8kv, reason: invalid class name */
/* loaded from: 8kv.class */
public final class C8kv extends C1rj {
    public 7Jy A00;
    public 5vW A01;
    public 9MS A02;
    public 6oP A03;
    public boolean A04;

    public C8kv() {
        super("MediaBlurOverlayComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A04), this.A00, this.A02, this.A03, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        7Jy r0 = this.A00;
        final String A0C = r302.A0C();
        final 7Jy r02 = this.A00;
        final 6oP r03 = this.A03;
        final boolean z = this.A04;
        Object obj = new Object(r02, r03, A0C, z) { // from class: X.9bm
            public final 7Jy A00;
            public final 6oP A01;
            public final String A02;
            public final boolean A03;

            {
                this.A02 = A0C;
                this.A00 = r02;
                this.A01 = r03;
                this.A03 = z;
            }

            public boolean equals(Object obj2) {
                if (this != obj2) {
                    if (obj2 == null || !(obj2 instanceof C9bm)) {
                        return false;
                    }
                    C9bm c9bm = (C9bm) obj2;
                    if (!11T.A0O(this.A02, c9bm.A02)) {
                        return false;
                    }
                    7Jy r04 = this.A00;
                    7Jy r05 = c9bm.A00;
                    if (r04 != null) {
                        if (!r04.equals(r05)) {
                            return false;
                        }
                    } else if (r05 != null) {
                        return false;
                    }
                    6oP r06 = this.A01;
                    6oP r07 = c9bm.A01;
                    if (r06 != null) {
                        if (!r06.equals(r07)) {
                            return false;
                        }
                    } else if (r07 != null) {
                        return false;
                    }
                    if (this.A03 != c9bm.A03) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A05(this, this.A02, this.A00, this.A01, Boolean.valueOf(this.A03));
            }
        };
        C6op c6op = (C6op) r302.A0B(obj, A0C, 0);
        if (c6op == null) {
            7Jy r04 = this.A00;
            6oP r05 = this.A03;
            boolean z2 = this.A04;
            11T.A0G(r04, 1, r05);
            int ordinal = r04.ordinal();
            c6op = r05.B7y(7zL.A0A(r302), z2 ? C6on.A03 : C6on.A05, ordinal != 0 ? ordinal != 1 ? 0S2.A0C : 0S2.A01 : 0S2.A00);
            r302.A0I(obj, c6op, A0C, 0);
        }
        int A05 = 7zP.A05(r0, c6op, 1);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        7zR.A18(A01);
        A01.A2c();
        A01.A2b();
        C8S3 c8s3 = new C8S3(r302, new 8mN());
        CharSequence charSequence = c6op.A04;
        8mN r06 = c8s3.A01;
        r06.A01 = charSequence;
        BitSet bitSet = c8s3.A02;
        bitSet.set(1);
        r06.A00 = c6op.A03;
        bitSet.set(0);
        C1rs.A05(bitSet, c8s3.A03, A05);
        c8s3.A0J();
        A01.A2e(r06);
        7zN.A1C(A01, r302, C8kv.class, "MediaBlurOverlayComponent");
        if (r0 == 7Jy.A02) {
            A01.A0D(c6op.A00);
        }
        return A01.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 131090082449123L);
        return A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        7Jy r0;
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        C8kv c8kv = (C8kv) r302.A00.A01;
        9MS r02 = c8kv.A02;
        5vV r03 = c8kv.A01;
        1BL.A1F(r02, r03);
        9MK r04 = r02.A00;
        5vV r05 = r03;
        7Hg r06 = (7Hg) r05.A01.A01.A00(7Hg.A01);
        if (r06 == null || (r0 = r06.A00) == null) {
            return null;
        }
        7Jy r310 = 7Jy.A04;
        if (r0 == r310) {
            return null;
        }
        4kZ r07 = r04.A00;
        C5o2 c5o2 = (C5o2) r07.A03.get();
        if (c5o2 == null) {
            c5o2 = C5o2.A01;
        }
        if (r0.ordinal() == 0) {
            r310 = 7Jy.A03;
        }
        C5jn c5jn = r07.A02;
        String str = ((C5fu) r05.A00).A09;
        LinkedHashMap A0z = 7zT.A0z(c5o2.A00);
        if (str != null) {
            A0z.put(str, r310);
        }
        c5jn.A00(new C5o2(04R.A0D(A0z)));
        return null;
    }
}
