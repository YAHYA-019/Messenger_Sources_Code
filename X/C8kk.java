package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.8kk, reason: invalid class name */
/* loaded from: 8kk.class */
public final class C8kk extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public 1Im A04;
    public Aad A05;
    public List A06;
    public int[] A07;

    public C8kk() {
        super("ReactionSegmentedTabs");
        this.A03 = 12;
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A07, Integer.valueOf(this.A03), this.A06};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Aad aad = this.A05;
        List list = this.A06;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A03;
        int[] iArr = this.A07;
        int i4 = this.A01;
        boolean A1X = 1BL.A1X(r302, aad);
        11T.A0F(list, 2);
        ArrayList A0z = 1BL.A0z(list);
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            CharSequence charSequence = (CharSequence) obj;
            int i7 = iArr != null ? iArr[i5] : 0;
            boolean A1Q = AnonymousClass001.A1Q(i5, i);
            8SC r0 = new 8SC(r302, new C8mx());
            C8mx c8mx = r0.A01;
            c8mx.A00 = i5;
            BitSet bitSet = r0.A02;
            bitSet.set(0);
            c8mx.A03 = i2;
            bitSet.set(4);
            c8mx.A06 = charSequence;
            bitSet.set(6);
            c8mx.A04 = i7;
            bitSet.set(5);
            c8mx.A07 = A1Q;
            bitSet.set(A1X ? 1 : 0);
            r0.A1C(i3);
            Context A0A = 7zL.A0A(r302);
            c8mx.A02 = aad.B5z(A0A, A1Q);
            bitSet.set(3);
            c8mx.A01 = aad.B5y(A0A);
            bitSet.set(2);
            1LI r02 = r302.A02;
            c8mx.A05 = r02 == null ? null : ((C8kk) r02).A04;
            7zP.A16(r0, bitSet, r0.A03);
            A0z.add(c8mx);
            i5 = i6;
        }
        8kI r03 = new 8kI();
        C1rs c1rs = new C1rs(r03, r302, 0, 0);
        ((8OD) c1rs).A01 = r03;
        ((8OD) c1rs).A00 = r302;
        if (r03.A01.isEmpty()) {
            r03.A01 = A0z;
        } else {
            r03.A01.addAll(A0z);
        }
        ((8OD) c1rs).A01.A00 = 7zL.A04(c1rs, i4);
        c1rs.A1C(20.0f);
        c1rs.A0J();
        8kI r04 = ((8OD) c1rs).A01;
        11T.A0A(r04);
        return r04;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
