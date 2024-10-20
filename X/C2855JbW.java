package X;

import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.JbW, reason: case insensitive filesystem */
/* loaded from: JbW.class */
public final class C2855JbW extends Lz5 implements MRG {
    public final int A00;
    public final Object[] A01;
    public final Object[] A02;
    public final int A03;

    public C2855JbW(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.A01 = objArr;
        this.A02 = objArr2;
        this.A03 = i;
        this.A00 = i2;
        if (size() <= 32) {
            throw AnonymousClass001.A0L(0Pz.A0T("Trie-based persistent vector should have at least 33 elements, got ", size()));
        }
        size();
        size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.KSU, java.lang.Object] */
    private final MRG A00(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size != 1) {
            Object[] objArr2 = this.A02;
            Object[] A1b = JQz.A1b(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                C1A9.A0I(objArr2, A1b, i3, i3 + 1, size);
            }
            A1b[i4] = null;
            return new C2855JbW(objArr, A1b, (i + size) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = JQz.A1b(objArr, 32);
            }
            return new C2854JbV(objArr);
        }
        ?? obj = new Object();
        ((KSU) obj).A00 = null;
        Object[] A04 = A04(obj, objArr, i2, i - 1);
        11T.A0D(A04);
        Object obj2 = ((KSU) obj).A00;
        11T.A0I(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj2;
        Object obj3 = A04[1];
        Object[] objArr4 = A04;
        if (obj3 == null) {
            Object obj4 = A04[0];
            11T.A0I(obj4, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr4 = (Object[]) obj4;
            i2 -= 5;
        }
        return new C2855JbW(objArr4, objArr3, i, i2);
    }

    private final C2855JbW A01(Object obj, Object[] objArr, int i) {
        int size = size() - ((size() - 1) & (-32));
        Object[] objArr2 = this.A02;
        Object[] A1b = JQz.A1b(objArr2, 32);
        if (size < 32) {
            C1A9.A0I(objArr2, A1b, i + 1, i, size);
            A1b[i] = obj;
            return new C2855JbW(objArr, A1b, size() + 1, this.A00);
        }
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, A1b, i + 1, (size - 1) - i);
        A1b[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return A02(objArr, A1b, objArr3);
    }

    private final C2855JbW A02(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        Object[] A07;
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            i += 5;
            A07 = A07(objArr4, objArr2, i);
        } else {
            A07 = A07(objArr, objArr2, i);
        }
        return new C2855JbW(A07, objArr3, size() + 1, i);
    }

