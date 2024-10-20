package com.fasterxml.jackson.databind.deser.std;

import X.0Pz;
import X.24S;
import X.27C;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass436;
import X.AnonymousClass437;
import X.C26L;
import X.C27T;
import X.C3m9;
import X.C42o;
import X.C42x;
import X.C68e;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: StdDelegatingDeserializer.class */
public class StdDelegatingDeserializer extends StdDeserializer implements AnonymousClass436, AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public final C3m9 _converter;
    public final JsonDeserializer _delegateDeserializer;
    public final 24S _delegateType;

    public StdDelegatingDeserializer(24S r302, JsonDeserializer jsonDeserializer, C3m9 c3m9) {
        super(r302);
        this._converter = c3m9;
        this._delegateType = r302;
        this._delegateDeserializer = jsonDeserializer;
    }

    public StdDelegatingDeserializer(C3m9 c3m9) {
        super(Object.class);
        this._converter = c3m9;
        this._delegateType = null;
        this._delegateDeserializer = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A0M = this._delegateDeserializer.A0M(abstractC01033pi, c27t);
        if (A0M == null) {
            return null;
        }
        return this._converter.AI5(A0M);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        Class cls = this._delegateType._class;
        Class<?> cls2 = obj.getClass();
        if (cls.isAssignableFrom(cls2)) {
            return this._delegateDeserializer.A0N(abstractC01033pi, c27t, obj);
        }
        throw AnonymousClass001.A0q(String.format(0Pz.A0W("Cannot update object of type %s (using deserializer for type %s)", cls2.getName()), this._delegateType));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return this._delegateDeserializer.A0Q();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean A0R(C26L c26l) {
        return this._delegateDeserializer.A0R(c26l);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class A0S() {
        return this._delegateDeserializer.A0S();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        Object A0M = this._delegateDeserializer.A0M(abstractC01033pi, c27t);
        if (A0M == null) {
            return null;
        }
        return this._converter.AI5(A0M);
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        JsonDeserializer jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer == null) {
            24S Aqz = this._converter.Aqz(c27t.A0A());
            C3m9 c3m9 = this._converter;
            JsonDeserializer A0G = c27t.A0G(r302, Aqz);
            27C.A0F(StdDelegatingDeserializer.class, this, "withDelegate");
            return new StdDelegatingDeserializer(Aqz, A0G, c3m9);
        }
        JsonDeserializer A0I = c27t.A0I(r302, this._delegateType, jsonDeserializer);
        if (A0I == this._delegateDeserializer) {
            return this;
        }
        C3m9 c3m92 = this._converter;
        24S r0 = this._delegateType;
        27C.A0F(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer(r0, A0I, c3m92);
    }

    @Override // X.AnonymousClass436
    public void Cht(C27T c27t) {
        C42o c42o = this._delegateDeserializer;
        if (c42o == null || !(c42o instanceof AnonymousClass436)) {
            return;
        }
        ((AnonymousClass436) c42o).Cht(c27t);
    }
}
