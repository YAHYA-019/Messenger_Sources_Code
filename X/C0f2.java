package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: X.0f2, reason: invalid class name */
/* loaded from: 0f2.class */
public final class C0f2 extends C00v implements RandomAccess {
    public int A00;
    public int A01;
    public final int A02;
    public final Object[] A03;

    public C0f2(Object[] objArr, int i) {
        this.A03 = objArr;
        if (i < 0) {
            throw 0Pz.A04("ring buffer filled size should not be negative but it is ", i);
        }
        int length = objArr.length;
        if (i <= length) {
            this.A02 = length;
            this.A00 = i;
        } else {
            StringBuilder A1D = 0Pz.A1D("ring buffer filled size: ", " cannot be larger than the buffer size: ", i);
            A1D.append(length);
            throw AnonymousClass001.A0L(A1D.toString());
        }
    }

    @Override // X.C00w
    public int A08() {
        return this.A00;
    }

    public final void A09(int i) {
        if (i < 0) {
            throw 0Pz.A04("n shouldn't be negative but it is ", i);
        }
        if (i > size()) {
            int size = size();
            StringBuilder A1D = 0Pz.A1D("n shouldn't be greater than the buffer size: n = ", ", size = ", i);
            A1D.append(size);
            throw AnonymousClass001.A0L(A1D.toString());
        }
        if (i > 0) {
            int i2 = this.A01;
            int i3 = i2 + i;
            int i4 = this.A02;
            int i5 = i3 % i4;
            Object[] objArr = this.A03;
            if (i2 > i5) {
                C1A9.A0H(objArr, i2, i4);
                C1A9.A0H(objArr, 0, i5);
            } else {
                C1A9.A0H(objArr, i2, i5);
            }
            this.A01 = i5;
            this.A00 = size() - i;
        }
    }

    @Override // X.C00v, java.util.List
    public Object get(int i) {
        C0A7.A01(i, size());
        return this.A03[(this.A01 + i) % this.A02];
    }

    @Override // X.C00v, X.C00w, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0rp() { // from class: X.19y
            public int A00;
            public int A01;

            {
                this.A00 = C0f2.this.size();
                this.A01 = C0f2.this.A01;
            }

            @Override // X.C0rp
            public void A00() {
                int i = this.A00;
                if (i == 0) {
                    super.A00 = 2;
                    return;
                }
                C0f2 c0f2 = C0f2.this;
                Object[] objArr = c0f2.A03;
                int i2 = this.A01;
                super.A01 = objArr[i2];
                super.A00 = 1;
                this.A01 = (i2 + 1) % c0f2.A02;
                this.A00 = i - 1;
            }
        };
    }

    @Override // X.C00w, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // X.C00w, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        11T.A0F(objArr, 0);
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            11T.A0A(objArr);
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.A01; i2 < size && i3 < this.A02; i3++) {
            objArr[i2] = this.A03[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.A03[i];
            i2++;
            i++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }
}
