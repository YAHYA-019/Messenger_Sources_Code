package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* loaded from: LzA.class */
public final class LzA extends C07b implements List, Collection, C18t, C07c {
    public int A00;
    public int A01;
    public KUL A02 = new Object();
    public Object[] A03;
    public Object[] A04;
    public MRG A05;
    public Object[] A06;
    public Object[] A07;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.KUL, java.lang.Object] */
    public LzA(MRG mrg, Object[] objArr, Object[] objArr2, int i) {
        this.A05 = mrg;
        this.A06 = objArr;
        this.A07 = objArr2;
        this.A00 = i;
        this.A03 = objArr;
        this.A04 = objArr2;
        this.A01 = mrg.size();
    }

    private final int A00() {
        if (size() <= 32) {
            return 0;
        }
        return DKC.A06(this) & (-32);
    }

    private final int A01(KSU ksu, List list, List list2, Function1 function1, Object[] objArr, int i, int i2) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            list.add(objArr);
        }
        Object obj = ksu.A00;
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i) {
                break;
            }
            Object obj2 = objArr[i4];
            if (!7zR.A1a(obj2, function1)) {
                if (i2 == 32) {
                    objArr3 = 1BK.A1Y(list) ? (Object[]) list.remove(AnonymousClass001.A04(list)) : A0B();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
            i3 = i4 + 1;
        }
        ksu.A00 = objArr3;
        if (objArr2 != objArr3) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final int A02(KSU ksu, Function1 function1, int i) {
        Object[] objArr = this.A04;
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (7zR.A1a(obj, function1)) {
                if (!z) {
                    objArr2 = A0H(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        ksu.A00 = objArr2;
        if (i2 == i) {
            return i;
        }
        11T.A0I(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        C1A9.A0H(objArr2, i2, i);
        this.A04 = objArr2;
        this.A01 = size() - (i - i2);
        return i2;
    }

    private final Lt7 A03(int i) {
        Object[] objArr = this.A03;
        if (objArr == null) {
            throw AnonymousClass001.A0N("Invalid root");
        }
        int A00 = A00() >> 5;
        KvD.A01(i, A00);
        int i2 = this.A00;
        return i2 == 0 ? new JbR(objArr, i) : new JbT(objArr, i, A00, i2 / 5);
    }

    private final Object A04(Object[] objArr, int i, int i2, int i3) {
        int A0L = JQx.A0L(this, i);
        if (A0L == 1) {
            Object obj = this.A04[0];
            A09(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[i3];
        Object[] A0H = A0H(objArr2);
        C1A9.A0I(objArr2, A0H, i3, i3 + 1, A0L);
        A0H[A0L - 1] = null;
        this.A03 = objArr;
        this.A04 = A0H;
        this.A01 = (i + A0L) - 1;
        this.A00 = i2;
        return obj2;
    }

    private final void A05(Object obj, Object[] objArr, int i) {
        int size = size();
        int A0F = JR0.A0F(size, size);
        Object[] A0H = A0H(this.A04);
        if (A0F < 32) {
            C1A9.A0I(this.A04, A0H, i + 1, i, A0F);
            A0H[i] = obj;
            this.A03 = objArr;
            this.A04 = A0H;
            this.A01 = size() + 1;
            return;
        }
        Object[] objArr2 = this.A04;
        Object obj2 = objArr2[31];
        C1A9.A0I(objArr2, A0H, i + 1, i, 31);
        A0H[i] = obj;
        Object[] objArr3 = new Object[33];
        objArr3[0] = obj2;
        objArr3[32] = this.A02;
        A0A(objArr, A0H, objArr3);
    }

    private final void A06(Collection collection, Object[] objArr, Object[] objArr2, Object[][] objArr3, int i, int i2, int i3) {
        Object[] A0B;
        if (i3 < 1) {
            throw AnonymousClass001.A0L("requires at least one nullBuffer");
        }
        Object[] A0H = A0H(objArr);
        objArr3[0] = A0H;
        int i4 = i & 31;
        int A0G = (JQz.A0G(collection, i) - 1) & 31;
        int i5 = (i2 - i4) + A0G;
        if (i5 < 32) {
            C1A9.A0I(A0H, objArr2, A0G + 1, i4, i2);
        } else {
            int i6 = (i5 - 32) + 1;
            if (i3 == 1) {
                A0B = A0H;
            } else {
                A0B = A0B();
                i3--;
                objArr3[i3] = A0B;
            }
            int i7 = i2 - i6;
            C1A9.A0I(A0H, objArr2, 0, i7, i2);
            C1A9.A0I(A0H, A0B, A0G + 1, i4, i7);
            objArr2 = A0B;
        }
        Iterator it = collection.iterator();
        A08(it, A0H, i4);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] A0B2 = A0B();
            A08(it, A0B2, 0);
            objArr3[i8] = A0B2;
        }
        A08(it, objArr2, 0);
    }

    private final void A07(Collection collection, Object[] objArr, Object[][] objArr2, int i, int i2, int i3) {
        Object[] objArr3;
        Object[] objArr4 = objArr;
        if (this.A03 == null) {
            throw AnonymousClass001.A0N("root is null");
        }
        int i4 = i >> 5;
        int i5 = i3;
        Object[] objArr5 = objArr;
        Lt7 A03 = A03(A00() >> 5);
        while (true) {
            int previousIndex = A03.previousIndex();
            objArr3 = (Object[]) A03.previous();
            if (previousIndex == i4) {
                break;
            }
            C1A9.A0I(objArr3, objArr5, 0, 32 - i2, 32);
            objArr5 = A0I(objArr3, i2);
            i5--;
            objArr2[i5] = objArr5;
        }
        int A00 = i3 - (((A00() >> 5) - 1) - i4);
        if (A00 < i3) {
            objArr4 = objArr2[A00];
            11T.A0D(objArr4);
        }
        A06(collection, objArr3, objArr4, objArr2, i, 32, A00);
    }

    public static final void A08(Iterator it, Object[] objArr, int i) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.KSU, java.lang.Object] */
    private final void A09(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.A03 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.A04 = objArr;
            this.A01 = i;
        } else {
            ?? obj = new Object();
            ((KSU) obj).A00 = null;
            11T.A0D(objArr);
            Object[] A0E = A0E(obj, objArr, i2, i);
            11T.A0D(A0E);
            Object obj2 = ((KSU) obj).A00;
            11T.A0I(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            this.A04 = (Object[]) obj2;
            this.A01 = i;
            if (A0E[1] == null) {
                this.A03 = (Object[]) A0E[0];
                i2 -= 5;
            } else {
                this.A03 = A0E;
            }
        }
        this.A00 = i2;
    }

    private final void A0A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.A00;
        if (size > (1 << i)) {
            Object[] objArr4 = new Object[33];
            objArr4[0] = objArr;
            objArr4[32] = this.A02;
            this.A03 = A0K(objArr4, objArr2, i + 5);
            this.A04 = objArr3;
            this.A00 += 5;
        } else {
            if (objArr == null) {
                this.A03 = objArr2;
            } else {
                this.A03 = A0K(objArr, objArr2, i);
            }
            this.A04 = objArr3;
        }
        this.A01 = size() + 1;
    }

    private final Object[] A0B() {
        Object[] objArr = new Object[33];
        objArr[32] = this.A02;
        return objArr;
    }

    private final Object[] A0C(KSU ksu, Object obj, Object[] objArr, int i, int i2) {
        Object[] A0H;
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i != 0) {
            A0H = A0H(objArr);
            int i4 = i - 5;
            Object obj3 = A0H[i3];
            11T.A0I(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) obj3;
            while (true) {
                A0H[i3] = A0C(ksu, obj, objArr2, i4, i2);
                i3++;
                if (i3 >= 32 || (obj2 = A0H[i3]) == null) {
                    break;
                }
                objArr2 = (Object[]) obj2;
                i2 = 0;
                obj = ksu.A00;
            }
        } else {
            ksu.A00 = objArr[31];
            A0H = A0H(objArr);
            C1A9.A0I(objArr, A0H, i3 + 1, i3, 31);
            A0H[i3] = obj;
        }
        return A0H;
    }

    private final Object[] A0D(KSU ksu, Object obj, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] A0H = A0H(objArr);
        if (i != 0) {
            Object obj2 = A0H[i3];
            11T.A0I(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            A0H[i3] = A0D(ksu, obj, (Object[]) obj2, i - 5, i2);
            return A0H;
        }
        if (A0H != objArr) {
            ((AbstractList) this).modCount++;
        }
        ksu.A00 = A0H[i3];
        A0H[i3] = obj;
        return A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r310 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] A0E(X.KSU r302, java.lang.Object[] r303, int r304, int r305) {
        /*
            r301 = this;
            r0 = r305
            r1 = -1
            int r0 = r0 + r1
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
            if (r0 != r1) goto L34
            r0 = r303
            r1 = r307
            r0 = r0[r1]
            r310 = r0
            r0 = r302
            r1 = r310
            r0.A00 = r1
            r0 = 0
            r306 = r0
            r0 = 0
            r310 = r0
        L2d:
            r0 = r307
            if (r0 != 0) goto L55
            r0 = 0
            return r0
        L34:
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
            java.lang.Object[] r0 = r0.A0E(r1, r2, r3, r4)
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L55
            goto L2d
        L55:
            r0 = r301
            r1 = r303
            java.lang.Object[] r0 = r0.A0H(r1)
            r308 = r0
            r0 = r308
            r1 = r307
            r2 = r310
            r0[r1] = r2
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LzA.A0E(X.KSU, java.lang.Object[], int, int):java.lang.Object[]");
    }

    private final Object[] A0F(KSU ksu, Object[] objArr, int i, int i2) {
        int i3 = (i2 >> i) & 31;
        int i4 = 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] A0H = A0H(objArr);
            C1A9.A0I(objArr, A0H, i3, i3 + 1, 32);
            A0H[31] = ksu.A00;
            ksu.A00 = obj;
            return A0H;
        }
        if (objArr[31] == null) {
            i4 = ((A00() - 1) >> i) & 31;
        }
        Object[] A0H2 = A0H(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = A0H2[i4];
                11T.A0I(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A0H2[i4] = A0F(ksu, (Object[]) obj2, i5, 0);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = A0H2[i3];
        11T.A0I(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        A0H2[i3] = A0F(ksu, (Object[]) obj3, i5, i2);
        return A0H2;
    }

    private final Object[] A0G(Iterator it, Object[] objArr, int i, int i2) {
        String str;
        Object[] A0H;
        if (!it.hasNext()) {
            str = "invalid buffersIterator";
        } else {
            if (i2 >= 0) {
                if (i2 != 0) {
                    A0H = A0H(objArr);
                    int i3 = (i >> i2) & 31;
                    int i4 = i2 - 5;
                    Object[] A0G = A0G(it, (Object[]) A0H[i3], i, i4);
                    while (true) {
                        A0H[i3] = A0G;
                        i3++;
                        if (i3 >= 32 || !it.hasNext()) {
                            break;
                        }
                        A0G = A0G(it, (Object[]) A0H[i3], 0, i4);
                    }
                } else {
                    A0H = (Object[]) it.next();
                }
                return A0H;
            }
            str = "negative shift";
        }
        throw AnonymousClass001.A0L(str);
    }

    private final Object[] A0H(Object[] objArr) {
        if (objArr == null) {
            objArr = A0B();
        } else {
            int length = objArr.length;
            if (length != 33 || objArr[32] != this.A02) {
                Object[] A0B = A0B();
                if (length > 32) {
                    length = 32;
                }
                C1A9.A0I(objArr, A0B, 0, 0, length);
                return A0B;
            }
        }
        return objArr;
    }

    private final Object[] A0I(Object[] objArr, int i) {
        if (objArr.length == 33 && objArr[32] == this.A02) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] A0B = A0B();
        C1A9.A0I(objArr, A0B, i, 0, 32 - i);
        return A0B;
    }

    private final Object[] A0J(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw AnonymousClass001.A0L("shift should be positive");
        }
        if (i2 != 0) {
            int i3 = (i >> i2) & 31;
            Object A0J = A0J(JR0.A1b(objArr, i3), i, i2 - 5);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (objArr.length == 33 && objArr[32] == this.A02) {
                        Arrays.fill(objArr, i4, 32, (Object) null);
                    }
                    Object[] A0B = A0B();
                    C1A9.A0I(objArr, A0B, 0, 0, i4);
                    objArr = A0B;
                }
            }
            if (A0J != objArr[i3]) {
                objArr = A0H(objArr);
                objArr[i3] = A0J;
            }
        }
        return objArr;
    }

    private final Object[] A0K(Object[] objArr, Object[] objArr2, int i) {
        int A06 = (DKC.A06(this) >> i) & 31;
        Object[] A0H = A0H(objArr);
        if (i != 5) {
            objArr2 = A0K((Object[]) A0H[A06], objArr2, i - 5);
        }
        A0H[A06] = objArr2;
        return A0H;
    }

    private final Object[] A0L(Object[] objArr, Object[][] objArr2, int i) {
        11T.A0F(objArr2, 0);
        0AR r0 = new 0AR(objArr2);
        int i2 = i >> 5;
        int i3 = this.A00;
        Object[] A0G = i2 < (1 << i3) ? A0G(r0, objArr, i, i3) : A0H(objArr);
        while (r0.hasNext()) {
            int i4 = this.A00 + 5;
            this.A00 = i4;
            Object[] objArr3 = new Object[33];
            objArr3[0] = A0G;
            objArr3[32] = this.A02;
            A0G = objArr3;
            A0G(r0, objArr3, 1 << i4, i4);
        }
        return A0G;
    }

    @Override // X.C07b
    public int A0M() {
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.KSU, java.lang.Object] */
    @Override // X.C07b
    public Object A0N(int i) {
        KvD.A00(i, size());
        ((AbstractList) this).modCount++;
        int A00 = A00();
        if (i >= A00) {
            return A04(this.A03, A00, this.A00, i - A00);
        }
        Object obj = this.A04[0];
        ?? obj2 = new Object();
        ((KSU) obj2).A00 = obj;
        Object[] objArr = this.A03;
        11T.A0D(objArr);
        A04(A0F(obj2, objArr, this.A00, i), A00, this.A00, 0);
        return ((KSU) obj2).A00;
    }

    public final int A0O() {
        return ((AbstractList) this).modCount;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.KUL, java.lang.Object] */
    public MRG A0P() {
        MRG c2855JbW;
        MRG mrg;
        Object[] objArr = this.A03;
        if (objArr == this.A06 && this.A04 == this.A07) {
            mrg = this.A05;
        } else {
            this.A02 = new Object();
            this.A06 = objArr;
            Object[] objArr2 = this.A04;
            this.A07 = objArr2;
            if (objArr != null) {
                c2855JbW = new C2855JbW(objArr, objArr2, size(), this.A00);
            } else if (objArr2.length == 0) {
                mrg = C2854JbV.A01;
            } else {
                c2855JbW = new C2854JbV(JQz.A1b(objArr2, size()));
            }
            mrg = c2855JbW;
        }
        this.A05 = mrg;
        return mrg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r309 != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.KSU, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0Q(kotlin.jvm.functions.Function1 r302) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LzA.A0Q(kotlin.jvm.functions.Function1):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.KSU, java.lang.Object] */
    @Override // X.C07b, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        KvD.A01(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int A00 = A00();
        if (i >= A00) {
            A05(obj, this.A03, i - A00);
            return;
        }
        ?? obj2 = new Object();
        ((KSU) obj2).A00 = null;
        Object[] objArr = this.A03;
        11T.A0D(objArr);
        A05(((KSU) obj2).A00, A0C(obj2, obj, objArr, this.A00, i), 0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int size = size();
        int A0F = JR0.A0F(size, size);
        if (A0F < 32) {
            Object[] A0H = A0H(this.A04);
            A0H[A0F] = obj;
            this.A04 = A0H;
            this.A01 = size() + 1;
            return true;
        }
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.A02;
        A0A(this.A03, this.A04, objArr);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object[], java.lang.Object[][]] */
    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        Object[] A0B;
        KvD.A01(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int A0G = (JQz.A0G(collection, JQx.A0L(this, i2)) - 1) / 32;
        if (A0G == 0) {
            A00();
            int i3 = i & 31;
            int A0G2 = (JQz.A0G(collection, i) - 1) & 31;
            Object[] objArr = this.A04;
            A0B = A0H(objArr);
            int i4 = A0G2 + 1;
            int size = size();
            C1A9.A0I(objArr, A0B, i4, i3, JR0.A0F(size, size));
            A08(collection.iterator(), A0B, i3);
        } else {
            ?? r0 = new Object[A0G];
            int size2 = size();
            int A0F = JR0.A0F(size2, size2);
            int A0G3 = JQz.A0G(collection, size());
            int A0F2 = JR0.A0F(A0G3, A0G3);
            if (i >= A00()) {
                A0B = A0B();
                A06(collection, this.A04, A0B, r0, i, A0F, A0G);
            } else if (A0F2 > A0F) {
                int i5 = A0F2 - A0F;
                A0B = A0I(this.A04, i5);
                A07(collection, A0B, r0, i, i5, A0G);
            } else {
                Object[] objArr2 = this.A04;
                A0B = A0B();
                int i6 = A0F - A0F2;
                C1A9.A0I(objArr2, A0B, 0, i6, A0F);
                int i7 = 32 - i6;
                Object[] A0I = A0I(this.A04, i7);
                int i8 = A0G - 1;
                r0[i8] = A0I;
                A07(collection, A0I, r0, i, i7, i8);
            }
            this.A03 = A0L(this.A03, r0, i2);
        }
        this.A04 = A0B;
        this.A01 = JQz.A0G(collection, size());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object[], java.lang.Object[][]] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        Object[] A0B;
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int size = size();
        int A0F = JR0.A0F(size, size);
        Iterator it = collection.iterator();
        if (32 - A0F >= collection.size()) {
            A0B = A0H(this.A04);
            A08(it, A0B, A0F);
        } else {
            int size2 = ((collection.size() + A0F) - 1) / 32;
            ?? r0 = new Object[size2];
            Object[] A0H = A0H(this.A04);
            A08(it, A0H, A0F);
            r0[0] = A0H;
            int i = 1;
            while (true) {
                int i2 = i;
                if (i2 >= size2) {
                    break;
                }
                Object[] A0B2 = A0B();
                A08(it, A0B2, 0);
                r0[i2] = A0B2;
                i = i2 + 1;
            }
            this.A03 = A0L(this.A03, r0, A00());
            A0B = A0B();
            A08(it, A0B, 0);
        }
        this.A04 = A0B;
        this.A01 = JQz.A0G(collection, size());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        Object[] objArr;
        KvD.A00(i, size());
        if (A00() > i) {
            objArr = this.A03;
            11T.A0D(objArr);
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
            objArr = this.A04;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        KvD.A01(i, size());
        return new C2853JbU(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        return A0Q(M6n.A00(collection, 48));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.KSU, java.lang.Object] */
    @Override // X.C07b, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        KvD.A00(i, size());
        if (A00() > i) {
            ?? obj2 = new Object();
            ((KSU) obj2).A00 = null;
            Object[] objArr = this.A03;
            11T.A0D(objArr);
            this.A03 = A0D(obj2, obj, objArr, this.A00, i);
            return ((KSU) obj2).A00;
        }
        Object[] A0H = A0H(this.A04);
        if (A0H != this.A04) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj3 = A0H[i2];
        A0H[i2] = obj;
        this.A04 = A0H;
        return obj3;
    }
}