    private final Object[] A03(KSU ksu, Object obj, Object[] objArr, int i, int i2) {
        Object[] A1b;
        int i3 = (i2 >> i) & 31;
        if (i != 0) {
            A1b = JQz.A1b(objArr, 32);
            int i4 = i - 5;
            Object obj2 = objArr[i3];
            11T.A0I(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            A1b[i3] = A03(ksu, obj, (Object[]) obj2, i4, i2);
            int i5 = i3;
            while (true) {
                int i6 = i5 + 1;
                if (i6 >= 32 || A1b[i6] == null) {
                    break;
                }
                Object obj3 = objArr[i6];
                11T.A0I(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A1b[i6] = A03(ksu, ksu.A00, (Object[]) obj3, i4, 0);
                i5 = i6;
            }
        } else {
            A1b = i3 == 0 ? new Object[32] : JQz.A1b(objArr, 32);
            C1A9.A0I(objArr, A1b, i3 + 1, i3, 31);
            ksu.A00 = objArr[31];
            A1b[i3] = obj;
        }
        return A1b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (r311 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] A04(X.KSU r302, java.lang.Object[] r303, int r304, int r305) {
        /*
            r301 = this;
            r0 = r305
            r1 = r304
            int r0 = r0 >> r1
            r306 = r0
            r0 = r306
            r1 = 31
            r0 = r0 & r1
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = 5
            r309 = r0
            r0 = r304
            r1 = r309
            if (r0 != r1) goto L32
            r0 = r303
            r1 = r307
            r0 = r0[r1]
            r310 = r0
            r0 = r302
            r1 = r310
            r0.A00 = r1
            r0 = 0
            r309 = r0
            r0 = 0
            r311 = r0
        L2b:
            r0 = r307
            if (r0 != 0) goto L53
            r0 = 0
            return r0
        L32:
            r0 = r303
            r1 = r307
            java.lang.Object[] r0 = X.JR0.A1b(r0, r1)
            r310 = r0
            r0 = r304
            r1 = r309
            int r0 = r0 - r1
            r304 = r0
            r0 = r301
            r1 = r302
            r2 = r310
            r3 = r304
            r4 = r305
            java.lang.Object[] r0 = r0.A04(r1, r2, r3, r4)
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L53
            goto L2b
        L53:
            r0 = r303
            r1 = 32
            java.lang.Object[] r0 = X.JQz.A1b(r0, r1)
            r308 = r0
            r0 = r308
            r1 = r307
            r2 = r311
            r0[r1] = r2
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2855JbW.A04(X.KSU, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A05(KSU ksu, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            Object[] A1b = i3 == 0 ? new Object[32] : JQz.A1b(objArr, 32);
            C1A9.A0I(objArr, A1b, i3, i3 + 1, 32);
            A1b[31] = ksu.A00;
            ksu.A00 = objArr[i3];
            return A1b;
        }
        if (objArr[31] == null) {
            i4 = ((((size() - 1) & (-32)) - 1) >> i) & 31;
        }
        Object[] A1b2 = JQz.A1b(objArr, 32);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = A1b2[i4];
                11T.A0I(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A1b2[i4] = A05(ksu, (Object[]) obj, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = A1b2[i3];
        11T.A0I(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A1b2[i3] = A05(ksu, (Object[]) obj2, i5, i2);
        return A1b2;
    }

    private final Object[] A06(Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A1b = JQz.A1b(objArr, 32);
        if (i == 0) {
            A1b[i3] = obj;
            return A1b;
        }
        A1b[i3] = A06(obj, JR0.A1b(A1b, i3), i - 5, i2);
        return A1b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object[]] */
    private final Object[] A07(Object[] objArr, Object[] objArr2, int i) {
        int size = ((size() - 1) >> i) & 31;
        Object[][] A1b = objArr != null ? JQz.A1b(objArr, 32) : new Object[32];
        if (i == 5) {
            A1b[size] = objArr2;
            return A1b;
        }
        A1b[size] = A07(A1b[size], objArr2, i - 5);
        return A1b;
    }

    @Override // X.C00w
    public int A08() {
        return this.A03;
    }

    @Override // X.MRG
    public MRG A4w(Object obj) {
        int size = size() - ((size() - 1) & (-32));
        if (size < 32) {
            Object[] A1b = JQz.A1b(this.A02, 32);
            A1b[size] = obj;
            return new C2855JbW(this.A01, A1b, size() + 1, this.A00);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return A02(this.A01, this.A02, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.KSU, java.lang.Object] */
    @Override // X.MRG
    public MRG A58(Object obj, int i) {
        KvD.A01(i, size());
        if (i == size()) {
            return A4w(obj);
        }
        int size = (size() - 1) & (-32);
        if (i >= size) {
            return A01(obj, this.A01, i - size);
        }
        ?? obj2 = new Object();
        ((KSU) obj2).A00 = null;
        return A01(((KSU) obj2).A00, A03(obj2, obj, this.A01, this.A00, i), 0);
    }

    @Override // X.MRG
    public /* bridge */ /* synthetic */ LzA ACx() {
        return new LzA(this, this.A01, this.A02, this.A00);
    }

    @Override // X.MRG
    public MRG Cdv(Function1 function1) {
        LzA lzA = new LzA(this, this.A01, this.A02, this.A00);
        lzA.A0Q(function1);
        return lzA.A0P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.KSU, java.lang.Object] */
    @Override // X.MRG
    public MRG Ce4(int i) {
        KvD.A00(i, size());
        int size = (size() - 1) & (-32);
        Object[] objArr = this.A01;
        int i2 = this.A00;
        if (i >= size) {
            return A00(objArr, size, i2, i - size);
        }
        Object obj = this.A02[0];
        ?? obj2 = new Object();
        ((KSU) obj2).A00 = obj;
        return A00(A05(obj2, objArr, i2, i), size, i2, 0);
    }

    @Override // X.MRG
    public MRG ClS(Object obj, int i) {
        KvD.A00(i, size());
        if (((size() - 1) & (-32)) <= i) {
            Object[] A1b = JQz.A1b(this.A02, 32);
            A1b[i & 31] = obj;
            return new C2855JbW(this.A01, A1b, size(), this.A00);
        }
        Object[] objArr = this.A01;
        int i2 = this.A00;
        return new C2855JbW(A06(obj, objArr, i2, i), this.A02, size(), i2);
    }

    @Override // X.C00v, java.util.List
    public Object get(int i) {
        Object[] objArr;
        KvD.A00(i, size());
        if (((size() - 1) & (-32)) > i) {
            objArr = this.A01;
            int i2 = this.A00;
            while (true) {
                int i3 = i2;
                if (i3 <= 0) {
                    break;
                }
                objArr = JR0.A1b(objArr, (i >> i3) & 31);
                i2 = i3 - 5;
            }
        } else {
            objArr = this.A02;
        }
        return objArr[i & 31];
    }

    @Override // X.C00v, java.util.List
    public ListIterator listIterator(int i) {
        KvD.A01(i, size());
        return new JbS(this.A01, this.A02, i, size(), (this.A00 / 5) + 1);
    }
}
