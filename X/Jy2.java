package X;

import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: Jy2.class */
public final class Jy2 extends 68S {
    public static final long serialVersionUID = 1;
    public final C7Rt _objectIdReader;

    public Jy2(C26G c26g, Jy2 jy2) {
        super(c26g, jy2);
        this._objectIdReader = jy2._objectIdReader;
    }

    public Jy2(C68N c68n, C7Rt c7Rt) {
        super(c7Rt._idType, c7Rt._deserializer, c68n, c7Rt.propertyName);
        this._objectIdReader = c7Rt;
    }

    public Jy2(JsonDeserializer jsonDeserializer, C42o c42o, Jy2 jy2) {
        super(jsonDeserializer, c42o, jy2);
        this._objectIdReader = jy2._objectIdReader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.42o] */
    public 68S A04(JsonDeserializer jsonDeserializer) {
        JsonDeserializer jsonDeserializer2 = ((68S) this)._valueDeserializer;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        JsonDeserializer jsonDeserializer3 = ((68S) this)._nullProvider;
        if (jsonDeserializer2 == jsonDeserializer3) {
            jsonDeserializer3 = jsonDeserializer;
        }
        return new Jy2(jsonDeserializer, jsonDeserializer3, this);
    }

    public 68S A05(C26G c26g) {
        return new Jy2(c26g, this);
    }

    public 68S A06(C42o c42o) {
        return new Jy2(((68S) this)._valueDeserializer, c42o, this);
    }

    public Object A0D(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        if (abstractC01033pi.A1u(C42h.A09)) {
            return null;
        }
        Object A0M = ((68S) this)._valueDeserializer.A0M(abstractC01033pi, c27t);
        C7Rt c7Rt = this._objectIdReader;
        c27t.A0P(c7Rt.generator, c7Rt.resolver, A0M).A01(obj);
        68S r0 = this._objectIdReader.idProperty;
        return r0 != null ? r0.A0F(obj, A0M) : obj;
    }

    public Object A0F(Object obj, Object obj2) {
        68S r0 = this._objectIdReader.idProperty;
        if (r0 != null) {
            return r0.A0F(obj, obj2);
        }
        throw AnonymousClass001.A0q("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    public void A0L(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
        A0D(abstractC01033pi, c27t, obj);
    }

    public void A0M(Object obj, Object obj2) {
        A0F(obj, obj2);
    }

    public AbstractC00953pX AwU() {
        return null;
    }
}
