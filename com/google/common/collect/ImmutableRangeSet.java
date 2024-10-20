package com.google.common.collect;

import X.C3Oc;
import com.google.common.collect.Range;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: ImmutableRangeSet.class */
public final class ImmutableRangeSet extends C3Oc implements Serializable {
    public final transient ImmutableList A00;
    public static final ImmutableRangeSet A02 = new ImmutableRangeSet(ImmutableList.of());
    public static final ImmutableRangeSet A01 = new ImmutableRangeSet(ImmutableList.of((Object) Range.A00));

    /* loaded from: ImmutableRangeSet$SerializedForm.class */
    public final class SerializedForm implements Serializable {
        public final ImmutableList ranges;

        public SerializedForm(ImmutableList immutableList) {
            this.ranges = immutableList;
        }

        public Object readResolve() {
            return this.ranges.isEmpty() ? ImmutableRangeSet.A02 : this.ranges.equals(ImmutableList.of((Object) Range.A00)) ? ImmutableRangeSet.A01 : new ImmutableRangeSet(this.ranges);
        }
    }

    public ImmutableRangeSet(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // X.C3Oc
    public /* bridge */ /* synthetic */ ImmutableSet A00() {
        ImmutableList immutableList = this.A00;
        if (immutableList.isEmpty()) {
            return RegularImmutableSet.A05;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A01;
        Range range = Range.A00;
        return new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.A00);
    }

    public Object writeReplace() {
        return new SerializedForm(this.A00);
    }
}
