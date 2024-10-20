package X;

import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.NullsFirstOrdering;
import com.google.common.collect.NullsLastOrdering;
import com.google.common.collect.Range;
import com.google.common.collect.ReverseOrdering;
import java.util.Comparator;

/* renamed from: X.1zA, reason: invalid class name */
/* loaded from: 1zA.class */
public abstract class C1zA implements Comparator {
    public static C1zA A00(Comparator comparator) {
        return comparator instanceof C1zA ? (C1zA) comparator : new ComparatorOrdering(comparator);
    }

    public C1zA A01() {
        return this instanceof NullsLastOrdering ? ((NullsLastOrdering) this).ordering.A01() : this instanceof NullsFirstOrdering ? this : new NullsFirstOrdering(this);
    }

    public C1zA A02() {
        return new NullsLastOrdering(this);
    }

    public C1zA A03() {
        return new ReverseOrdering(this);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (this instanceof NullsLastOrdering) {
            NullsLastOrdering nullsLastOrdering = (NullsLastOrdering) this;
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return 1;
            }
            if (obj2 != null) {
                return nullsLastOrdering.ordering.compare(obj, obj2);
            }
            return -1;
        }
        if (this instanceof ComparatorOrdering) {
            return ((ComparatorOrdering) this).comparator.compare(obj, obj2);
        }
        if (this instanceof ReverseOrdering) {
            return ((ReverseOrdering) this).forwardOrder.compare(obj2, obj);
        }
        if (this instanceof Range.RangeLexOrdering) {
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            return 2xG.A00.A03(range.lowerBound, range2.lowerBound).A03(range.upperBound, range2.upperBound).A01();
        }
        NullsFirstOrdering nullsFirstOrdering = (NullsFirstOrdering) this;
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 != null) {
            return nullsFirstOrdering.ordering.compare(obj, obj2);
        }
        return 1;
    }
}
