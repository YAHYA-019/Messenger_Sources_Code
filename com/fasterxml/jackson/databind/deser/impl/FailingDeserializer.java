package com.fasterxml.jackson.databind.deser.impl;

import X.0Q8;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.C27T;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/* loaded from: FailingDeserializer.class */
public class FailingDeserializer extends StdDeserializer {
    public static final long serialVersionUID = 1;
    public final String _message;

    public FailingDeserializer() {
        super(Object.class);
        this._message = "No _valueDeserializer assigned";
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        c27t.A0e(this, this._message, AnonymousClass001.A1Z());
        throw 0Q8.createAndThrow();
    }
}
