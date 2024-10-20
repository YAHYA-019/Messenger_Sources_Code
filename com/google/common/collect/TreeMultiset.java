package com.google.common.collect;

import X.1Fg;
import X.1NS;
import X.JQx;
import X.K9e;
import X.KB4;
import X.Koy;
import X.Koz;
import X.L9Q;
import X.LE8;
import X.LsX;
import X.Lsf;
import X.MQm;
import com.google.common.base.Preconditions;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: TreeMultiset.class */
public final class TreeMultiset extends K9e implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient GeneralRange A00;
    public final transient LE8 A01;
    public final transient Koz A02;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: TreeMultiset$Aggregate.class */
    public abstract class Aggregate {
        public static final Aggregate A01 = new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
        };
        public static final Aggregate A00 = new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
        };

        public Aggregate(String str, int i) {
        }

        public long A00(LE8 le8) {
            if (this instanceof AnonymousClass2) {
                if (le8 != null) {
                    return le8.A00;
                }
                return 0L;
            }
            if (le8 != null) {
                return le8.A03;
            }
            return 0L;
        }
    }

    public TreeMultiset(GeneralRange generalRange, LE8 le8, Koz koz) {
        super(generalRange.comparator);
        this.A02 = koz;
        this.A00 = generalRange;
        this.A01 = le8;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.Koz] */
    public TreeMultiset(Comparator comparator) {
        super(comparator);
        BoundType boundType = BoundType.OPEN;
        this.A00 = new GeneralRange(boundType, boundType, null, null, comparator, false, false);
        LE8 le8 = new LE8();
        this.A01 = le8;
        le8.A07 = le8;
        le8.A05 = le8;
        this.A02 = new Object();
    }

    private long A00(Aggregate aggregate, LE8 le8) {
        long A00;
        long A002;
        if (le8 == null) {
            return 0L;
        }
        Comparator comparator = this.comparator;
        GeneralRange generalRange = this.A00;
        int compare = comparator.compare(generalRange.upperEndpoint, le8.A08);
        if (compare > 0) {
            return A00(aggregate, le8.A06);
        }
        if (compare == 0) {
            int ordinal = generalRange.upperBoundType.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return aggregate.A00(le8.A06);
                }
                throw JQx.A0m();
            }
            A00 = aggregate instanceof Aggregate.AnonymousClass2 ? 1 : le8.A01;
            A002 = aggregate.A00(le8.A06);
        } else {
            A00 = aggregate.A00(le8.A06) + (aggregate instanceof Aggregate.AnonymousClass2 ? 1 : le8.A01);
            A002 = A00(aggregate, le8.A04);
        }
        return A00 + A002;
    }

    private long A01(Aggregate aggregate, LE8 le8) {
        long A00;
        long A01;
        if (le8 == null) {
            return 0L;
        }
        Comparator comparator = this.comparator;
        GeneralRange generalRange = this.A00;
        int compare = comparator.compare(generalRange.lowerEndpoint, le8.A08);
        if (compare < 0) {
            return A01(aggregate, le8.A04);
        }
        if (compare == 0) {
            int ordinal = generalRange.lowerBoundType.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return aggregate.A00(le8.A04);
                }
                throw JQx.A0m();
            }
            A00 = aggregate instanceof Aggregate.AnonymousClass2 ? 1 : le8.A01;
            A01 = aggregate.A00(le8.A04);
        } else {
            A00 = aggregate.A00(le8.A04) + (aggregate instanceof Aggregate.AnonymousClass2 ? 1 : le8.A01);
            A01 = A01(aggregate, le8.A06);
        }
        return A00 + A01;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        readObject.getClass();
        Comparator comparator = (Comparator) readObject;
        L9Q.A00(K9e.class, "comparator").A00(this, comparator);
        Koy A00 = L9Q.A00(TreeMultiset.class, "range");
        BoundType boundType = BoundType.OPEN;
        A00.A00(this, new GeneralRange(boundType, boundType, null, null, comparator, false, false));
        L9Q.A00(TreeMultiset.class, "rootReference").A00(this, new Object());
        LE8 le8 = new LE8();
        L9Q.A00(TreeMultiset.class, "header").A00(this, le8);
        le8.A07 = le8;
        le8.A05 = le8;
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            A05(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(APB().comparator());
        L9Q.A03(this, objectOutputStream);
    }

    @Override // X.AbstractC10624u0
    public int A04() {
        Aggregate aggregate = Aggregate.A00;
        LE8 le8 = (LE8) this.A02.A00;
        long A00 = aggregate.A00(le8);
        GeneralRange generalRange = this.A00;
        if (generalRange.hasLowerBound) {
            A00 -= A01(aggregate, le8);
        }
        if (generalRange.hasUpperBound) {
            A00 -= A00(aggregate, le8);
        }
        return 1NS.A01(A00);
    }

    @Override // X.AbstractC10624u0
    public int A05(Object obj, int i) {
        1Fg.A00(i, "occurrences");
        if (i == 0) {
            return AIN(obj);
        }
        Preconditions.checkArgument(this.A00.A01(obj));
        Koz koz = this.A02;
        LE8 le8 = (LE8) koz.A00;
        if (le8 != null) {
            int[] iArr = new int[1];
            koz.A00(le8, le8.A0B(obj, this.comparator, iArr, i));
            return iArr[0];
        }
        this.comparator.compare(obj, obj);
        LE8 le82 = new LE8(obj, i);
        LE8 le83 = this.A01;
        le83.A07 = le82;
        le82.A05 = le83;
        le82.A07 = le83;
        le83.A05 = le82;
        koz.A00(le8, le82);
        return 0;
    }

    @Override // X.AbstractC10624u0
    public int A06(Object obj, int i) {
        1Fg.A00(i, "count");
        boolean z = true;
        if (!this.A00.A01(obj)) {
            if (i != 0) {
                z = false;
            }
            Preconditions.checkArgument(z);
            return 0;
        }
        Koz koz = this.A02;
        LE8 le8 = (LE8) koz.A00;
        if (le8 != null) {
            int[] iArr = new int[1];
            koz.A00(le8, le8.A0D(obj, this.comparator, iArr, i));
            return iArr[0];
        }
        if (i <= 0) {
            return 0;
        }
        A05(obj, i);
        return 0;
    }

    @Override // X.AbstractC10624u0
    public Iterator A07() {
        return new KB4(new LsX(this, 0));
    }

    @Override // X.AbstractC10624u0
    public Iterator A08() {
        return new LsX(this, 0);
    }

    @Override // X.C4u1
    public int AIN(Object obj) {
        try {
            LE8 le8 = (LE8) this.A02.A00;
            if (!this.A00.A01(obj) || le8 == null) {
                return 0;
            }
            return le8.A0A(obj, this.comparator);
        } catch (ClassCastException | NullPointerException unused) {
            return 0;
        }
    }

    @Override // X.MQm
    public MQm BNq(BoundType boundType, Object obj) {
        return new TreeMultiset(this.A00.A00(new GeneralRange(BoundType.OPEN, boundType, null, obj, this.comparator, false, true)), this.A01, this.A02);
    }

    @Override // X.AbstractC10624u0, X.C4u1
    public int Cdf(Object obj, int i) {
        1Fg.A00(i, "occurrences");
        if (i == 0) {
            return AIN(obj);
        }
        Koz koz = this.A02;
        LE8 le8 = (LE8) koz.A00;
        int[] iArr = new int[1];
        try {
            if (!this.A00.A01(obj) || le8 == null) {
                return 0;
            }
            koz.A00(le8, le8.A0C(obj, this.comparator, iArr, i));
            return iArr[0];
        } catch (ClassCastException | NullPointerException unused) {
            return 0;
        }
    }

    @Override // X.AbstractC10624u0, X.C4u1
    public boolean CnX(Object obj, int i, int i2) {
        1Fg.A00(i2, "newCount");
        1Fg.A00(i, "oldCount");
        Preconditions.checkArgument(this.A00.A01(obj));
        Koz koz = this.A02;
        LE8 le8 = (LE8) koz.A00;
        boolean z = false;
        if (le8 != null) {
            int[] iArr = new int[1];
            koz.A00(le8, le8.A0E(obj, this.comparator, iArr, i, i2));
            if (iArr[0] == i) {
                z = true;
            }
        } else if (i == 0) {
            if (i2 > 0) {
                A05(obj, i2);
            }
            return true;
        }
        return z;
    }

    @Override // X.MQm
    public MQm D3y(BoundType boundType, Object obj) {
        return new TreeMultiset(this.A00.A00(new GeneralRange(boundType, BoundType.OPEN, obj, null, this.comparator, true, false)), this.A01, this.A02);
    }

    @Override // X.AbstractC10624u0, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        GeneralRange generalRange = this.A00;
        if (generalRange.hasLowerBound || generalRange.hasUpperBound) {
            LsX lsX = new LsX(this, 0);
            while (lsX.hasNext()) {
                lsX.next();
                lsX.remove();
            }
            return;
        }
        LE8 le8 = this.A01;
        LE8 le82 = le8.A07;
        le82.getClass();
        while (true) {
            LE8 le83 = le82;
            if (le82 == le8) {
                le8.A07 = le8;
                le8.A05 = le8;
                this.A02.A00 = null;
                return;
            } else {
                le82 = le82.A07;
                le82.getClass();
                le83.A01 = 0;
                le83.A04 = null;
                le83.A06 = null;
                le83.A05 = null;
                le83.A07 = null;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, X.C4u1
    public Iterator iterator() {
        return new Lsf(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.C4u1
    public int size() {
        Aggregate aggregate = Aggregate.A01;
        LE8 le8 = (LE8) this.A02.A00;
        long A00 = aggregate.A00(le8);
        GeneralRange generalRange = this.A00;
        if (generalRange.hasLowerBound) {
            A00 -= A01(aggregate, le8);
        }
        if (generalRange.hasUpperBound) {
            A00 -= A00(aggregate, le8);
        }
        return 1NS.A01(A00);
    }
}
