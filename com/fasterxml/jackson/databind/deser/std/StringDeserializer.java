package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.AbstractC01033pi;
import X.C27T;
import X.C42h;

/* loaded from: StringDeserializer.class */
public class StringDeserializer extends StdScalarDeserializer {
    public static final StringDeserializer A00 = new StringDeserializer();
    public static final long serialVersionUID = 1;

    public StringDeserializer() {
        super(String.class);
    }

    public static String A00(AbstractC01033pi abstractC01033pi, C27T c27t, StringDeserializer stringDeserializer) {
        String A1z;
        if (abstractC01033pi.A1u(C42h.A0C)) {
            return abstractC01033pi.A1Z();
        }
        C42h A1I = abstractC01033pi.A1I();
        if (A1I == C42h.A05) {
            return (String) stringDeserializer.A0p(abstractC01033pi, c27t);
        }
        if (A1I == C42h.A07) {
            Object A1R = abstractC01033pi.A1R();
            if (A1R == null) {
                return null;
            }
            return A1R instanceof byte[] ? c27t._config._base._defaultBase64.A06((byte[]) A1R) : A1R.toString();
        }
        if (A1I != C42h.A06 && A1I._isScalar && (A1z = abstractC01033pi.A1z()) != null) {
            return A1z;
        }
        c27t.A0Y(abstractC01033pi, stringDeserializer._valueClass);
        throw 0Q8.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return A00(abstractC01033pi, c27t, this);
    }
}
