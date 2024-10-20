package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.3ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ul.class */
public final class C02253ul implements Iterator, Map.Entry {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;
    public final Object A07;
    public final Object A08;
    public final Object[] A09;

    public C02253ul() {
    }

    public C02253ul(Object[] objArr, Object obj, Object obj2) {
        int length = objArr.length;
        if ((length & 1) == 1) {
            throw new IllegalArgumentException();
        }
        this.A07 = obj;
        this.A08 = obj2;
        this.A09 = objArr;
        this.A06 = (length >> 1) + 1;
        this.A00 = -1;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A03;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A04;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object obj;
        if (this.A05) {
            return true;
        }
        this.A01 = null;
        this.A02 = null;
        boolean z = false;
        this.A05 = false;
        int i = this.A00 + 1;
        if (i < this.A06) {
            z = true;
            this.A00 = i;
            if (i == 0) {
                this.A01 = this.A07;
                obj = this.A08;
            } else {
                int i2 = (i - 1) << 1;
                Object[] objArr = this.A09;
                this.A01 = objArr[i2];
                obj = objArr[i2 + 1];
            }
            this.A02 = obj;
        }
        this.A05 = z;
        return z;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        if (!this.A05 && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.A03 = this.A01;
        this.A04 = this.A02;
        this.A05 = false;
        this.A01 = null;
        this.A02 = null;
        return this;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw AnonymousClass001.A0p();
    }
}
