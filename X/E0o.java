package X;

import com.facebook.ui.emoji.model.Emoji;
import java.util.BitSet;
import java.util.List;

/* loaded from: E0o.class */
public final class E0o extends 2Yf {
    public int A00;
    public 1Im A01;
    public C22a A02;
    public Integer A03;
    public List A04;
    public boolean A05;

    public E0o() {
        super("ComposerEmojiCategorySectionComponent");
    }

    public void A0Q(C1qb c1qb) {
        List list = this.A04;
        11T.A0H(c1qb, list);
        2Yg.A0H(c1qb, 0S2.A0C, (Throwable) null, list.isEmpty());
    }

    public 2Ys A0d(C1qb c1qb) {
        List list = this.A04;
        11T.A0H(c1qb, list);
        2Yg.A0H(c1qb, 0S2.A0C, (Throwable) null, list.isEmpty());
        2Yr r0 = new 2Yr();
        C2hf A0I = C2he.A0I(c1qb);
        A0I.A06(list);
        A0I.A05(2Yg.A07(c1qb, E0o.class, "ComposerEmojiCategorySectionComponent"));
        r0.A00(A0I);
        2Ys r02 = r0.A00;
        11T.A0A(r02);
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.2hj, java.lang.Object] */
    public Object A0e(1Im r302, Object obj) {
        DuA du8;
        Dxc dxc;
        if (r302.A01 != 239257522) {
            return null;
        }
        1Iv r0 = r302.A00;
        E0o e0o = r0.A01;
        1Iw r02 = r0.A00;
        Emoji emoji = (Emoji) ((C2i6) obj).A01;
        E0o e0o2 = e0o;
        C22a c22a = e0o2.A02;
        boolean z = e0o2.A05;
        int i = e0o2.A00;
        Integer num = e0o2.A03;
        1Im r03 = e0o2.A01;
        1BK.A1M(r02, c22a);
        11T.A0F(emoji, 6);
        ?? obj2 = new Object();
        if (c22a.BNY(emoji)) {
            du8 = new DuA(r02, new Dxe());
            Dxe dxe = du8.A01;
            dxe.A01 = r03;
            dxe.A03 = emoji;
            BitSet bitSet = du8.A02;
            bitSet.set(0);
            dxe.A04 = num;
            dxe.A02 = c22a;
            bitSet.set(1);
            dxe.A05 = z;
            bitSet.set(2);
            dxe.A00 = i;
            bitSet.set(3);
            C1rs.A02(bitSet, du8.A03);
            dxc = dxe;
        } else {
            du8 = new Du8(r02, new Dxc());
            Dxc dxc2 = du8.A01;
            dxc2.A00 = r03;
            dxc2.A02 = emoji;
            BitSet bitSet2 = du8.A02;
            bitSet2.set(0);
            dxc2.A03 = num;
            dxc2.A01 = c22a;
            bitSet2.set(1);
            dxc2.A04 = z;
            bitSet2.set(2);
            C1rs.A03(bitSet2, du8.A03);
            dxc = dxc2;
        }
        du8.A0J();
        return 7zM.A0t(dxc, (C2hj) obj2);
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0o e0o = (E0o) r302;
            1Im r0 = this.A01;
            1Im r02 = e0o.A01;
            if (r0 != null) {
                if (!r0.A01(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            Integer num = this.A03;
            Integer num2 = e0o.A03;
            if (num != null) {
                if (!num.equals(num2)) {
                    return false;
                }
            } else if (num2 != null) {
                return false;
            }
            C22a c22a = this.A02;
            C22a c22a2 = e0o.A02;
            if (c22a != null) {
                if (!c22a.equals(c22a2)) {
                    return false;
                }
            } else if (c22a2 != null) {
                return false;
            }
            List list = this.A04;
            List list2 = e0o.A04;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            if (this.A05 != e0o.A05 || this.A00 != e0o.A00) {
                return false;
            }
        }
        return true;
    }
}
