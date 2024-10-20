package com.google.common.collect;

import X.1FW;
import X.1Fg;
import X.1NS;
import X.5sJ;
import X.AbstractC10624u0;
import X.AnonymousClass001;
import X.K9O;
import X.K9P;
import X.L9Q;
import X.Lsf;
import com.google.common.base.Preconditions;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: AbstractMapBasedMultiset.class */
public abstract class AbstractMapBasedMultiset extends AbstractC10624u0 implements Serializable {
    public static final long serialVersionUID = 0;
    public transient long A00;
    public transient 5sJ A01;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.A01 = A09();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                return;
            }
            A05(objectInputStream.readObject(), objectInputStream.readInt());
            i = i2 + 1;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        L9Q.A03(this, objectOutputStream);
    }

    @Override // X.AbstractC10624u0
    public final int A04() {
        return this.A01.A01;
    }

    @Override // X.AbstractC10624u0
    public final int A05(Object obj, int i) {
        long j;
        if (i == 0) {
            return AIN(obj);
        }
        boolean z = true;
        int i2 = 0;
        Preconditions.checkArgument(AnonymousClass001.A1P(i), "occurrences cannot be negative: %s", i);
        int A04 = this.A01.A04(obj);
        if (A04 == -1) {
            this.A01.A05(obj, i);
            j = this.A00 + i;
        } else {
            5sJ r0 = this.A01;
            Preconditions.checkElementIndex(A04, r0.A01);
            i2 = r0.A04[A04];
            long j2 = i;
            long j3 = i2 + j2;
            if (j3 > 2147483647L) {
                z = false;
            }
            Preconditions.checkArgument(z, "too many occurrences: %s", j3);
            5sJ r02 = this.A01;
            Preconditions.checkElementIndex(A04, r02.A01);
            r02.A04[A04] = (int) j3;
            j = this.A00 + j2;
        }
        this.A00 = j;
        return i2;
    }

    @Override // X.AbstractC10624u0
    public final int A06(Object obj, int i) {
        1Fg.A00(i, "count");
        5sJ r0 = this.A01;
        int A00 = i == 0 ? 5sJ.A00(r0, obj, 1FW.A02(obj)) : r0.A05(obj, i);
        this.A00 += i - A00;
        return A00;
    }

    @Override // X.AbstractC10624u0
    public final Iterator A07() {
        return new K9O(this);
    }

    @Override // X.AbstractC10624u0
    public final Iterator A08() {
        return new K9P(this);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.5sJ] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.5sJ] */
    public 5sJ A09() {
        if (this instanceof LinkedHashMultiset) {
            ?? obj = new Object();
            obj.A0C(3, 1.0f);
            return obj;
        }
        ?? obj2 = new Object();
        obj2.A0C(3, 1.0f);
        return obj2;
    }

    @Override // X.C4u1
    public final int AIN(Object obj) {
        5sJ r0 = this.A01;
        int A04 = r0.A04(obj);
        if (A04 == -1) {
            return 0;
        }
        return r0.A04[A04];
    }

    @Override // X.AbstractC10624u0, X.C4u1
    public final int Cdf(Object obj, int i) {
        int i2;
        if (i == 0) {
            i2 = AIN(obj);
        } else {
            i2 = 0;
            Preconditions.checkArgument(AnonymousClass001.A1P(i), "occurrences cannot be negative: %s", i);
            int A04 = this.A01.A04(obj);
            if (A04 != -1) {
                5sJ r0 = this.A01;
                Preconditions.checkElementIndex(A04, r0.A01);
                int i3 = r0.A04[A04];
                if (i3 > i) {
                    5sJ r02 = this.A01;
                    Preconditions.checkElementIndex(A04, r02.A01);
                    r02.A04[A04] = i3 - i;
                } else {
                    5sJ r03 = this.A01;
                    5sJ.A00(r03, r03.A06[A04], (int) (r03.A05[A04] >>> 32));
                    i = i3;
                }
                this.A00 -= i;
                return i3;
            }
        }
        return i2;
    }

    @Override // X.AbstractC10624u0, X.C4u1
    public final boolean CnX(Object obj, int i, int i2) {
        long j;
        long j2;
        1Fg.A00(i, "oldCount");
        1Fg.A00(i2, "newCount");
        int A04 = this.A01.A04(obj);
        if (A04 == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.A01.A05(obj, i2);
                j = this.A00;
            }
            return true;
        }
        5sJ r0 = this.A01;
        Preconditions.checkElementIndex(A04, r0.A01);
        if (r0.A04[A04] != i) {
            return false;
        }
        5sJ r02 = this.A01;
        if (i2 == 0) {
            5sJ.A00(r02, r02.A06[A04], (int) (r02.A05[A04] >>> 32));
            j2 = this.A00 - i;
            this.A00 = j2;
            return true;
        }
        Preconditions.checkElementIndex(A04, r02.A01);
        r02.A04[A04] = i2;
        j = this.A00;
        i2 -= i;
        j2 = j + i2;
        this.A00 = j2;
        return true;
    }

    @Override // X.AbstractC10624u0, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A01.A09();
        this.A00 = 0L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, X.C4u1
    public final Iterator iterator() {
        return new Lsf(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public final int size() {
        return 1NS.A01(this.A00);
    }
}
