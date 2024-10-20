package X;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps$EntryFunction;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1my, reason: invalid class name */
/* loaded from: 1my.class */
public abstract class C1my {
    public static int A00(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : (-1) >>> 1;
        }
        1Fg.A00(i, "expectedSize");
        return i + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.common.collect.ImmutableMap] */
    public static ImmutableMap A01(Function function, ImmutableMap.Builder builder, Iterator it) {
        while (true) {
            ?? hasNext = it.hasNext();
            if (hasNext == 0) {
                try {
                    hasNext = builder.buildOrThrow();
                    return hasNext;
                } catch (IllegalArgumentException unused) {
                    throw 0Pz.A05(hasNext.getMessage(), ". To index multiple values under a key, use Multimaps.index.");
                }
            }
            Object next = it.next();
            builder.put(function.apply(next), next);
        }
    }

    public static ImmutableMap A02(Function function, Iterable iterable) {
        ImmutableMap.Builder A0c;
        boolean z = iterable instanceof Collection;
        Iterator it = iterable.iterator();
        if (z) {
            int size = ((Collection) iterable).size();
            1Fg.A00(size, "expectedSize");
            A0c = new ImmutableMap.Builder(size);
        } else {
            A0c = 1BK.A0c();
        }
        return A01(function, A0c, it);
    }

    public static C1mz A03(final Predicate predicate, final java.util.Map map) {
        final Predicates.CompositionPredicate compositionPredicate = new Predicates.CompositionPredicate(predicate, Maps$EntryFunction.A00);
        if (!(map instanceof C1mz)) {
            map.getClass();
            return new C1mz(predicate, compositionPredicate, map) { // from class: X.5bv
                public final Predicate A00;

                {
                    super(compositionPredicate, map);
                    this.A00 = predicate;
                }

                @Override // X.C1n0
                public Set A02() {
                    return C1n3.A07(this.A00, ((C1mz) this).A01.keySet());
                }

                @Override // X.C1n0
                public Set A03() {
                    return C1n3.A07(((C1mz) this).A00, ((C1mz) this).A01.entrySet());
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
                
                    if (r301.A00.apply(r302) == false) goto L6;
                 */
                @Override // X.C1mz, java.util.AbstractMap, java.util.Map
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public boolean containsKey(java.lang.Object r302) {
                    /*
                        r301 = this;
                        r0 = r301
                        java.util.Map r0 = r0.A01
                        r303 = r0
                        r0 = r303
                        r1 = r302
                        boolean r0 = r0.containsKey(r1)
                        r304 = r0
                        r0 = r304
                        if (r0 == 0) goto L26
                        r0 = r301
                        com.google.common.base.Predicate r0 = r0.A00
                        r303 = r0
                        r0 = r303
                        r1 = r302
                        boolean r0 = r0.apply(r1)
                        r305 = r0
                        r0 = 1
                        r304 = r0
                        r0 = r305
                        if (r0 != 0) goto L2a
                    L26:
                        r0 = 0
                        r304 = r0
                        r0 = 0
                        r303 = r0
                    L2a:
                        r0 = r304
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C5bv.containsKey(java.lang.Object):boolean");
                }
            };
        }
        C1mz c1mz = (C1mz) map;
        return new C1n1(Predicates.and(c1mz.A00, compositionPredicate), c1mz.A01);
    }

    public static C1n1 A04(Predicate predicate, java.util.Map map) {
        if (!(map instanceof C1mz)) {
            map.getClass();
            return new C1n1(predicate, map);
        }
        C1mz c1mz = (C1mz) map;
        return new C1n1(Predicates.and(c1mz.A00, predicate), c1mz.A01);
    }
}
