package com.fasterxml.jackson.datatype.guava.deser;

import X.24R;
import X.24S;
import X.24W;
import X.2Ri;
import X.43K;
import X.5DK;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass437;
import X.C00993pc;
import X.C1Jp;
import X.C27T;
import X.C3iq;
import X.C42x;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Preconditions;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: RangeSetDeserializer.class */
public class RangeSetDeserializer extends JsonDeserializer implements AnonymousClass437 {
    public 24S A00;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Cut cut;
        Cut cut2;
        24S r0 = this.A00;
        if (r0 == null) {
            throw new 5DK(abstractC01033pi, "RangeSetJsonSerializer was not contextualized (no deserialize target type). You need to specify the generic type down to the generic parameter of RangeSet.");
        }
        Iterable<Range> iterable = (Iterable) c27t.A0G(null, r0).A0M(abstractC01033pi, c27t);
        ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Range range : iterable) {
            Preconditions.checkArgument(!range.lowerBound.equals(range.upperBound), "range must not be empty, but was %s", range);
            A0s.add(range);
        }
        ImmutableList.Builder builder = new ImmutableList.Builder(A0s.size());
        Range range2 = Range.A00;
        Collections.sort(A0s, Range.RangeLexOrdering.A00);
        C3iq A01 = C1Jp.A01(A0s.iterator());
        while (A01.hasNext()) {
            Range range3 = (Range) A01.next();
            while (A01.hasNext()) {
                Range range4 = (Range) A01.A00();
                if (range3.lowerBound.A00(range4.upperBound) <= 0 && range4.lowerBound.A00(range3.upperBound) <= 0) {
                    Range A02 = range3.A02(range4);
                    Preconditions.checkArgument(A02.lowerBound.equals(A02.upperBound), "Overlapping ranges not permitted but found %s overlapping %s", range3, range4);
                    Range range5 = (Range) A01.next();
                    int A00 = range3.lowerBound.A00(range5.lowerBound);
                    int A002 = range3.upperBound.A00(range5.upperBound);
                    if (A00 > 0) {
                        if (A002 > 0) {
                            cut = range5.lowerBound;
                            cut2 = range3.upperBound;
                            range5 = new Range(cut, cut2);
                        }
                        range3 = range5;
                    } else if (A002 < 0) {
                        if (A00 < 0) {
                            cut = range3.lowerBound;
                            cut2 = range5.upperBound;
                            range5 = new Range(cut, cut2);
                        }
                        range3 = range5;
                    }
                }
                builder.m11011add((Object) range3);
            }
            builder.m11011add((Object) range3);
        }
        ImmutableList build = builder.build();
        return build.isEmpty() ? ImmutableRangeSet.A02 : (build.size() == 1 && 2Ri.A0A(build).equals(Range.A00)) ? ImmutableRangeSet.A01 : new ImmutableRangeSet(build);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Collection;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.fasterxml.jackson.datatype.guava.deser.RangeSetDeserializer, java.lang.Object, com.fasterxml.jackson.databind.JsonDeserializer] */
    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        C00993pc c00993pc = c27t._currentType;
        24S A09 = (c00993pc == null ? null : (24S) c00993pc.A01).A09(0);
        if (A09 == null) {
            return this;
        }
        ?? obj = new Object();
        24R A0A = c27t.A0A();
        obj.A00 = A0A.A0A(24R.A00(A0A.A07((43K) null, 24W.A01(new 24S[]{A09}[0], Range.class), Range.class), A0A), List.class);
        return obj;
    }
}
