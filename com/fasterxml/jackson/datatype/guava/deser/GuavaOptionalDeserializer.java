package com.fasterxml.jackson.datatype.guava.deser;

import X.C27T;
import com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer;
import com.google.common.base.Optional;

/* loaded from: GuavaOptionalDeserializer.class */
public class GuavaOptionalDeserializer extends ReferenceTypeDeserializer {
    public static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        A0U(c27t);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, X.C42o
    public /* bridge */ /* synthetic */ Object Azd(C27T c27t) {
        return Optional.fromNullable(this._valueDeserializer.Azd(c27t));
    }
}
