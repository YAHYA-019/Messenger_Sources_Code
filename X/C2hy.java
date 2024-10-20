package X;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2hy, reason: invalid class name */
/* loaded from: 2hy.class */
public final class C2hy {
    public final int A00;
    public final int A01;
    public final C2ht A02;
    public final List A03;
    public final boolean A04;
    public final int[] A05;
    public final int[] A06;

    public C2hy(C2ht c2ht, List list, int[] iArr, int[] iArr2, boolean z) {
        int i;
        C2hz c2hz;
        this.A03 = list;
        this.A06 = iArr;
        this.A05 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.A02 = c2ht;
        this.A01 = c2ht.A05();
        this.A00 = c2ht.A04();
        this.A04 = z;
        List list2 = this.A03;
        if (list2.isEmpty() || (c2hz = (C2hz) list2.get(0)) == null || c2hz.A01 != 0 || c2hz.A02 != 0) {
            list2.add(0, new C2hz(0, 0, 0));
        }
        list2.add(new C2hz(this.A01, this.A00, 0));
        List<C2hz> list3 = this.A03;
        for (C2hz c2hz2 : list3) {
            for (int i2 = 0; i2 < c2hz2.A00; i2++) {
                int i3 = c2hz2.A01 + i2;
                int i4 = c2hz2.A02 + i2;
                int i5 = 2;
                if (this.A02.A02(i3, i4)) {
                    i5 = 1;
                }
                this.A06[i3] = (i4 << 4) | i5;
                this.A05[i4] = (i3 << 4) | i5;
            }
        }
        if (this.A04) {
            int i6 = 0;
            for (C2hz c2hz3 : list3) {
                while (true) {
                    i = c2hz3.A01;
                    if (i6 < i) {
                        int[] iArr3 = this.A06;
                        if (iArr3[i6] == 0) {
                            int size = list3.size();
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                if (i7 < size) {
                                    C2hz c2hz4 = (C2hz) list3.get(i7);
                                    while (i8 < c2hz4.A02) {
                                        int[] iArr4 = this.A05;
                                        if (iArr4[i8] == 0) {
                                            C2ht c2ht2 = this.A02;
                                            if (c2ht2.A03(i6, i8)) {
                                                int i9 = c2ht2.A02(i6, i8) ? 8 : 4;
                                                iArr3[i6] = (i8 << 4) | i9;
                                                iArr4[i8] = (i6 << 4) | i9;
                                            }
                                        }
                                        i8++;
                                    }
                                    i8 = c2hz4.A02 + c2hz4.A00;
                                    i7++;
                                }
                            }
                        }
                        i6++;
                    }
                }
                i6 = i + c2hz3.A00;
            }
        }
    }

    public static 5rK A00(Collection collection, int i, boolean z) {
        5rK r305;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                r305 = null;
                break;
            }
            r305 = (5rK) it.next();
            if (r305.A01 == i && r305.A02 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            5rK r0 = (5rK) it.next();
            int i2 = r0.A00;
            int i3 = i2 + 1;
            if (z) {
                i3 = i2 - 1;
            }
            r0.A00 = i3;
        }
        return r305;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v137, types: [X.5rK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [X.5rK, java.lang.Object] */
    public void A01(final C2i1 c2i1) {
        int i;
        C2i1 c2i12 = c2i1 instanceof C2i2 ? (C2i2) c2i1 : new C2i1(c2i1) { // from class: X.2i2
            public final C2i1 A04;
            public int A02 = 0;
            public int A01 = -1;
            public int A00 = -1;
            public Object A03 = null;

            {
                this.A04 = c2i1;
            }

            public void A00() {
                int i2 = this.A02;
                if (i2 != 0) {
                    if (i2 == 1) {
                        this.A04.C1x(this.A01, this.A00);
                    } else if (i2 != 2) {
                        this.A04.Bnh(this.A01, this.A00, this.A03);
                    } else {
                        this.A04.CGT(this.A01, this.A00);
                    }
                    this.A03 = null;
                    this.A02 = 0;
                }
            }

            @Override // X.C2i1
            public void Bnh(int i2, int i3, Object obj) {
                int i4;
                int i5;
                int i6;
                if (this.A02 == 3 && i2 <= (i5 = (i4 = this.A01) + this.A00) && (i6 = i2 + i3) >= i4 && this.A03 == obj) {
                    int min = Math.min(i2, i4);
                    this.A01 = min;
                    this.A00 = Math.max(i5, i6) - min;
                } else {
                    A00();
                    this.A01 = i2;
                    this.A00 = i3;
                    this.A03 = obj;
                    this.A02 = 3;
                }
            }

            @Override // X.C2i1
            public void C1x(int i2, int i3) {
                int i4;
                if (this.A02 == 1 && i2 >= (i4 = this.A01)) {
                    int i5 = this.A00;
                    if (i2 <= i4 + i5) {
                        this.A00 = i5 + i3;
                        this.A01 = Math.min(i2, i4);
                        return;
                    }
                }
                A00();
                this.A01 = i2;
                this.A00 = i3;
                this.A02 = 1;
            }

            @Override // X.C2i1
            public void C7k(int i2, int i3) {
                A00();
                this.A04.C7k(i2, i3);
            }

            @Override // X.C2i1
            public void CGT(int i2, int i3) {
                int i4;
                if (this.A02 == 2 && (i4 = this.A01) >= i2 && i4 <= i2 + i3) {
                    this.A00 += i3;
                    this.A01 = i2;
                } else {
                    A00();
                    this.A01 = i2;
                    this.A00 = i3;
                    this.A02 = 2;
                }
            }
        };
        int i2 = this.A01;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = i2;
        int i4 = this.A00;
        List list = this.A03;
        int size = list.size() - 1;
        while (true) {
            int i5 = size;
            if (i5 < 0) {
                c2i12.A00();
                return;
            }
            C2hz c2hz = (C2hz) list.get(i5);
            int i6 = c2hz.A01;
            int i7 = c2hz.A00;
            int i8 = i6 + i7;
            int i9 = c2hz.A02 + i7;
            while (true) {
                if (i3 <= i8) {
                    break;
                }
                i3--;
                int i10 = this.A06[i3];
                if ((i10 & 12) != 0) {
                    int i11 = i10 >> 4;
                    5rK A00 = A00(arrayDeque, i11, false);
                    if (A00 != null) {
                        int i12 = (i2 - A00.A00) - 1;
                        c2i12.C7k(i3, i12);
                        if ((i10 & 4) != 0) {
                            c2i12.Bnh(i12, 1, this.A02.A01(i3, i11));
                        }
                    } else {
                        ?? obj = new Object();
                        ((5rK) obj).A01 = i3;
                        ((5rK) obj).A00 = (i2 - i3) - 1;
                        ((5rK) obj).A02 = true;
                        arrayDeque.add(obj);
                    }
                } else {
                    c2i12.CGT(i3, 1);
                    i2--;
                }
            }
            while (i4 > i9) {
                i4--;
                int i13 = this.A05[i4];
                if ((i13 & 12) != 0) {
                    int i14 = i13 >> 4;
                    5rK A002 = A00(arrayDeque, i14, true);
                    if (A002 == null) {
                        ?? obj2 = new Object();
                        ((5rK) obj2).A01 = i4;
                        ((5rK) obj2).A00 = i2 - i3;
                        ((5rK) obj2).A02 = false;
                        arrayDeque.add(obj2);
                    } else {
                        c2i12.C7k((i2 - A002.A00) - 1, i3);
                        if ((i13 & 4) != 0) {
                            c2i12.Bnh(i3, 1, this.A02.A01(i14, i4));
                        }
                    }
                } else {
                    c2i12.C1x(i3, 1);
                    i2++;
                }
            }
            int i15 = c2hz.A01;
            int i16 = c2hz.A02;
            for (i = 0; i < c2hz.A00; i++) {
                if ((this.A06[i15] & 15) == 2) {
                    c2i12.Bnh(i15, 1, this.A02.A01(i15, i16));
                }
                i15++;
                i16++;
            }
            i3 = c2hz.A01;
            i4 = c2hz.A02;
            size = i5 - 1;
        }
    }

    public void A02(2Xd r302) {
        A01(new ILX(r302));
    }
}
