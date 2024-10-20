package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HashCodeDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HostAndPortDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.InternetDomainNameDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.RangeDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer;
import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.BoundType;
import com.google.common.collect.EnumBiMap;
import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.EnumMultiset;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Range;
import com.google.common.collect.TreeMultimap;
import com.google.common.collect.TreeMultiset;
import java.io.Serializable;

/* renamed from: X.28f, reason: invalid class name */
/* loaded from: 28f.class */
public final class C28f extends C28g implements Serializable {
    public static final long serialVersionUID = 1;
    public BoundType _defaultBoundType = null;

    public static void A00(3Bw r301, String str) {
        Class cls = r301._elementType._class;
        if (!Comparable.class.isAssignableFrom(cls)) {
            throw AnonymousClass001.A0L(0Pz.A0z("Can not handle ", str, " with elements that are not Comparable<?> (", cls.getName(), ")"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, com.fasterxml.jackson.databind.JsonDeserializer] */
    @Override // X.C27J
    public JsonDeserializer ASX(C26L c26l, 24S r303, AnonymousClass251 anonymousClass251) {
        Class cls = r303._class;
        if (cls == C3Oc.class) {
            return new Object();
        }
        if (cls == Range.class) {
            return new RangeDeserializer(r303, null, L6w.A00, this._defaultBoundType);
        }
        if (cls == 3eX.class) {
            return HostAndPortDeserializer.A00;
        }
        if (cls == 3TD.class) {
            return InternetDomainNameDeserializer.A00;
        }
        if (cls == 1U9.class) {
            return HashCodeDeserializer.A00;
        }
        return null;
    }

    @Override // X.C27J
    public JsonDeserializer ASb(C26L c26l, JsonDeserializer jsonDeserializer, AnonymousClass251 anonymousClass251, C68e c68e, 3Bw r306) {
        Class cls = ((24S) r306)._class;
        if (!ImmutableCollection.class.isAssignableFrom(cls)) {
            if (!C4u1.class.isAssignableFrom(cls)) {
                return null;
            }
            if (MQm.class.isAssignableFrom(cls)) {
                TreeMultiset.class.isAssignableFrom(cls);
                return new GuavaCollectionDeserializer(r306, jsonDeserializer, null, c68e, null);
            }
            if (LinkedHashMultiset.class.isAssignableFrom(cls)) {
                return new GuavaCollectionDeserializer(r306, jsonDeserializer, null, c68e, null);
            }
            if (!HashMultiset.class.isAssignableFrom(cls)) {
                EnumMultiset.class.isAssignableFrom(cls);
            }
            return new GuavaCollectionDeserializer(r306, jsonDeserializer, null, c68e, null);
        }
        if (!ImmutableList.class.isAssignableFrom(cls)) {
            if (ImmutableMultiset.class.isAssignableFrom(cls)) {
                if (!ImmutableSortedMultiset.class.isAssignableFrom(cls)) {
                    return new GuavaCollectionDeserializer(r306, jsonDeserializer, null, c68e, null);
                }
                A00(r306, "ImmutableSortedMultiset");
                return new GuavaCollectionDeserializer(r306, jsonDeserializer, null, c68e, null);
            }
            if (ImmutableSet.class.isAssignableFrom(cls)) {
                if (!ImmutableSortedSet.class.isAssignableFrom(cls)) {
                    return new GuavaCollectionDeserializer(r306, jsonDeserializer, null, c68e, null);
                }
                A00(r306, "ImmutableSortedSet");
                return new GuavaCollectionDeserializer(r306, jsonDeserializer, null, c68e, null);
            }
        }
        return new GuavaCollectionDeserializer(r306, jsonDeserializer, null, c68e, null);
    }

    @Override // X.C27J
    public JsonDeserializer ASp(C26L c26l, JsonDeserializer jsonDeserializer, KnN knN, AnonymousClass251 anonymousClass251, C68e c68e, C4E6 c4e6) {
        Class cls = ((24S) c4e6)._class;
        if (ImmutableMap.class.isAssignableFrom(cls)) {
            if (!ImmutableSortedMap.class.isAssignableFrom(cls) && !ImmutableBiMap.class.isAssignableFrom(cls)) {
                return new GuavaMapDeserializer(c4e6, jsonDeserializer, knN, null, c68e);
            }
            return new GuavaMapDeserializer(c4e6, jsonDeserializer, knN, null, c68e);
        }
        if (!C5f2.class.isAssignableFrom(cls)) {
            return null;
        }
        EnumBiMap.class.isAssignableFrom(cls);
        EnumHashBiMap.class.isAssignableFrom(cls);
        HashBiMap.class.isAssignableFrom(cls);
        return null;
    }

    @Override // X.C27J
    public JsonDeserializer ASq(C26L c26l, JsonDeserializer jsonDeserializer, KnN knN, AnonymousClass251 anonymousClass251, C68e c68e, C4E7 c4e7) {
        Class cls = ((24S) c4e7)._class;
        if (1Mv.class.isAssignableFrom(cls)) {
            ImmutableListMultimap.class.isAssignableFrom(cls);
            if (!ArrayListMultimap.class.isAssignableFrom(cls)) {
                if (!LinkedListMultimap.class.isAssignableFrom(cls)) {
                    K9z.class.isAssignableFrom(cls);
                }
            }
            return new GuavaMultimapDeserializer(jsonDeserializer, knN, c68e, c4e7);
        }
        if (1Xl.class.isAssignableFrom(cls)) {
            if (MQn.class.isAssignableFrom(cls)) {
                TreeMultimap.class.isAssignableFrom(cls);
                KA0.class.isAssignableFrom(cls);
            }
            if (!ImmutableSetMultimap.class.isAssignableFrom(cls)) {
                if (HashMultimap.class.isAssignableFrom(cls)) {
                    return new GuavaMultimapDeserializer(jsonDeserializer, knN, c68e, c4e7);
                }
                if (!LinkedHashMultimap.class.isAssignableFrom(cls)) {
                    KA0.class.isAssignableFrom(cls);
                }
            }
            return new GuavaMultimapDeserializer(jsonDeserializer, knN, c68e, c4e7);
        }
        if (!1Mu.class.isAssignableFrom(cls)) {
            L5M.class.isAssignableFrom(cls);
            return null;
        }
        return new GuavaMultimapDeserializer(jsonDeserializer, knN, c68e, c4e7);
    }

    @Override // X.C27J
    public JsonDeserializer ASx(C26L c26l, JsonDeserializer jsonDeserializer, AnonymousClass251 anonymousClass251, C68e c68e, 3Bx r306) {
        if (AnonymousClass001.A1W(((24S) r306)._class, Optional.class)) {
            return new ReferenceTypeDeserializer(r306, jsonDeserializer, null, c68e);
        }
        return null;
    }
}
