package com.fasterxml.jackson.datatype.guava.deser;

import X.0Q8;
import X.1BK;
import X.24S;
import X.68U;
import X.7Qw;
import X.AbstractC01033pi;
import X.AnonymousClass437;
import X.C27T;
import X.C42h;
import X.C42o;
import X.C42x;
import X.C68e;
import X.JQx;
import X.JQy;
import X.KnN;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.NaturalOrdering;

/* loaded from: GuavaMapDeserializer.class */
public abstract class GuavaMapDeserializer extends ContainerDeserializerBase implements AnonymousClass437 {
    public static final long serialVersionUID = 2;
    public KnN _keyDeserializer;
    public JsonDeserializer _valueDeserializer;
    public final C68e _valueTypeDeserializer;

    public GuavaMapDeserializer(24S r302, JsonDeserializer jsonDeserializer, KnN knN, C42o c42o, C68e c68e) {
        super(r302, c42o, (Boolean) null);
        this._keyDeserializer = knN;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = c68e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        7Qw A0c;
        Object A0r;
        C42h A1J = abstractC01033pi.A1J();
        if (A1J == C42h.A06) {
            A1J = abstractC01033pi.A1K();
        }
        C42h c42h = C42h.A03;
        if (A1J != c42h && A1J != C42h.A02) {
            c27t.A0Y(abstractC01033pi, this._containerType._class);
            throw 0Q8.createAndThrow();
        }
        GuavaImmutableMapDeserializer guavaImmutableMapDeserializer = (GuavaImmutableMapDeserializer) this;
        KnN knN = guavaImmutableMapDeserializer._keyDeserializer;
        JsonDeserializer jsonDeserializer = guavaImmutableMapDeserializer._valueDeserializer;
        C68e c68e = guavaImmutableMapDeserializer._valueTypeDeserializer;
        if (guavaImmutableMapDeserializer instanceof ImmutableSortedMapDeserializer) {
            ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.A03;
            A0c = new 7Qw(NaturalOrdering.A02);
        } else {
            A0c = guavaImmutableMapDeserializer instanceof ImmutableMapDeserializer ? 1BK.A0c() : new ImmutableMap.Builder(4);
        }
        while (abstractC01033pi.A1J() == c42h) {
            String A1Y = abstractC01033pi.A1Y();
            if (knN != null) {
                A1Y = knN.A00(c27t, A1Y);
            }
            if (abstractC01033pi.A1K() != C42h.A09) {
                A0c.put(A1Y, c68e == null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : jsonDeserializer.A0T(abstractC01033pi, c27t, c68e));
            } else if (!guavaImmutableMapDeserializer._skipNullValues && (A0r = JQx.A0r(c27t, guavaImmutableMapDeserializer)) != null) {
                A0c.put(A1Y, A0r);
            }
            abstractC01033pi.A1K();
        }
        return A0c.build();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Map;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return c68e.A07(abstractC01033pi, c27t);
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        KnN knN = this._keyDeserializer;
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        C68e c68e = this._valueTypeDeserializer;
        if (knN == null) {
            knN = c27t.A0L(this._containerType.A06());
        }
        JsonDeserializer A0a = JQy.A0a(r302, c27t, jsonDeserializer, this);
        if (c68e != null) {
            c68e = c68e.A04(r302);
        }
        C42o A0h = A0h(r302, c27t, A0a);
        if (this._keyDeserializer == knN && this._valueDeserializer == A0a && this._valueTypeDeserializer == c68e && this._nullProvider == A0h) {
            return this;
        }
        if (this instanceof ImmutableSortedMapDeserializer) {
            return new GuavaMapDeserializer(this._containerType, A0a, knN, A0h, c68e);
        }
        boolean z = this instanceof ImmutableMapDeserializer;
        24S r0 = this._containerType;
        return z ? new GuavaMapDeserializer(r0, A0a, knN, A0h, c68e) : new GuavaMapDeserializer(r0, A0a, knN, A0h, c68e);
    }
}
