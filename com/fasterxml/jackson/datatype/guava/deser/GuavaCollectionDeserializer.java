package com.fasterxml.jackson.datatype.guava.deser;

import X.0Q8;
import X.1Hz;
import X.24S;
import X.5sI;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass437;
import X.C26O;
import X.C27T;
import X.C42h;
import X.C42o;
import X.C42x;
import X.C4u1;
import X.C68e;
import X.C68k;
import X.JQx;
import X.KAG;
import X.KAH;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.RegularImmutableMultiset;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.RegularImmutableSortedMultiset;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Collection;

/* loaded from: GuavaCollectionDeserializer.class */
public abstract class GuavaCollectionDeserializer extends ContainerDeserializerBase implements AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer _valueDeserializer;
    public final C68e _valueTypeDeserializer;

    public GuavaCollectionDeserializer(24S r302, JsonDeserializer jsonDeserializer, C42o c42o, C68e c68e, Boolean bool) {
        super(r302, c42o, bool);
        this._valueTypeDeserializer = c68e;
        this._valueDeserializer = jsonDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v15, types: [X.4u1] */
    /* JADX WARN: Type inference failed for: r308v8 */
    /* JADX WARN: Type inference failed for: r308v9 */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A0M;
        KAH kag;
        Object A12;
        Object A0M2;
        Object A0M3;
        if (!abstractC01033pi.A1p()) {
            if (!c27t.A0p(C26O.A04)) {
                c27t.A0Y(abstractC01033pi, this._valueClass);
                throw 0Q8.createAndThrow();
            }
            JsonDeserializer jsonDeserializer = this._valueDeserializer;
            C68e c68e = this._valueTypeDeserializer;
            if (abstractC01033pi.A1J() != C42h.A09) {
                A0M = c68e == null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : jsonDeserializer.A0T(abstractC01033pi, c27t, c68e);
            } else if (this._skipNullValues) {
                A12 = A12();
            } else {
                A0M = JQx.A0r(c27t, this);
            }
            if (this instanceof ImmutableSortedSetDeserializer) {
                kag = new KAH(NaturalOrdering.A02);
            } else {
                if (!(this instanceof ImmutableSortedMultisetDeserializer)) {
                    if (this instanceof ImmutableSetDeserializer) {
                        return new SingletonImmutableSet(A0M);
                    }
                    if (this instanceof ImmutableMultisetDeserializer) {
                        5sI r0 = new 5sI(4);
                        r0.A06(new Object[]{A0M});
                        return r0.A07();
                    }
                    if (this instanceof ImmutableListDeserializer) {
                        return ImmutableList.of(A0M);
                    }
                    C4u1 A13 = ((GuavaMultisetDeserializer) this).A13();
                    A13.add(A0M);
                    return A13;
                }
                kag = new KAG(NaturalOrdering.A02);
            }
            kag.add(A0M);
            return kag.build();
        }
        if (this instanceof GuavaMultisetDeserializer) {
            GuavaMultisetDeserializer guavaMultisetDeserializer = (GuavaMultisetDeserializer) this;
            JsonDeserializer jsonDeserializer2 = guavaMultisetDeserializer._valueDeserializer;
            C68e c68e2 = guavaMultisetDeserializer._valueTypeDeserializer;
            A12 = guavaMultisetDeserializer.A13();
            while (true) {
                C42h A1K = abstractC01033pi.A1K();
                if (A1K == C42h.A01) {
                    break;
                }
                if (A1K != C42h.A09) {
                    A0M3 = c68e2 == null ? jsonDeserializer2.A0M(abstractC01033pi, c27t) : jsonDeserializer2.A0T(abstractC01033pi, c27t, c68e2);
                } else if (!guavaMultisetDeserializer._skipNullValues) {
                    A0M3 = JQx.A0r(c27t, guavaMultisetDeserializer);
                }
                A12.add(A0M3);
            }
        } else {
            GuavaImmutableCollectionDeserializer guavaImmutableCollectionDeserializer = (GuavaImmutableCollectionDeserializer) this;
            JsonDeserializer jsonDeserializer3 = guavaImmutableCollectionDeserializer._valueDeserializer;
            C68e c68e3 = guavaImmutableCollectionDeserializer._valueTypeDeserializer;
            KAH kah = guavaImmutableCollectionDeserializer instanceof ImmutableSortedSetDeserializer ? new KAH(NaturalOrdering.A02) : guavaImmutableCollectionDeserializer instanceof ImmutableSortedMultisetDeserializer ? new KAG(NaturalOrdering.A02) : guavaImmutableCollectionDeserializer instanceof ImmutableSetDeserializer ? new 1Hz() : guavaImmutableCollectionDeserializer instanceof ImmutableMultisetDeserializer ? new 5sI(4) : ImmutableList.builder();
            while (true) {
                C42h A1K2 = abstractC01033pi.A1K();
                if (A1K2 == C42h.A01) {
                    return kah.build();
                }
                if (A1K2 != C42h.A09) {
                    A0M2 = c68e3 == null ? jsonDeserializer3.A0M(abstractC01033pi, c27t) : jsonDeserializer3.A0T(abstractC01033pi, c27t, c68e3);
                } else if (!guavaImmutableCollectionDeserializer._skipNullValues) {
                    A0M2 = JQx.A0r(c27t, guavaImmutableCollectionDeserializer);
                }
                kah.add(A0M2);
            }
        }
        return A12;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Collection;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return c68e.A06(abstractC01033pi, c27t);
    }

    public Object A12() {
        return this instanceof ImmutableSortedSetDeserializer ? RegularImmutableSortedSet.A01 : this instanceof ImmutableSortedMultisetDeserializer ? RegularImmutableSortedMultiset.A04 : this instanceof ImmutableSetDeserializer ? RegularImmutableSet.A05 : this instanceof ImmutableMultisetDeserializer ? RegularImmutableMultiset.A03 : this instanceof ImmutableListDeserializer ? ImmutableList.of() : ((GuavaMultisetDeserializer) this).A13();
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        Boolean A0j = A0j(C68k.A01, r302, c27t, Collection.class);
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        C68e c68e = this._valueTypeDeserializer;
        if (jsonDeserializer == null) {
            jsonDeserializer = c27t.A0G(r302, this._containerType.A05());
        }
        if (c68e != null) {
            c68e = c68e.A04(r302);
        }
        C42o A0h = A0h(r302, c27t, jsonDeserializer);
        if (A0j == this._unwrapSingle && A0h == this._nullProvider && jsonDeserializer == this._valueDeserializer && c68e == this._valueTypeDeserializer) {
            return this;
        }
        if (!(this instanceof ImmutableSortedSetDeserializer) && !(this instanceof ImmutableSortedMultisetDeserializer) && !(this instanceof ImmutableSetDeserializer) && !(this instanceof ImmutableMultisetDeserializer) && !(this instanceof ImmutableListDeserializer) && !(this instanceof TreeMultisetDeserializer)) {
            boolean z = this instanceof LinkedHashMultisetDeserializer;
            24S r0 = this._containerType;
            return z ? new GuavaCollectionDeserializer(r0, jsonDeserializer, A0h, c68e, A0j) : new GuavaCollectionDeserializer(r0, jsonDeserializer, A0h, c68e, A0j);
        }
        return new GuavaCollectionDeserializer(this._containerType, jsonDeserializer, A0h, c68e, A0j);
    }
}
