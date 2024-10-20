package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.JbU, reason: case insensitive filesystem */
/* loaded from: JbU.class */
public final class C2853JbU extends Lt7 implements ListIterator, AnonymousClass116 {
    public int A00;
    public int A01;
    public JbT A02;
    public final LzA A03;

    public C2853JbU(LzA lzA, int i) {
        int size = lzA.size();
        super.A00 = i;
        super.A01 = size;
        this.A03 = lzA;
        this.A00 = lzA.A0O();
        this.A01 = -1;
        A01(this);
    }

    public static final void A00(C2853JbU c2853JbU) {
        if (c2853JbU.A00 != c2853JbU.A03.A0O()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(C2853JbU c2853JbU) {
        JbT jbT;
        LzA lzA = c2853JbU.A03;
        Object[] objArr = lzA.A03;
        if (objArr == null) {
            jbT = null;
        } else {
            int A06 = DKC.A06(lzA) & (-32);
            int i = ((Lt7) c2853JbU).A00;
            if (i > A06) {
                i = A06;
            }
            int i2 = (lzA.A00 / 5) + 1;
            JbT jbT2 = c2853JbU.A02;
            if (jbT2 != null) {
                jbT2.A00 = i;
                jbT2.A01 = A06;
                jbT2.A00 = i2;
                Object[] objArr2 = jbT2.A02;
                if (objArr2.length < i2) {
                    objArr2 = new Object[i2];
                    jbT2.A02 = objArr2;
                }
                int i3 = 0;
                objArr2[0] = objArr;
                if (i == A06) {
                    i3 = 1;
                }
                jbT2.A01 = i3;
                JbT.A00(jbT2, i - i3, 1);
                return;
            }
            jbT = new JbT(objArr, i, A06, i2);
        }
        c2853JbU.A02 = jbT;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        Object[] objArr;
        A00(this);
        if (!hasPrevious()) {
            throw AnonymousClass001.A10();
        }
        int i = super.A00;
        int i2 = i - 1;
        this.A01 = i2;
        JbT jbT = this.A02;
        if (jbT == null) {
            objArr = this.A03.A04;
            super.A00 = i2;
        } else {
            int i3 = jbT.A01;
            if (i <= i3) {
                super.A00 = i2;
                return jbT.previous();
            }
            objArr = this.A03.A04;
            super.A00 = i2;
            i2 -= i3;
        }
        return objArr[i2];
    }
}
