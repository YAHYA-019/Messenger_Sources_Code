package X;

import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.8qk, reason: invalid class name */
/* loaded from: 8qk.class */
public final class C8qk extends 2Yf {
    public static final Integer A05 = 80;
    public long A00;
    public 2YJ A01;
    public ImmutableList A02;
    public Integer A03;
    public boolean A04;

    public C8qk() {
        super("HScrollSection");
        this.A04 = true;
        this.A03 = A05;
    }

    public 2Ys A0d(C1qb c1qb) {
        long j = this.A00;
        ImmutableList immutableList = this.A02;
        2Ys r0 = new 2Ys();
        C2he c2he = new C2he();
        ((2Yf) c2he).A07 = AnonymousClass001.A0h(AnonymousClass001.A0n("SEARCH_HSCROLL_KEY"), j);
        c2he.A05 = immutableList;
        c2he.A02 = 2Yg.A07(c1qb, C8qk.class, "HScrollSection");
        c2he.A01 = 2Yg.A06(c1qb, C8qk.class, "HScrollSection");
        c2he.A00 = 2Yg.A08(c1qb, C8qk.class, "HScrollSection");
        r0.A00.add(c2he);
        return r0;
    }

    public Object A0e(1Im r302, Object obj) {
        boolean A00;
        switch (r302.A01) {
            case -1351902487:
                8B6 r0 = (8B6) 7zN.A0o(r302);
                if (r0 == null) {
                    return null;
                }
                AYA aya = r0.A02;
                AcX acX = r0.A03;
                int i = r0.A00;
                aya.BoQ(acX, i / r0.A01, i);
                return null;
            case 239257522:
                1Iv r02 = r302.A00;
                C8qk c8qk = r02.A01;
                C1qb c1qb = (C1qb) r02.A00;
                8B3 r03 = (8B3) ((C2i6) obj).A01;
                C8qk c8qk2 = c8qk;
                2YJ r04 = c8qk2.A01;
                Integer num = c8qk2.A03;
                boolean z = c8qk2.A04;
                C2hj A0m = 7zL.A0m();
                8Pk r05 = new 8Pk(c1qb, new C8mj());
                C1326Ae4 c1326Ae4 = r03.A01;
                C8mj c8mj = r05.A01;
                c8mj.A02 = c1326Ae4;
                BitSet bitSet = r05.A02;
                bitSet.set(1);
                c8mj.A01 = r04;
                c8mj.A04 = r03.A03;
                bitSet.set(3);
                c8mj.A03 = r03.A02;
                bitSet.set(2);
                c8mj.A00 = 2Yg.A0B(c1qb, C8qk.class, "HScrollSection", new Object[]{r03.A00}, -1351902487);
                bitSet.set(0);
                c8mj.A05 = r03.A04;
                c8mj.A06 = num;
                c8mj.A07 = z;
                C1rs.A02(bitSet, r05.A03);
                r05.A0J();
                return 7zM.A0t(c8mj, A0m);
            case 851046848:
                C4I1 c4i1 = (C4I1) obj;
                A00 = ((8B3) c4i1.A01).A00((8B3) c4i1.A00);
                break;
            case 947264300:
                C2hu c2hu = (C2hu) obj;
                8B3 r06 = (8B3) c2hu.A01;
                8B3 r07 = (8B3) c2hu.A00;
                A00 = false;
                if (r07.getClass() == 8B3.class && 6EU.A00(r06.A03, r07.A03) && 6EV.A00(r06.A02, r07.A02)) {
                    A00 = 4YV.A1Z(r06.A04, r07.A04);
                    break;
                }
                break;
            default:
                return null;
        }
        return Boolean.valueOf(A00);
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qk c8qk = (C8qk) r302;
            if (this.A04 != c8qk.A04 || this.A00 != c8qk.A00) {
                return false;
            }
            2YJ r0 = this.A01;
            2YJ r02 = c8qk.A01;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            Integer num = this.A03;
            Integer num2 = c8qk.A03;
            if (num != null) {
                if (!num.equals(num2)) {
                    return false;
                }
            } else if (num2 != null) {
                return false;
            }
            ImmutableList immutableList = this.A02;
            ImmutableList immutableList2 = c8qk.A02;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
        }
        return true;
    }
}
