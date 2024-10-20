package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Method;

/* loaded from: Jy3.class */
public final class Jy3 extends 68S {
    public static final long serialVersionUID = 1;
    public final C68D _annotated;
    public final Method _getter;

    public Jy3(24S r302, C68D c68d, AnonymousClass687 anonymousClass687, C68e c68e, C24w c24w) {
        super(r302, anonymousClass687, c68e, c24w);
        this._annotated = c68d;
        this._getter = c68d.A00;
    }

    public Jy3(C26G c26g, Jy3 jy3) {
        super(c26g, jy3);
        this._annotated = jy3._annotated;
        this._getter = jy3._getter;
    }

    public Jy3(JsonDeserializer jsonDeserializer, C42o c42o, Jy3 jy3) {
        super(jsonDeserializer, c42o, jy3);
        this._annotated = jy3._annotated;
        this._getter = jy3._getter;
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
        return new Jy3(jsonDeserializer, jsonDeserializer3, this);
    }

    public 68S A05(C26G c26g) {
        return new Jy3(c26g, this);
    }

    public 68S A06(C42o c42o) {
        return new Jy3(((68S) this)._valueDeserializer, c42o, this);
    }

    public Object A0D(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        A0L(obj, abstractC01033pi, c27t);
        return obj;
    }

    public Object A0F(Object obj, Object obj2) {
        A0M(obj, obj2);
        throw 0Q8.createAndThrow();
    }

    public void A0K(C26L c26l) {
        this._annotated.A0E(c26l.A09(AnonymousClass260.A0K));
    }

    public final void A0L(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
        24S r307;
        Object[] objArr;
        String str;
        if (abstractC01033pi.A1u(C42h.A09)) {
            return;
        }
        if (((68S) this)._valueTypeDeserializer != null) {
            r307 = ((68S) this)._type;
            objArr = new Object[]{((68S) this)._propName._simpleName};
            str = "Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet";
        } else {
            try {
                Object invoke = this._getter.invoke(obj, null);
                if (invoke != null) {
                    ((68S) this)._valueDeserializer.A0N(abstractC01033pi, c27t, invoke);
                    return;
                } else {
                    r307 = ((68S) this)._type;
                    objArr = new Object[]{((68S) this)._propName._simpleName};
                    str = "Problem deserializing 'setterless' property '%s': get method returned null";
                }
            } catch (Exception e) {
                68S.A01(abstractC01033pi, e);
                throw 0Q8.createAndThrow();
            }
        }
        JQx.A1I(c27t, r307, str, objArr);
        throw 0Q8.createAndThrow();
    }

    public final void A0M(Object obj, Object obj2) {
        throw AnonymousClass001.A0q(0Pz.A0j("Should never call `set()` on setterless property ('", ((68S) this)._propName._simpleName, "')"));
    }

    public AbstractC00953pX AwU() {
        return this._annotated;
    }
}
