package com.fasterxml.jackson.databind.deser.impl;

import X.0Q8;
import X.24S;
import X.AbstractC01033pi;
import X.C27T;
import X.C42h;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/* loaded from: UnsupportedTypeDeserializer.class */
public class UnsupportedTypeDeserializer extends StdDeserializer {
    public static final long serialVersionUID = 1;
    public final String _message;
    public final 24S _type;

    public UnsupportedTypeDeserializer(24S r302, String str) {
        super(r302);
        this._type = r302;
        this._message = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A1R;
        if (abstractC01033pi.A1I() == C42h.A07 && ((A1R = abstractC01033pi.A1R()) == null || this._type._class.isAssignableFrom(A1R.getClass()))) {
            return A1R;
        }
        c27t.A0D(this._type, this._message);
        throw 0Q8.createAndThrow();
    }
}
