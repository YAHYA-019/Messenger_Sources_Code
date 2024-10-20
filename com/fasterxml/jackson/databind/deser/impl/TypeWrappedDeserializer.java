package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC01033pi;
import X.C27T;
import X.C68e;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* loaded from: TypeWrappedDeserializer.class */
public final class TypeWrappedDeserializer extends JsonDeserializer implements Serializable {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer _deserializer;
    public final C68e _typeDeserializer;

    public TypeWrappedDeserializer(JsonDeserializer jsonDeserializer, C68e c68e) {
        this._typeDeserializer = c68e;
        this._deserializer = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return this._deserializer.A0T(abstractC01033pi, c27t, this._typeDeserializer);
    }
}
