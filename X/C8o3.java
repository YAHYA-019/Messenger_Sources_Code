package X;

import android.view.View;
import java.util.List;

/* renamed from: X.8o3, reason: invalid class name */
/* loaded from: 8o3.class */
public final class C8o3 extends C1rj {
    public static final 95S A06 = 95S.A03;
    public int A00;
    public int A01;
    public 1Im A02;
    public Aad A03;
    public 95S A04;
    public List A05;

    public C8o3() {
        super("ReactionSegmentedControl");
        this.A04 = A06;
    }

    public static final int A00(int[] iArr, int i, int i2) {
        int length = iArr.length;
        if (length != 0) {
            int i3 = 0;
            int i4 = 0;
            do {
                if (iArr[i3] > i2) {
                    i4++;
                }
                i3++;
            } while (i3 < length);
            int i5 = 0;
            int i6 = 0;
            do {
                int i7 = iArr[i5];
                if (i7 <= i2) {
                    i7 = 0;
                }
                i6 += i7;
                i5++;
            } while (i5 < length);
            int i8 = (i - i6) / (length - i4);
            if (i8 != i2) {
                i2 = A00(iArr, i, i8);
            }
        }
        return i2;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, Integer.valueOf(this.A00), this.A02, Integer.valueOf(this.A01), this.A05, this.A04};
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04bc  */
    /* JADX WARN: Type inference failed for: r0v147, types: [X.Dzb] */
    /* JADX WARN: Type inference failed for: r0v180, types: [X.1rh] */
    /* JADX WARN: Type inference failed for: r0v240, types: [X.23P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [X.9HC] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0z(X.1Iw r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8o3.A0z(X.1Iw, int, int):X.1LI");
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [X.9Q3, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 823540209) {
            return null;
        }
        9Q3 r0 = (9Q3) obj;
        1Is r02 = r302.A00.A01;
        Object[] objArr = r302.A03;
        9HC r03 = (9HC) objArr[0];
        int A08 = 7zO.A08(objArr, 1);
        int i2 = r0.A00;
        View view = r0.A01;
        1Im r04 = ((C8o3) r02).A02;
        C3o5.A0k(r03, 2, view);
        int left = view.getLeft();
        int i3 = left - 64;
        if (view.getWidth() + left < A08) {
            i3 = 0;
        }
        DQA dqa = r03.A00;
        if (dqa != null) {
            dqa.smoothScrollTo(i3, 0);
        }
        if (r04 == null) {
            return null;
        }
        ?? obj2 = new Object();
        ((9Q3) obj2).A01 = view;
        ((9Q3) obj2).A00 = i2;
        r04.A00((Object) obj2);
        return null;
    }
}
