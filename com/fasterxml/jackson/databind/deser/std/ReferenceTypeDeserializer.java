package com.fasterxml.jackson.databind.deser.std;

import X.24S;
import X.3Bx;
import X.68U;
import X.68W;
import X.AbstractC01033pi;
import X.AnonymousClass437;
import X.C26L;
import X.C27T;
import X.C42h;
import X.C42x;
import X.C68e;
import X.GOn;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaOptionalDeserializer;
import com.google.common.base.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: ReferenceTypeDeserializer.class */
public abstract class ReferenceTypeDeserializer extends StdDeserializer implements AnonymousClass437 {
    public static final long serialVersionUID = 2;
    public final 24S _fullType;
    public final JsonDeserializer _valueDeserializer;
    public final 68W _valueInstantiator;
    public final C68e _valueTypeDeserializer;

    public ReferenceTypeDeserializer(24S r302, JsonDeserializer jsonDeserializer, 68W r304, C68e c68e) {
        super(r302);
        this._valueInstantiator = r304;
        this._fullType = r302;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = c68e;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        68W r0 = this._valueInstantiator;
        if (r0 != null) {
            return A0N(abstractC01033pi, c27t, r0.A09(c27t));
        }
        C68e c68e = this._valueTypeDeserializer;
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        Object A0M = c68e == null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : jsonDeserializer.A0T(abstractC01033pi, c27t, c68e);
        return this instanceof GuavaOptionalDeserializer ? Optional.fromNullable(A0M) : GOn.A1L(A0M);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        Object A0M;
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer.A0R(c27t._config).equals(Boolean.FALSE) || this._valueTypeDeserializer != null) {
            C68e c68e = this._valueTypeDeserializer;
            A0M = c68e == null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : jsonDeserializer.A0T(abstractC01033pi, c27t, c68e);
        } else {
            boolean z = this instanceof GuavaOptionalDeserializer;
            Object obj2 = z ? ((Optional) obj).get() : ((AtomicReference) obj).get();
            if (obj2 == null) {
                C68e c68e2 = this._valueTypeDeserializer;
                JsonDeserializer jsonDeserializer2 = this._valueDeserializer;
                Object A0M2 = c68e2 == null ? jsonDeserializer2.A0M(abstractC01033pi, c27t) : jsonDeserializer2.A0T(abstractC01033pi, c27t, c68e2);
                return z ? Optional.fromNullable(A0M2) : GOn.A1L(A0M2);
            }
            A0M = this._valueDeserializer.A0N(abstractC01033pi, c27t, obj2);
        }
        if (this instanceof GuavaOptionalDeserializer) {
            return Optional.fromNullable(A0M);
        }
        AtomicReference atomicReference = (AtomicReference) obj;
        atomicReference.set(A0M);
        return atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer.A0Q();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean A0R(C26L c26l) {
        if (this instanceof AtomicReferenceDeserializer) {
            return Boolean.TRUE;
        }
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer == null) {
            return null;
        }
        return jsonDeserializer.A0R(c26l);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        if (abstractC01033pi.A1u(C42h.A09)) {
            return Azd(c27t);
        }
        C68e c68e2 = this._valueTypeDeserializer;
        if (c68e2 == null) {
            return A0M(abstractC01033pi, c27t);
        }
        Object A05 = c68e2.A05(abstractC01033pi, c27t);
        return this instanceof GuavaOptionalDeserializer ? Optional.fromNullable(A05) : GOn.A1L(A05);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 24S A0c() {
        return this._fullType;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 68W A0i() {
        return this._valueInstantiator;
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        JsonDeserializer A0I;
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        3Bx r0 = this._fullType;
        boolean z = r0 instanceof 3Bx;
        if (jsonDeserializer == null) {
            A0I = c27t.A0G(r302, z ? r0._referencedType : null);
        } else {
            A0I = c27t.A0I(r302, z ? r0._referencedType : null, jsonDeserializer);
        }
        C68e c68e = this._valueTypeDeserializer;
        if (c68e != null) {
            c68e = c68e.A04(r302);
        }
        if (A0I == this._valueDeserializer && c68e == c68e) {
            return this;
        }
        boolean z2 = this instanceof GuavaOptionalDeserializer;
        24S r02 = this._fullType;
        68W r03 = this._valueInstantiator;
        return z2 ? new ReferenceTypeDeserializer(r02, A0I, r03, c68e) : new ReferenceTypeDeserializer(r02, A0I, r03, c68e);
    }
}
