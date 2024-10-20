package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24S;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass437;
import X.C24c;
import X.C27T;
import X.C42h;
import X.C42o;
import X.C42x;
import X.C68e;
import X.KnN;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: MapEntryDeserializer.class */
public class MapEntryDeserializer extends ContainerDeserializerBase implements AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public final KnN _keyDeserializer;
    public final JsonDeserializer _valueDeserializer;
    public final C68e _valueTypeDeserializer;

    public MapEntryDeserializer(24S r302, JsonDeserializer jsonDeserializer, KnN knN, C68e c68e) {
        super(r302, (C42o) null, (Boolean) null);
        if (((C24c) r302)._bindings._types.length != 2) {
            throw AnonymousClass002.A0C(r302, "Missing generic type information for ", AnonymousClass001.A0k());
        }
        this._keyDeserializer = knN;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = c68e;
    }

    public MapEntryDeserializer(JsonDeserializer jsonDeserializer, KnN knN, MapEntryDeserializer mapEntryDeserializer, C68e c68e) {
        super(mapEntryDeserializer._nullProvider, mapEntryDeserializer, mapEntryDeserializer._unwrapSingle);
        this._keyDeserializer = knN;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = c68e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Map.Entry A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        String A0Z;
        Object[] objArr;
        C42h A1I = abstractC01033pi.A1I();
        if (A1I == C42h.A06) {
            A1I = abstractC01033pi.A1K();
        } else if (A1I != C42h.A03 && A1I != C42h.A02) {
            if (A1I == C42h.A05) {
                return (Map.Entry) A0p(abstractC01033pi, c27t);
            }
            JsonDeserializer.A05(abstractC01033pi, c27t, this);
            throw 0Q8.createAndThrow();
        }
        C42h c42h = C42h.A03;
        if (A1I == c42h) {
            KnN knN = this._keyDeserializer;
            JsonDeserializer jsonDeserializer = this._valueDeserializer;
            C68e c68e = this._valueTypeDeserializer;
            String A1X = abstractC01033pi.A1X();
            Object A00 = knN.A00(c27t, A1X);
            try {
                Object Azd = abstractC01033pi.A1K() == C42h.A09 ? jsonDeserializer.Azd(c27t) : c68e == null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : jsonDeserializer.A0T(abstractC01033pi, c27t, c68e);
                C42h A1K = abstractC01033pi.A1K();
                if (A1K == C42h.A02) {
                    return new AbstractMap.SimpleEntry(A00, Azd);
                }
                if (A1K == c42h) {
                    objArr = new Object[]{abstractC01033pi.A1X()};
                    A0Z = "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')";
                } else {
                    A0Z = AnonymousClass001.A0Z(A1K, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ", AnonymousClass001.A0k());
                    objArr = new Object[0];
                }
            } catch (Exception e) {
                ContainerDeserializerBase.A04(c27t, Map.Entry.class, A1X, e);
                throw 0Q8.createAndThrow();
            }
        } else {
            if (A1I != C42h.A02) {
                c27t.A0Y(abstractC01033pi, A0S());
                throw 0Q8.createAndThrow();
            }
            objArr = new Object[0];
            A0Z = "Cannot deserialize a Map.Entry out of empty JSON Object";
        }
        c27t.A0e(this, A0Z, objArr);
        throw 0Q8.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        throw AnonymousClass001.A0N("Cannot update Map.Entry values");
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
        if (knN == null) {
            knN = c27t.A0L(this._containerType.A09(0));
        }
        JsonDeserializer A0A = StdDeserializer.A0A(r302, c27t, this._valueDeserializer);
        24S A09 = this._containerType.A09(1);
        JsonDeserializer A0G = A0A == null ? c27t.A0G(r302, A09) : c27t.A0I(r302, A09, A0A);
        C68e c68e = this._valueTypeDeserializer;
        if (c68e != null) {
            c68e = c68e.A04(r302);
        }
        return (this._keyDeserializer == knN && this._valueDeserializer == A0G && c68e == c68e) ? this : new MapEntryDeserializer(A0G, knN, this, c68e);
    }
}
