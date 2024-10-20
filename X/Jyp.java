package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Jyp.class */
public abstract class Jyp extends C68e implements Serializable {
    public static final long serialVersionUID = 1;
    public final 24S _baseType;
    public final 24S _defaultImpl;
    public JsonDeserializer _defaultImplDeserializer;
    public final java.util.Map _deserializers;
    public final MKA _idResolver;
    public final 68U _property;
    public final boolean _typeIdVisible;
    public final String _typePropertyName;

    public Jyp(24S r302, 24S r303, MKA mka, String str, boolean z) {
        this._baseType = r302;
        this._idResolver = mka;
        C27F[] c27fArr = 27C.A01;
        this._typePropertyName = str == null ? "" : str;
        this._typeIdVisible = z;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = r303;
        this._property = null;
    }

    public Jyp(68U r302, Jyp jyp) {
        this._baseType = jyp._baseType;
        this._idResolver = jyp._idResolver;
        this._typePropertyName = jyp._typePropertyName;
        this._typeIdVisible = jyp._typeIdVisible;
        this._deserializers = jyp._deserializers;
        this._defaultImpl = jyp._defaultImpl;
        this._defaultImplDeserializer = jyp._defaultImplDeserializer;
        this._property = r302;
    }

    public static AbstractC01033pi A02(AbstractC01033pi abstractC01033pi, C42h c42h, C27T c27t, Jyp jyp, String str) {
        if (!abstractC01033pi.A1u(c42h)) {
            return abstractC01033pi;
        }
        28P r0 = new 28P(abstractC01033pi, c27t);
        r0.A0b();
        r0.A0o(jyp._typePropertyName);
        r0.A0r(str);
        abstractC01033pi.A1g();
        4sG A00 = C4Qi.A00(r0.A0y(abstractC01033pi), abstractC01033pi);
        A00.A1K();
        return A00;
    }

    public final JsonDeserializer A09(C27T c27t) {
        JsonDeserializer jsonDeserializer;
        24S r0 = this._defaultImpl;
        if (r0 == null) {
            if (c27t.A0p(C26O.A07)) {
                return null;
            }
        } else if (!27C.A0J(r0._class)) {
            synchronized (r0) {
                jsonDeserializer = this._defaultImplDeserializer;
                if (jsonDeserializer == null) {
                    jsonDeserializer = c27t.A0G(this._property, this._defaultImpl);
                    this._defaultImplDeserializer = jsonDeserializer;
                }
            }
            return jsonDeserializer;
        }
        return NullifyingDeserializer.A00;
    }

    public final JsonDeserializer A0A(C27T c27t, String str) {
        JsonDeserializer A0G;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) this._deserializers.get(str);
        if (jsonDeserializer == null) {
            24S D5P = this._idResolver.D5P(c27t, str);
            if (D5P == null) {
                A0G = A09(c27t);
                if (A0G == null) {
                    String AhO = this._idResolver.AhO();
                    String A0W = AhO == null ? "type ids are not statically known" : 0Pz.A0W("known type ids = ", AhO);
                    68U r0 = this._property;
                    if (r0 != null) {
                        A0W = String.format("%s (for POJO property '%s')", A0W, r0.getName());
                    }
                    24S r02 = this._baseType;
                    if (c27t._config._problemHandlers != null) {
                        throw AnonymousClass001.A0Q(1BJ.A00(1402));
                    }
                    if (c27t.A0p(C26O.A07)) {
                        throw c27t.A09(r02, str, A0W);
                    }
                    jsonDeserializer = NullifyingDeserializer.A00;
                }
            } else {
                24S r307 = this._baseType;
                if (r307 != null && r307.getClass() == D5P.getClass() && !D5P.A0L()) {
                    try {
                        Class cls = D5P._class;
                        if (r307._class != cls) {
                            r307 = c27t._config._base._typeFactory.A06(r307, cls, false);
                        }
                        D5P = r307;
                    } catch (IllegalArgumentException e) {
                        throw c27t.A09(this._baseType, str, e.getMessage());
                    }
                }
                A0G = c27t.A0G(this._property, D5P);
            }
            this._deserializers.put(str, A0G);
            return A0G;
        }
        return jsonDeserializer;
    }

    public String toString() {
        StringBuilder A0u = 7zR.A0u();
        A0u.append(AnonymousClass001.A0Y(this));
        A0u.append("; base-type:");
        A0u.append(this._baseType);
        A0u.append("; id-resolver: ");
        A0u.append(this._idResolver);
        return AnonymousClass001.A0g(A0u, ']');
    }
}
